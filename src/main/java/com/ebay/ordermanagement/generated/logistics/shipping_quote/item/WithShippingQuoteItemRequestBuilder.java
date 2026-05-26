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

package com.ebay.ordermanagement.generated.logistics.shipping_quote.item;

import com.ebay.ordermanagement.generated.logistics.models.ShippingQuote;
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
 * Builds and executes requests for operations under /shipping_quote/{shippingQuoteId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithShippingQuoteItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithShippingQuoteItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithShippingQuoteItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping_quote/{shippingQuoteId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithShippingQuoteItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithShippingQuoteItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping_quote/{shippingQuoteId}", rawUrl);
    }
    /**
     * This method retrieves the complete details of the shipping quote associated with the specified &lt;b&gt;shippingQuoteId&lt;/b&gt; value.  &lt;br&gt;&lt;br&gt;A &quot;shipping quote&quot; pertains to a single specific package and contains a set of shipping &quot;rates&quot; that quote the cost to ship the package by different shipping carriers and services. The quotes are based on the package&apos;s origin, destination, and size.  &lt;br&gt;&lt;br&gt;Call &lt;b&gt;createShippingQuote&lt;/b&gt; to create a &lt;b&gt;shippingQuoteId&lt;/b&gt;.
     * @return a {@link ShippingQuote}
     */
    @jakarta.annotation.Nullable
    public ShippingQuote get() {
        return get(null);
    }
    /**
     * This method retrieves the complete details of the shipping quote associated with the specified &lt;b&gt;shippingQuoteId&lt;/b&gt; value.  &lt;br&gt;&lt;br&gt;A &quot;shipping quote&quot; pertains to a single specific package and contains a set of shipping &quot;rates&quot; that quote the cost to ship the package by different shipping carriers and services. The quotes are based on the package&apos;s origin, destination, and size.  &lt;br&gt;&lt;br&gt;Call &lt;b&gt;createShippingQuote&lt;/b&gt; to create a &lt;b&gt;shippingQuoteId&lt;/b&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingQuote}
     */
    @jakarta.annotation.Nullable
    public ShippingQuote get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingQuote::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the complete details of the shipping quote associated with the specified &lt;b&gt;shippingQuoteId&lt;/b&gt; value.  &lt;br&gt;&lt;br&gt;A &quot;shipping quote&quot; pertains to a single specific package and contains a set of shipping &quot;rates&quot; that quote the cost to ship the package by different shipping carriers and services. The quotes are based on the package&apos;s origin, destination, and size.  &lt;br&gt;&lt;br&gt;Call &lt;b&gt;createShippingQuote&lt;/b&gt; to create a &lt;b&gt;shippingQuoteId&lt;/b&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the complete details of the shipping quote associated with the specified &lt;b&gt;shippingQuoteId&lt;/b&gt; value.  &lt;br&gt;&lt;br&gt;A &quot;shipping quote&quot; pertains to a single specific package and contains a set of shipping &quot;rates&quot; that quote the cost to ship the package by different shipping carriers and services. The quotes are based on the package&apos;s origin, destination, and size.  &lt;br&gt;&lt;br&gt;Call &lt;b&gt;createShippingQuote&lt;/b&gt; to create a &lt;b&gt;shippingQuoteId&lt;/b&gt;.
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
     * @return a {@link WithShippingQuoteItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithShippingQuoteItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithShippingQuoteItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
