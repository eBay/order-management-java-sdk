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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.decide;

import com.ebay.ordermanagement.generated.postorderapi.models.DecideReturnRequest;
import com.ebay.ordermanagement.generated.postorderapi.models.Error;
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
 * Builds and executes requests for operations under /post-order/v2/return/{returnId}/decide
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DecideRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DecideRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DecideRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}/decide", pathParameters);
    }
    /**
     * Instantiates a new {@link DecideRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DecideRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}/decide", rawUrl);
    }
    /**
     * This method can be used on behalf of a seller or buyer to perform an action against a return request. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload.&lt;/span&gt;Some of the actions that sellers can initiate with this method including approving or declining the return request, offering a partial refund solution to the buyer, or providing a Return Merchandise Authorization (RMA) number to the buyer. &lt;br/&gt;&lt;br/&gt;Buyers can use this method to accept or decline a partial refund offer.
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final DecideReturnRequest body) {
        return post(body, null);
    }
    /**
     * This method can be used on behalf of a seller or buyer to perform an action against a return request. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload.&lt;/span&gt;Some of the actions that sellers can initiate with this method including approving or declining the return request, offering a partial refund solution to the buyer, or providing a Return Merchandise Authorization (RMA) number to the buyer. &lt;br/&gt;&lt;br/&gt;Buyers can use this method to accept or decline a partial refund offer.
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final DecideReturnRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method can be used on behalf of a seller or buyer to perform an action against a return request. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload.&lt;/span&gt;Some of the actions that sellers can initiate with this method including approving or declining the return request, offering a partial refund solution to the buyer, or providing a Return Merchandise Authorization (RMA) number to the buyer. &lt;br/&gt;&lt;br/&gt;Buyers can use this method to accept or decline a partial refund offer.
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DecideReturnRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used on behalf of a seller or buyer to perform an action against a return request. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload.&lt;/span&gt;Some of the actions that sellers can initiate with this method including approving or declining the return request, offering a partial refund solution to the buyer, or providing a Return Merchandise Authorization (RMA) number to the buyer. &lt;br/&gt;&lt;br/&gt;Buyers can use this method to accept or decline a partial refund offer.
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DecideReturnRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DecideRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecideRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DecideRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
