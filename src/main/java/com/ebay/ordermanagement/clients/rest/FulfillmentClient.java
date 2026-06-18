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
import com.ebay.ordermanagement.generated.fulfillment.FulfillmentApiClient;
import com.ebay.ordermanagement.generated.fulfillment.models.*;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Fulfillment API.
 * Provides methods to manage orders, shipping fulfillments, and payment disputes.
 */
public final class FulfillmentClient {
    private final FulfillmentApiClient kiota;
    private final OrderManagementConfiguration config;

    public FulfillmentClient(FulfillmentApiClient kiota, OrderManagementConfiguration config) {
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

    // ── Orders ────────────────────────────────────────────────────────────────

    /**
     * Get a specific order by ID.
     */
    public CompletableFuture<Order> getOrderAsync(
            String orderId, String fieldGroups, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("orderId", orderId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(orderId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldGroups != null) {
                    config.queryParameters.fieldGroups = fieldGroups;
                }
            });
        }));
    }

    /**
     * Search for and retrieve orders.
     */
    public CompletableFuture<OrderSearchPagedCollection> getOrdersAsync(
            String fieldGroups, String filter, String limit, String offset, String orderIds,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldGroups != null) {
                    config.queryParameters.fieldGroups = fieldGroups;
                }
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (orderIds != null) {
                    config.queryParameters.orderIds = orderIds;
                }
            });
        }));
    }

    /**
     * Issue a refund for an order.
     */
    public CompletableFuture<Refund> issueRefundAsync(
            String orderId, IssueRefundRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("orderId", orderId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(orderId).issueRefund().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    // ── Shipping Fulfillments ─────────────────────────────────────────────────

    /**
     * Get all shipping fulfillments for an order.
     */
    public CompletableFuture<ShippingFulfillmentPagedCollection> getShippingFulfillmentsAsync(
            String orderId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("orderId", orderId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(orderId).shippingFulfillment().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Create a shipping fulfillment for an order.
     */
    public CompletableFuture<com.ebay.ordermanagement.generated.fulfillment.order.item.shipping_fulfillment.ShippingFulfillmentPostResponse> createShippingFulfillmentAsync(
            String orderId, ShippingFulfillmentDetails body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("orderId", orderId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(orderId).shippingFulfillment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get a specific shipping fulfillment.
     */
    public CompletableFuture<ShippingFulfillment> getShippingFulfillmentAsync(
            String orderId, String fulfillmentId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("orderId", orderId);
        Params.requireValid("fulfillmentId", fulfillmentId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(orderId).shippingFulfillment().byFulfillmentId(fulfillmentId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    // ── Payment Disputes ──────────────────────────────────────────────────────

    /**
     * Get a specific payment dispute.
     */
    public CompletableFuture<PaymentDispute> getPaymentDisputeAsync(
            String paymentDisputeId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Get payment dispute summaries.
     */
    public CompletableFuture<DisputeSummaryResponse> getPaymentDisputeSummariesAsync(
            String buyerUsername, String limit, String offset, String openDateFrom, String openDateTo,
            String orderId, String paymentDisputeStatus, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDisputeSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (buyerUsername != null) {
                    config.queryParameters.buyerUsername = buyerUsername;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (openDateFrom != null) {
                    config.queryParameters.openDateFrom = openDateFrom;
                }
                if (openDateTo != null) {
                    config.queryParameters.openDateTo = openDateTo;
                }
                if (orderId != null) {
                    config.queryParameters.orderId = orderId;
                }
                if (paymentDisputeStatus != null) {
                    config.queryParameters.paymentDisputeStatus = paymentDisputeStatus;
                }
            });
        }));
    }

    /**
     * Get activities for a payment dispute.
     */
    public CompletableFuture<PaymentDisputeActivityHistory> getActivitiesAsync(
            String paymentDisputeId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).activity().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Accept a payment dispute.
     */
    public CompletableFuture<Void> acceptPaymentDisputeAsync(
            String paymentDisputeId, AcceptPaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.runAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).accept().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Contest a payment dispute.
     */
    public CompletableFuture<Void> contestPaymentDisputeAsync(
            String paymentDisputeId, ContestPaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.runAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).contest().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Add evidence to a payment dispute.
     */
    public CompletableFuture<AddEvidencePaymentDisputeResponse> addEvidenceAsync(
            String paymentDisputeId, AddEvidencePaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).addEvidence().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Update evidence for a payment dispute.
     */
    public CompletableFuture<Void> updateEvidenceAsync(
            String paymentDisputeId, UpdateEvidencePaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.runAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).updateEvidence().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Fetch evidence content for a payment dispute.
     */
    public CompletableFuture<InputStream> fetchEvidenceContentAsync(
            String paymentDisputeId, String evidenceId, String fileId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).fetchEvidenceContent().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (evidenceId != null) {
                    config.queryParameters.evidenceId = evidenceId;
                }
                if (fileId != null) {
                    config.queryParameters.fileId = fileId;
                }
            });
        }));
    }

    /**
     * Upload evidence file for a payment dispute.
     */
    public CompletableFuture<FileEvidence> uploadEvidenceFileAsync(
            String paymentDisputeId, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("paymentDisputeId", paymentDisputeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(paymentDisputeId).uploadEvidenceFile().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}
