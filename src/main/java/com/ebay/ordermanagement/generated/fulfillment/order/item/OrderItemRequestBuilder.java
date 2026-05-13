package com.ebay.ordermanagement.generated.fulfillment.order.item;

import com.ebay.ordermanagement.generated.fulfillment.models.Order;
import com.ebay.ordermanagement.generated.fulfillment.order.item.issue_refund.IssueRefundRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.order.item.shipping_fulfillment.ShippingFulfillmentRequestBuilder;
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
 * Builds and executes requests for operations under /order/{order-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The issue_refund property
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder issueRefund() {
        return new IssueRefundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shipping_fulfillment property
     * @return a {@link ShippingFulfillmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShippingFulfillmentRequestBuilder shippingFulfillment() {
        return new ShippingFulfillmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrderItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}{?fieldGroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrderItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}{?fieldGroups*}", rawUrl);
    }
    /**
     * Use this call to retrieve the contents of an order based on its unique identifier, &lt;i&gt;orderId&lt;/i&gt;. This value was returned in the &lt;b&gt; getOrders&lt;/b&gt; call&apos;s &lt;b&gt;orders.orderId&lt;/b&gt; field when you searched for orders by creation date, modification date, or fulfillment status. Include the optional &lt;b&gt;fieldGroups&lt;/b&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. &lt;br&gt;&lt;br&gt; The returned &lt;b&gt;Order&lt;/b&gt; object contains information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt; The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt;
     * @return a {@link Order}
     */
    @jakarta.annotation.Nullable
    public Order get() {
        return get(null);
    }
    /**
     * Use this call to retrieve the contents of an order based on its unique identifier, &lt;i&gt;orderId&lt;/i&gt;. This value was returned in the &lt;b&gt; getOrders&lt;/b&gt; call&apos;s &lt;b&gt;orders.orderId&lt;/b&gt; field when you searched for orders by creation date, modification date, or fulfillment status. Include the optional &lt;b&gt;fieldGroups&lt;/b&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. &lt;br&gt;&lt;br&gt; The returned &lt;b&gt;Order&lt;/b&gt; object contains information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt; The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Order}
     */
    @jakarta.annotation.Nullable
    public Order get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Order::createFromDiscriminatorValue);
    }
    /**
     * Use this call to retrieve the contents of an order based on its unique identifier, &lt;i&gt;orderId&lt;/i&gt;. This value was returned in the &lt;b&gt; getOrders&lt;/b&gt; call&apos;s &lt;b&gt;orders.orderId&lt;/b&gt; field when you searched for orders by creation date, modification date, or fulfillment status. Include the optional &lt;b&gt;fieldGroups&lt;/b&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. &lt;br&gt;&lt;br&gt; The returned &lt;b&gt;Order&lt;/b&gt; object contains information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt; The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this call to retrieve the contents of an order based on its unique identifier, &lt;i&gt;orderId&lt;/i&gt;. This value was returned in the &lt;b&gt; getOrders&lt;/b&gt; call&apos;s &lt;b&gt;orders.orderId&lt;/b&gt; field when you searched for orders by creation date, modification date, or fulfillment status. Include the optional &lt;b&gt;fieldGroups&lt;/b&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. &lt;br&gt;&lt;br&gt; The returned &lt;b&gt;Order&lt;/b&gt; object contains information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt; The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt;
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
     * @return a {@link OrderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrderItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this call to retrieve the contents of an order based on its unique identifier, &lt;i&gt;orderId&lt;/i&gt;. This value was returned in the &lt;b&gt; getOrders&lt;/b&gt; call&apos;s &lt;b&gt;orders.orderId&lt;/b&gt; field when you searched for orders by creation date, modification date, or fulfillment status. Include the optional &lt;b&gt;fieldGroups&lt;/b&gt; query parameter set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt; to return a breakdown of the taxes and fees. &lt;br&gt;&lt;br&gt; The returned &lt;b&gt;Order&lt;/b&gt; object contains information you can use to create and process fulfillments, including: &lt;ul&gt; &lt;li&gt;Information about the buyer and seller&lt;/li&gt; &lt;li&gt;Information about the order&apos;s line items&lt;/li&gt; &lt;li&gt; The plans for packaging, addressing and shipping the order&lt;/li&gt; &lt;li&gt;The status of payment, packaging, addressing, and shipping the order&lt;/li&gt; &lt;li&gt;A summary of monetary amounts specific to the order such as pricing, payments, and shipping costs&lt;/li&gt; &lt;li&gt;A summary of applied taxes and fees, and optionally a breakdown of each &lt;/li&gt;&lt;/ul&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This parameter lets you control what is returned in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only presently supported value is &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. This field group adds addition fields to the response that return a breakdown of taxes and fees.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String fieldGroups;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("fieldGroups", fieldGroups);
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
