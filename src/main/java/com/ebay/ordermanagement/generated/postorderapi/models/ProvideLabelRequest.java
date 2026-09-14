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
 * The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvideLabelRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * One of the values defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition must be used in this field to indicate the shipping carrier that will be used to ship the return item. This field is conditionally required if the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method is being used to initiate an eBay shipping label. Otherwise, the &lt;b&gt;carrierName&lt;/b&gt; field can be used to indicate which shipping carrier will be used. &lt;br/&gt;&lt;br/&gt;Note that the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type defines enumeration values for some popular shipping carriers for the US, UK, Germany, Canada, and Australia, but it is not a complete global list. 
     */
    private String carrierEnum;
    /**
     * This field is used to show the name of the shipping carrier.
     */
    private String carrierName;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * The unique ID of a file attached to the return request. This field may be used if the seller has associated a shipping label related file to the return request.
     */
    private String fileId;
    /**
     * This field should be provided and set to &lt;code&gt;true&lt;/code&gt; if the seller has already provided the buyer with a return shipping label. This field is generally provided if the &lt;b&gt;labelAction&lt;/b&gt; value is set to &lt;code&gt;MARK_AS_SENT&lt;/code&gt;.
     */
    private Boolean forwardShippingLabelProvided;
    /**
     * This enumerated type lists the actions that may be specified in the &lt;b&gt;labelAction&lt;/b&gt; field in the request of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     */
    private LabelActionEnum labelAction;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime labelSentDate;
    /**
     * This enumerated type lists the possible values that a seller  can provide in the &lt;b&gt;noLabelReason&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; to indicate the reason why a shipping label is not being supplied to the buyer.
     */
    private NoSellerUploadLabelReasonEnum noLabelReason;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount returnLabelCost;
    /**
     * The tracking number on the shipping label. If providing the tracking number, the shipping carrier must also be provided through the &lt;b&gt;carrierEnum&lt;/b&gt; field.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link ProvideLabelRequest} and sets the default values.
     */
    public ProvideLabelRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvideLabelRequest}
     */
    @jakarta.annotation.Nonnull
    public static ProvideLabelRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvideLabelRequest();
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
     * Gets the carrierEnum property value. One of the values defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition must be used in this field to indicate the shipping carrier that will be used to ship the return item. This field is conditionally required if the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method is being used to initiate an eBay shipping label. Otherwise, the &lt;b&gt;carrierName&lt;/b&gt; field can be used to indicate which shipping carrier will be used. &lt;br/&gt;&lt;br/&gt;Note that the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type defines enumeration values for some popular shipping carriers for the US, UK, Germany, Canada, and Australia, but it is not a complete global list. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrierEnum() {
        return this.carrierEnum;
    }
    /**
     * Gets the carrierName property value. This field is used to show the name of the shipping carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrierName() {
        return this.carrierName;
    }
    /**
     * Gets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @return a {@link Text}
     */
    @jakarta.annotation.Nullable
    public Text getComments() {
        return this.comments;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("carrierEnum", (n) -> { this.setCarrierEnum(n.getStringValue()); });
        deserializerMap.put("carrierName", (n) -> { this.setCarrierName(n.getStringValue()); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
        deserializerMap.put("forwardShippingLabelProvided", (n) -> { this.setForwardShippingLabelProvided(n.getBooleanValue()); });
        deserializerMap.put("labelAction", (n) -> { this.setLabelAction(n.getEnumValue(LabelActionEnum::forValue)); });
        deserializerMap.put("labelSentDate", (n) -> { this.setLabelSentDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("noLabelReason", (n) -> { this.setNoLabelReason(n.getEnumValue(NoSellerUploadLabelReasonEnum::forValue)); });
        deserializerMap.put("returnLabelCost", (n) -> { this.setReturnLabelCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileId property value. The unique ID of a file attached to the return request. This field may be used if the seller has associated a shipping label related file to the return request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.fileId;
    }
    /**
     * Gets the forwardShippingLabelProvided property value. This field should be provided and set to &lt;code&gt;true&lt;/code&gt; if the seller has already provided the buyer with a return shipping label. This field is generally provided if the &lt;b&gt;labelAction&lt;/b&gt; value is set to &lt;code&gt;MARK_AS_SENT&lt;/code&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForwardShippingLabelProvided() {
        return this.forwardShippingLabelProvided;
    }
    /**
     * Gets the labelAction property value. This enumerated type lists the actions that may be specified in the &lt;b&gt;labelAction&lt;/b&gt; field in the request of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @return a {@link LabelActionEnum}
     */
    @jakarta.annotation.Nullable
    public LabelActionEnum getLabelAction() {
        return this.labelAction;
    }
    /**
     * Gets the labelSentDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getLabelSentDate() {
        return this.labelSentDate;
    }
    /**
     * Gets the noLabelReason property value. This enumerated type lists the possible values that a seller  can provide in the &lt;b&gt;noLabelReason&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; to indicate the reason why a shipping label is not being supplied to the buyer.
     * @return a {@link NoSellerUploadLabelReasonEnum}
     */
    @jakarta.annotation.Nullable
    public NoSellerUploadLabelReasonEnum getNoLabelReason() {
        return this.noLabelReason;
    }
    /**
     * Gets the returnLabelCost property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getReturnLabelCost() {
        return this.returnLabelCost;
    }
    /**
     * Gets the trackingNumber property value. The tracking number on the shipping label. If providing the tracking number, the shipping carrier must also be provided through the &lt;b&gt;carrierEnum&lt;/b&gt; field.
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
        writer.writeStringValue("carrierEnum", this.getCarrierEnum());
        writer.writeStringValue("carrierName", this.getCarrierName());
        writer.writeObjectValue("comments", this.getComments());
        writer.writeStringValue("fileId", this.getFileId());
        writer.writeBooleanValue("forwardShippingLabelProvided", this.getForwardShippingLabelProvided());
        writer.writeEnumValue("labelAction", this.getLabelAction());
        writer.writeObjectValue("labelSentDate", this.getLabelSentDate());
        writer.writeEnumValue("noLabelReason", this.getNoLabelReason());
        writer.writeObjectValue("returnLabelCost", this.getReturnLabelCost());
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
     * Sets the carrierEnum property value. One of the values defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition must be used in this field to indicate the shipping carrier that will be used to ship the return item. This field is conditionally required if the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method is being used to initiate an eBay shipping label. Otherwise, the &lt;b&gt;carrierName&lt;/b&gt; field can be used to indicate which shipping carrier will be used. &lt;br/&gt;&lt;br/&gt;Note that the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type defines enumeration values for some popular shipping carriers for the US, UK, Germany, Canada, and Australia, but it is not a complete global list. 
     * @param value Value to set for the carrierEnum property.
     */
    public void setCarrierEnum(@jakarta.annotation.Nullable final String value) {
        this.carrierEnum = value;
    }
    /**
     * Sets the carrierName property value. This field is used to show the name of the shipping carrier.
     * @param value Value to set for the carrierName property.
     */
    public void setCarrierName(@jakarta.annotation.Nullable final String value) {
        this.carrierName = value;
    }
    /**
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the fileId property value. The unique ID of a file attached to the return request. This field may be used if the seller has associated a shipping label related file to the return request.
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
    /**
     * Sets the forwardShippingLabelProvided property value. This field should be provided and set to &lt;code&gt;true&lt;/code&gt; if the seller has already provided the buyer with a return shipping label. This field is generally provided if the &lt;b&gt;labelAction&lt;/b&gt; value is set to &lt;code&gt;MARK_AS_SENT&lt;/code&gt;.
     * @param value Value to set for the forwardShippingLabelProvided property.
     */
    public void setForwardShippingLabelProvided(@jakarta.annotation.Nullable final Boolean value) {
        this.forwardShippingLabelProvided = value;
    }
    /**
     * Sets the labelAction property value. This enumerated type lists the actions that may be specified in the &lt;b&gt;labelAction&lt;/b&gt; field in the request of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
     * @param value Value to set for the labelAction property.
     */
    public void setLabelAction(@jakarta.annotation.Nullable final LabelActionEnum value) {
        this.labelAction = value;
    }
    /**
     * Sets the labelSentDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the labelSentDate property.
     */
    public void setLabelSentDate(@jakarta.annotation.Nullable final DateTime value) {
        this.labelSentDate = value;
    }
    /**
     * Sets the noLabelReason property value. This enumerated type lists the possible values that a seller  can provide in the &lt;b&gt;noLabelReason&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; to indicate the reason why a shipping label is not being supplied to the buyer.
     * @param value Value to set for the noLabelReason property.
     */
    public void setNoLabelReason(@jakarta.annotation.Nullable final NoSellerUploadLabelReasonEnum value) {
        this.noLabelReason = value;
    }
    /**
     * Sets the returnLabelCost property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the returnLabelCost property.
     */
    public void setReturnLabelCost(@jakarta.annotation.Nullable final Amount value) {
        this.returnLabelCost = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number on the shipping label. If providing the tracking number, the shipping carrier must also be provided through the &lt;b&gt;carrierEnum&lt;/b&gt; field.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
