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
 * The base request type of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_shipment_info&lt;/b&gt; method, which is used to provide return shipment tracking information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvideShipmentInfoRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The shipping carrier enumeration value is passed into this field, and represents the shipping carrier being used to return the item. &lt;br/&gt;&lt;br/&gt;A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     */
    private String shippingCarrierName;
    /**
     * The shipment tracking number is passed into this field. This value should be passed in without hyphens or spaces. The seller is responsible for the accuracy of this value, as eBay can only validate that the format is consistent with the format that is used by the specified shipping carrier.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link ProvideShipmentInfoRequest} and sets the default values.
     */
    public ProvideShipmentInfoRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvideShipmentInfoRequest}
     */
    @jakarta.annotation.Nonnull
    public static ProvideShipmentInfoRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvideShipmentInfoRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("shippingCarrierName", (n) -> { this.setShippingCarrierName(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shippingCarrierName property value. The shipping carrier enumeration value is passed into this field, and represents the shipping carrier being used to return the item. &lt;br/&gt;&lt;br/&gt;A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierName() {
        return this.shippingCarrierName;
    }
    /**
     * Gets the trackingNumber property value. The shipment tracking number is passed into this field. This value should be passed in without hyphens or spaces. The seller is responsible for the accuracy of this value, as eBay can only validate that the format is consistent with the format that is used by the specified shipping carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("shippingCarrierName", this.getShippingCarrierName());
        writer.writeStringValue("trackingNumber", this.getTrackingNumber());
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
     * Sets the shippingCarrierName property value. The shipping carrier enumeration value is passed into this field, and represents the shipping carrier being used to return the item. &lt;br/&gt;&lt;br/&gt;A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @param value Value to set for the shippingCarrierName property.
     */
    public void setShippingCarrierName(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierName = value;
    }
    /**
     * Sets the trackingNumber property value. The shipment tracking number is passed into this field. This value should be passed in without hyphens or spaces. The seller is responsible for the accuracy of this value, as eBay can only validate that the format is consistent with the format that is used by the specified shipping carrier.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
