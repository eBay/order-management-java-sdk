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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.check_eligibility.CheckEligibilityRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.WithCancelItemRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.search.SearchRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/cancellation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancellationRequestBuilder extends BaseRequestBuilder {
    /**
     * The check_eligibility property
     * @return a {@link CheckEligibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckEligibilityRequestBuilder checkEligibility() {
        return new CheckEligibilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.postorderapi.postOrder.v2.cancellation.item collection
     * @param cancelId Input the unique identifier for the cancellation request you wish to retrieve. The cancellation ID value is passed in as part of the call URI.
     * @return a {@link WithCancelItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCancelItemRequestBuilder byCancelId(@jakarta.annotation.Nonnull final String cancelId) {
        Objects.requireNonNull(cancelId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cancelId", cancelId);
        return new WithCancelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CancellationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancellationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation", pathParameters);
    }
    /**
     * Instantiates a new {@link CancellationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancellationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation", rawUrl);
    }
    /**
     * This method initiates an order cancellation on behalf of a seller and, if needed, you can also create an order cancellation on behalf of a buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;  &lt;p&gt;The buyer use-case for this method provides a way for you to programmatically test your cancellation flows in the Sandbox, as buyers in a production environment normally request order cancellations via the eBay web flows.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Call &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; before calling this method to ensure the order being considered is eligible to be cancelled.&lt;/p&gt;  &lt;p&gt;Orders are eligible for cancellation based on various criteria, such as the cancellation cutoff period for the eBay marketplace on which the order was placed. As an example, the cutoff for &lt;code&gt;EBAY_US&lt;/code&gt; is 1 hour after purchase, after which the order becomes ineligible for cancellation. If the order is not eligible for cancellation, you can notify the buyer or seller so they don&apos;t proceed with a cancellation request.&lt;/p&gt;  &lt;p&gt;When a buyer cancels an order after purchase, it is up to the seller to either reject or approve it the request by calling &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/reject&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/approve&lt;/b&gt; methods, respectively.&lt;p&gt;   &lt;p&gt;Sellers can call &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; to directly cancel the order.&lt;/p&gt; &lt;p&gt;Sellers may cancel an order if they run out of stock on an item and are unable to fulfill the order for up to 30 days after the sale. While the &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; method can be used to check for order cancellation eligibility, the &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; method also returns eligibility information in the response. If the order&apos;s cancellation eligibility has changed, examine the &lt;b&gt;failureReason&lt;/b&gt; field for why the cancellation failed.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers may cancel an order up to 30 days after the sale. However, if a seller has run out of stock on an item and cannot fulfill the order, a cancellation can result in a defect on the seller&apos;s account. Also, note there is no negative effect on the seller&apos;s account if the seller is cancelling the order at the request of the buyer.&lt;/p&gt;   &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, an entire eligible order can be cancelled, but not individual order line items. For the order to be eligible for cancellation, all of its order line items must be eligible.&lt;/p&gt;  
     * @param body Binary request body
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final InputStream body) {
        return post(body, null);
    }
    /**
     * This method initiates an order cancellation on behalf of a seller and, if needed, you can also create an order cancellation on behalf of a buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;  &lt;p&gt;The buyer use-case for this method provides a way for you to programmatically test your cancellation flows in the Sandbox, as buyers in a production environment normally request order cancellations via the eBay web flows.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Call &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; before calling this method to ensure the order being considered is eligible to be cancelled.&lt;/p&gt;  &lt;p&gt;Orders are eligible for cancellation based on various criteria, such as the cancellation cutoff period for the eBay marketplace on which the order was placed. As an example, the cutoff for &lt;code&gt;EBAY_US&lt;/code&gt; is 1 hour after purchase, after which the order becomes ineligible for cancellation. If the order is not eligible for cancellation, you can notify the buyer or seller so they don&apos;t proceed with a cancellation request.&lt;/p&gt;  &lt;p&gt;When a buyer cancels an order after purchase, it is up to the seller to either reject or approve it the request by calling &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/reject&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/approve&lt;/b&gt; methods, respectively.&lt;p&gt;   &lt;p&gt;Sellers can call &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; to directly cancel the order.&lt;/p&gt; &lt;p&gt;Sellers may cancel an order if they run out of stock on an item and are unable to fulfill the order for up to 30 days after the sale. While the &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; method can be used to check for order cancellation eligibility, the &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; method also returns eligibility information in the response. If the order&apos;s cancellation eligibility has changed, examine the &lt;b&gt;failureReason&lt;/b&gt; field for why the cancellation failed.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers may cancel an order up to 30 days after the sale. However, if a seller has run out of stock on an item and cannot fulfill the order, a cancellation can result in a defect on the seller&apos;s account. Also, note there is no negative effect on the seller&apos;s account if the seller is cancelling the order at the request of the buyer.&lt;/p&gt;   &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, an entire eligible order can be cancelled, but not individual order line items. For the order to be eligible for cancellation, all of its order line items must be eligible.&lt;/p&gt;  
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method initiates an order cancellation on behalf of a seller and, if needed, you can also create an order cancellation on behalf of a buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;  &lt;p&gt;The buyer use-case for this method provides a way for you to programmatically test your cancellation flows in the Sandbox, as buyers in a production environment normally request order cancellations via the eBay web flows.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Call &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; before calling this method to ensure the order being considered is eligible to be cancelled.&lt;/p&gt;  &lt;p&gt;Orders are eligible for cancellation based on various criteria, such as the cancellation cutoff period for the eBay marketplace on which the order was placed. As an example, the cutoff for &lt;code&gt;EBAY_US&lt;/code&gt; is 1 hour after purchase, after which the order becomes ineligible for cancellation. If the order is not eligible for cancellation, you can notify the buyer or seller so they don&apos;t proceed with a cancellation request.&lt;/p&gt;  &lt;p&gt;When a buyer cancels an order after purchase, it is up to the seller to either reject or approve it the request by calling &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/reject&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/approve&lt;/b&gt; methods, respectively.&lt;p&gt;   &lt;p&gt;Sellers can call &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; to directly cancel the order.&lt;/p&gt; &lt;p&gt;Sellers may cancel an order if they run out of stock on an item and are unable to fulfill the order for up to 30 days after the sale. While the &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; method can be used to check for order cancellation eligibility, the &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; method also returns eligibility information in the response. If the order&apos;s cancellation eligibility has changed, examine the &lt;b&gt;failureReason&lt;/b&gt; field for why the cancellation failed.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers may cancel an order up to 30 days after the sale. However, if a seller has run out of stock on an item and cannot fulfill the order, a cancellation can result in a defect on the seller&apos;s account. Also, note there is no negative effect on the seller&apos;s account if the seller is cancelling the order at the request of the buyer.&lt;/p&gt;   &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, an entire eligible order can be cancelled, but not individual order line items. For the order to be eligible for cancellation, all of its order line items must be eligible.&lt;/p&gt;  
     * @param body Binary request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InputStream body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method initiates an order cancellation on behalf of a seller and, if needed, you can also create an order cancellation on behalf of a buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;  &lt;p&gt;The buyer use-case for this method provides a way for you to programmatically test your cancellation flows in the Sandbox, as buyers in a production environment normally request order cancellations via the eBay web flows.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Call &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; before calling this method to ensure the order being considered is eligible to be cancelled.&lt;/p&gt;  &lt;p&gt;Orders are eligible for cancellation based on various criteria, such as the cancellation cutoff period for the eBay marketplace on which the order was placed. As an example, the cutoff for &lt;code&gt;EBAY_US&lt;/code&gt; is 1 hour after purchase, after which the order becomes ineligible for cancellation. If the order is not eligible for cancellation, you can notify the buyer or seller so they don&apos;t proceed with a cancellation request.&lt;/p&gt;  &lt;p&gt;When a buyer cancels an order after purchase, it is up to the seller to either reject or approve it the request by calling &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/reject&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/cancellation/{cancelId}/approve&lt;/b&gt; methods, respectively.&lt;p&gt;   &lt;p&gt;Sellers can call &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; to directly cancel the order.&lt;/p&gt; &lt;p&gt;Sellers may cancel an order if they run out of stock on an item and are unable to fulfill the order for up to 30 days after the sale. While the &lt;b&gt;POST /post-order/v2/cancellation/check_eligibility&lt;/b&gt; method can be used to check for order cancellation eligibility, the &lt;b&gt;POST /post-order/v2/cancellation&lt;/b&gt; method also returns eligibility information in the response. If the order&apos;s cancellation eligibility has changed, examine the &lt;b&gt;failureReason&lt;/b&gt; field for why the cancellation failed.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers may cancel an order up to 30 days after the sale. However, if a seller has run out of stock on an item and cannot fulfill the order, a cancellation can result in a defect on the seller&apos;s account. Also, note there is no negative effect on the seller&apos;s account if the seller is cancelling the order at the request of the buyer.&lt;/p&gt;   &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, an entire eligible order can be cancelled, but not individual order line items. For the order to be eligible for cancellation, all of its order line items must be eligible.&lt;/p&gt;  
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        requestInfo.setStreamContent(body, "application/xml");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CancellationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancellationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CancellationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
