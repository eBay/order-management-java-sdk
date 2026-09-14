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
 * This type contains information about the various monetary exchanges that apply to the net balance due for the order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     */
    private java.util.List<Payment> payments;
    /**
     * This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     */
    private java.util.List<OrderRefund> refunds;
    /**
     * This is the total price that the seller receives for the entire order after all costs (item cost, delivery cost, taxes) are added for all line items, minus any discounts and/or promotions for any of the line items. Note that this value is subject to change before payment is actually made by the buyer (if the &lt;strong&gt;paymentStatus&lt;/strong&gt; value was &lt;code&gt;PENDING&lt;/code&gt; or &lt;code&gt;FAILED&lt;/code&gt;), or if a partial or full refund occurs with the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Amount totalDueSeller;
    /**
     * Instantiates a new {@link PaymentSummary} and sets the default values.
     */
    public PaymentSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentSummary}
     */
    @jakarta.annotation.Nonnull
    public static PaymentSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentSummary();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("payments", (n) -> { this.setPayments(n.getCollectionOfObjectValues(Payment::createFromDiscriminatorValue)); });
        deserializerMap.put("refunds", (n) -> { this.setRefunds(n.getCollectionOfObjectValues(OrderRefund::createFromDiscriminatorValue)); });
        deserializerMap.put("totalDueSeller", (n) -> { this.setTotalDueSeller(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payments property value. This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     * @return a {@link java.util.List<Payment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Payment> getPayments() {
        return this.payments;
    }
    /**
     * Gets the refunds property value. This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @return a {@link java.util.List<OrderRefund>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderRefund> getRefunds() {
        return this.refunds;
    }
    /**
     * Gets the totalDueSeller property value. This is the total price that the seller receives for the entire order after all costs (item cost, delivery cost, taxes) are added for all line items, minus any discounts and/or promotions for any of the line items. Note that this value is subject to change before payment is actually made by the buyer (if the &lt;strong&gt;paymentStatus&lt;/strong&gt; value was &lt;code&gt;PENDING&lt;/code&gt; or &lt;code&gt;FAILED&lt;/code&gt;), or if a partial or full refund occurs with the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalDueSeller() {
        return this.totalDueSeller;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("payments", this.getPayments());
        writer.writeCollectionOfObjectValues("refunds", this.getRefunds());
        writer.writeObjectValue("totalDueSeller", this.getTotalDueSeller());
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
     * Sets the payments property value. This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     * @param value Value to set for the payments property.
     */
    public void setPayments(@jakarta.annotation.Nullable final java.util.List<Payment> value) {
        this.payments = value;
    }
    /**
     * Sets the refunds property value. This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @param value Value to set for the refunds property.
     */
    public void setRefunds(@jakarta.annotation.Nullable final java.util.List<OrderRefund> value) {
        this.refunds = value;
    }
    /**
     * Sets the totalDueSeller property value. This is the total price that the seller receives for the entire order after all costs (item cost, delivery cost, taxes) are added for all line items, minus any discounts and/or promotions for any of the line items. Note that this value is subject to change before payment is actually made by the buyer (if the &lt;strong&gt;paymentStatus&lt;/strong&gt; value was &lt;code&gt;PENDING&lt;/code&gt; or &lt;code&gt;FAILED&lt;/code&gt;), or if a partial or full refund occurs with the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;totalDueSeller&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the totalDueSeller property.
     */
    public void setTotalDueSeller(@jakarta.annotation.Nullable final Amount value) {
        this.totalDueSeller = value;
    }
}
