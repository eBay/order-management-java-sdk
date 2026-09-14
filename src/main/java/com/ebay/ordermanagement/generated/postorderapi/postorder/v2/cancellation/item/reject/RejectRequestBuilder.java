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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.reject;

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
 * Builds and executes requests for operations under /post-order/v2/cancellation/{cancelId}/reject
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RejectRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RejectRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RejectRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}/reject", pathParameters);
    }
    /**
     * Instantiates a new {@link RejectRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RejectRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}/reject", rawUrl);
    }
    /**
     * This method is used on behalf of a seller to reject a buyer&apos;s order cancellation request.  &lt;br/&gt;&lt;br/&gt;A seller often rejects cancellation requests if one or more line items in the order have already been shipped to the buyer (which makes the order ineligible to be cancelled). &lt;br/&gt;&lt;br/&gt;If the seller has shipped all or part of the order, it is good practice to pass &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; in the request payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; The &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; fields are optional in the request payload. If you do &lt;i&gt;not&lt;/i&gt; include either of these fields, you must submit a payload consisting of just the opening and closing braces (&lt;code&gt;{ }&lt;/code&gt;).&lt;/p&gt;
     * @param body Binary request body
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final InputStream body) {
        return post(body, null);
    }
    /**
     * This method is used on behalf of a seller to reject a buyer&apos;s order cancellation request.  &lt;br/&gt;&lt;br/&gt;A seller often rejects cancellation requests if one or more line items in the order have already been shipped to the buyer (which makes the order ineligible to be cancelled). &lt;br/&gt;&lt;br/&gt;If the seller has shipped all or part of the order, it is good practice to pass &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; in the request payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; The &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; fields are optional in the request payload. If you do &lt;i&gt;not&lt;/i&gt; include either of these fields, you must submit a payload consisting of just the opening and closing braces (&lt;code&gt;{ }&lt;/code&gt;).&lt;/p&gt;
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
     * This method is used on behalf of a seller to reject a buyer&apos;s order cancellation request.  &lt;br/&gt;&lt;br/&gt;A seller often rejects cancellation requests if one or more line items in the order have already been shipped to the buyer (which makes the order ineligible to be cancelled). &lt;br/&gt;&lt;br/&gt;If the seller has shipped all or part of the order, it is good practice to pass &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; in the request payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; The &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; fields are optional in the request payload. If you do &lt;i&gt;not&lt;/i&gt; include either of these fields, you must submit a payload consisting of just the opening and closing braces (&lt;code&gt;{ }&lt;/code&gt;).&lt;/p&gt;
     * @param body Binary request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InputStream body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used on behalf of a seller to reject a buyer&apos;s order cancellation request.  &lt;br/&gt;&lt;br/&gt;A seller often rejects cancellation requests if one or more line items in the order have already been shipped to the buyer (which makes the order ineligible to be cancelled). &lt;br/&gt;&lt;br/&gt;If the seller has shipped all or part of the order, it is good practice to pass &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; in the request payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; The &lt;b&gt;shipmentDate&lt;/b&gt; and &lt;b&gt;trackingNumber&lt;/b&gt; fields are optional in the request payload. If you do &lt;i&gt;not&lt;/i&gt; include either of these fields, you must submit a payload consisting of just the opening and closing braces (&lt;code&gt;{ }&lt;/code&gt;).&lt;/p&gt;
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
     * @return a {@link RejectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RejectRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RejectRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
