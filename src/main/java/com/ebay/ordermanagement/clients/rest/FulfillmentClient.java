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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class FulfillmentClient {
    private final FulfillmentApiClient kiota;
    private final OrderManagementConfiguration config;

    public FulfillmentClient(FulfillmentApiClient kiota, OrderManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<Order> getOrderAsync(
            String orderId, String fieldGroups, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(Params.requireValid("orderId", orderId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldGroups != null) config.queryParameters.fieldGroups = fieldGroups;
            });
        }));
    }

    public CompletableFuture<OrderSearchPagedCollection> getOrdersAsync(
            String fieldGroups, String filter, String limit, String offset, String orderIds, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldGroups != null) config.queryParameters.fieldGroups = fieldGroups;
                if (filter != null) config.queryParameters.filter = filter;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (orderIds != null) config.queryParameters.orderIds = orderIds;
            });
        }));
    }

    public CompletableFuture<Refund> issueRefundAsync(
            String orderId, IssueRefundRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(Params.requireValid("orderId", orderId)).issueRefund().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ShippingFulfillmentPagedCollection> getShippingFulfillmentsAsync(
            String orderId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(Params.requireValid("orderId", orderId)).shippingFulfillment().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> createShippingFulfillmentAsync(
            String orderId, ShippingFulfillmentDetails body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.order().byOrderId(Params.requireValid("orderId", orderId)).shippingFulfillment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ShippingFulfillment> getShippingFulfillmentAsync(
            String fulfillmentId, String orderId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.order().byOrderId(Params.requireValid("orderId", orderId)).shippingFulfillment().byFulfillmentId(Params.requireValid("fulfillmentId", fulfillmentId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<PaymentDispute> getPaymentDisputeAsync(
            String paymentDisputeId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> fetchEvidenceContentAsync(
            String paymentDisputeId, String evidenceId, String fileId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).fetchEvidenceContent().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (evidenceId != null) config.queryParameters.evidenceId = evidenceId;
                if (fileId != null) config.queryParameters.fileId = fileId;
            });
            return null;
        }));
    }

    public CompletableFuture<PaymentDisputeActivityHistory> getActivitiesAsync(
            String paymentDisputeId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).activity().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<DisputeSummaryResponse> getPaymentDisputeSummariesAsync(
            String orderId, String buyerUsername, String openDateFrom, String openDateTo, String paymentDisputeStatus, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDisputeSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (orderId != null) config.queryParameters.orderId = orderId;
                if (buyerUsername != null) config.queryParameters.buyerUsername = buyerUsername;
                if (openDateFrom != null) config.queryParameters.openDateFrom = openDateFrom;
                if (openDateTo != null) config.queryParameters.openDateTo = openDateTo;
                if (paymentDisputeStatus != null) config.queryParameters.paymentDisputeStatus = paymentDisputeStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> contestPaymentDisputeAsync(
            String paymentDisputeId, ContestPaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).contest().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> acceptPaymentDisputeAsync(
            String paymentDisputeId, AcceptPaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).accept().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<FileEvidence> uploadEvidenceFileAsync(
            String paymentDisputeId, byte[] body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).uploadEvidenceFile().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<AddEvidencePaymentDisputeResponse> addEvidenceAsync(
            String paymentDisputeId, AddEvidencePaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).addEvidence().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateEvidenceAsync(
            String paymentDisputeId, UpdateEvidencePaymentDisputeRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentDispute().byPayment_dispute_id(Params.requireValid("paymentDisputeId", paymentDisputeId)).updateEvidence().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }
}
