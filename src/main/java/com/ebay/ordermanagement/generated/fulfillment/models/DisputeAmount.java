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
public class DisputeAmount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;strong&gt; convertedFromValue&lt;/strong&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     */
    private CurrencyCodeEnum convertedFromCurrency;
    /**
     * The monetary amount before any conversion is performed, in the currency specified by the &lt;strong&gt; convertedFromCurrency&lt;/strong&gt; field. This value is the pre-conversion amount. The &lt;strong&gt; value&lt;/strong&gt; field contains the converted amount of this value, in the currency specified by the &lt;strong&gt; currency&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     */
    private String convertedFromValue;
    /**
     * A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Default&lt;/strong&gt;: The currency of the authenticated user&apos;s country.
     */
    private CurrencyCodeEnum currency;
    /**
     * The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;strong&gt;value&lt;/strong&gt; field from the dollar value in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     */
    private String exchangeRate;
    /**
     * The monetary amount, in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type.
     */
    private String value;
    /**
     * Instantiates a new {@link DisputeAmount} and sets the default values.
     */
    public DisputeAmount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DisputeAmount}
     */
    @jakarta.annotation.Nonnull
    public static DisputeAmount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisputeAmount();
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
     * Gets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;strong&gt; convertedFromValue&lt;/strong&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getConvertedFromCurrency() {
        return this.convertedFromCurrency;
    }
    /**
     * Gets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;strong&gt; convertedFromCurrency&lt;/strong&gt; field. This value is the pre-conversion amount. The &lt;strong&gt; value&lt;/strong&gt; field contains the converted amount of this value, in the currency specified by the &lt;strong&gt; currency&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedFromValue() {
        return this.convertedFromValue;
    }
    /**
     * Gets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Default&lt;/strong&gt;: The currency of the authenticated user&apos;s country.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCurrency() {
        return this.currency;
    }
    /**
     * Gets the exchangeRate property value. The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;strong&gt;value&lt;/strong&gt; field from the dollar value in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExchangeRate() {
        return this.exchangeRate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("convertedFromCurrency", (n) -> { this.setConvertedFromCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("convertedFromValue", (n) -> { this.setConvertedFromValue(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("exchangeRate", (n) -> { this.setExchangeRate(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount, in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type.
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
        writer.writeStringValue("exchangeRate", this.getExchangeRate());
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
     * Sets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;strong&gt; convertedFromValue&lt;/strong&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @param value Value to set for the convertedFromCurrency property.
     */
    public void setConvertedFromCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.convertedFromCurrency = value;
    }
    /**
     * Sets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;strong&gt; convertedFromCurrency&lt;/strong&gt; field. This value is the pre-conversion amount. The &lt;strong&gt; value&lt;/strong&gt; field contains the converted amount of this value, in the currency specified by the &lt;strong&gt; currency&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @param value Value to set for the convertedFromValue property.
     */
    public void setConvertedFromValue(@jakarta.annotation.Nullable final String value) {
        this.convertedFromValue = value;
    }
    /**
     * Sets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Default&lt;/strong&gt;: The currency of the authenticated user&apos;s country.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.currency = value;
    }
    /**
     * Sets the exchangeRate property value. The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;strong&gt;value&lt;/strong&gt; field from the dollar value in the &lt;strong&gt;convertedFromValue&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @param value Value to set for the exchangeRate property.
     */
    public void setExchangeRate(@jakarta.annotation.Nullable final String value) {
        this.exchangeRate = value;
    }
    /**
     * Sets the value property value. The monetary amount, in the currency specified by the &lt;strong&gt;currency&lt;/strong&gt; field. This field is always returned with any container using &lt;strong&gt;Amount&lt;/strong&gt; type.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
