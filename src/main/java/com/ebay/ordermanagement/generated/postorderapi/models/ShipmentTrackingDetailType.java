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
 * This type is used to show detailed shipment tracking information if an INR item is being shipped to the buyer, or if the buyer is returning an item to the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShipmentTrackingDetailType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the shipping carrier handling the shipment. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     */
    private String carrier;
    /**
     * The current status of the shipment, such as delivered or still in-transit. This field is returned if it is known and available.
     */
    private String currentStatus;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime estimateFromDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime estimateToDate;
    /**
     * A unique identifier used to track the shipment of the order line item. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     */
    private String trackingNumber;
    /**
     * This field provides the URL to the shipping carrier&apos;s shipment tracking page. This field is returned if available.
     */
    private String trackingURL;
    /**
     * Instantiates a new {@link ShipmentTrackingDetailType} and sets the default values.
     */
    public ShipmentTrackingDetailType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShipmentTrackingDetailType}
     */
    @jakarta.annotation.Nonnull
    public static ShipmentTrackingDetailType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShipmentTrackingDetailType();
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
     * Gets the carrier property value. The name of the shipping carrier handling the shipment. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrier() {
        return this.carrier;
    }
    /**
     * Gets the currentStatus property value. The current status of the shipment, such as delivered or still in-transit. This field is returned if it is known and available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrentStatus() {
        return this.currentStatus;
    }
    /**
     * Gets the estimateFromDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getEstimateFromDate() {
        return this.estimateFromDate;
    }
    /**
     * Gets the estimateToDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getEstimateToDate() {
        return this.estimateToDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("carrier", (n) -> { this.setCarrier(n.getStringValue()); });
        deserializerMap.put("currentStatus", (n) -> { this.setCurrentStatus(n.getStringValue()); });
        deserializerMap.put("estimateFromDate", (n) -> { this.setEstimateFromDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("estimateToDate", (n) -> { this.setEstimateToDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        deserializerMap.put("trackingURL", (n) -> { this.setTrackingURL(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trackingNumber property value. A unique identifier used to track the shipment of the order line item. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    /**
     * Gets the trackingURL property value. This field provides the URL to the shipping carrier&apos;s shipment tracking page. This field is returned if available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingURL() {
        return this.trackingURL;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("carrier", this.getCarrier());
        writer.writeStringValue("currentStatus", this.getCurrentStatus());
        writer.writeObjectValue("estimateFromDate", this.getEstimateFromDate());
        writer.writeObjectValue("estimateToDate", this.getEstimateToDate());
        writer.writeStringValue("trackingNumber", this.getTrackingNumber());
        writer.writeStringValue("trackingURL", this.getTrackingURL());
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
     * Sets the carrier property value. The name of the shipping carrier handling the shipment. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     * @param value Value to set for the carrier property.
     */
    public void setCarrier(@jakarta.annotation.Nullable final String value) {
        this.carrier = value;
    }
    /**
     * Sets the currentStatus property value. The current status of the shipment, such as delivered or still in-transit. This field is returned if it is known and available.
     * @param value Value to set for the currentStatus property.
     */
    public void setCurrentStatus(@jakarta.annotation.Nullable final String value) {
        this.currentStatus = value;
    }
    /**
     * Sets the estimateFromDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the estimateFromDate property.
     */
    public void setEstimateFromDate(@jakarta.annotation.Nullable final DateTime value) {
        this.estimateFromDate = value;
    }
    /**
     * Sets the estimateToDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the estimateToDate property.
     */
    public void setEstimateToDate(@jakarta.annotation.Nullable final DateTime value) {
        this.estimateToDate = value;
    }
    /**
     * Sets the trackingNumber property value. A unique identifier used to track the shipment of the order line item. This field is generally always returned with the &lt;b&gt;shipmentTrackingDetails&lt;/b&gt; container unless the tracking number has yet to be provided for the order line item.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
    /**
     * Sets the trackingURL property value. This field provides the URL to the shipping carrier&apos;s shipment tracking page. This field is returned if available.
     * @param value Value to set for the trackingURL property.
     */
    public void setTrackingURL(@jakarta.annotation.Nullable final String value) {
        this.trackingURL = value;
    }
}
