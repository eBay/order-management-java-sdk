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
 * This type contains information about a refund issued for an order. This does not include line item level refunds.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderRefund implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount amount;
    /**
     * The date and time that the refund was issued. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String refundDate;
    /**
     * Unique identifier of a refund that was initiated for an order through the &lt;b&gt;issueRefund&lt;/b&gt; method. If the &lt;b&gt;issueRefund&lt;/b&gt; method was used to issue one or more refunds at the line item level, these refund identifiers are returned at the line item level instead (&lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field).&lt;br&gt;&lt;br&gt; A &lt;b&gt;refundId&lt;/b&gt; value is returned in the response of the &lt;b&gt;issueRefund&lt;/b&gt; method, and this same value will be returned in the &lt;b&gt;getOrders&lt;/b&gt; and &lt;b&gt;getOrders&lt;/b&gt; responses for pending and completed refunds. For other refunds, see the &lt;b&gt;refundReferenceId&lt;/b&gt; field.
     */
    private String refundId;
    /**
     * The eBay-generated unique identifier for the refund. This field is not returned until the refund has been issued.
     */
    private String refundReferenceId;
    /**
     * This enumeration value indicates the current status of the refund to the buyer. This container is always returned for each refund. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String refundStatus;
    /**
     * Instantiates a new {@link OrderRefund} and sets the default values.
     */
    public OrderRefund() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderRefund}
     */
    @jakarta.annotation.Nonnull
    public static OrderRefund createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderRefund();
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
     * Gets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundDate", (n) -> { this.setRefundDate(n.getStringValue()); });
        deserializerMap.put("refundId", (n) -> { this.setRefundId(n.getStringValue()); });
        deserializerMap.put("refundReferenceId", (n) -> { this.setRefundReferenceId(n.getStringValue()); });
        deserializerMap.put("refundStatus", (n) -> { this.setRefundStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refundDate property value. The date and time that the refund was issued. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundDate() {
        return this.refundDate;
    }
    /**
     * Gets the refundId property value. Unique identifier of a refund that was initiated for an order through the &lt;b&gt;issueRefund&lt;/b&gt; method. If the &lt;b&gt;issueRefund&lt;/b&gt; method was used to issue one or more refunds at the line item level, these refund identifiers are returned at the line item level instead (&lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field).&lt;br&gt;&lt;br&gt; A &lt;b&gt;refundId&lt;/b&gt; value is returned in the response of the &lt;b&gt;issueRefund&lt;/b&gt; method, and this same value will be returned in the &lt;b&gt;getOrders&lt;/b&gt; and &lt;b&gt;getOrders&lt;/b&gt; responses for pending and completed refunds. For other refunds, see the &lt;b&gt;refundReferenceId&lt;/b&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundId() {
        return this.refundId;
    }
    /**
     * Gets the refundReferenceId property value. The eBay-generated unique identifier for the refund. This field is not returned until the refund has been issued.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundReferenceId() {
        return this.refundReferenceId;
    }
    /**
     * Gets the refundStatus property value. This enumeration value indicates the current status of the refund to the buyer. This container is always returned for each refund. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("refundDate", this.getRefundDate());
        writer.writeStringValue("refundId", this.getRefundId());
        writer.writeStringValue("refundReferenceId", this.getRefundReferenceId());
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
     * Sets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the refundDate property value. The date and time that the refund was issued. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the refundDate property.
     */
    public void setRefundDate(@jakarta.annotation.Nullable final String value) {
        this.refundDate = value;
    }
    /**
     * Sets the refundId property value. Unique identifier of a refund that was initiated for an order through the &lt;b&gt;issueRefund&lt;/b&gt; method. If the &lt;b&gt;issueRefund&lt;/b&gt; method was used to issue one or more refunds at the line item level, these refund identifiers are returned at the line item level instead (&lt;b&gt;lineItems.refunds.refundId&lt;/b&gt; field).&lt;br&gt;&lt;br&gt; A &lt;b&gt;refundId&lt;/b&gt; value is returned in the response of the &lt;b&gt;issueRefund&lt;/b&gt; method, and this same value will be returned in the &lt;b&gt;getOrders&lt;/b&gt; and &lt;b&gt;getOrders&lt;/b&gt; responses for pending and completed refunds. For other refunds, see the &lt;b&gt;refundReferenceId&lt;/b&gt; field.
     * @param value Value to set for the refundId property.
     */
    public void setRefundId(@jakarta.annotation.Nullable final String value) {
        this.refundId = value;
    }
    /**
     * Sets the refundReferenceId property value. The eBay-generated unique identifier for the refund. This field is not returned until the refund has been issued.
     * @param value Value to set for the refundReferenceId property.
     */
    public void setRefundReferenceId(@jakarta.annotation.Nullable final String value) {
        this.refundReferenceId = value;
    }
    /**
     * Sets the refundStatus property value. This enumeration value indicates the current status of the refund to the buyer. This container is always returned for each refund. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the refundStatus property.
     */
    public void setRefundStatus(@jakarta.annotation.Nullable final String value) {
        this.refundStatus = value;
    }
}
