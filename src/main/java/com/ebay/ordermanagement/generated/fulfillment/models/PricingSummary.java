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
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount adjustment;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount deliveryCost;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount deliveryDiscount;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount fee;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount priceDiscount;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount priceSubtotal;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount tax;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
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
     * Gets the adjustment property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdjustment() {
        return this.adjustment;
    }
    /**
     * Gets the deliveryCost property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDeliveryCost() {
        return this.deliveryCost;
    }
    /**
     * Gets the deliveryDiscount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDeliveryDiscount() {
        return this.deliveryDiscount;
    }
    /**
     * Gets the fee property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
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
     * Gets the priceDiscount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPriceDiscount() {
        return this.priceDiscount;
    }
    /**
     * Gets the priceSubtotal property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPriceSubtotal() {
        return this.priceSubtotal;
    }
    /**
     * Gets the tax property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTax() {
        return this.tax;
    }
    /**
     * Gets the total property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
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
     * Sets the adjustment property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the adjustment property.
     */
    public void setAdjustment(@jakarta.annotation.Nullable final Amount value) {
        this.adjustment = value;
    }
    /**
     * Sets the deliveryCost property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the deliveryCost property.
     */
    public void setDeliveryCost(@jakarta.annotation.Nullable final Amount value) {
        this.deliveryCost = value;
    }
    /**
     * Sets the deliveryDiscount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the deliveryDiscount property.
     */
    public void setDeliveryDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.deliveryDiscount = value;
    }
    /**
     * Sets the fee property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the fee property.
     */
    public void setFee(@jakarta.annotation.Nullable final Amount value) {
        this.fee = value;
    }
    /**
     * Sets the priceDiscount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the priceDiscount property.
     */
    public void setPriceDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.priceDiscount = value;
    }
    /**
     * Sets the priceSubtotal property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the priceSubtotal property.
     */
    public void setPriceSubtotal(@jakarta.annotation.Nullable final Amount value) {
        this.priceSubtotal = value;
    }
    /**
     * Sets the tax property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the tax property.
     */
    public void setTax(@jakarta.annotation.Nullable final Amount value) {
        this.tax = value;
    }
    /**
     * Sets the total property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Amount value) {
        this.total = value;
    }
}
