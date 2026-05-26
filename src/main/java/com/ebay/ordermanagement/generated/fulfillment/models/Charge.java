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
 * This type is used to display the charge type and the amount of the charge against the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Charge implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount amount;
    /**
     * This field shows the type of buyer charge &lt;br&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt; Note: &lt;/strong&gt; Currently, the only supported charge type is BUYER_PROTECTION. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sol:ChargeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String chargeType;
    /**
     * Instantiates a new {@link Charge} and sets the default values.
     */
    public Charge() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Charge}
     */
    @jakarta.annotation.Nonnull
    public static Charge createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Charge();
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
     * Gets the chargeType property value. This field shows the type of buyer charge &lt;br&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt; Note: &lt;/strong&gt; Currently, the only supported charge type is BUYER_PROTECTION. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sol:ChargeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChargeType() {
        return this.chargeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("chargeType", (n) -> { this.setChargeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("chargeType", this.getChargeType());
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
     * Sets the chargeType property value. This field shows the type of buyer charge &lt;br&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt; Note: &lt;/strong&gt; Currently, the only supported charge type is BUYER_PROTECTION. &lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sol:ChargeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the chargeType property.
     */
    public void setChargeType(@jakarta.annotation.Nullable final String value) {
        this.chargeType = value;
    }
}
