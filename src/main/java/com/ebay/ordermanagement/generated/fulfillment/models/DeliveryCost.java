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
 * This type contains a breakdown of all costs associated with the fulfillment of a line item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryCost implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount of any shipping discount that has been applied to the line item. This container is returned only if a shipping discount applies to the line item.
     */
    private Amount discountAmount;
    /**
     * The amount of any handing cost that has been applied to the line item. This container is returned only if a handling cost applies to the line item.
     */
    private Amount handlingCost;
    /**
     * The amount of any import charges applied to international shipping of the line item. This container is only returned if import charges apply to the line item.
     */
    private Amount importCharges;
    /**
     * The total cost of shipping all units of the line item. This container is always returned even when the shipping cost is free, in which case the &lt;strong&gt;value&lt;/strong&gt; field will show &lt;code&gt;0.0&lt;/code&gt; (dollars).
     */
    private Amount shippingCost;
    /**
     * This field shows the fee due to eBay&apos;s international shipping provider for a line item that is being shipped through the Global Shipping Program.&lt;br&gt;&lt;br&gt;This container is only returned for line items being shipped internationally through the Global Shipping Program, which is currently only supported in the US and UK marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The value returned for this field will always be &lt;code&gt;0.0&lt;/code&gt; for line items sold in the UK marketplace.&lt;/span&gt;
     */
    private Amount shippingIntermediationFee;
    /**
     * Instantiates a new {@link DeliveryCost} and sets the default values.
     */
    public DeliveryCost() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeliveryCost}
     */
    @jakarta.annotation.Nonnull
    public static DeliveryCost createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryCost();
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
     * Gets the discountAmount property value. The amount of any shipping discount that has been applied to the line item. This container is returned only if a shipping discount applies to the line item.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDiscountAmount() {
        return this.discountAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("handlingCost", (n) -> { this.setHandlingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("importCharges", (n) -> { this.setImportCharges(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingIntermediationFee", (n) -> { this.setShippingIntermediationFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handlingCost property value. The amount of any handing cost that has been applied to the line item. This container is returned only if a handling cost applies to the line item.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getHandlingCost() {
        return this.handlingCost;
    }
    /**
     * Gets the importCharges property value. The amount of any import charges applied to international shipping of the line item. This container is only returned if import charges apply to the line item.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getImportCharges() {
        return this.importCharges;
    }
    /**
     * Gets the shippingCost property value. The total cost of shipping all units of the line item. This container is always returned even when the shipping cost is free, in which case the &lt;strong&gt;value&lt;/strong&gt; field will show &lt;code&gt;0.0&lt;/code&gt; (dollars).
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Gets the shippingIntermediationFee property value. This field shows the fee due to eBay&apos;s international shipping provider for a line item that is being shipped through the Global Shipping Program.&lt;br&gt;&lt;br&gt;This container is only returned for line items being shipped internationally through the Global Shipping Program, which is currently only supported in the US and UK marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The value returned for this field will always be &lt;code&gt;0.0&lt;/code&gt; for line items sold in the UK marketplace.&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingIntermediationFee() {
        return this.shippingIntermediationFee;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("discountAmount", this.getDiscountAmount());
        writer.writeObjectValue("handlingCost", this.getHandlingCost());
        writer.writeObjectValue("importCharges", this.getImportCharges());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeObjectValue("shippingIntermediationFee", this.getShippingIntermediationFee());
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
     * Sets the discountAmount property value. The amount of any shipping discount that has been applied to the line item. This container is returned only if a shipping discount applies to the line item.
     * @param value Value to set for the discountAmount property.
     */
    public void setDiscountAmount(@jakarta.annotation.Nullable final Amount value) {
        this.discountAmount = value;
    }
    /**
     * Sets the handlingCost property value. The amount of any handing cost that has been applied to the line item. This container is returned only if a handling cost applies to the line item.
     * @param value Value to set for the handlingCost property.
     */
    public void setHandlingCost(@jakarta.annotation.Nullable final Amount value) {
        this.handlingCost = value;
    }
    /**
     * Sets the importCharges property value. The amount of any import charges applied to international shipping of the line item. This container is only returned if import charges apply to the line item.
     * @param value Value to set for the importCharges property.
     */
    public void setImportCharges(@jakarta.annotation.Nullable final Amount value) {
        this.importCharges = value;
    }
    /**
     * Sets the shippingCost property value. The total cost of shipping all units of the line item. This container is always returned even when the shipping cost is free, in which case the &lt;strong&gt;value&lt;/strong&gt; field will show &lt;code&gt;0.0&lt;/code&gt; (dollars).
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
    /**
     * Sets the shippingIntermediationFee property value. This field shows the fee due to eBay&apos;s international shipping provider for a line item that is being shipped through the Global Shipping Program.&lt;br&gt;&lt;br&gt;This container is only returned for line items being shipped internationally through the Global Shipping Program, which is currently only supported in the US and UK marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The value returned for this field will always be &lt;code&gt;0.0&lt;/code&gt; for line items sold in the UK marketplace.&lt;/span&gt;
     * @param value Value to set for the shippingIntermediationFee property.
     */
    public void setShippingIntermediationFee(@jakarta.annotation.Nullable final Amount value) {
        this.shippingIntermediationFee = value;
    }
}
