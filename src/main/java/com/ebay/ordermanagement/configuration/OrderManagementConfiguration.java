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
    // Base URLs for each API
    private String fulfillmentBaseUrl = "https://api.ebay.com/sell/fulfillment/v1";
    private String logisticsBaseUrl = "https://api.ebay.com/sell/logistics/v1";
    private String graphQLBaseUrl = "https://apig.ebay.com/graphql";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getFulfillmentBaseUrl() { return fulfillmentBaseUrl; }
    public void setFulfillmentBaseUrl(String fulfillmentBaseUrl) { this.fulfillmentBaseUrl = fulfillmentBaseUrl; }

    public String getLogisticsBaseUrl() { return logisticsBaseUrl; }
    public void setLogisticsBaseUrl(String logisticsBaseUrl) { this.logisticsBaseUrl = logisticsBaseUrl; }

    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }
    public void setGraphQLBaseUrl(String graphQLBaseUrl) { this.graphQLBaseUrl = graphQLBaseUrl; }

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

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
