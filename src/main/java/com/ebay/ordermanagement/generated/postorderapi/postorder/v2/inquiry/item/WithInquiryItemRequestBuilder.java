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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.InquiryDetailsResponse;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.close.CloseRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.confirm_refund.ConfirmRefundRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.escalate.EscalateRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.issue_refund.IssueRefundRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.provide_refund_info.ProvideRefundInfoRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.provide_shipment_info.ProvideShipmentInfoRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.send_message.SendMessageRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/inquiry/{inquiryId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInquiryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The close property
     * @return a {@link CloseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloseRequestBuilder close() {
        return new CloseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The confirm_refund property
     * @return a {@link ConfirmRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfirmRefundRequestBuilder confirmRefund() {
        return new ConfirmRefundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The escalate property
     * @return a {@link EscalateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EscalateRequestBuilder escalate() {
        return new EscalateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The issue_refund property
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder issueRefund() {
        return new IssueRefundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The provide_refund_info property
     * @return a {@link ProvideRefundInfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvideRefundInfoRequestBuilder provideRefundInfo() {
        return new ProvideRefundInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The provide_shipment_info property
     * @return a {@link ProvideShipmentInfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvideShipmentInfoRequestBuilder provideShipmentInfo() {
        return new ProvideShipmentInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The send_message property
     * @return a {@link SendMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMessageRequestBuilder sendMessage() {
        return new SendMessageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithInquiryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInquiryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithInquiryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInquiryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}", rawUrl);
    }
    /**
     * This method retrieves details about the specified INR inquiry and a summary of the activity to date with respect to the inquiry. The response can also include provisional refund state and an estimated resolution date when the inquiry is in a provisional refund eligible flow. The summary includes any actions taken by the buyer, the seller, the Inquiry service, or customer support representatives.&lt;p&gt;&lt;/p&gt;
     * @return a {@link InquiryDetailsResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InquiryDetailsResponse get() {
        return get(null);
    }
    /**
     * This method retrieves details about the specified INR inquiry and a summary of the activity to date with respect to the inquiry. The response can also include provisional refund state and an estimated resolution date when the inquiry is in a provisional refund eligible flow. The summary includes any actions taken by the buyer, the seller, the Inquiry service, or customer support representatives.&lt;p&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InquiryDetailsResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InquiryDetailsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InquiryDetailsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves details about the specified INR inquiry and a summary of the activity to date with respect to the inquiry. The response can also include provisional refund state and an estimated resolution date when the inquiry is in a provisional refund eligible flow. The summary includes any actions taken by the buyer, the seller, the Inquiry service, or customer support representatives.&lt;p&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves details about the specified INR inquiry and a summary of the activity to date with respect to the inquiry. The response can also include provisional refund state and an estimated resolution date when the inquiry is in a provisional refund eligible flow. The summary includes any actions taken by the buyer, the seller, the Inquiry service, or customer support representatives.&lt;p&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithInquiryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInquiryItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithInquiryItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
