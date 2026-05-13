package com.ebay.ordermanagement.generated.fulfillment.order.item.issue_refund;

import com.ebay.ordermanagement.generated.fulfillment.models.IssueRefundRequest;
import com.ebay.ordermanagement.generated.fulfillment.models.Refund;
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
 * Builds and executes requests for operations under /order/{order-id}/issue_refund
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IssueRefundRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link IssueRefundRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IssueRefundRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}/issue_refund", pathParameters);
    }
    /**
     * Instantiates a new {@link IssueRefundRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IssueRefundRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}/issue_refund", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including &lt;b&gt;issueRefund&lt;/b&gt;. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt; This method allows a seller to issue a full or partial refund to a buyer for an order. Full or partial refunds can be issued at the order level or line item level.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response.
     * @param body The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
     * @return a {@link Refund}
     */
    @jakarta.annotation.Nullable
    public Refund post(@jakarta.annotation.Nonnull final IssueRefundRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including &lt;b&gt;issueRefund&lt;/b&gt;. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt; This method allows a seller to issue a full or partial refund to a buyer for an order. Full or partial refunds can be issued at the order level or line item level.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response.
     * @param body The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Refund}
     */
    @jakarta.annotation.Nullable
    public Refund post(@jakarta.annotation.Nonnull final IssueRefundRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Refund::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including &lt;b&gt;issueRefund&lt;/b&gt;. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt; This method allows a seller to issue a full or partial refund to a buyer for an order. Full or partial refunds can be issued at the order level or line item level.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response.
     * @param body The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IssueRefundRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including &lt;b&gt;issueRefund&lt;/b&gt;. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt; This method allows a seller to issue a full or partial refund to a buyer for an order. Full or partial refunds can be issued at the order level or line item level.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response.
     * @param body The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IssueRefundRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IssueRefundRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
