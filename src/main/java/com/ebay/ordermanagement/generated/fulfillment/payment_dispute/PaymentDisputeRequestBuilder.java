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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute;

import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.WithPaymentDisputeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /payment_dispute
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item collection
     * @param payment_dispute_id This parameter is used to specify the unique identifier of the payment dispute being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method to retrieve payment dispute IDs.
     * @return a {@link WithPaymentDisputeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentDisputeItemRequestBuilder byPayment_dispute_id(@jakarta.annotation.Nonnull final String payment_dispute_id) {
        Objects.requireNonNull(payment_dispute_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payment_dispute_id", payment_dispute_id);
        return new WithPaymentDisputeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentDisputeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentDisputeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentDisputeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentDisputeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute", rawUrl);
    }
}
