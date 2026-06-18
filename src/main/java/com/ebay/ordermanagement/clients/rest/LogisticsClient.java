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

package com.ebay.ordermanagement.clients.rest;

import com.ebay.ordermanagement.configuration.OrderManagementConfiguration;
import com.ebay.ordermanagement.configuration.RequestOptions;
import com.ebay.ordermanagement.configuration.TokenContext;
import com.ebay.ordermanagement.generated.logistics.LogisticsApiClient;
import com.ebay.ordermanagement.generated.logistics.models.*;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Logistics API.
 * Provides methods to manage shipping quotes and shipments.
 */
public final class LogisticsClient {
    private final LogisticsApiClient kiota;
    private final OrderManagementConfiguration config;

    public LogisticsClient(LogisticsApiClient kiota, OrderManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Shipping Quotes ───────────────────────────────────────────────────────

    /**
     * Create a shipping quote.
     */
    public CompletableFuture<ShippingQuote> createShippingQuoteAsync(
            ShippingQuoteRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shippingQuote().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get a specific shipping quote.
     */
    public CompletableFuture<ShippingQuote> getShippingQuoteAsync(
            String shippingQuoteId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("shippingQuoteId", shippingQuoteId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shippingQuote().byShippingQuoteId(shippingQuoteId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    // ── Shipments ─────────────────────────────────────────────────────────────

    /**
     * Create a shipment from a shipping quote.
     */
    public CompletableFuture<Shipment> createFromShippingQuoteAsync(
            CreateShipmentFromQuoteRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipment().createFromShippingQuote().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get a specific shipment.
     */
    public CompletableFuture<Shipment> getShipmentAsync(
            String shipmentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("shipmentId", shipmentId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipment().byShipmentId(shipmentId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Cancel a shipment.
     */
    public CompletableFuture<Shipment> cancelShipmentAsync(
            String shipmentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("shipmentId", shipmentId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipment().byShipmentId(shipmentId).cancel().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Download label file for a shipment.
     */
    public CompletableFuture<InputStream> downloadLabelFileAsync(
            String shipmentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("shipmentId", shipmentId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipment().byShipmentId(shipmentId).downloadLabelFile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
