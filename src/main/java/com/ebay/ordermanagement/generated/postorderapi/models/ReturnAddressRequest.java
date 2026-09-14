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
 * This type is used by the request payload of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; method, and the payload is used to provide the seller&apos;s return address and Return Merchandise Authorization (RMA) number (if applicable) to the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnAddressRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first name associated with the seller&apos;s return address, or if applicable, a business or store name.&lt;br/&gt;&lt;br/&gt;If a first name or business/store name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     */
    private String firstName;
    /**
     * The last name associated with the seller&apos;s return address. &lt;br/&gt;&lt;br/&gt;If a last name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     */
    private String lastName;
    /**
     * This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     */
    private Address returnAddress;
    /**
     * The Return Merchandise Authorization (RMA) number associated with the item to be returned. An RMA number is a unique identifier that is provided by a manufacturer and authorizes the return of an item. This field is conditionally required if there is an RMA number associated with the item, and if the buyer is requesting an RMA number.
     */
    private String rMA;
    /**
     * Instantiates a new {@link ReturnAddressRequest} and sets the default values.
     */
    public ReturnAddressRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReturnAddressRequest}
     */
    @jakarta.annotation.Nonnull
    public static ReturnAddressRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReturnAddressRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("returnAddress", (n) -> { this.setReturnAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("RMA", (n) -> { this.setRMA(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The first name associated with the seller&apos;s return address, or if applicable, a business or store name.&lt;br/&gt;&lt;br/&gt;If a first name or business/store name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. The last name associated with the seller&apos;s return address. &lt;br/&gt;&lt;br/&gt;If a last name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the returnAddress property value. This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getReturnAddress() {
        return this.returnAddress;
    }
    /**
     * Gets the RMA property value. The Return Merchandise Authorization (RMA) number associated with the item to be returned. An RMA number is a unique identifier that is provided by a manufacturer and authorizes the return of an item. This field is conditionally required if there is an RMA number associated with the item, and if the buyer is requesting an RMA number.
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
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeObjectValue("returnAddress", this.getReturnAddress());
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
     * Sets the firstName property value. The first name associated with the seller&apos;s return address, or if applicable, a business or store name.&lt;br/&gt;&lt;br/&gt;If a first name or business/store name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. The last name associated with the seller&apos;s return address. &lt;br/&gt;&lt;br/&gt;If a last name is defined for the return address, this field should be included in the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; request.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the returnAddress property value. This type is used to define an address. It is used by all containers in the Post-Order API that provide an address.
     * @param value Value to set for the returnAddress property.
     */
    public void setReturnAddress(@jakarta.annotation.Nullable final Address value) {
        this.returnAddress = value;
    }
    /**
     * Sets the RMA property value. The Return Merchandise Authorization (RMA) number associated with the item to be returned. An RMA number is a unique identifier that is provided by a manufacturer and authorizes the return of an item. This field is conditionally required if there is an RMA number associated with the item, and if the buyer is requesting an RMA number.
     * @param value Value to set for the RMA property.
     */
    public void setRMA(@jakarta.annotation.Nullable final String value) {
        this.rMA = value;
    }
}
