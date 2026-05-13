package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This is the base type of the &lt;b&gt;issueRefund&lt;/b&gt; response payload. As long as the &lt;b&gt;issueRefund&lt;/b&gt; method does not trigger an error, a response payload will be returned.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Refund implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the order refund. This value is returned unless the refund operation fails (&lt;b&gt;refundStatus&lt;/b&gt; value shows &lt;code&gt;FAILED&lt;/code&gt;). This identifier can be used to track the status of the refund through a &lt;b&gt;getOrder&lt;/b&gt; or &lt;b&gt;getOrders&lt;/b&gt; call. For order-level refunds, check the &lt;b&gt;paymentSummary.refunds.refundId&lt;/b&gt; field in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response, and for line item level refunds, check the &lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field(s) in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response.
     */
    private String refundId;
    /**
     * The value returned in this field indicates the success or failure of the refund operation. A successful &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;PENDING&lt;/code&gt;. A failed &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;FAILED&lt;/code&gt;, and an HTTP status code and/or and API error code may also get returned to possibly indicate the issue.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String refundStatus;
    /**
     * Instantiates a new {@link Refund} and sets the default values.
     */
    public Refund() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Refund}
     */
    @jakarta.annotation.Nonnull
    public static Refund createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Refund();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("refundId", (n) -> { this.setRefundId(n.getStringValue()); });
        deserializerMap.put("refundStatus", (n) -> { this.setRefundStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refundId property value. The unique identifier of the order refund. This value is returned unless the refund operation fails (&lt;b&gt;refundStatus&lt;/b&gt; value shows &lt;code&gt;FAILED&lt;/code&gt;). This identifier can be used to track the status of the refund through a &lt;b&gt;getOrder&lt;/b&gt; or &lt;b&gt;getOrders&lt;/b&gt; call. For order-level refunds, check the &lt;b&gt;paymentSummary.refunds.refundId&lt;/b&gt; field in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response, and for line item level refunds, check the &lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field(s) in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundId() {
        return this.refundId;
    }
    /**
     * Gets the refundStatus property value. The value returned in this field indicates the success or failure of the refund operation. A successful &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;PENDING&lt;/code&gt;. A failed &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;FAILED&lt;/code&gt;, and an HTTP status code and/or and API error code may also get returned to possibly indicate the issue.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundStatus() {
        return this.refundStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("refundId", this.getRefundId());
        writer.writeStringValue("refundStatus", this.getRefundStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the refundId property value. The unique identifier of the order refund. This value is returned unless the refund operation fails (&lt;b&gt;refundStatus&lt;/b&gt; value shows &lt;code&gt;FAILED&lt;/code&gt;). This identifier can be used to track the status of the refund through a &lt;b&gt;getOrder&lt;/b&gt; or &lt;b&gt;getOrders&lt;/b&gt; call. For order-level refunds, check the &lt;b&gt;paymentSummary.refunds.refundId&lt;/b&gt; field in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response, and for line item level refunds, check the &lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field(s) in the &lt;b&gt;getOrder&lt;/b&gt;/&lt;b&gt;getOrders&lt;/b&gt; response.
     * @param value Value to set for the refundId property.
     */
    public void setRefundId(@jakarta.annotation.Nullable final String value) {
        this.refundId = value;
    }
    /**
     * Sets the refundStatus property value. The value returned in this field indicates the success or failure of the refund operation. A successful &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;PENDING&lt;/code&gt;. A failed &lt;b&gt;issueRefund&lt;/b&gt; operation should result in a value of &lt;code&gt;FAILED&lt;/code&gt;, and an HTTP status code and/or and API error code may also get returned to possibly indicate the issue.&lt;br&gt;&lt;br&gt;The refunds issued through this method are processed asynchronously, so the refund will not show as &apos;Refunded&apos; right away. A seller will have to make a subsequent &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call to check the status of the refund.  The status of an order refund can be found in the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder#response.paymentSummary.refunds.refundStatus&quot; target=&quot;_blank&quot;&gt;paymentSummary.refunds.refundStatus&lt;/a&gt; field of the &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the refundStatus property.
     */
    public void setRefundStatus(@jakarta.annotation.Nullable final String value) {
        this.refundStatus = value;
    }
}
