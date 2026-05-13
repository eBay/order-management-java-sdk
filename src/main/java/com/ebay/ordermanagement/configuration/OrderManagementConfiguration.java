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
    private String fulfillmentBaseUrl = "https://api.ebay.com";
    private String logisticsBaseUrl = "https://api.ebay.com";

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
