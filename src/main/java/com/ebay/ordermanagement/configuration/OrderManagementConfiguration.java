// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.ordermanagement.configuration;

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Order Management SDK.
 * Provides base URLs for each API and optional fallback access token.
 */
public final class OrderManagementConfiguration {
    private static final String DEFAULT_FULFILLMENT_BASE_URL = "https://api.ebay.com";
    private static final String DEFAULT_LOGISTICS_BASE_URL = "https://api.ebay.com";
    private static final String DEFAULT_GRAPHQL_BASE_URL = "https://apig.ebay.com/graphql";

    // Base URLs for each API (SEC-002: private final, validated at construction)
    private final String fulfillmentBaseUrl;
    private final String logisticsBaseUrl;
    private final String graphQLBaseUrl;

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /** No-arg constructor using production eBay API endpoints. */
    public OrderManagementConfiguration() {
        this.fulfillmentBaseUrl = DEFAULT_FULFILLMENT_BASE_URL;
        this.logisticsBaseUrl = DEFAULT_LOGISTICS_BASE_URL;
        this.graphQLBaseUrl = DEFAULT_GRAPHQL_BASE_URL;
    }

    /**
     * Constructor for custom base URLs (e.g. sandbox).
     * Each URL is validated against the allowed-hosts list.
     *
     * @param fulfillmentBaseUrl base URL for the Fulfillment API
     * @param logisticsBaseUrl   base URL for the Logistics API
     */
    public OrderManagementConfiguration(String fulfillmentBaseUrl, String logisticsBaseUrl) {
        this.fulfillmentBaseUrl = validateHost(fulfillmentBaseUrl);
        this.logisticsBaseUrl = validateHost(logisticsBaseUrl);
        this.graphQLBaseUrl = DEFAULT_GRAPHQL_BASE_URL;
    }

    // Getters
    public String getFulfillmentBaseUrl() { return fulfillmentBaseUrl; }
    public String getLogisticsBaseUrl() { return logisticsBaseUrl; }
    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }

    /**
     * Sets the fallback access token used when no per-call token is supplied.
     *
     * <p><strong>Security note:</strong> The token is stored as a plain {@code String} on the Java
     * heap and will remain in memory until the object is garbage-collected. Prefer supplying a
     * per-call token via the individual async methods to reduce the window of exposure.
     */
    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(fulfillmentBaseUrl));
        hosts.add(extractHost(logisticsBaseUrl));
        hosts.add(extractHost(graphQLBaseUrl));
        return hosts;
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
