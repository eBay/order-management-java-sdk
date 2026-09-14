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
 * This type describes the physical location of an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code representing the country of the address.
     */
    private CountryCodeEnum countryCode;
    /**
     * Indicates the geographical location of the item (along with the values in the &lt;strong&gt;countryCode&lt;/strong&gt; and &lt;strong&gt;postalCode&lt;/strong&gt; fields).&lt;br&gt;&lt;br&gt;This field provides city, province, state, or similar information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi-Warehouse Program, this field will return the geographical location of the fulfillment center closest to the buyer.&lt;/span&gt;
     */
    private String location;
    /**
     * The postal code of the address.
     */
    private String postalCode;
    /**
     * Instantiates a new {@link ItemLocation} and sets the default values.
     */
    public ItemLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemLocation}
     */
    @jakarta.annotation.Nonnull
    public static ItemLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemLocation();
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
     * Gets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code representing the country of the address.
     * @return a {@link CountryCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CountryCodeEnum getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getEnumValue(CountryCodeEnum::forValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. Indicates the geographical location of the item (along with the values in the &lt;strong&gt;countryCode&lt;/strong&gt; and &lt;strong&gt;postalCode&lt;/strong&gt; fields).&lt;br&gt;&lt;br&gt;This field provides city, province, state, or similar information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi-Warehouse Program, this field will return the geographical location of the fulfillment center closest to the buyer.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the postalCode property value. The postal code of the address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("countryCode", this.getCountryCode());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("postalCode", this.getPostalCode());
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
     * Sets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code representing the country of the address.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final CountryCodeEnum value) {
        this.countryCode = value;
    }
    /**
     * Sets the location property value. Indicates the geographical location of the item (along with the values in the &lt;strong&gt;countryCode&lt;/strong&gt; and &lt;strong&gt;postalCode&lt;/strong&gt; fields).&lt;br&gt;&lt;br&gt;This field provides city, province, state, or similar information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi-Warehouse Program, this field will return the geographical location of the fulfillment center closest to the buyer.&lt;/span&gt;
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the postalCode property value. The postal code of the address.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
}
