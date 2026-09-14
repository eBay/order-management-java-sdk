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
 * This type is used to provide the history of events associated with an INR inquiry or a case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClaimHistoryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains one or more events or actions associated with an INR inquiry or a case.
     */
    private java.util.List<ClaimHistoryEventModel> history;
    /**
     * This type is used to show detailed shipment tracking information if an INR item is being shipped to the buyer, or if the buyer is returning an item to the seller.
     */
    private ShipmentTrackingDetailType shipmentTrackingDetails;
    /**
     * Instantiates a new {@link ClaimHistoryResponse} and sets the default values.
     */
    public ClaimHistoryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClaimHistoryResponse}
     */
    @jakarta.annotation.Nonnull
    public static ClaimHistoryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClaimHistoryResponse();
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
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(ClaimHistoryEventModel::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentTrackingDetails", (n) -> { this.setShipmentTrackingDetails(n.getObjectValue(ShipmentTrackingDetailType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. This array contains one or more events or actions associated with an INR inquiry or a case.
     * @return a {@link java.util.List<ClaimHistoryEventModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimHistoryEventModel> getHistory() {
        return this.history;
    }
    /**
     * Gets the shipmentTrackingDetails property value. This type is used to show detailed shipment tracking information if an INR item is being shipped to the buyer, or if the buyer is returning an item to the seller.
     * @return a {@link ShipmentTrackingDetailType}
     */
    @jakarta.annotation.Nullable
    public ShipmentTrackingDetailType getShipmentTrackingDetails() {
        return this.shipmentTrackingDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeObjectValue("shipmentTrackingDetails", this.getShipmentTrackingDetails());
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
     * Sets the history property value. This array contains one or more events or actions associated with an INR inquiry or a case.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<ClaimHistoryEventModel> value) {
        this.history = value;
    }
    /**
     * Sets the shipmentTrackingDetails property value. This type is used to show detailed shipment tracking information if an INR item is being shipped to the buyer, or if the buyer is returning an item to the seller.
     * @param value Value to set for the shipmentTrackingDetails property.
     */
    public void setShipmentTrackingDetails(@jakarta.annotation.Nullable final ShipmentTrackingDetailType value) {
        this.shipmentTrackingDetails = value;
    }
}
