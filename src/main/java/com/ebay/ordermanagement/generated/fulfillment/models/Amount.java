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
 * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Amount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required and represents the pre-conversion currency.
     */
    private CurrencyCodeEnum convertedFromCurrency;
    /**
     * The monetary amount, before any conversion is performed, in the currency specified by the &lt;strong&gt;convertedFromCurrency&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required. The &lt;strong&gt;value&lt;/strong&gt; field contains the converted amount of this value in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field.
     */
    private String convertedFromValue;
    /**
     * A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. If currency conversion/localization is required, this is the post-conversion currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The default currency with be that of the eBay marketplace that hosts the listing.
     */
    private CurrencyCodeEnum currency;
    /**
     * The monetary amount in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. If currency conversion/localization is required, this value is the converted amount, and the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field contains the amount in the original currency.  &lt;br&gt;&lt;br&gt;&lt;em&gt;Required&lt;/em&gt; in the &lt;strong&gt;amount&lt;/strong&gt; type.
     */
    private String value;
    /**
     * Instantiates a new {@link Amount} and sets the default values.
     */
    public Amount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nonnull
    public static Amount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Amount();
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
     * Gets the convertedFromCurrency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required and represents the pre-conversion currency.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getConvertedFromCurrency() {
        return this.convertedFromCurrency;
    }
    /**
     * Gets the convertedFromValue property value. The monetary amount, before any conversion is performed, in the currency specified by the &lt;strong&gt;convertedFromCurrency&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required. The &lt;strong&gt;value&lt;/strong&gt; field contains the converted amount of this value in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedFromValue() {
        return this.convertedFromValue;
    }
    /**
     * Gets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. If currency conversion/localization is required, this is the post-conversion currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The default currency with be that of the eBay marketplace that hosts the listing.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("convertedFromCurrency", (n) -> { this.setConvertedFromCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("convertedFromValue", (n) -> { this.setConvertedFromValue(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. If currency conversion/localization is required, this value is the converted amount, and the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field contains the amount in the original currency.  &lt;br&gt;&lt;br&gt;&lt;em&gt;Required&lt;/em&gt; in the &lt;strong&gt;amount&lt;/strong&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("convertedFromCurrency", this.getConvertedFromCurrency());
        writer.writeStringValue("convertedFromValue", this.getConvertedFromValue());
        writer.writeEnumValue("currency", this.getCurrency());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the convertedFromCurrency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required and represents the pre-conversion currency.
     * @param value Value to set for the convertedFromCurrency property.
     */
    public void setConvertedFromCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.convertedFromCurrency = value;
    }
    /**
     * Sets the convertedFromValue property value. The monetary amount, before any conversion is performed, in the currency specified by the &lt;strong&gt;convertedFromCurrency&lt;/strong&gt; field. This value is required or returned only if currency conversion/localization is required. The &lt;strong&gt;value&lt;/strong&gt; field contains the converted amount of this value in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field.
     * @param value Value to set for the convertedFromValue property.
     */
    public void setConvertedFromValue(@jakarta.annotation.Nullable final String value) {
        this.convertedFromValue = value;
    }
    /**
     * Sets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. If currency conversion/localization is required, this is the post-conversion currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The default currency with be that of the eBay marketplace that hosts the listing.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. The monetary amount in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. If currency conversion/localization is required, this value is the converted amount, and the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field contains the amount in the original currency.  &lt;br&gt;&lt;br&gt;&lt;em&gt;Required&lt;/em&gt; in the &lt;strong&gt;amount&lt;/strong&gt; type.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
