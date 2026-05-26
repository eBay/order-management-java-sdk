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

package com.ebay.ordermanagement.generated.logistics.shipping_quote;

import com.ebay.ordermanagement.generated.logistics.models.ShippingQuote;
import com.ebay.ordermanagement.generated.logistics.models.ShippingQuoteRequest;
import com.ebay.ordermanagement.generated.logistics.shipping_quote.item.WithShippingQuoteItemRequestBuilder;
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
 * Builds and executes requests for operations under /shipping_quote
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingQuoteRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.logistics.shipping_quote.item collection
     * @param shippingQuoteId This path parameter specifies the unique eBay-assigned ID of the shipping quote you want to retrieve.&lt;br&gt;&lt;br&gt;The &lt;b&gt;shippingQuoteId&lt;/b&gt; value is generated and returned by the &lt;a href=&quot;/api-docs/sell/logistics/resources/shipping_quote/methods/createShippingQuote&quot; target=&quot;_blank&quot;&gt;createShippingQuote&lt;/a&gt; method.
     * @return a {@link WithShippingQuoteItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithShippingQuoteItemRequestBuilder byShippingQuoteId(@jakarta.annotation.Nonnull final String shippingQuoteId) {
        Objects.requireNonNull(shippingQuoteId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shippingQuoteId", shippingQuoteId);
        return new WithShippingQuoteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ShippingQuoteRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShippingQuoteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping_quote", pathParameters);
    }
    /**
     * Instantiates a new {@link ShippingQuoteRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShippingQuoteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping_quote", rawUrl);
    }
    /**
     * The &lt;b&gt;createShippingQuote&lt;/b&gt; method returns a &lt;i&gt;shipping quote &lt;/i&gt; that contains a list of live &quot;rates.&quot;  &lt;br&gt;&lt;br&gt;Each rate represents an offer made by a shipping carrier for a specific service and each offer has a live quote for the base service cost. Rates have a time window in which they are &quot;live,&quot; and rates expire when their purchase window ends. If offered by the carrier, rates can include shipping options (and their associated prices), and users can add any offered shipping option to the base service should they desire.  Also, depending on the services required, rates can also include pickup and delivery windows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate is for a single package and is based on the following information: &lt;ul&gt;&lt;li&gt;The shipping origin&lt;/li&gt; &lt;li&gt;The shipping destination&lt;/li&gt; &lt;li&gt;The package size (weight and dimensions)&lt;/li&gt;&lt;/ul&gt;  Rates are identified by a unique eBay-assigned &lt;b&gt;rateId&lt;/b&gt; and rates are based on price points, pickup and delivery time frames, and other user requirements. Because each rate offered must be compliant with the eBay shipping program, all rates reflect eBay-negotiated prices.  &lt;br&gt;&lt;br&gt;The various rates returned in a shipping quote offer the user a choice from which they can choose a shipping service that best fits their needs. Select the rate for your shipment and using the associated &lt;b&gt;rateId&lt;/b&gt;, call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to create a shipment and generate a shipping label that you can use to ship the package.
     * @param body This complex type defines the request body for &lt;b&gt;createShippingQuote&lt;/b&gt;. Sellers &lt;i&gt;request a quote&lt;/i&gt; for a shipment by defining the &quot;To&quot; and &quot;From&quot; addresses for the package, plus the package&apos;s size.  &lt;br&gt;&lt;br&gt;Carriers respond by offering up a &quot;rate&quot; for the service of theirs that best fits seller&apos;s needs.
     * @return a {@link ShippingQuote}
     */
    @jakarta.annotation.Nullable
    public ShippingQuote post(@jakarta.annotation.Nonnull final ShippingQuoteRequest body) {
        return post(body, null);
    }
    /**
     * The &lt;b&gt;createShippingQuote&lt;/b&gt; method returns a &lt;i&gt;shipping quote &lt;/i&gt; that contains a list of live &quot;rates.&quot;  &lt;br&gt;&lt;br&gt;Each rate represents an offer made by a shipping carrier for a specific service and each offer has a live quote for the base service cost. Rates have a time window in which they are &quot;live,&quot; and rates expire when their purchase window ends. If offered by the carrier, rates can include shipping options (and their associated prices), and users can add any offered shipping option to the base service should they desire.  Also, depending on the services required, rates can also include pickup and delivery windows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate is for a single package and is based on the following information: &lt;ul&gt;&lt;li&gt;The shipping origin&lt;/li&gt; &lt;li&gt;The shipping destination&lt;/li&gt; &lt;li&gt;The package size (weight and dimensions)&lt;/li&gt;&lt;/ul&gt;  Rates are identified by a unique eBay-assigned &lt;b&gt;rateId&lt;/b&gt; and rates are based on price points, pickup and delivery time frames, and other user requirements. Because each rate offered must be compliant with the eBay shipping program, all rates reflect eBay-negotiated prices.  &lt;br&gt;&lt;br&gt;The various rates returned in a shipping quote offer the user a choice from which they can choose a shipping service that best fits their needs. Select the rate for your shipment and using the associated &lt;b&gt;rateId&lt;/b&gt;, call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to create a shipment and generate a shipping label that you can use to ship the package.
     * @param body This complex type defines the request body for &lt;b&gt;createShippingQuote&lt;/b&gt;. Sellers &lt;i&gt;request a quote&lt;/i&gt; for a shipment by defining the &quot;To&quot; and &quot;From&quot; addresses for the package, plus the package&apos;s size.  &lt;br&gt;&lt;br&gt;Carriers respond by offering up a &quot;rate&quot; for the service of theirs that best fits seller&apos;s needs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingQuote}
     */
    @jakarta.annotation.Nullable
    public ShippingQuote post(@jakarta.annotation.Nonnull final ShippingQuoteRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingQuote::createFromDiscriminatorValue);
    }
    /**
     * The &lt;b&gt;createShippingQuote&lt;/b&gt; method returns a &lt;i&gt;shipping quote &lt;/i&gt; that contains a list of live &quot;rates.&quot;  &lt;br&gt;&lt;br&gt;Each rate represents an offer made by a shipping carrier for a specific service and each offer has a live quote for the base service cost. Rates have a time window in which they are &quot;live,&quot; and rates expire when their purchase window ends. If offered by the carrier, rates can include shipping options (and their associated prices), and users can add any offered shipping option to the base service should they desire.  Also, depending on the services required, rates can also include pickup and delivery windows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate is for a single package and is based on the following information: &lt;ul&gt;&lt;li&gt;The shipping origin&lt;/li&gt; &lt;li&gt;The shipping destination&lt;/li&gt; &lt;li&gt;The package size (weight and dimensions)&lt;/li&gt;&lt;/ul&gt;  Rates are identified by a unique eBay-assigned &lt;b&gt;rateId&lt;/b&gt; and rates are based on price points, pickup and delivery time frames, and other user requirements. Because each rate offered must be compliant with the eBay shipping program, all rates reflect eBay-negotiated prices.  &lt;br&gt;&lt;br&gt;The various rates returned in a shipping quote offer the user a choice from which they can choose a shipping service that best fits their needs. Select the rate for your shipment and using the associated &lt;b&gt;rateId&lt;/b&gt;, call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to create a shipment and generate a shipping label that you can use to ship the package.
     * @param body This complex type defines the request body for &lt;b&gt;createShippingQuote&lt;/b&gt;. Sellers &lt;i&gt;request a quote&lt;/i&gt; for a shipment by defining the &quot;To&quot; and &quot;From&quot; addresses for the package, plus the package&apos;s size.  &lt;br&gt;&lt;br&gt;Carriers respond by offering up a &quot;rate&quot; for the service of theirs that best fits seller&apos;s needs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ShippingQuoteRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * The &lt;b&gt;createShippingQuote&lt;/b&gt; method returns a &lt;i&gt;shipping quote &lt;/i&gt; that contains a list of live &quot;rates.&quot;  &lt;br&gt;&lt;br&gt;Each rate represents an offer made by a shipping carrier for a specific service and each offer has a live quote for the base service cost. Rates have a time window in which they are &quot;live,&quot; and rates expire when their purchase window ends. If offered by the carrier, rates can include shipping options (and their associated prices), and users can add any offered shipping option to the base service should they desire.  Also, depending on the services required, rates can also include pickup and delivery windows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate is for a single package and is based on the following information: &lt;ul&gt;&lt;li&gt;The shipping origin&lt;/li&gt; &lt;li&gt;The shipping destination&lt;/li&gt; &lt;li&gt;The package size (weight and dimensions)&lt;/li&gt;&lt;/ul&gt;  Rates are identified by a unique eBay-assigned &lt;b&gt;rateId&lt;/b&gt; and rates are based on price points, pickup and delivery time frames, and other user requirements. Because each rate offered must be compliant with the eBay shipping program, all rates reflect eBay-negotiated prices.  &lt;br&gt;&lt;br&gt;The various rates returned in a shipping quote offer the user a choice from which they can choose a shipping service that best fits their needs. Select the rate for your shipment and using the associated &lt;b&gt;rateId&lt;/b&gt;, call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to create a shipment and generate a shipping label that you can use to ship the package.
     * @param body This complex type defines the request body for &lt;b&gt;createShippingQuote&lt;/b&gt;. Sellers &lt;i&gt;request a quote&lt;/i&gt; for a shipment by defining the &quot;To&quot; and &quot;From&quot; addresses for the package, plus the package&apos;s size.  &lt;br&gt;&lt;br&gt;Carriers respond by offering up a &quot;rate&quot; for the service of theirs that best fits seller&apos;s needs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ShippingQuoteRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ShippingQuoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShippingQuoteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ShippingQuoteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
