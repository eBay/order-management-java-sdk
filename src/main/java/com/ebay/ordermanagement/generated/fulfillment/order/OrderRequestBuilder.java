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

package com.ebay.ordermanagement.generated.fulfillment.order;

import com.ebay.ordermanagement.generated.fulfillment.models.OrderSearchPagedCollection;
import com.ebay.ordermanagement.generated.fulfillment.order.item.OrderItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /order
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.fulfillment.order.item collection
     * @param orderId This path parameter is used to specify the unique identifier of the order being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; method to retrieve order IDs. Order ID values are also shown in My eBay/Seller Hub.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; can return orders up to two years old. Do not provide the &lt;strong&gt;orderId&lt;/strong&gt; for an order created more than two years in the past.&lt;/span&gt;
     * @return a {@link OrderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderItemRequestBuilder byOrderId(@jakarta.annotation.Nonnull final String orderId) {
        Objects.requireNonNull(orderId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("order%2Did", orderId);
        return new OrderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrderRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order{?fieldGroups*,filter*,limit*,offset*,orderIds*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrderRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order{?fieldGroups*,filter*,limit*,offset*,orderIds*}", rawUrl);
    }
    /**
     * Use this method to search for and retrieve one or more orders based on their creation date, last modification date, or fulfillment status using the &lt;strong&gt;filter&lt;/strong&gt; parameter. You can alternatively specify a list of orders using the &lt;strong&gt;orderIds&lt;/strong&gt; parameter. Include the optional &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. By default, when no filters are used this call returns all orders created within the last 90 days. &lt;br&gt;&lt;br&gt; The returned &lt;strong&gt;Order&lt;/strong&gt; objects contain information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt;The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt; In this call, the &lt;strong&gt;cancelStatus.cancelRequests&lt;/strong&gt; array is returned but is always empty. Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call instead, which returns this array fully populated with information about any cancellation requests.&lt;/span&gt;
     * @return a {@link OrderSearchPagedCollection}
     */
    @jakarta.annotation.Nullable
    public OrderSearchPagedCollection get() {
        return get(null);
    }
    /**
     * Use this method to search for and retrieve one or more orders based on their creation date, last modification date, or fulfillment status using the &lt;strong&gt;filter&lt;/strong&gt; parameter. You can alternatively specify a list of orders using the &lt;strong&gt;orderIds&lt;/strong&gt; parameter. Include the optional &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. By default, when no filters are used this call returns all orders created within the last 90 days. &lt;br&gt;&lt;br&gt; The returned &lt;strong&gt;Order&lt;/strong&gt; objects contain information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt;The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt; In this call, the &lt;strong&gt;cancelStatus.cancelRequests&lt;/strong&gt; array is returned but is always empty. Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call instead, which returns this array fully populated with information about any cancellation requests.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrderSearchPagedCollection}
     */
    @jakarta.annotation.Nullable
    public OrderSearchPagedCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrderSearchPagedCollection::createFromDiscriminatorValue);
    }
    /**
     * Use this method to search for and retrieve one or more orders based on their creation date, last modification date, or fulfillment status using the &lt;strong&gt;filter&lt;/strong&gt; parameter. You can alternatively specify a list of orders using the &lt;strong&gt;orderIds&lt;/strong&gt; parameter. Include the optional &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. By default, when no filters are used this call returns all orders created within the last 90 days. &lt;br&gt;&lt;br&gt; The returned &lt;strong&gt;Order&lt;/strong&gt; objects contain information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt;The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt; In this call, the &lt;strong&gt;cancelStatus.cancelRequests&lt;/strong&gt; array is returned but is always empty. Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call instead, which returns this array fully populated with information about any cancellation requests.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to search for and retrieve one or more orders based on their creation date, last modification date, or fulfillment status using the &lt;strong&gt;filter&lt;/strong&gt; parameter. You can alternatively specify a list of orders using the &lt;strong&gt;orderIds&lt;/strong&gt; parameter. Include the optional &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. By default, when no filters are used this call returns all orders created within the last 90 days. &lt;br&gt;&lt;br&gt; The returned &lt;strong&gt;Order&lt;/strong&gt; objects contain information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt;The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt; In this call, the &lt;strong&gt;cancelStatus.cancelRequests&lt;/strong&gt; array is returned but is always empty. Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call instead, which returns this array fully populated with information about any cancellation requests.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OrderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrderRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to search for and retrieve one or more orders based on their creation date, last modification date, or fulfillment status using the &lt;strong&gt;filter&lt;/strong&gt; parameter. You can alternatively specify a list of orders using the &lt;strong&gt;orderIds&lt;/strong&gt; parameter. Include the optional &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. By default, when no filters are used this call returns all orders created within the last 90 days. &lt;br&gt;&lt;br&gt; The returned &lt;strong&gt;Order&lt;/strong&gt; objects contain information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt;The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt; In this call, the &lt;strong&gt;cancelStatus.cancelRequests&lt;/strong&gt; array is returned but is always empty. Use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call instead, which returns this array fully populated with information about any cancellation requests.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This parameter lets you control what is returned in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The only presently supported value is &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. This field group adds addition fields to the response that return a breakdown of taxes and fees.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String fieldGroups;
        /**
         * One or more comma-separated criteria for narrowing down the collection of orders returned by this call. These criteria correspond to specific fields in the response payload. Multiple filter criteria combine to further restrict the results. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; can return orders up to two years old. Do not set the &lt;code&gt;creationdate&lt;/code&gt; filter to a date beyond two years in the past.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the &lt;strong&gt;orderIds&lt;/strong&gt; parameter is included in the request, the &lt;strong&gt;filter&lt;/strong&gt; parameter will be ignored.&lt;/span&gt;&lt;br&gt;The available criteria are as follows: &lt;dl&gt; &lt;dt&gt;&lt;code&gt;&lt;strong&gt;creationdate&lt;/strong&gt;&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt;The time period during which qualifying orders were created (the &lt;strong&gt;orders.creationDate&lt;/strong&gt; field). In the URI, this is expressed as a starting timestamp, with or without an ending timestamp (in brackets). The timestamps are in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock.For example: &lt;ul&gt; &lt;li&gt;&lt;code&gt;creationdate:[2016-02-21T08:25:43.511Z..]&lt;/code&gt; identifies orders created on or after the given timestamp.&lt;/li&gt; &lt;li&gt;&lt;code&gt;creationdate:[2016-02-21T08:25:43.511Z..2016-04-21T08:25:43.511Z]&lt;/code&gt; identifies orders created between the given timestamps, inclusive.&lt;/li&gt; &lt;/ul&gt; &lt;/dd&gt; &lt;dt&gt;&lt;code&gt;&lt;strong&gt;lastmodifieddate&lt;/strong&gt;&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt;The time period during which qualifying orders were last modified (the &lt;strong&gt;orders.modifiedDate&lt;/strong&gt; field).  In the URI, this is expressed as a starting timestamp, with or without an ending timestamp (in brackets). The timestamps are in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock.For example: &lt;ul&gt; &lt;li&gt;&lt;code&gt;lastmodifieddate:[2016-05-15T08:25:43.511Z..]&lt;/code&gt; identifies orders modified on or after the given timestamp.&lt;/li&gt; &lt;li&gt;&lt;code&gt;lastmodifieddate:[2016-05-15T08:25:43.511Z..2016-05-31T08:25:43.511Z]&lt;/code&gt; identifies orders modified between the given timestamps, inclusive.&lt;/li&gt; &lt;/ul&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If &lt;strong&gt;creationdate&lt;/strong&gt; and &lt;strong&gt;lastmodifieddate&lt;/strong&gt; are both included, only &lt;strong&gt;creationdate&lt;/strong&gt; is used.&lt;/span&gt; &lt;br&gt;&lt;/dd&gt; &lt;dt&gt;&lt;code&gt;&lt;strong&gt;orderfulfillmentstatus&lt;/strong&gt;&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt;The degree to which qualifying orders have been shipped (the &lt;strong&gt;orders.orderFulfillmentStatus&lt;/strong&gt; field). In the URI, this is expressed as one of the following value combinations: &lt;ul&gt; &lt;li&gt;&lt;code&gt;orderfulfillmentstatus:{NOT_STARTED|IN_PROGRESS}&lt;/code&gt; specifies orders for which no shipping fulfillments have been started, plus orders for which at least one shipping fulfillment has been started but not completed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;orderfulfillmentstatus:{FULFILLED|IN_PROGRESS}&lt;/code&gt; specifies orders for which all shipping fulfillments have been completed, plus orders for which at least one shipping fulfillment has been started but not completed.&lt;/li&gt; &lt;/ul&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The values &lt;code&gt;NOT_STARTED&lt;/code&gt;, &lt;code&gt;IN_PROGRESS&lt;/code&gt;, and &lt;code&gt;FULFILLED&lt;/code&gt; can be used in various combinations, but only the combinations shown here are currently supported.&lt;/span&gt; &lt;/dd&gt; &lt;/dl&gt; Here is an example of a &lt;strong&gt;getOrders&lt;/strong&gt; call using all of these filters: &lt;br&gt; &lt;pre&gt;GET https://api.ebay.com/sell/v1/order?&lt;br&gt;filter=&lt;strong&gt;creationdate&lt;/strong&gt;:%5B2016-03-21T08:25:43.511Z..2016-04-21T08:25:43.511Z%5D,&lt;br&gt;&lt;strong&gt;lastmodifieddate&lt;/strong&gt;:%5B2016-05-15T08:25:43.511Z..%5D,&lt;br&gt;&lt;strong&gt;orderfulfillmentstatus&lt;/strong&gt;:%7BNOT_STARTED%7CIN_PROGRESS%7D&lt;/pre&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This call requires that certain special characters in the URI query string be percent-encoded: &lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;[&lt;/code&gt; = &lt;code&gt;%5B&lt;/code&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;]&lt;/code&gt; = &lt;code&gt;%5D&lt;/code&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;{&lt;/code&gt; = &lt;code&gt;%7B&lt;/code&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;|&lt;/code&gt; = &lt;code&gt;%7C&lt;/code&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;}&lt;/code&gt; = &lt;code&gt;%7D&lt;/code&gt; &lt;br&gt; This query filter example uses these codes.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * The number of orders to return per page of the result set. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;br&gt;&lt;br&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves orders 11 through 20 from the result set. &lt;br&gt;&lt;br&gt; If a limit is not set, the &lt;strong&gt;limit&lt;/strong&gt; defaults to 50 and returns up to 50 orders. If a requested limit is more than 200, the call fails and returns an error.&lt;br &gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;. If the &lt;strong&gt;orderIds&lt;/strong&gt; parameter is included in the request, this parameter will be ignored.&lt;/span&gt; &lt;br&gt; &lt;strong&gt;Maximum:&lt;/strong&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;strong&gt;Default:&lt;/strong&gt; &lt;code&gt;50&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of orders to skip in the result set before returning the first order in the paginated response.  &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Default:&lt;/strong&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * A comma-separated list of the unique identifiers of the orders to retrieve (maximum 50). If one or more order ID values are specified through the &lt;strong&gt;orderIds&lt;/strong&gt; query parameter, all other query parameters will be ignored.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; can return orders up to two years old. Do not provide the &lt;strong&gt;orderId&lt;/strong&gt; for an order created more than two years in the past.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String orderIds;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("fieldGroups", fieldGroups);
            allQueryParams.put("filter", filter);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("orderIds", orderIds);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
