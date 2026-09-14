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
 * This type contains refund information for a line item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LineItemRefund implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field shows the refund amount for a line item. This field is only returned if the buyer is due a refund for the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The refund amount shown is the seller&apos;s &lt;em&gt;net amount&lt;/em&gt; received from the sale/transaction. EBay-collected tax will not be included in this amount, so the actual amount of the buyer&apos;s refund may be higher than this value.&lt;/span&gt;
     */
    private Amount amount;
    /**
     * The date and time that the refund was issued for the line item. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String refundDate;
    /**
     * Unique identifier of a refund that was initiated for an order&apos;s line item through the &lt;strong&gt;issueRefund&lt;/strong&gt; method. If the &lt;strong&gt;issueRefund&lt;/strong&gt; method was used to issue a refund at the order level, this identifier is returned at the order level instead (&lt;strong&gt;paymentSummary.refunds.refundId&lt;/strong&gt; field).&lt;br&gt;&lt;br&gt; A &lt;strong&gt;refundId&lt;/strong&gt; value is returned in the response of the &lt;strong&gt;issueRefund&lt;/strong&gt; method, and this same value will be returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; responses for pending and completed refunds.
     */
    private String refundId;
    /**
     * This field is reserved for internal or future use.
     */
    private String refundReferenceId;
    /**
     * Instantiates a new {@link LineItemRefund} and sets the default values.
     */
    public LineItemRefund() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LineItemRefund}
     */
    @jakarta.annotation.Nonnull
    public static LineItemRefund createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LineItemRefund();
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
     * Gets the amount property value. This field shows the refund amount for a line item. This field is only returned if the buyer is due a refund for the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The refund amount shown is the seller&apos;s &lt;em&gt;net amount&lt;/em&gt; received from the sale/transaction. EBay-collected tax will not be included in this amount, so the actual amount of the buyer&apos;s refund may be higher than this value.&lt;/span&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundDate", (n) -> { this.setRefundDate(n.getStringValue()); });
        deserializerMap.put("refundId", (n) -> { this.setRefundId(n.getStringValue()); });
        deserializerMap.put("refundReferenceId", (n) -> { this.setRefundReferenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refundDate property value. The date and time that the refund was issued for the line item. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundDate() {
        return this.refundDate;
    }
    /**
     * Gets the refundId property value. Unique identifier of a refund that was initiated for an order&apos;s line item through the &lt;strong&gt;issueRefund&lt;/strong&gt; method. If the &lt;strong&gt;issueRefund&lt;/strong&gt; method was used to issue a refund at the order level, this identifier is returned at the order level instead (&lt;strong&gt;paymentSummary.refunds.refundId&lt;/strong&gt; field).&lt;br&gt;&lt;br&gt; A &lt;strong&gt;refundId&lt;/strong&gt; value is returned in the response of the &lt;strong&gt;issueRefund&lt;/strong&gt; method, and this same value will be returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; responses for pending and completed refunds.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundId() {
        return this.refundId;
    }
    /**
     * Gets the refundReferenceId property value. This field is reserved for internal or future use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundReferenceId() {
        return this.refundReferenceId;
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
     * Sets the amount property value. This field shows the refund amount for a line item. This field is only returned if the buyer is due a refund for the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The refund amount shown is the seller&apos;s &lt;em&gt;net amount&lt;/em&gt; received from the sale/transaction. EBay-collected tax will not be included in this amount, so the actual amount of the buyer&apos;s refund may be higher than this value.&lt;/span&gt;
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the refundDate property value. The date and time that the refund was issued for the line item. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the refundDate property.
     */
    public void setRefundDate(@jakarta.annotation.Nullable final String value) {
        this.refundDate = value;
    }
    /**
     * Sets the refundId property value. Unique identifier of a refund that was initiated for an order&apos;s line item through the &lt;strong&gt;issueRefund&lt;/strong&gt; method. If the &lt;strong&gt;issueRefund&lt;/strong&gt; method was used to issue a refund at the order level, this identifier is returned at the order level instead (&lt;strong&gt;paymentSummary.refunds.refundId&lt;/strong&gt; field).&lt;br&gt;&lt;br&gt; A &lt;strong&gt;refundId&lt;/strong&gt; value is returned in the response of the &lt;strong&gt;issueRefund&lt;/strong&gt; method, and this same value will be returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; responses for pending and completed refunds.
     * @param value Value to set for the refundId property.
     */
    public void setRefundId(@jakarta.annotation.Nullable final String value) {
        this.refundId = value;
    }
    /**
     * Sets the refundReferenceId property value. This field is reserved for internal or future use.
     * @param value Value to set for the refundReferenceId property.
     */
    public void setRefundReferenceId(@jakarta.annotation.Nullable final String value) {
        this.refundReferenceId = value;
    }
}
