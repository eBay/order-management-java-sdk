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
 * This type contains a summary of cumulative costs and charges for all line items of an order, including item price, price adjustments, sales taxes, delivery costs, and order discounts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PricingSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container shows the total amount of any adjustments that were applied to the cost of the item(s) in the order. This amount does not include shipping, discounts, fixed fees, or taxes.&lt;br&gt;&lt;br&gt;This container is only returned if price adjustments were made to the order after the initial transaction/commitment to buy occurred.
     */
    private Amount adjustment;
    /**
     * This container shows the total cost of delivering the order to the buyer before any shipping/delivery discount is applied.
     */
    private Amount deliveryCost;
    /**
     * This container shows the total amount of delivery discounts (including shipping discounts) that apply to the order. This should be a negative real number.&lt;br&gt;&lt;br&gt;This container is only returned if delivery discounts are being applied to the order.
     */
    private Amount deliveryDiscount;
    /**
     * This container shows the total amount of any special fees applied to the order, such as a tire recycling fee or an electronic waste fee. &lt;br&gt;&lt;br&gt;This container is returned if special fees are being applied to the order and if the &lt;strong&gt;fieldGroups&lt;/strong&gt; is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;.
     */
    private Amount fee;
    /**
     * This container shows the total amount of all item price discounts (including promotions) that apply to the order and reduce its cost to the buyer. This should be a negative real number. &lt;br&gt;&lt;br&gt;This container is only returned if special discounts are being applied to the order.
     */
    private Amount priceDiscount;
    /**
     * This container shows the cumulative costs of of all units of all line items in the order before any discount is applied.
     */
    private Amount priceSubtotal;
    /**
     * This container shows the total amount of tax for the order. To calculate the tax percentage rate, divide this value by the value of the &lt;strong&gt;total&lt;/strong&gt; field. &lt;br&gt;&lt;br&gt;This container is only returned if any type of tax (sales tax, tax on shipping, tax on handling, import tax, etc.) is applied to the order.
     */
    private Amount tax;
    /**
     * The total cost of the order after adding all line item costs, delivery costs, sales tax, and special fees and then subtracting all special discounts and price adjustments.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Amount total;
    /**
     * Instantiates a new {@link PricingSummary} and sets the default values.
     */
    public PricingSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PricingSummary}
     */
    @jakarta.annotation.Nonnull
    public static PricingSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PricingSummary();
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
     * Gets the adjustment property value. This container shows the total amount of any adjustments that were applied to the cost of the item(s) in the order. This amount does not include shipping, discounts, fixed fees, or taxes.&lt;br&gt;&lt;br&gt;This container is only returned if price adjustments were made to the order after the initial transaction/commitment to buy occurred.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdjustment() {
        return this.adjustment;
    }
    /**
     * Gets the deliveryCost property value. This container shows the total cost of delivering the order to the buyer before any shipping/delivery discount is applied.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDeliveryCost() {
        return this.deliveryCost;
    }
    /**
     * Gets the deliveryDiscount property value. This container shows the total amount of delivery discounts (including shipping discounts) that apply to the order. This should be a negative real number.&lt;br&gt;&lt;br&gt;This container is only returned if delivery discounts are being applied to the order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDeliveryDiscount() {
        return this.deliveryDiscount;
    }
    /**
     * Gets the fee property value. This container shows the total amount of any special fees applied to the order, such as a tire recycling fee or an electronic waste fee. &lt;br&gt;&lt;br&gt;This container is returned if special fees are being applied to the order and if the &lt;strong&gt;fieldGroups&lt;/strong&gt; is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getFee() {
        return this.fee;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("adjustment", (n) -> { this.setAdjustment(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("deliveryCost", (n) -> { this.setDeliveryCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("deliveryDiscount", (n) -> { this.setDeliveryDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("fee", (n) -> { this.setFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("priceDiscount", (n) -> { this.setPriceDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("priceSubtotal", (n) -> { this.setPriceSubtotal(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("tax", (n) -> { this.setTax(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the priceDiscount property value. This container shows the total amount of all item price discounts (including promotions) that apply to the order and reduce its cost to the buyer. This should be a negative real number. &lt;br&gt;&lt;br&gt;This container is only returned if special discounts are being applied to the order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPriceDiscount() {
        return this.priceDiscount;
    }
    /**
     * Gets the priceSubtotal property value. This container shows the cumulative costs of of all units of all line items in the order before any discount is applied.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPriceSubtotal() {
        return this.priceSubtotal;
    }
    /**
     * Gets the tax property value. This container shows the total amount of tax for the order. To calculate the tax percentage rate, divide this value by the value of the &lt;strong&gt;total&lt;/strong&gt; field. &lt;br&gt;&lt;br&gt;This container is only returned if any type of tax (sales tax, tax on shipping, tax on handling, import tax, etc.) is applied to the order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTax() {
        return this.tax;
    }
    /**
     * Gets the total property value. The total cost of the order after adding all line item costs, delivery costs, sales tax, and special fees and then subtracting all special discounts and price adjustments.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adjustment", this.getAdjustment());
        writer.writeObjectValue("deliveryCost", this.getDeliveryCost());
        writer.writeObjectValue("deliveryDiscount", this.getDeliveryDiscount());
        writer.writeObjectValue("fee", this.getFee());
        writer.writeObjectValue("priceDiscount", this.getPriceDiscount());
        writer.writeObjectValue("priceSubtotal", this.getPriceSubtotal());
        writer.writeObjectValue("tax", this.getTax());
        writer.writeObjectValue("total", this.getTotal());
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
     * Sets the adjustment property value. This container shows the total amount of any adjustments that were applied to the cost of the item(s) in the order. This amount does not include shipping, discounts, fixed fees, or taxes.&lt;br&gt;&lt;br&gt;This container is only returned if price adjustments were made to the order after the initial transaction/commitment to buy occurred.
     * @param value Value to set for the adjustment property.
     */
    public void setAdjustment(@jakarta.annotation.Nullable final Amount value) {
        this.adjustment = value;
    }
    /**
     * Sets the deliveryCost property value. This container shows the total cost of delivering the order to the buyer before any shipping/delivery discount is applied.
     * @param value Value to set for the deliveryCost property.
     */
    public void setDeliveryCost(@jakarta.annotation.Nullable final Amount value) {
        this.deliveryCost = value;
    }
    /**
     * Sets the deliveryDiscount property value. This container shows the total amount of delivery discounts (including shipping discounts) that apply to the order. This should be a negative real number.&lt;br&gt;&lt;br&gt;This container is only returned if delivery discounts are being applied to the order.
     * @param value Value to set for the deliveryDiscount property.
     */
    public void setDeliveryDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.deliveryDiscount = value;
    }
    /**
     * Sets the fee property value. This container shows the total amount of any special fees applied to the order, such as a tire recycling fee or an electronic waste fee. &lt;br&gt;&lt;br&gt;This container is returned if special fees are being applied to the order and if the &lt;strong&gt;fieldGroups&lt;/strong&gt; is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;.
     * @param value Value to set for the fee property.
     */
    public void setFee(@jakarta.annotation.Nullable final Amount value) {
        this.fee = value;
    }
    /**
     * Sets the priceDiscount property value. This container shows the total amount of all item price discounts (including promotions) that apply to the order and reduce its cost to the buyer. This should be a negative real number. &lt;br&gt;&lt;br&gt;This container is only returned if special discounts are being applied to the order.
     * @param value Value to set for the priceDiscount property.
     */
    public void setPriceDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.priceDiscount = value;
    }
    /**
     * Sets the priceSubtotal property value. This container shows the cumulative costs of of all units of all line items in the order before any discount is applied.
     * @param value Value to set for the priceSubtotal property.
     */
    public void setPriceSubtotal(@jakarta.annotation.Nullable final Amount value) {
        this.priceSubtotal = value;
    }
    /**
     * Sets the tax property value. This container shows the total amount of tax for the order. To calculate the tax percentage rate, divide this value by the value of the &lt;strong&gt;total&lt;/strong&gt; field. &lt;br&gt;&lt;br&gt;This container is only returned if any type of tax (sales tax, tax on shipping, tax on handling, import tax, etc.) is applied to the order.
     * @param value Value to set for the tax property.
     */
    public void setTax(@jakarta.annotation.Nullable final Amount value) {
        this.tax = value;
    }
    /**
     * Sets the total property value. The total cost of the order after adding all line item costs, delivery costs, sales tax, and special fees and then subtracting all special discounts and price adjustments.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is included in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Good and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Amount value) {
        this.total = value;
    }
}
