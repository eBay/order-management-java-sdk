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
 * This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnAddress implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     */
    private Address address;
    /**
     * This boolean field indicates whether or not the seller&apos;s return address (shown in the &lt;b&gt;address&lt;/b&gt; container) can be modified. A value of &lt;code&gt;true&lt;/code&gt; indicates that the return address can be modified, and a value of &lt;code&gt;false&lt;/code&gt; indicates that the return address cannot be modified.
     */
    private Boolean editable;
    /**
     * The first name associated with the return address, or if applicable, a business or store name.
     */
    private String firstName;
    /**
     * The last name associated with the return address. This field will only be returned if applicable.
     */
    private String lastName;
    /**
     * The Return Merchandise Authorization (RMA) identifier authorizing this return. This field is only returned if an RMA number exists for the order line item.
     */
    private String rMA;
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
     * Gets the address property value. This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getAddress() {
        return this.address;
    }
    /**
     * Gets the editable property value. This boolean field indicates whether or not the seller&apos;s return address (shown in the &lt;b&gt;address&lt;/b&gt; container) can be modified. A value of &lt;code&gt;true&lt;/code&gt; indicates that the return address can be modified, and a value of &lt;code&gt;false&lt;/code&gt; indicates that the return address cannot be modified.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEditable() {
        return this.editable;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("editable", (n) -> { this.setEditable(n.getBooleanValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("RMA", (n) -> { this.setRMA(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The first name associated with the return address, or if applicable, a business or store name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. The last name associated with the return address. This field will only be returned if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the RMA property value. The Return Merchandise Authorization (RMA) identifier authorizing this return. This field is only returned if an RMA number exists for the order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRMA() {
        return this.rMA;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("RMA", this.getRMA());
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
     * Sets the address property value. This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final Address value) {
        this.address = value;
    }
    /**
     * Sets the editable property value. This boolean field indicates whether or not the seller&apos;s return address (shown in the &lt;b&gt;address&lt;/b&gt; container) can be modified. A value of &lt;code&gt;true&lt;/code&gt; indicates that the return address can be modified, and a value of &lt;code&gt;false&lt;/code&gt; indicates that the return address cannot be modified.
     * @param value Value to set for the editable property.
     */
    public void setEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.editable = value;
    }
    /**
     * Sets the firstName property value. The first name associated with the return address, or if applicable, a business or store name.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. The last name associated with the return address. This field will only be returned if applicable.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the RMA property value. The Return Merchandise Authorization (RMA) identifier authorizing this return. This field is only returned if an RMA number exists for the order line item.
     * @param value Value to set for the RMA property.
     */
    public void setRMA(@jakarta.annotation.Nullable final String value) {
        this.rMA = value;
    }
}
