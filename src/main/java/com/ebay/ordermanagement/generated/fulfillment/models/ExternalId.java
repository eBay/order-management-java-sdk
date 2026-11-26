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
 * An external identifier associated with the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalId implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional key-value attributes associated with this external identifier.
     */
    private java.util.List<Attribute> attributes;
    /**
     * The type of the external identifier.
     */
    private String externalIdType;
    /**
     * The unique external key.
     */
    private String externalKey;
    /**
     * Instantiates a new {@link ExternalId} and sets the default values.
     */
    public ExternalId() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalId}
     */
    @jakarta.annotation.Nonnull
    public static ExternalId createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalId();
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
     * Gets the attributes property value. Additional key-value attributes associated with this external identifier.
     * @return a {@link java.util.List<Attribute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attribute> getAttributes() {
        return this.attributes;
    }
    /**
     * Gets the externalIdType property value. The type of the external identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalIdType() {
        return this.externalIdType;
    }
    /**
     * Gets the externalKey property value. The unique external key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalKey() {
        return this.externalKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("attributes", (n) -> { this.setAttributes(n.getCollectionOfObjectValues(Attribute::createFromDiscriminatorValue)); });
        deserializerMap.put("externalIdType", (n) -> { this.setExternalIdType(n.getStringValue()); });
        deserializerMap.put("externalKey", (n) -> { this.setExternalKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributes", this.getAttributes());
        writer.writeStringValue("externalIdType", this.getExternalIdType());
        writer.writeStringValue("externalKey", this.getExternalKey());
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
     * Sets the attributes property value. Additional key-value attributes associated with this external identifier.
     * @param value Value to set for the attributes property.
     */
    public void setAttributes(@jakarta.annotation.Nullable final java.util.List<Attribute> value) {
        this.attributes = value;
    }
    /**
     * Sets the externalIdType property value. The type of the external identifier.
     * @param value Value to set for the externalIdType property.
     */
    public void setExternalIdType(@jakarta.annotation.Nullable final String value) {
        this.externalIdType = value;
    }
    /**
     * Sets the externalKey property value. The unique external key.
     * @param value Value to set for the externalKey property.
     */
    public void setExternalKey(@jakarta.annotation.Nullable final String value) {
        this.externalKey = value;
    }
}
