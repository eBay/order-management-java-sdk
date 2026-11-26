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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains the details for creating an additional shipping fulfillment for an order that is being shipped in multiple packages.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingTrackingDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains the line items and quantities that are included in the package associated with the additional shipping fulfillment.
     */
    private java.util.List<LineItemReference> lineItems;
    /**
     * This is the actual date and time that the package associated with the additional shipping fulfillment was shipped. If this field is omitted, it will default to the current date and time.
     */
    private OffsetDateTime shippedDate;
    /**
     * This field is used to specify the shipping carrier used to ship the package associated with the additional shipping fulfillment.
     */
    private String shippingCarrierCode;
    /**
     * This field is used to specify the shipment tracking number for the package associated with the additional shipping fulfillment.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link ShippingTrackingDetails} and sets the default values.
     */
    public ShippingTrackingDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingTrackingDetails}
     */
    @jakarta.annotation.Nonnull
    public static ShippingTrackingDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingTrackingDetails();
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
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(LineItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("shippedDate", (n) -> { this.setShippedDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineItems property value. This array contains the line items and quantities that are included in the package associated with the additional shipping fulfillment.
     * @return a {@link java.util.List<LineItemReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LineItemReference> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the shippedDate property value. This is the actual date and time that the package associated with the additional shipping fulfillment was shipped. If this field is omitted, it will default to the current date and time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getShippedDate() {
        return this.shippedDate;
    }
    /**
     * Gets the shippingCarrierCode property value. This field is used to specify the shipping carrier used to ship the package associated with the additional shipping fulfillment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the trackingNumber property value. This field is used to specify the shipment tracking number for the package associated with the additional shipping fulfillment.
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
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeOffsetDateTimeValue("shippedDate", this.getShippedDate());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
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
     * Sets the lineItems property value. This array contains the line items and quantities that are included in the package associated with the additional shipping fulfillment.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<LineItemReference> value) {
        this.lineItems = value;
    }
    /**
     * Sets the shippedDate property value. This is the actual date and time that the package associated with the additional shipping fulfillment was shipped. If this field is omitted, it will default to the current date and time.
     * @param value Value to set for the shippedDate property.
     */
    public void setShippedDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.shippedDate = value;
    }
    /**
     * Sets the shippingCarrierCode property value. This field is used to specify the shipping carrier used to ship the package associated with the additional shipping fulfillment.
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the trackingNumber property value. This field is used to specify the shipment tracking number for the package associated with the additional shipping fulfillment.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
