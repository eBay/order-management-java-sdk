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
import com.ebay.ordermanagement.generated.postorderapi.PostOrderApiApiClient;
import com.ebay.ordermanagement.generated.postorderapi.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class PostOrderApiClient {
    private final PostOrderApiApiClient kiota;
    private final OrderManagementConfiguration config;

    public PostOrderApiClient(PostOrderApiApiClient kiota, OrderManagementConfiguration config) {
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

    public CompletableFuture<Void> checkCancellationEligibilityAsync(
            InputStream body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().checkEligibility().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getCancellationAsync(
            String cancelId, String fieldgroups, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().byCancelId(Params.requireValid("cancelId", cancelId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> createCancellationRequestAsync(
            InputStream body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> confirmAsync(
            String cancelId, InputStream body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().byCancelId(Params.requireValid("cancelId", cancelId)).confirm().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> searchCancellationsAsync(
            String cancelId, String creationDateRangeFrom, String creationDateRangeTo, String itemId, String legacyOrderId, String limit, String offset, String role, String sort, String transactionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().search().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (cancelId != null) config.queryParameters.cancelId = cancelId;
                if (creationDateRangeFrom != null) config.queryParameters.creationDateRangeFrom = creationDateRangeFrom;
                if (creationDateRangeTo != null) config.queryParameters.creationDateRangeTo = creationDateRangeTo;
                if (itemId != null) config.queryParameters.itemId = itemId;
                if (legacyOrderId != null) config.queryParameters.legacyOrderId = legacyOrderId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (role != null) config.queryParameters.role = role;
                if (sort != null) config.queryParameters.sort = sort;
                if (transactionId != null) config.queryParameters.transactionId = transactionId;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> approveCancellationAsync(
            String cancelId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().byCancelId(Params.requireValid("cancelId", cancelId)).approve().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> rejectCancellationAsync(
            String cancelId, InputStream body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().cancellation().byCancelId(Params.requireValid("cancelId", cancelId)).reject().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> appealCaseDecisionAsync(
            String caseId, AppealRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).appeal().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<CaseDetailsResponse> getCaseAsync(
            String caseId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<VoluntaryRefundResponse> issueCaseRefundAsync(
            String caseId, CaseVoluntaryRefundRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).issueRefund().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> provideCaseReturnAddressAsync(
            String caseId, ReturnAddressRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).provideReturnAddress().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> closeCaseAsync(
            String caseId, BuyerCloseCaseRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).close().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> provideCaseShipmentInfoAsync(
            String caseId, ProvideShipmentInfoRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().casemanagement().byCaseId(Params.requireValid("caseId", caseId)).provideShipmentInfo().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<CaseSearchResponse> searchCasesAsync(
            String caseCreationDateRangeFrom, String caseCreationDateRangeTo, String caseStatusFilter, String fieldgroups, String itemId, String limit, String offset, String orderId, String returnId, String sort, String transactionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().casemanagement().search().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (caseCreationDateRangeFrom != null) config.queryParameters.caseCreationDateRangeFrom = caseCreationDateRangeFrom;
                if (caseCreationDateRangeTo != null) config.queryParameters.caseCreationDateRangeTo = caseCreationDateRangeTo;
                if (caseStatusFilter != null) config.queryParameters.caseStatusFilter = caseStatusFilter;
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
                if (itemId != null) config.queryParameters.itemId = itemId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (orderId != null) config.queryParameters.orderId = orderId;
                if (returnId != null) config.queryParameters.returnId = returnId;
                if (sort != null) config.queryParameters.sort = sort;
                if (transactionId != null) config.queryParameters.transactionId = transactionId;
            });
        }));
    }

    public CompletableFuture<Void> createInquiryAsync(
            CreateInquiryRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().emptyPathSegment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> sendInquiryMessageAsync(
            String inquiryId, SendMessageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).sendMessage().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> escalateInquiryAsync(
            String inquiryId, EscalateInquiryRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).escalate().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> closeInquiryAsync(
            String inquiryId, BuyerCloseInquiryRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).close().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> confirmInquiryRefundAsync(
            String inquiryId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).confirmRefund().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InquiryDetailsResponse> getInquiryAsync(
            String inquiryId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<VoluntaryRefundResponse> issueInquiryRefundAsync(
            String inquiryId, InquiryVoluntaryRefundRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).issueRefund().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> provideInquiryShipmentInfoAsync(
            String inquiryId, ShipmentInfoRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).provideShipmentInfo().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<InquirySearchResponse> searchInquiriesAsync(
            String fieldgroups, String inquiryCreationDateRangeFrom, String inquiryCreationDateRangeTo, String inquiryStatus, String itemId, String limit, String offset, String orderId, String sort, String transactionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.postOrder().v2().inquiry().search().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
                if (inquiryCreationDateRangeFrom != null) config.queryParameters.inquiryCreationDateRangeFrom = inquiryCreationDateRangeFrom;
                if (inquiryCreationDateRangeTo != null) config.queryParameters.inquiryCreationDateRangeTo = inquiryCreationDateRangeTo;
                if (inquiryStatus != null) config.queryParameters.inquiryStatus = inquiryStatus;
                if (itemId != null) config.queryParameters.itemId = itemId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (orderId != null) config.queryParameters.orderId = orderId;
                if (sort != null) config.queryParameters.sort = sort;
                if (transactionId != null) config.queryParameters.transactionId = transactionId;
            });
        }));
    }

    public CompletableFuture<Void> provideInquiryRefundInfoAsync(
            String inquiryId, SellerProvideRefundInfoRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().inquiry().byInquiryId(Params.requireValid("inquiryId", inquiryId)).provideRefundInfo().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> createReturnRequestAsync(
            CreateReturnRequest body, String fieldgroups, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getReturnAsync(
            String returnId, String fieldgroups, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> searchReturnsAsync(
            String creationDateRangeFrom, String creationDateRangeTo, String itemId, String limit, String offset, String orderId, String returnId, String returnState, String role, String sort, String states, String transactionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().search().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (creationDateRangeFrom != null) config.queryParameters.creationDateRangeFrom = creationDateRangeFrom;
                if (creationDateRangeTo != null) config.queryParameters.creationDateRangeTo = creationDateRangeTo;
                if (itemId != null) config.queryParameters.itemId = itemId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (orderId != null) config.queryParameters.orderId = orderId;
                if (returnId != null) config.queryParameters.returnId = returnId;
                if (returnState != null) config.queryParameters.returnState = returnState;
                if (role != null) config.queryParameters.role = role;
                if (sort != null) config.queryParameters.sort = sort;
                if (states != null) config.queryParameters.states = states;
                if (transactionId != null) config.queryParameters.transactionId = transactionId;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> escalateReturnAsync(
            String returnId, EscalateRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).escalate().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> processReturnRequestAsync(
            String returnId, DecideReturnRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).decide().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> markItemReceivedAsync(
            String returnId, MarkAsReceivedRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).markAsReceived().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> issueReturnRefundAsync(
            String returnId, IssueRefundRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).issueRefund().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getShipmentTrackingInfoAsync(
            String returnId, String carrierUsed, String trackingNumber, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).tracking().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (carrierUsed != null) config.queryParameters.carrierUsed = carrierUsed;
                if (trackingNumber != null) config.queryParameters.trackingNumber = trackingNumber;
            });
            return null;
        }));
    }

    public CompletableFuture<Void> sendReturnMessageAsync(
            String returnId, SendMessageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).sendMessage().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> addShippingLabelInfoAsync(
            String returnId, ProvideLabelRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).addShippingLabel().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> uploadReturnFileAsync(
            String returnId, UploadFileRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).file().upload().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getReturnFilesAsync(
            String returnId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().byReturnId(Params.requireValid("returnId", returnId)).files().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getReturnPreferencesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().preference().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> setReturnPreferencesAsync(
            InputStream body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.postOrder().v2().returnEscaped().preference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }
}
