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
 * This type is used by the payment dispute methods, and is relevant if the buyer will be returning the item to the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnAddress implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first line of the street address.
     */
    private String addressLine1;
    /**
     * The second line of the street address. This line is not always necessarily, but is often used for apartment number or suite number, or other relevant information that can not fit on the first line.
     */
    private String addressLine2;
    /**
     * The city of the return address.
     */
    private String city;
    /**
     * The country&apos;s two-letter, ISO 3166-1 country code. See the enumeration type for a country&apos;s value.
     */
    private CountryCodeEnum country;
    /**
     * The county of the return address. Counties are not applicable to all countries.
     */
    private String county;
    /**
     * The full name of return address owner.
     */
    private String fullName;
    /**
     * The postal code of the return address.
     */
    private String postalCode;
    /**
     * This container shows the seller&apos;s primary phone number associated with the return address.
     */
    private Phone primaryPhone;
    /**
     * The state or province of the return address.
     */
    private String stateOrProvince;
    /**
     * Instantiates a new {@link ReturnAddress} and sets the default values.
     */
    public ReturnAddress() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReturnAddress}
     */
    @jakarta.annotation.Nonnull
    public static ReturnAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReturnAddress();
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
     * Gets the addressLine1 property value. The first line of the street address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine1() {
        return this.addressLine1;
    }
    /**
     * Gets the addressLine2 property value. The second line of the street address. This line is not always necessarily, but is often used for apartment number or suite number, or other relevant information that can not fit on the first line.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine2() {
        return this.addressLine2;
    }
    /**
     * Gets the city property value. The city of the return address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. The country&apos;s two-letter, ISO 3166-1 country code. See the enumeration type for a country&apos;s value.
     * @return a {@link CountryCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CountryCodeEnum getCountry() {
        return this.country;
    }
    /**
     * Gets the county property value. The county of the return address. Counties are not applicable to all countries.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("addressLine1", (n) -> { this.setAddressLine1(n.getStringValue()); });
        deserializerMap.put("addressLine2", (n) -> { this.setAddressLine2(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getEnumValue(CountryCodeEnum::forValue)); });
        deserializerMap.put("county", (n) -> { this.setCounty(n.getStringValue()); });
        deserializerMap.put("fullName", (n) -> { this.setFullName(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("primaryPhone", (n) -> { this.setPrimaryPhone(n.getObjectValue(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullName property value. The full name of return address owner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullName() {
        return this.fullName;
    }
    /**
     * Gets the postalCode property value. The postal code of the return address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the primaryPhone property value. This container shows the seller&apos;s primary phone number associated with the return address.
     * @return a {@link Phone}
     */
    @jakarta.annotation.Nullable
    public Phone getPrimaryPhone() {
        return this.primaryPhone;
    }
    /**
     * Gets the stateOrProvince property value. The state or province of the return address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addressLine1", this.getAddressLine1());
        writer.writeStringValue("addressLine2", this.getAddressLine2());
        writer.writeStringValue("city", this.getCity());
        writer.writeEnumValue("country", this.getCountry());
        writer.writeStringValue("county", this.getCounty());
        writer.writeStringValue("fullName", this.getFullName());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeObjectValue("primaryPhone", this.getPrimaryPhone());
        writer.writeStringValue("stateOrProvince", this.getStateOrProvince());
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
     * Sets the addressLine1 property value. The first line of the street address.
     * @param value Value to set for the addressLine1 property.
     */
    public void setAddressLine1(@jakarta.annotation.Nullable final String value) {
        this.addressLine1 = value;
    }
    /**
     * Sets the addressLine2 property value. The second line of the street address. This line is not always necessarily, but is often used for apartment number or suite number, or other relevant information that can not fit on the first line.
     * @param value Value to set for the addressLine2 property.
     */
    public void setAddressLine2(@jakarta.annotation.Nullable final String value) {
        this.addressLine2 = value;
    }
    /**
     * Sets the city property value. The city of the return address.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. The country&apos;s two-letter, ISO 3166-1 country code. See the enumeration type for a country&apos;s value.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final CountryCodeEnum value) {
        this.country = value;
    }
    /**
     * Sets the county property value. The county of the return address. Counties are not applicable to all countries.
     * @param value Value to set for the county property.
     */
    public void setCounty(@jakarta.annotation.Nullable final String value) {
        this.county = value;
    }
    /**
     * Sets the fullName property value. The full name of return address owner.
     * @param value Value to set for the fullName property.
     */
    public void setFullName(@jakarta.annotation.Nullable final String value) {
        this.fullName = value;
    }
    /**
     * Sets the postalCode property value. The postal code of the return address.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the primaryPhone property value. This container shows the seller&apos;s primary phone number associated with the return address.
     * @param value Value to set for the primaryPhone property.
     */
    public void setPrimaryPhone(@jakarta.annotation.Nullable final Phone value) {
        this.primaryPhone = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province of the return address.
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
}
