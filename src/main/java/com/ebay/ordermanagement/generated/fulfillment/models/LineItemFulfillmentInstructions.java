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
 * This type contains the specifications for processing the fulfillment of a line item, including the handling window and the delivery window. These fields provide guidance for &lt;i&gt;eBay Guaranteed Delivery&lt;/i&gt; as well as for non-guaranteed delivery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LineItemFulfillmentInstructions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Although this field is still returned, it can be ignored since eBay Guaranteed Delivery is no longer a supported feature on any marketplace. This field may get removed from the schema in the future.
     */
    private Boolean guaranteedDelivery;
    /**
     * The estimated latest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options. The seller must pay extra attention to this date, as a failure to deliver by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     */
    private String maxEstimatedDeliveryDate;
    /**
     * The estimated earliest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     */
    private String minEstimatedDeliveryDate;
    /**
     * The latest date and time by which the seller should ship line item in order to meet the expected delivery window. This timestamp will be set by eBay based on time of purchase and the seller&apos;s stated handling time. The seller must pay extra attention to this date, as a failure to physically ship the line item by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     */
    private String shipByDate;
    /**
     * Instantiates a new {@link LineItemFulfillmentInstructions} and sets the default values.
     */
    public LineItemFulfillmentInstructions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LineItemFulfillmentInstructions}
     */
    @jakarta.annotation.Nonnull
    public static LineItemFulfillmentInstructions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LineItemFulfillmentInstructions();
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
        deserializerMap.put("guaranteedDelivery", (n) -> { this.setGuaranteedDelivery(n.getBooleanValue()); });
        deserializerMap.put("maxEstimatedDeliveryDate", (n) -> { this.setMaxEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("minEstimatedDeliveryDate", (n) -> { this.setMinEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("shipByDate", (n) -> { this.setShipByDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guaranteedDelivery property value. Although this field is still returned, it can be ignored since eBay Guaranteed Delivery is no longer a supported feature on any marketplace. This field may get removed from the schema in the future.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGuaranteedDelivery() {
        return this.guaranteedDelivery;
    }
    /**
     * Gets the maxEstimatedDeliveryDate property value. The estimated latest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options. The seller must pay extra attention to this date, as a failure to deliver by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxEstimatedDeliveryDate() {
        return this.maxEstimatedDeliveryDate;
    }
    /**
     * Gets the minEstimatedDeliveryDate property value. The estimated earliest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinEstimatedDeliveryDate() {
        return this.minEstimatedDeliveryDate;
    }
    /**
     * Gets the shipByDate property value. The latest date and time by which the seller should ship line item in order to meet the expected delivery window. This timestamp will be set by eBay based on time of purchase and the seller&apos;s stated handling time. The seller must pay extra attention to this date, as a failure to physically ship the line item by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipByDate() {
        return this.shipByDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("guaranteedDelivery", this.getGuaranteedDelivery());
        writer.writeStringValue("maxEstimatedDeliveryDate", this.getMaxEstimatedDeliveryDate());
        writer.writeStringValue("minEstimatedDeliveryDate", this.getMinEstimatedDeliveryDate());
        writer.writeStringValue("shipByDate", this.getShipByDate());
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
     * Sets the guaranteedDelivery property value. Although this field is still returned, it can be ignored since eBay Guaranteed Delivery is no longer a supported feature on any marketplace. This field may get removed from the schema in the future.
     * @param value Value to set for the guaranteedDelivery property.
     */
    public void setGuaranteedDelivery(@jakarta.annotation.Nullable final Boolean value) {
        this.guaranteedDelivery = value;
    }
    /**
     * Sets the maxEstimatedDeliveryDate property value. The estimated latest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options. The seller must pay extra attention to this date, as a failure to deliver by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @param value Value to set for the maxEstimatedDeliveryDate property.
     */
    public void setMaxEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.maxEstimatedDeliveryDate = value;
    }
    /**
     * Sets the minEstimatedDeliveryDate property value. The estimated earliest date and time that the buyer can expect to receive the line item based on the seller&apos;s stated handling time and the transit times of the available shipping service options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @param value Value to set for the minEstimatedDeliveryDate property.
     */
    public void setMinEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.minEstimatedDeliveryDate = value;
    }
    /**
     * Sets the shipByDate property value. The latest date and time by which the seller should ship line item in order to meet the expected delivery window. This timestamp will be set by eBay based on time of purchase and the seller&apos;s stated handling time. The seller must pay extra attention to this date, as a failure to physically ship the line item by this date/time can result in a &apos;Late shipment&apos; seller defect, and can affect seller level and Top-Rated Seller status. In addition to the seller defect, buyers will be eligible for a shipping cost refund, and will also be eligible to return the item for a full refund (with no return shipping charge) if they choose. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;
     * @param value Value to set for the shipByDate property.
     */
    public void setShipByDate(@jakarta.annotation.Nullable final String value) {
        this.shipByDate = value;
    }
}
