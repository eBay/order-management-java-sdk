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

package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IssueRefundRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This free-text field allows the seller to clarify why the refund is being issued to the buyer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 100
     */
    private String comment;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount orderLevelRefundAmount;
    /**
     * The enumeration value passed into this field indicates the reason for the refund. One of the defined enumeration values in the &lt;b&gt;ReasonForRefundEnum&lt;/b&gt; type must be used.&lt;br&gt;&lt;br&gt;This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or &apos;buyer remorse&apos; return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate &lt;b&gt;issueRefund&lt;/b&gt; calls, one for each refund reason. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ReasonForRefundEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reasonForRefund;
    /**
     * The &lt;b&gt;refundItems&lt;/b&gt; array is only required if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the &lt;b&gt;orderLevelRefundAmount&lt;/b&gt; container to specify the amount of the refund for the entire order.
     */
    private java.util.List<RefundItem> refundItems;
    /**
     * Instantiates a new {@link IssueRefundRequest} and sets the default values.
     */
    public IssueRefundRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IssueRefundRequest}
     */
    @jakarta.annotation.Nonnull
    public static IssueRefundRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IssueRefundRequest();
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
     * Gets the comment property value. This free-text field allows the seller to clarify why the refund is being issued to the buyer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 100
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("orderLevelRefundAmount", (n) -> { this.setOrderLevelRefundAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("reasonForRefund", (n) -> { this.setReasonForRefund(n.getStringValue()); });
        deserializerMap.put("refundItems", (n) -> { this.setRefundItems(n.getCollectionOfObjectValues(RefundItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orderLevelRefundAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getOrderLevelRefundAmount() {
        return this.orderLevelRefundAmount;
    }
    /**
     * Gets the reasonForRefund property value. The enumeration value passed into this field indicates the reason for the refund. One of the defined enumeration values in the &lt;b&gt;ReasonForRefundEnum&lt;/b&gt; type must be used.&lt;br&gt;&lt;br&gt;This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or &apos;buyer remorse&apos; return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate &lt;b&gt;issueRefund&lt;/b&gt; calls, one for each refund reason. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ReasonForRefundEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonForRefund() {
        return this.reasonForRefund;
    }
    /**
     * Gets the refundItems property value. The &lt;b&gt;refundItems&lt;/b&gt; array is only required if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the &lt;b&gt;orderLevelRefundAmount&lt;/b&gt; container to specify the amount of the refund for the entire order.
     * @return a {@link java.util.List<RefundItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RefundItem> getRefundItems() {
        return this.refundItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeObjectValue("orderLevelRefundAmount", this.getOrderLevelRefundAmount());
        writer.writeStringValue("reasonForRefund", this.getReasonForRefund());
        writer.writeCollectionOfObjectValues("refundItems", this.getRefundItems());
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
     * Sets the comment property value. This free-text field allows the seller to clarify why the refund is being issued to the buyer.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max Length&lt;/b&gt;: 100
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the orderLevelRefundAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the orderLevelRefundAmount property.
     */
    public void setOrderLevelRefundAmount(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.orderLevelRefundAmount = value;
    }
    /**
     * Sets the reasonForRefund property value. The enumeration value passed into this field indicates the reason for the refund. One of the defined enumeration values in the &lt;b&gt;ReasonForRefundEnum&lt;/b&gt; type must be used.&lt;br&gt;&lt;br&gt;This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or &apos;buyer remorse&apos; return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate &lt;b&gt;issueRefund&lt;/b&gt; calls, one for each refund reason. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ReasonForRefundEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reasonForRefund property.
     */
    public void setReasonForRefund(@jakarta.annotation.Nullable final String value) {
        this.reasonForRefund = value;
    }
    /**
     * Sets the refundItems property value. The &lt;b&gt;refundItems&lt;/b&gt; array is only required if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the &lt;b&gt;orderLevelRefundAmount&lt;/b&gt; container to specify the amount of the refund for the entire order.
     * @param value Value to set for the refundItems property.
     */
    public void setRefundItems(@jakarta.annotation.Nullable final java.util.List<RefundItem> value) {
        this.refundItems = value;
    }
}
