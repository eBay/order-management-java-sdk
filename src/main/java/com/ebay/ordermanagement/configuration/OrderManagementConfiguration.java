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

import jakarta.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public final class OrderManagementConfiguration {
    private @Nullable String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    private final String fulfillmentBaseUrl;
    private final String logisticsBaseUrl;
    private final String graphQLBaseUrl;

    public OrderManagementConfiguration() {
        this.fulfillmentBaseUrl = "https://api.ebay.com/sell/fulfillment/v1";
        this.logisticsBaseUrl = "https://api.ebay.com/sell/logistics/v1_beta";
        this.graphQLBaseUrl = "https://api.ebay.com/graphql";
    }

    public OrderManagementConfiguration(
            String fulfillmentBaseUrl,
            String logisticsBaseUrl,
            String graphQLBaseUrl) {
        this.fulfillmentBaseUrl = validateHost(fulfillmentBaseUrl);
        this.logisticsBaseUrl = validateHost(logisticsBaseUrl);
        this.graphQLBaseUrl = validateHost(graphQLBaseUrl);
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

    /**
     * Sets the OAuth Bearer token used for API calls when no per-call token is provided.
     *
     * <p><b>Security note:</b> The token is stored as a Java {@code String} and will remain
     * in heap memory until garbage collected. To minimize exposure: do not log this
     * configuration object, null out the token reference when it is no longer needed,
     * and avoid storing the configuration longer than the client lifecycle.
     */
    public void setAccessToken(@Nullable String token) {
        this.accessToken = token;
    }

    public @Nullable String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        return hosts;
    }

    public String getFulfillmentBaseUrl() {
        return fulfillmentBaseUrl;
    }

    public String getLogisticsBaseUrl() {
        return logisticsBaseUrl;
    }

    public String getGraphQLBaseUrl() {
        return graphQLBaseUrl;
    }
}
