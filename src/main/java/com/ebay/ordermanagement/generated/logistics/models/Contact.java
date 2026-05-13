package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type contains contact information for an individual buyer or seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Contact implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The company name with which the contact is associated.
     */
    private String companyName;
    /**
     * This complex type specifies the details of a geographical address.
     */
    private ContactAddress contactAddress;
    /**
     * The contact&apos;s full name.
     */
    private String fullName;
    /**
     * This complex type contains a string field representing a telephone number.
     */
    private PhoneNumber primaryPhone;
    /**
     * Instantiates a new {@link Contact} and sets the default values.
     */
    public Contact() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nonnull
    public static Contact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contact();
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
     * Gets the companyName property value. The company name with which the contact is associated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the contactAddress property value. This complex type specifies the details of a geographical address.
     * @return a {@link ContactAddress}
     */
    @jakarta.annotation.Nullable
    public ContactAddress getContactAddress() {
        return this.contactAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("contactAddress", (n) -> { this.setContactAddress(n.getObjectValue(ContactAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("fullName", (n) -> { this.setFullName(n.getStringValue()); });
        deserializerMap.put("primaryPhone", (n) -> { this.setPrimaryPhone(n.getObjectValue(PhoneNumber::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fullName property value. The contact&apos;s full name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullName() {
        return this.fullName;
    }
    /**
     * Gets the primaryPhone property value. This complex type contains a string field representing a telephone number.
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
     * Sets the companyName property value. The company name with which the contact is associated.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the contactAddress property value. This complex type specifies the details of a geographical address.
     * @param value Value to set for the contactAddress property.
     */
    public void setContactAddress(@jakarta.annotation.Nullable final ContactAddress value) {
        this.contactAddress = value;
    }
    /**
     * Sets the fullName property value. The contact&apos;s full name.
     * @param value Value to set for the fullName property.
     */
    public void setFullName(@jakarta.annotation.Nullable final String value) {
        this.fullName = value;
    }
    /**
     * Sets the primaryPhone property value. This complex type contains a string field representing a telephone number.
     * @param value Value to set for the primaryPhone property.
     */
    public void setPrimaryPhone(@jakarta.annotation.Nullable final PhoneNumber value) {
        this.primaryPhone = value;
    }
}
