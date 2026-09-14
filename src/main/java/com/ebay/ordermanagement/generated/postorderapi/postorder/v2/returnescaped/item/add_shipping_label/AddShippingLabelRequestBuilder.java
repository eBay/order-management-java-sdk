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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.add_shipping_label;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.ProvideLabelRequest;
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
 * Builds and executes requests for operations under /post-order/v2/return/{returnId}/add_shipping_label
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddShippingLabelRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AddShippingLabelRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddShippingLabelRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}/add_shipping_label", pathParameters);
    }
    /**
     * Instantiates a new {@link AddShippingLabelRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddShippingLabelRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}/add_shipping_label", rawUrl);
    }
    /**
     * The primary function of this seller-facing method is to create a return shipping label for the buyer. However, this method can also be used on behalf of the seller to provide more information to the buyer about the shipping label. For example, the seller may want to use this method to inform the buyer that an eBay or seller-provided shipping label is already available for use.&lt;br/&gt;&lt;br/&gt;The seller may need to first call &lt;b&gt;POST /post-order/v2/return/{returnId}/initiate_shipping_label&lt;/b&gt; method before using this method.&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final ProvideLabelRequest body) {
        return post(body, null);
    }
    /**
     * The primary function of this seller-facing method is to create a return shipping label for the buyer. However, this method can also be used on behalf of the seller to provide more information to the buyer about the shipping label. For example, the seller may want to use this method to inform the buyer that an eBay or seller-provided shipping label is already available for use.&lt;br/&gt;&lt;br/&gt;The seller may need to first call &lt;b&gt;POST /post-order/v2/return/{returnId}/initiate_shipping_label&lt;/b&gt; method before using this method.&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final ProvideLabelRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * The primary function of this seller-facing method is to create a return shipping label for the buyer. However, this method can also be used on behalf of the seller to provide more information to the buyer about the shipping label. For example, the seller may want to use this method to inform the buyer that an eBay or seller-provided shipping label is already available for use.&lt;br/&gt;&lt;br/&gt;The seller may need to first call &lt;b&gt;POST /post-order/v2/return/{returnId}/initiate_shipping_label&lt;/b&gt; method before using this method.&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProvideLabelRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * The primary function of this seller-facing method is to create a return shipping label for the buyer. However, this method can also be used on behalf of the seller to provide more information to the buyer about the shipping label. For example, the seller may want to use this method to inform the buyer that an eBay or seller-provided shipping label is already available for use.&lt;br/&gt;&lt;br/&gt;The seller may need to first call &lt;b&gt;POST /post-order/v2/return/{returnId}/initiate_shipping_label&lt;/b&gt; method before using this method.&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProvideLabelRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AddShippingLabelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddShippingLabelRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddShippingLabelRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
