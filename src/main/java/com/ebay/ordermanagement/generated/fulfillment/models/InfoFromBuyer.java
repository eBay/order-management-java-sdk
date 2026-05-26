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
 * This container is returned if the buyer is returning one or more line items in an order that is associated with the payment dispute, and that buyer has provided return shipping tracking information and/or a note about the return.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InfoFromBuyer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * When the value of this field is &lt;code&gt;true&lt;/code&gt; it indicates that the buyer&apos;s note regarding the payment dispute (i.e., the &lt;b&gt;buyerProvided.note&lt;/b&gt; field,) is on hold. When this is the case, the &lt;b&gt;buyerProvided.note&lt;/b&gt; field will not be returned.&lt;br&gt;&lt;br&gt;When the value of this field is &lt;code&gt;false&lt;/code&gt;, it is not returned.
     */
    private Boolean contentOnHold;
    /**
     * This field shows any note that was left by the buyer in regard to the dispute.
     */
    private String note;
    /**
     * This array shows shipment tracking information for one or more shipping packages being returned to the buyer after a payment dispute.
     */
    private java.util.List<TrackingInfo> returnShipmentTracking;
    /**
     * Instantiates a new {@link InfoFromBuyer} and sets the default values.
     */
    public InfoFromBuyer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InfoFromBuyer}
     */
    @jakarta.annotation.Nonnull
    public static InfoFromBuyer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InfoFromBuyer();
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
     * Gets the contentOnHold property value. When the value of this field is &lt;code&gt;true&lt;/code&gt; it indicates that the buyer&apos;s note regarding the payment dispute (i.e., the &lt;b&gt;buyerProvided.note&lt;/b&gt; field,) is on hold. When this is the case, the &lt;b&gt;buyerProvided.note&lt;/b&gt; field will not be returned.&lt;br&gt;&lt;br&gt;When the value of this field is &lt;code&gt;false&lt;/code&gt;, it is not returned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getContentOnHold() {
        return this.contentOnHold;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("contentOnHold", (n) -> { this.setContentOnHold(n.getBooleanValue()); });
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("returnShipmentTracking", (n) -> { this.setReturnShipmentTracking(n.getCollectionOfObjectValues(TrackingInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the note property value. This field shows any note that was left by the buyer in regard to the dispute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.note;
    }
    /**
     * Gets the returnShipmentTracking property value. This array shows shipment tracking information for one or more shipping packages being returned to the buyer after a payment dispute.
     * @return a {@link java.util.List<TrackingInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrackingInfo> getReturnShipmentTracking() {
        return this.returnShipmentTracking;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("contentOnHold", this.getContentOnHold());
        writer.writeStringValue("note", this.getNote());
        writer.writeCollectionOfObjectValues("returnShipmentTracking", this.getReturnShipmentTracking());
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
     * Sets the contentOnHold property value. When the value of this field is &lt;code&gt;true&lt;/code&gt; it indicates that the buyer&apos;s note regarding the payment dispute (i.e., the &lt;b&gt;buyerProvided.note&lt;/b&gt; field,) is on hold. When this is the case, the &lt;b&gt;buyerProvided.note&lt;/b&gt; field will not be returned.&lt;br&gt;&lt;br&gt;When the value of this field is &lt;code&gt;false&lt;/code&gt;, it is not returned.
     * @param value Value to set for the contentOnHold property.
     */
    public void setContentOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.contentOnHold = value;
    }
    /**
     * Sets the note property value. This field shows any note that was left by the buyer in regard to the dispute.
     * @param value Value to set for the note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the returnShipmentTracking property value. This array shows shipment tracking information for one or more shipping packages being returned to the buyer after a payment dispute.
     * @param value Value to set for the returnShipmentTracking property.
     */
    public void setReturnShipmentTracking(@jakarta.annotation.Nullable final java.util.List<TrackingInfo> value) {
        this.returnShipmentTracking = value;
    }
}
