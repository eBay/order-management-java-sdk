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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.approve;

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
 * Builds and executes requests for operations under /post-order/v2/cancellation/{cancelId}/approve
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApproveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ApproveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}/approve", pathParameters);
    }
    /**
     * Instantiates a new {@link ApproveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}/approve", rawUrl);
    }
    /**
     * This method approves a buyer&apos;s order cancellation request on behalf of the seller.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;If the order is eligible for cancellation and the seller agrees, this method cancels the order and notifies the buyer of the cancellation.  &lt;br/&gt;&lt;br/&gt;This method has no request or response payloads. The &lt;b&gt;cancelId&lt;/b&gt; value is passed in as a path parameter and if the order is successfully cancelled, an HTTP status code of &lt;code&gt;200&lt;/code&gt; is returned. &lt;br&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post() {
        return post(null);
    }
    /**
     * This method approves a buyer&apos;s order cancellation request on behalf of the seller.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;If the order is eligible for cancellation and the seller agrees, this method cancels the order and notifies the buyer of the cancellation.  &lt;br/&gt;&lt;br/&gt;This method has no request or response payloads. The &lt;b&gt;cancelId&lt;/b&gt; value is passed in as a path parameter and if the order is successfully cancelled, an HTTP status code of &lt;code&gt;200&lt;/code&gt; is returned. &lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method approves a buyer&apos;s order cancellation request on behalf of the seller.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;If the order is eligible for cancellation and the seller agrees, this method cancels the order and notifies the buyer of the cancellation.  &lt;br/&gt;&lt;br/&gt;This method has no request or response payloads. The &lt;b&gt;cancelId&lt;/b&gt; value is passed in as a path parameter and if the order is successfully cancelled, an HTTP status code of &lt;code&gt;200&lt;/code&gt; is returned. &lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method approves a buyer&apos;s order cancellation request on behalf of the seller.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;If the order is eligible for cancellation and the seller agrees, this method cancels the order and notifies the buyer of the cancellation.  &lt;br/&gt;&lt;br/&gt;This method has no request or response payloads. The &lt;b&gt;cancelId&lt;/b&gt; value is passed in as a path parameter and if the order is successfully cancelled, an HTTP status code of &lt;code&gt;200&lt;/code&gt; is returned. &lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ApproveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApproveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApproveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
