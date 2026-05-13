package com.ebay.ordermanagement.clients.graphql;

import com.ebay.ordermanagement.configuration.OrderManagementConfiguration;
import com.ebay.ordermanagement.configuration.RequestOptions;
import com.ebay.ordermanagement.configuration.TokenContext;
import com.ebay.ordermanagement.exceptions.GraphQLException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dynamic GraphQL client for executing arbitrary GraphQL queries.
 * Returns raw JsonNode for flexible response handling.
 */
public final class DynamicGraphQLClient {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final OkHttpClient http;
    private final OrderManagementConfiguration config;

    public DynamicGraphQLClient(OkHttpClient http, OrderManagementConfiguration config) {
        this.http = http;
        this.config = config;
    }

    /**
     * Execute a GraphQL query or mutation.
     * @param query The GraphQL query string.
     * @param variables The variables object (or null).
     * @param accessToken Per-call token; overrides config fallback.
     * @param requestOptions Optional custom headers for this request.
     * @return The GraphQL response data as JsonNode.
     * @throws GraphQLException if the response contains errors.
     */
    public JsonNode execute(String query, Object variables, String accessToken, RequestOptions requestOptions) {
        String token = accessToken != null ? accessToken
            : TokenContext.CURRENT.get() != null ? TokenContext.CURRENT.get()
            : config.getAccessToken();
        if (token == null) {
            throw new IllegalStateException(
                "No access token. Pass accessToken or set OrderManagementConfiguration.accessToken.");
        }

        // Merge default headers + per-request headers
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }

        ObjectNode body = MAPPER.createObjectNode();
        body.put("query", query);
        if (variables != null) {
            body.set("variables", MAPPER.valueToTree(variables));
        }

        try {
            Request.Builder requestBuilder = new Request.Builder()
                .url(config.getGraphQLBaseUrl())
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .post(RequestBody.create(MAPPER.writeValueAsBytes(body), JSON));

            // Add custom headers
            headers.forEach(requestBuilder::addHeader);

            Request request = requestBuilder.build();

            try (Response resp = http.newCall(request).execute()) {
                if (!resp.isSuccessful()) {
                    throw new GraphQLException(List.of("HTTP " + resp.code() + ": " + resp.message()));
                }

                JsonNode root = MAPPER.readTree(resp.body().bytes());
                JsonNode errors = root.get("errors");
                if (errors != null && errors.isArray() && !errors.isEmpty()) {
                    List<String> msgs = new ArrayList<>();
                    errors.forEach(e -> msgs.add(e.path("message").asText()));
                    throw new GraphQLException(msgs);
                }

                // Return the data field
                return root.get("data");
            }
        } catch (IOException e) {
            throw new RuntimeException("GraphQL request failed", e);
        }
    }
}
