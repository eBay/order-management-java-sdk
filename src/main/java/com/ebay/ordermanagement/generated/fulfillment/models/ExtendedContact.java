package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains shipping and contact information for a buyer or an eBay shipping partner.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendedContact implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The company name associated with the buyer or eBay shipping partner. This field is only returned if defined/applicable to the buyer or eBay shipping partner.
     */
    private String companyName;
    /**
     * This type contains the details of a geographical address.
     */
    private Address contactAddress;
    /**
     * This field contains the email address of the buyer. This address will be returned for up to 14 days from order creation. If an order is more than 14 days old, no address is returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; If returned, this field contains the email address of the buyer, even for Global Shipping Program shipments.&lt;br&gt;&lt;br&gt;The &lt;b&gt;email&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String email;
    /**
     * The full name of the buyer or eBay shipping partner.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;fullName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String fullName;
    /**
     * This type contains a string field representing a telephone number.
     */
    private PhoneNumber primaryPhone;
    /**
     * Instantiates a new {@link ExtendedContact} and sets the default values.
     */
    public ExtendedContact() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedContact}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedContact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedContact();
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
     * Gets the companyName property value. The company name associated with the buyer or eBay shipping partner. This field is only returned if defined/applicable to the buyer or eBay shipping partner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the contactAddress property value. This type contains the details of a geographical address.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getContactAddress() {
        return this.contactAddress;
    }
    /**
     * Gets the email property value. This field contains the email address of the buyer. This address will be returned for up to 14 days from order creation. If an order is more than 14 days old, no address is returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; If returned, this field contains the email address of the buyer, even for Global Shipping Program shipments.&lt;br&gt;&lt;br&gt;The &lt;b&gt;email&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("contactAddress", (n) -> { this.setContactAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("fullName", (n) -> { this.setFullName(n.getStringValue()); });
        deserializerMap.put("primaryPhone", (n) -> { this.setPrimaryPhone(n.getObjectValue(PhoneNumber::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fullName property value. The full name of the buyer or eBay shipping partner.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;fullName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullName() {
        return this.fullName;
    }
    /**
     * Gets the primaryPhone property value. This type contains a string field representing a telephone number.
     * @return a {@link PhoneNumber}
     */
    @jakarta.annotation.Nullable
    public PhoneNumber getPrimaryPhone() {
        return this.primaryPhone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeObjectValue("contactAddress", this.getContactAddress());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("fullName", this.getFullName());
        writer.writeObjectValue("primaryPhone", this.getPrimaryPhone());
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
     * Sets the companyName property value. The company name associated with the buyer or eBay shipping partner. This field is only returned if defined/applicable to the buyer or eBay shipping partner.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the contactAddress property value. This type contains the details of a geographical address.
     * @param value Value to set for the contactAddress property.
     */
    public void setContactAddress(@jakarta.annotation.Nullable final Address value) {
        this.contactAddress = value;
    }
    /**
     * Sets the email property value. This field contains the email address of the buyer. This address will be returned for up to 14 days from order creation. If an order is more than 14 days old, no address is returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; If returned, this field contains the email address of the buyer, even for Global Shipping Program shipments.&lt;br&gt;&lt;br&gt;The &lt;b&gt;email&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the fullName property value. The full name of the buyer or eBay shipping partner.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;fullName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the fullName property.
     */
    public void setFullName(@jakarta.annotation.Nullable final String value) {
        this.fullName = value;
    }
    /**
     * Sets the primaryPhone property value. This type contains a string field representing a telephone number.
     * @param value Value to set for the primaryPhone property.
     */
    public void setPrimaryPhone(@jakarta.annotation.Nullable final PhoneNumber value) {
        this.primaryPhone = value;
    }
}
