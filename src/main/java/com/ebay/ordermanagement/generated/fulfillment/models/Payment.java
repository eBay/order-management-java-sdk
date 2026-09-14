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
 * This type is used to provide details about the seller payments for an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Payment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount that seller receives for the order via the payment method mentioned in &lt;strong&gt;Payment.paymentMethod&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, which includes US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK or EU, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;amount.value&lt;/strong&gt; field (and in the &lt;strong&gt;amount.convertedFromValue&lt;/strong&gt; field if currency conversion is applicable).&lt;br&gt;&lt;br&gt; To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Amount amount;
    /**
     * The date and time that the payment was received by the seller. This field will not be returned if buyer has yet to pay for the order. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String paymentDate;
    /**
     * This container is only returned if eBay is temporarily holding the seller&apos;s funds for the order. If a payment hold has been placed on the order, this container includes the reason for the payment hold, the expected release date of the funds into the seller&apos;s account, the current state of the hold, and as soon as the payment hold has been released, the actual release date.
     */
    private java.util.List<PaymentHold> paymentHolds;
    /**
     * The payment method used to pay for the order. See the &lt;strong&gt;PaymentMethodTypeEnum&lt;/strong&gt; type for more information on the payment methods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, access to buyer payment details for U.S. users will be limited to select developers. All other developers will receive a value of &quot;CustomCode&quot; in place of buyer payment details. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private PaymentMethodTypeEnum paymentMethod;
    /**
     * This field is only returned if payment has been made by the buyer, and the &lt;strong&gt;paymentMethod&lt;/strong&gt; is &lt;code&gt;ESCROW&lt;/code&gt;. This field contains a special ID for ESCROW.
     */
    private String paymentReferenceId;
    /**
     * The enumeration value returned in this field indicates the status of the payment for the order. See the &lt;strong&gt;PaymentStatusEnum&lt;/strong&gt; type definition for more information on the possible payment states.
     */
    private PaymentStatusEnum paymentStatus;
    /**
     * Instantiates a new {@link Payment} and sets the default values.
     */
    public Payment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Payment}
     */
    @jakarta.annotation.Nonnull
    public static Payment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Payment();
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
     * Gets the amount property value. The amount that seller receives for the order via the payment method mentioned in &lt;strong&gt;Payment.paymentMethod&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, which includes US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK or EU, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;amount.value&lt;/strong&gt; field (and in the &lt;strong&gt;amount.convertedFromValue&lt;/strong&gt; field if currency conversion is applicable).&lt;br&gt;&lt;br&gt; To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentDate", (n) -> { this.setPaymentDate(n.getStringValue()); });
        deserializerMap.put("paymentHolds", (n) -> { this.setPaymentHolds(n.getCollectionOfObjectValues(PaymentHold::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentMethod", (n) -> { this.setPaymentMethod(n.getEnumValue(PaymentMethodTypeEnum::forValue)); });
        deserializerMap.put("paymentReferenceId", (n) -> { this.setPaymentReferenceId(n.getStringValue()); });
        deserializerMap.put("paymentStatus", (n) -> { this.setPaymentStatus(n.getEnumValue(PaymentStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paymentDate property value. The date and time that the payment was received by the seller. This field will not be returned if buyer has yet to pay for the order. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDate() {
        return this.paymentDate;
    }
    /**
     * Gets the paymentHolds property value. This container is only returned if eBay is temporarily holding the seller&apos;s funds for the order. If a payment hold has been placed on the order, this container includes the reason for the payment hold, the expected release date of the funds into the seller&apos;s account, the current state of the hold, and as soon as the payment hold has been released, the actual release date.
     * @return a {@link java.util.List<PaymentHold>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentHold> getPaymentHolds() {
        return this.paymentHolds;
    }
    /**
     * Gets the paymentMethod property value. The payment method used to pay for the order. See the &lt;strong&gt;PaymentMethodTypeEnum&lt;/strong&gt; type for more information on the payment methods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, access to buyer payment details for U.S. users will be limited to select developers. All other developers will receive a value of &quot;CustomCode&quot; in place of buyer payment details. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link PaymentMethodTypeEnum}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodTypeEnum getPaymentMethod() {
        return this.paymentMethod;
    }
    /**
     * Gets the paymentReferenceId property value. This field is only returned if payment has been made by the buyer, and the &lt;strong&gt;paymentMethod&lt;/strong&gt; is &lt;code&gt;ESCROW&lt;/code&gt;. This field contains a special ID for ESCROW.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentReferenceId() {
        return this.paymentReferenceId;
    }
    /**
     * Gets the paymentStatus property value. The enumeration value returned in this field indicates the status of the payment for the order. See the &lt;strong&gt;PaymentStatusEnum&lt;/strong&gt; type definition for more information on the possible payment states.
     * @return a {@link PaymentStatusEnum}
     */
    @jakarta.annotation.Nullable
    public PaymentStatusEnum getPaymentStatus() {
        return this.paymentStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("paymentDate", this.getPaymentDate());
        writer.writeCollectionOfObjectValues("paymentHolds", this.getPaymentHolds());
        writer.writeEnumValue("paymentMethod", this.getPaymentMethod());
        writer.writeStringValue("paymentReferenceId", this.getPaymentReferenceId());
        writer.writeEnumValue("paymentStatus", this.getPaymentStatus());
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
     * Sets the amount property value. The amount that seller receives for the order via the payment method mentioned in &lt;strong&gt;Payment.paymentMethod&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, which includes US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK or EU, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;amount.value&lt;/strong&gt; field (and in the &lt;strong&gt;amount.convertedFromValue&lt;/strong&gt; field if currency conversion is applicable).&lt;br&gt;&lt;br&gt; To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the paymentDate property value. The date and time that the payment was received by the seller. This field will not be returned if buyer has yet to pay for the order. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the paymentDate property.
     */
    public void setPaymentDate(@jakarta.annotation.Nullable final String value) {
        this.paymentDate = value;
    }
    /**
     * Sets the paymentHolds property value. This container is only returned if eBay is temporarily holding the seller&apos;s funds for the order. If a payment hold has been placed on the order, this container includes the reason for the payment hold, the expected release date of the funds into the seller&apos;s account, the current state of the hold, and as soon as the payment hold has been released, the actual release date.
     * @param value Value to set for the paymentHolds property.
     */
    public void setPaymentHolds(@jakarta.annotation.Nullable final java.util.List<PaymentHold> value) {
        this.paymentHolds = value;
    }
    /**
     * Sets the paymentMethod property value. The payment method used to pay for the order. See the &lt;strong&gt;PaymentMethodTypeEnum&lt;/strong&gt; type for more information on the payment methods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, access to buyer payment details for U.S. users will be limited to select developers. All other developers will receive a value of &quot;CustomCode&quot; in place of buyer payment details. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the paymentMethod property.
     */
    public void setPaymentMethod(@jakarta.annotation.Nullable final PaymentMethodTypeEnum value) {
        this.paymentMethod = value;
    }
    /**
     * Sets the paymentReferenceId property value. This field is only returned if payment has been made by the buyer, and the &lt;strong&gt;paymentMethod&lt;/strong&gt; is &lt;code&gt;ESCROW&lt;/code&gt;. This field contains a special ID for ESCROW.
     * @param value Value to set for the paymentReferenceId property.
     */
    public void setPaymentReferenceId(@jakarta.annotation.Nullable final String value) {
        this.paymentReferenceId = value;
    }
    /**
     * Sets the paymentStatus property value. The enumeration value returned in this field indicates the status of the payment for the order. See the &lt;strong&gt;PaymentStatusEnum&lt;/strong&gt; type definition for more information on the possible payment states.
     * @param value Value to set for the paymentStatus property.
     */
    public void setPaymentStatus(@jakarta.annotation.Nullable final PaymentStatusEnum value) {
        this.paymentStatus = value;
    }
}
