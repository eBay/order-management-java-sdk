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
 * Base request type for the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/provide_shipment_info&lt;/b&gt; method, which is used to provide shipment information about an order line item that is on its way to the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShipmentInfoRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This boolean field should be included and set to &lt;code&gt;true&lt;/code&gt; if shipment tracking information for the order line item is already available in the eBay system. If this field is included in the request and set to &lt;code&gt;true&lt;/code&gt;, no other shipment tracking fields are necessary, although they can still be provided by the seller.
     */
    private Boolean proofOfShipmentUploaded;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text sellerComments;
    /**
     * This field can be included and set to &lt;code&gt;true&lt;/code&gt; if the shipping carrier used to ship the package uses tracking information. Most, but not all shipping carriers provide shipment tracking numbers.
     */
    private Boolean shippedWithTracking;
    /**
     * The seller provides the name of the shipping carrier in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;). A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     */
    private String shippingCarrierName;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime shippingDate;
    /**
     * The seller provides the shipping carrier&apos;s tracking number in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;).&lt;br/&gt;&lt;br/&gt;The accuracy of this tracking number cannot be verified by eBay, so the seller should make sure that the number is accurate.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link ShipmentInfoRequest} and sets the default values.
     */
    public ShipmentInfoRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShipmentInfoRequest}
     */
    @jakarta.annotation.Nonnull
    public static ShipmentInfoRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShipmentInfoRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("proofOfShipmentUploaded", (n) -> { this.setProofOfShipmentUploaded(n.getBooleanValue()); });
        deserializerMap.put("sellerComments", (n) -> { this.setSellerComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("shippedWithTracking", (n) -> { this.setShippedWithTracking(n.getBooleanValue()); });
        deserializerMap.put("shippingCarrierName", (n) -> { this.setShippingCarrierName(n.getStringValue()); });
        deserializerMap.put("shippingDate", (n) -> { this.setShippingDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proofOfShipmentUploaded property value. This boolean field should be included and set to &lt;code&gt;true&lt;/code&gt; if shipment tracking information for the order line item is already available in the eBay system. If this field is included in the request and set to &lt;code&gt;true&lt;/code&gt;, no other shipment tracking fields are necessary, although they can still be provided by the seller.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getProofOfShipmentUploaded() {
        return this.proofOfShipmentUploaded;
    }
    /**
     * Gets the sellerComments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @return a {@link Text}
     */
    @jakarta.annotation.Nullable
    public Text getSellerComments() {
        return this.sellerComments;
    }
    /**
     * Gets the shippedWithTracking property value. This field can be included and set to &lt;code&gt;true&lt;/code&gt; if the shipping carrier used to ship the package uses tracking information. Most, but not all shipping carriers provide shipment tracking numbers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippedWithTracking() {
        return this.shippedWithTracking;
    }
    /**
     * Gets the shippingCarrierName property value. The seller provides the name of the shipping carrier in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;). A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierName() {
        return this.shippingCarrierName;
    }
    /**
     * Gets the shippingDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getShippingDate() {
        return this.shippingDate;
    }
    /**
     * Gets the trackingNumber property value. The seller provides the shipping carrier&apos;s tracking number in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;).&lt;br/&gt;&lt;br/&gt;The accuracy of this tracking number cannot be verified by eBay, so the seller should make sure that the number is accurate.
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
        writer.writeBooleanValue("proofOfShipmentUploaded", this.getProofOfShipmentUploaded());
        writer.writeObjectValue("sellerComments", this.getSellerComments());
        writer.writeBooleanValue("shippedWithTracking", this.getShippedWithTracking());
        writer.writeStringValue("shippingCarrierName", this.getShippingCarrierName());
        writer.writeObjectValue("shippingDate", this.getShippingDate());
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
     * Sets the proofOfShipmentUploaded property value. This boolean field should be included and set to &lt;code&gt;true&lt;/code&gt; if shipment tracking information for the order line item is already available in the eBay system. If this field is included in the request and set to &lt;code&gt;true&lt;/code&gt;, no other shipment tracking fields are necessary, although they can still be provided by the seller.
     * @param value Value to set for the proofOfShipmentUploaded property.
     */
    public void setProofOfShipmentUploaded(@jakarta.annotation.Nullable final Boolean value) {
        this.proofOfShipmentUploaded = value;
    }
    /**
     * Sets the sellerComments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the sellerComments property.
     */
    public void setSellerComments(@jakarta.annotation.Nullable final Text value) {
        this.sellerComments = value;
    }
    /**
     * Sets the shippedWithTracking property value. This field can be included and set to &lt;code&gt;true&lt;/code&gt; if the shipping carrier used to ship the package uses tracking information. Most, but not all shipping carriers provide shipment tracking numbers.
     * @param value Value to set for the shippedWithTracking property.
     */
    public void setShippedWithTracking(@jakarta.annotation.Nullable final Boolean value) {
        this.shippedWithTracking = value;
    }
    /**
     * Sets the shippingCarrierName property value. The seller provides the name of the shipping carrier in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;). A list of shipping carrier enumeration values can be found in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @param value Value to set for the shippingCarrierName property.
     */
    public void setShippingCarrierName(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierName = value;
    }
    /**
     * Sets the shippingDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the shippingDate property.
     */
    public void setShippingDate(@jakarta.annotation.Nullable final DateTime value) {
        this.shippingDate = value;
    }
    /**
     * Sets the trackingNumber property value. The seller provides the shipping carrier&apos;s tracking number in this field. This field is conditionally required unless shipment tracking information has already been uploaded to the eBay system (&lt;b&gt;proofOfShipmentUploaded&lt;/b&gt;=&lt;code&gt;true&lt;/code&gt;).&lt;br/&gt;&lt;br/&gt;The accuracy of this tracking number cannot be verified by eBay, so the seller should make sure that the number is accurate.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
