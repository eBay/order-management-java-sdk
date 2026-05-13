package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used for seller provided shipment tracking information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrackingInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string value represents the shipment tracking number of the package.
     */
    private String shipmentTrackingNumber;
    /**
     * This string value represents the shipping carrier used to ship the package.
     */
    private String shippingCarrierCode;
    /**
     * Instantiates a new {@link TrackingInfo} and sets the default values.
     */
    public TrackingInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrackingInfo}
     */
    @jakarta.annotation.Nonnull
    public static TrackingInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrackingInfo();
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
        deserializerMap.put("shipmentTrackingNumber", (n) -> { this.setShipmentTrackingNumber(n.getStringValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shipmentTrackingNumber property value. This string value represents the shipment tracking number of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipmentTrackingNumber() {
        return this.shipmentTrackingNumber;
    }
    /**
     * Gets the shippingCarrierCode property value. This string value represents the shipping carrier used to ship the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("shipmentTrackingNumber", this.getShipmentTrackingNumber());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
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
     * Sets the shipmentTrackingNumber property value. This string value represents the shipment tracking number of the package.
     * @param value Value to set for the shipmentTrackingNumber property.
     */
    public void setShipmentTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.shipmentTrackingNumber = value;
    }
    /**
     * Sets the shippingCarrierCode property value. This string value represents the shipping carrier used to ship the package.
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
}
