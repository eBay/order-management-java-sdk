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
 * This type is used by the &lt;strong&gt;taxIdentifier&lt;/strong&gt; container that is returned in &lt;strong&gt;getOrder&lt;/strong&gt;. The &lt;strong&gt;taxIdentifier&lt;/strong&gt; container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, the &lt;strong&gt;taxIdentifier&lt;/strong&gt; container is only returned in &lt;strong&gt;getOrder&lt;/strong&gt; and not in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt;. So, if a seller wanted to view a buyer&apos;s tax information for a particular order returned in &lt;strong&gt;getOrders&lt;/strong&gt;, that seller would need to use the &lt;strong&gt;orderId&lt;/strong&gt; value for that particular order, and then run a &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call against that order ID. &lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxIdentifier implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This two-letter code indicates the country that issued the buyer&apos;s tax ID. The country that the two-letter code represents can be found in the &lt;strong&gt;CountryCodeEnum&lt;/strong&gt; type or in the  &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; standard.
     */
    private CountryCodeEnum issuingCountry;
    /**
     * This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the &lt;strong&gt;TaxIdentifierTypeEnum&lt;/strong&gt; type.
     */
    private TaxIdentifierTypeEnum taxIdentifierType;
    /**
     * This value is the unique tax ID associated with the buyer. The type of tax identification is shown in the &lt;strong&gt;taxIdentifierType&lt;/strong&gt; field.
     */
    private String taxpayerId;
    /**
     * Instantiates a new {@link TaxIdentifier} and sets the default values.
     */
    public TaxIdentifier() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaxIdentifier}
     */
    @jakarta.annotation.Nonnull
    public static TaxIdentifier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaxIdentifier();
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
        deserializerMap.put("issuingCountry", (n) -> { this.setIssuingCountry(n.getEnumValue(CountryCodeEnum::forValue)); });
        deserializerMap.put("taxIdentifierType", (n) -> { this.setTaxIdentifierType(n.getEnumValue(TaxIdentifierTypeEnum::forValue)); });
        deserializerMap.put("taxpayerId", (n) -> { this.setTaxpayerId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuingCountry property value. This two-letter code indicates the country that issued the buyer&apos;s tax ID. The country that the two-letter code represents can be found in the &lt;strong&gt;CountryCodeEnum&lt;/strong&gt; type or in the  &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; standard.
     * @return a {@link CountryCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CountryCodeEnum getIssuingCountry() {
        return this.issuingCountry;
    }
    /**
     * Gets the taxIdentifierType property value. This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the &lt;strong&gt;TaxIdentifierTypeEnum&lt;/strong&gt; type.
     * @return a {@link TaxIdentifierTypeEnum}
     */
    @jakarta.annotation.Nullable
    public TaxIdentifierTypeEnum getTaxIdentifierType() {
        return this.taxIdentifierType;
    }
    /**
     * Gets the taxpayerId property value. This value is the unique tax ID associated with the buyer. The type of tax identification is shown in the &lt;strong&gt;taxIdentifierType&lt;/strong&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxpayerId() {
        return this.taxpayerId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("issuingCountry", this.getIssuingCountry());
        writer.writeEnumValue("taxIdentifierType", this.getTaxIdentifierType());
        writer.writeStringValue("taxpayerId", this.getTaxpayerId());
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
     * Sets the issuingCountry property value. This two-letter code indicates the country that issued the buyer&apos;s tax ID. The country that the two-letter code represents can be found in the &lt;strong&gt;CountryCodeEnum&lt;/strong&gt; type or in the  &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; standard.
     * @param value Value to set for the issuingCountry property.
     */
    public void setIssuingCountry(@jakarta.annotation.Nullable final CountryCodeEnum value) {
        this.issuingCountry = value;
    }
    /**
     * Sets the taxIdentifierType property value. This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the &lt;strong&gt;TaxIdentifierTypeEnum&lt;/strong&gt; type.
     * @param value Value to set for the taxIdentifierType property.
     */
    public void setTaxIdentifierType(@jakarta.annotation.Nullable final TaxIdentifierTypeEnum value) {
        this.taxIdentifierType = value;
    }
    /**
     * Sets the taxpayerId property value. This value is the unique tax ID associated with the buyer. The type of tax identification is shown in the &lt;strong&gt;taxIdentifierType&lt;/strong&gt; field.
     * @param value Value to set for the taxpayerId property.
     */
    public void setTaxpayerId(@jakarta.annotation.Nullable final String value) {
        this.taxpayerId = value;
    }
}
