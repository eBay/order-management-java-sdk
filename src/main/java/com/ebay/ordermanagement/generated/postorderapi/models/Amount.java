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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to expressed dollar amounts and the currency used.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Amount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     */
    private String convertedFromCurrency;
    /**
     * The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.
     */
    private Double convertedFromValue;
    /**
     * A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     */
    private String currency;
    /**
     * This field shows the exchange rate used to convert the amount in the &lt;b&gt;convertedFromValue&lt;/b&gt; field to amount in the &lt;b&gt;value&lt;/b&gt; field. This field is only returned when eBay does a currency version.
     */
    private String exchangeRate;
    /**
     * The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
     */
    private Double value;
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
     * Gets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedFromCurrency() {
        return this.convertedFromCurrency;
    }
    /**
     * Gets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConvertedFromValue() {
        return this.convertedFromValue;
    }
    /**
     * Gets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the exchangeRate property value. This field shows the exchange rate used to convert the amount in the &lt;b&gt;convertedFromValue&lt;/b&gt; field to amount in the &lt;b&gt;value&lt;/b&gt; field. This field is only returned when eBay does a currency version.
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
        deserializerMap.put("convertedFromCurrency", (n) -> { this.setConvertedFromCurrency(n.getStringValue()); });
        deserializerMap.put("convertedFromValue", (n) -> { this.setConvertedFromValue(n.getDoubleValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("exchangeRate", (n) -> { this.setExchangeRate(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("convertedFromCurrency", this.getConvertedFromCurrency());
        writer.writeDoubleValue("convertedFromValue", this.getConvertedFromValue());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("exchangeRate", this.getExchangeRate());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     * @param value Value to set for the convertedFromCurrency property.
     */
    public void setConvertedFromCurrency(@jakarta.annotation.Nullable final String value) {
        this.convertedFromCurrency = value;
    }
    /**
     * Sets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br/&gt;&lt;br/&gt;If no conversion occurs, this should not be populated.
     * @param value Value to set for the convertedFromValue property.
     */
    public void setConvertedFromValue(@jakarta.annotation.Nullable final Double value) {
        this.convertedFromValue = value;
    }
    /**
     * Sets the currency property value. A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of three-digit currency codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CurrencyCodeEnum.html&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type definition.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the exchangeRate property value. This field shows the exchange rate used to convert the amount in the &lt;b&gt;convertedFromValue&lt;/b&gt; field to amount in the &lt;b&gt;value&lt;/b&gt; field. This field is only returned when eBay does a currency version.
     * @param value Value to set for the exchangeRate property.
     */
    public void setExchangeRate(@jakarta.annotation.Nullable final String value) {
        this.exchangeRate = value;
    }
    /**
     * Sets the value property value. The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.value = value;
    }
}
