package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains the details of a geographical address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Address implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first line of the street address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine1&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String addressLine1;
    /**
     * The second line of the street address. This field can be used for additional address information, such as a suite or apartment number. This field will be returned if defined for the shipping address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine2&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String addressLine2;
    /**
     * The city of the shipping destination.
     */
    private String city;
    /**
     * The country of the shipping destination, represented as a two-letter ISO 3166-1 alpha-2 country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String countryCode;
    /**
     * The county of the shipping destination. Counties typically, but not always, contain multiple cities or towns. This field is returned if known/available.
     */
    private String county;
    /**
     * The postal code of the shipping destination. Usually referred to as Zip codes in the US. Most countries have postal codes, but not all. The postal code will be returned if applicable.
     */
    private String postalCode;
    /**
     * The state or province of the shipping destination. Most countries have states or provinces, but not all. The state or province will be returned if applicable.
     */
    private String stateOrProvince;
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
     * Gets the addressLine1 property value. The first line of the street address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine1&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine1() {
        return this.addressLine1;
    }
    /**
     * Gets the addressLine2 property value. The second line of the street address. This field can be used for additional address information, such as a suite or apartment number. This field will be returned if defined for the shipping address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine2&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressLine2() {
        return this.addressLine2;
    }
    /**
     * Gets the city property value. The city of the shipping destination.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the countryCode property value. The country of the shipping destination, represented as a two-letter ISO 3166-1 alpha-2 country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the county property value. The county of the shipping destination. Counties typically, but not always, contain multiple cities or towns. This field is returned if known/available.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("addressLine1", (n) -> { this.setAddressLine1(n.getStringValue()); });
        deserializerMap.put("addressLine2", (n) -> { this.setAddressLine2(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("county", (n) -> { this.setCounty(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the postalCode property value. The postal code of the shipping destination. Usually referred to as Zip codes in the US. Most countries have postal codes, but not all. The postal code will be returned if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the stateOrProvince property value. The state or province of the shipping destination. Most countries have states or provinces, but not all. The state or province will be returned if applicable.
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
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("county", this.getCounty());
        writer.writeStringValue("postalCode", this.getPostalCode());
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
     * Sets the addressLine1 property value. The first line of the street address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine1&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the addressLine1 property.
     */
    public void setAddressLine1(@jakarta.annotation.Nullable final String value) {
        this.addressLine1 = value;
    }
    /**
     * Sets the addressLine2 property value. The second line of the street address. This field can be used for additional address information, such as a suite or apartment number. This field will be returned if defined for the shipping address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;addressLine2&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the addressLine2 property.
     */
    public void setAddressLine2(@jakarta.annotation.Nullable final String value) {
        this.addressLine2 = value;
    }
    /**
     * Sets the city property value. The city of the shipping destination.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the countryCode property value. The country of the shipping destination, represented as a two-letter ISO 3166-1 alpha-2 country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States, and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the county property value. The county of the shipping destination. Counties typically, but not always, contain multiple cities or towns. This field is returned if known/available.
     * @param value Value to set for the county property.
     */
    public void setCounty(@jakarta.annotation.Nullable final String value) {
        this.county = value;
    }
    /**
     * Sets the postalCode property value. The postal code of the shipping destination. Usually referred to as Zip codes in the US. Most countries have postal codes, but not all. The postal code will be returned if applicable.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province of the shipping destination. Most countries have states or provinces, but not all. The state or province will be returned if applicable.
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
}
