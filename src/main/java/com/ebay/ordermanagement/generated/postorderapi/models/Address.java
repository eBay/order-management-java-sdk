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
 * This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Address implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first line of the street address. The first line of the street address is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     */
    private String addressLine1;
    /**
     * The second line of the street address. This field is not always used, but it should be provided if applicable. It might be used for something like &apos;Suite Number&apos; or &apos;Apt Number&apos;.
     */
    private String addressLine2;
    /**
     * This enumeration value indicates whether the address is a business, a personal address, PO Box, or other type of address. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AddressTypeEnum.html&quot;&gt;AddressTypeEnum&lt;/a&gt; type definition.
     */
    private String addressType;
    /**
     * The city of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     */
    private String city;
    /**
     * This enumeration value indicates the country of the address. The three-letter country codes of the ISO 3166-1 Standard are used. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of two-digit country codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CountryCodeEnum.html&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.
     */
    private String country;
    /**
     * The county of the address. This field is not always used, but it should be provided if applicable.
     */
    private String county;
    /**
     * This Boolean field is returned as &lt;code&gt;true&lt;/code&gt; if language transliteration was required.
     */
    private Boolean isTransliterated;
    /**
     * This string value indicates a specific region or metropolitan area within a country in which the address resides. Not all countries have defined national regions.
     */
    private String nationalRegion;
    /**
     * The postal code of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     */
    private String postalCode;
    /**
     * This enumeration value indicates the language that the address has been transliterated into. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &lt;code&gt;true&lt;/code&gt;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     */
    private String script;
    /**
     * The state or province of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     */
    private String stateOrProvince;
    /**
     * This enumeration value indicates the language that the address has been transliterated from. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &apos;true&apos;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     */
    private String transliteratedFromScript;
    /**
     * This string value indicates the region of the world in which the address resides. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of world region enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/WorldRegionEnum.html&quot;&gt;WorldRegionEnum&lt;/a&gt; type definition.
     */
    private String worldRegion;
    /**
     * Instantiates a new {@link Address} and sets the default values.
     */
    public Address() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Address}
     */
    @jakarta.annotation.Nonnull
    public static Address createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Address();
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
     * Gets the addressLine1 property value. The first line of the street address. The first line of the street address is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine1() {
        return this.addressLine1;
    }
    /**
     * Gets the addressLine2 property value. The second line of the street address. This field is not always used, but it should be provided if applicable. It might be used for something like &apos;Suite Number&apos; or &apos;Apt Number&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine2() {
        return this.addressLine2;
    }
    /**
     * Gets the addressType property value. This enumeration value indicates whether the address is a business, a personal address, PO Box, or other type of address. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AddressTypeEnum.html&quot;&gt;AddressTypeEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressType() {
        return this.addressType;
    }
    /**
     * Gets the city property value. The city of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. This enumeration value indicates the country of the address. The three-letter country codes of the ISO 3166-1 Standard are used. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of two-digit country codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CountryCodeEnum.html&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the county property value. The county of the address. This field is not always used, but it should be provided if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCounty() {
        return this.county;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("addressLine1", (n) -> { this.setAddressLine1(n.getStringValue()); });
        deserializerMap.put("addressLine2", (n) -> { this.setAddressLine2(n.getStringValue()); });
        deserializerMap.put("addressType", (n) -> { this.setAddressType(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("county", (n) -> { this.setCounty(n.getStringValue()); });
        deserializerMap.put("isTransliterated", (n) -> { this.setIsTransliterated(n.getBooleanValue()); });
        deserializerMap.put("nationalRegion", (n) -> { this.setNationalRegion(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("script", (n) -> { this.setScript(n.getStringValue()); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        deserializerMap.put("transliteratedFromScript", (n) -> { this.setTransliteratedFromScript(n.getStringValue()); });
        deserializerMap.put("worldRegion", (n) -> { this.setWorldRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTransliterated property value. This Boolean field is returned as &lt;code&gt;true&lt;/code&gt; if language transliteration was required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTransliterated() {
        return this.isTransliterated;
    }
    /**
     * Gets the nationalRegion property value. This string value indicates a specific region or metropolitan area within a country in which the address resides. Not all countries have defined national regions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNationalRegion() {
        return this.nationalRegion;
    }
    /**
     * Gets the postalCode property value. The postal code of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the script property value. This enumeration value indicates the language that the address has been transliterated into. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &lt;code&gt;true&lt;/code&gt;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScript() {
        return this.script;
    }
    /**
     * Gets the stateOrProvince property value. The state or province of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }
    /**
     * Gets the transliteratedFromScript property value. This enumeration value indicates the language that the address has been transliterated from. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &apos;true&apos;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransliteratedFromScript() {
        return this.transliteratedFromScript;
    }
    /**
     * Gets the worldRegion property value. This string value indicates the region of the world in which the address resides. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of world region enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/WorldRegionEnum.html&quot;&gt;WorldRegionEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWorldRegion() {
        return this.worldRegion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addressLine1", this.getAddressLine1());
        writer.writeStringValue("addressLine2", this.getAddressLine2());
        writer.writeStringValue("addressType", this.getAddressType());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("county", this.getCounty());
        writer.writeBooleanValue("isTransliterated", this.getIsTransliterated());
        writer.writeStringValue("nationalRegion", this.getNationalRegion());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("script", this.getScript());
        writer.writeStringValue("stateOrProvince", this.getStateOrProvince());
        writer.writeStringValue("transliteratedFromScript", this.getTransliteratedFromScript());
        writer.writeStringValue("worldRegion", this.getWorldRegion());
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
     * Sets the addressLine1 property value. The first line of the street address. The first line of the street address is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @param value Value to set for the addressLine1 property.
     */
    public void setAddressLine1(@jakarta.annotation.Nullable final String value) {
        this.addressLine1 = value;
    }
    /**
     * Sets the addressLine2 property value. The second line of the street address. This field is not always used, but it should be provided if applicable. It might be used for something like &apos;Suite Number&apos; or &apos;Apt Number&apos;.
     * @param value Value to set for the addressLine2 property.
     */
    public void setAddressLine2(@jakarta.annotation.Nullable final String value) {
        this.addressLine2 = value;
    }
    /**
     * Sets the addressType property value. This enumeration value indicates whether the address is a business, a personal address, PO Box, or other type of address. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AddressTypeEnum.html&quot;&gt;AddressTypeEnum&lt;/a&gt; type definition.
     * @param value Value to set for the addressType property.
     */
    public void setAddressType(@jakarta.annotation.Nullable final String value) {
        this.addressType = value;
    }
    /**
     * Sets the city property value. The city of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. This enumeration value indicates the country of the address. The three-letter country codes of the ISO 3166-1 Standard are used. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of two-digit country codes that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CountryCodeEnum.html&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the county property value. The county of the address. This field is not always used, but it should be provided if applicable.
     * @param value Value to set for the county property.
     */
    public void setCounty(@jakarta.annotation.Nullable final String value) {
        this.county = value;
    }
    /**
     * Sets the isTransliterated property value. This Boolean field is returned as &lt;code&gt;true&lt;/code&gt; if language transliteration was required.
     * @param value Value to set for the isTransliterated property.
     */
    public void setIsTransliterated(@jakarta.annotation.Nullable final Boolean value) {
        this.isTransliterated = value;
    }
    /**
     * Sets the nationalRegion property value. This string value indicates a specific region or metropolitan area within a country in which the address resides. Not all countries have defined national regions.
     * @param value Value to set for the nationalRegion property.
     */
    public void setNationalRegion(@jakarta.annotation.Nullable final String value) {
        this.nationalRegion = value;
    }
    /**
     * Sets the postalCode property value. The postal code of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the script property value. This enumeration value indicates the language that the address has been transliterated into. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &lt;code&gt;true&lt;/code&gt;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     * @param value Value to set for the script property.
     */
    public void setScript(@jakarta.annotation.Nullable final String value) {
        this.script = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province of the address. This field is always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
    /**
     * Sets the transliteratedFromScript property value. This enumeration value indicates the language that the address has been transliterated from. This field is only returned if transliteration was required (and the &lt;b&gt;isTransliterated&lt;/b&gt; field is &apos;true&apos;. Transliteration is required for languages that use special characters, such as Japanese, Chinese, or Arabic.&lt;br/&gt;&lt;br/&gt;The list of language enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageScriptEnum.html&quot;&gt;LanguageScriptEnum&lt;/a&gt; type definition.
     * @param value Value to set for the transliteratedFromScript property.
     */
    public void setTransliteratedFromScript(@jakarta.annotation.Nullable final String value) {
        this.transliteratedFromScript = value;
    }
    /**
     * Sets the worldRegion property value. This string value indicates the region of the world in which the address resides. This field is not always used by containers using the &lt;b&gt;Address&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The list of world region enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/WorldRegionEnum.html&quot;&gt;WorldRegionEnum&lt;/a&gt; type definition.
     * @param value Value to set for the worldRegion property.
     */
    public void setWorldRegion(@jakarta.annotation.Nullable final String value) {
        this.worldRegion = value;
    }
}
