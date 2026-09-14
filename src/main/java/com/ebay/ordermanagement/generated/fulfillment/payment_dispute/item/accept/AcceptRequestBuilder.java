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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.accept;

import com.ebay.ordermanagement.generated.fulfillment.models.AcceptPaymentDisputeRequest;
import com.ebay.ordermanagement.generated.fulfillment.models.ErrorResponse;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/accept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AcceptRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AcceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/accept", pathParameters);
    }
    /**
     * Instantiates a new {@link AcceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/accept", rawUrl);
    }
    /**
     * This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     * @param body This type is used by base request of the &lt;strong&gt;acceptPaymentDispute&lt;/strong&gt; method.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final AcceptPaymentDisputeRequest body) {
        post(body, null);
    }
    /**
     * This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     * @param body This type is used by base request of the &lt;strong&gt;acceptPaymentDispute&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final AcceptPaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     * @param body This type is used by base request of the &lt;strong&gt;acceptPaymentDispute&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AcceptPaymentDisputeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     * @param body This type is used by base request of the &lt;strong&gt;acceptPaymentDispute&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AcceptPaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AcceptRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
