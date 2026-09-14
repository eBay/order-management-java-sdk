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
 * The base response type for the &lt;b&gt;GET /post-order/v2/inquiry/{inquiryId}&lt;/b&gt; method. This type provides full details on an INR inquiry.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InquiryDetailsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount claimAmount;
    /**
     * The enumeration value in this field indicates why the buyer created an INR inquiry for the line item.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/INRCreationReasonEnum.html&quot;&gt;INRCreationReasonEnum&lt;/a&gt; type definition.
     */
    private String creationReason;
    /**
     * This string value is the unique identifier of the payment transaction for the order. This field will only be returned if the payment transaction happened outside of eBay&apos;s system.
     */
    private String extTransactionId;
    /**
     * This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     */
    private UserPartyEnum initiator;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime inquiryClosureDate;
    /**
     * This field indicates the item content related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding inquiry content is on hold due to eBay policy violation; false otherwise.
     */
    private Boolean inquiryContentOnHold;
    /**
     * Type used by the &lt;b&gt;inquiryDetails&lt;/b&gt; container of the &lt;b&gt;GET /post-order/v2/inquiry/{inquiryId}&lt;/b&gt; response. The &lt;b&gt;inquiryDetails&lt;/b&gt; container provides details about a specific INR inquiry that is identified through a path parameter in the request.
     */
    private InquiryDetails inquiryDetails;
    /**
     * This type is used to provide the history of events associated with an INR inquiry or a case.
     */
    private ClaimHistoryResponse inquiryHistoryDetails;
    /**
     * The unique identifier of the INR inquiry for which details have been retrieved. All information returned in the response is relevant to this specific INR inquiry.
     */
    private String inquiryId;
    /**
     * This integer is the quantity of the line item purchased by the buyer. This value is the same value passed into the &lt;b&gt;claimQuantity&lt;/b&gt; field when the INR inquiry was created. If the &lt;b&gt;claimQuantity&lt;/b&gt; field was omitted when the INR inquiry was created, this value defaults to &lt;code&gt;1&lt;/code&gt;. 
     */
    private Integer inquiryQuantity;
    /**
     * This type provides information about the line item associated with the INR inquiry.
     */
    private ItemDetails itemDetails;
    /**
     * The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the INR inquiry.
     */
    private String itemId;
    /**
     * This type defines the estimated resolution date for the inquiry.
     */
    private ResolutionEstimate resolutionEstimate;
    /**
     * This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
     */
    private ReturnAddress returnDetails;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime sellerMakeItRightByDate;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount shippingCost;
    /**
     * This enumeration value indicates the current state of the INR inquiry. &lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStateEnum.html&quot;&gt;InquiryStateEnum&lt;/a&gt; type definition.
     */
    private String state;
    /**
     * This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     */
    private String status;
    /**
     * The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the INR inquiry.
     */
    private String transactionId;
    /**
     * &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     */
    private String viewPPTrasanctionUrl;
    /**
     * Instantiates a new {@link InquiryDetailsResponse} and sets the default values.
     */
    public InquiryDetailsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InquiryDetailsResponse}
     */
    @jakarta.annotation.Nonnull
    public static InquiryDetailsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InquiryDetailsResponse();
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
     * Gets the claimAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getClaimAmount() {
        return this.claimAmount;
    }
    /**
     * Gets the creationReason property value. The enumeration value in this field indicates why the buyer created an INR inquiry for the line item.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/INRCreationReasonEnum.html&quot;&gt;INRCreationReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationReason() {
        return this.creationReason;
    }
    /**
     * Gets the extTransactionId property value. This string value is the unique identifier of the payment transaction for the order. This field will only be returned if the payment transaction happened outside of eBay&apos;s system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtTransactionId() {
        return this.extTransactionId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("claimAmount", (n) -> { this.setClaimAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creationReason", (n) -> { this.setCreationReason(n.getStringValue()); });
        deserializerMap.put("extTransactionId", (n) -> { this.setExtTransactionId(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getEnumValue(UserPartyEnum::forValue)); });
        deserializerMap.put("inquiryClosureDate", (n) -> { this.setInquiryClosureDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("inquiryContentOnHold", (n) -> { this.setInquiryContentOnHold(n.getBooleanValue()); });
        deserializerMap.put("inquiryDetails", (n) -> { this.setInquiryDetails(n.getObjectValue(InquiryDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("inquiryHistoryDetails", (n) -> { this.setInquiryHistoryDetails(n.getObjectValue(ClaimHistoryResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("inquiryId", (n) -> { this.setInquiryId(n.getStringValue()); });
        deserializerMap.put("inquiryQuantity", (n) -> { this.setInquiryQuantity(n.getIntegerValue()); });
        deserializerMap.put("itemDetails", (n) -> { this.setItemDetails(n.getObjectValue(ItemDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("resolutionEstimate", (n) -> { this.setResolutionEstimate(n.getObjectValue(ResolutionEstimate::createFromDiscriminatorValue)); });
        deserializerMap.put("returnDetails", (n) -> { this.setReturnDetails(n.getObjectValue(ReturnAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("sellerMakeItRightByDate", (n) -> { this.setSellerMakeItRightByDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("viewPPTrasanctionUrl", (n) -> { this.setViewPPTrasanctionUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @return a {@link UserPartyEnum}
     */
    @jakarta.annotation.Nullable
    public UserPartyEnum getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the inquiryClosureDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getInquiryClosureDate() {
        return this.inquiryClosureDate;
    }
    /**
     * Gets the inquiryContentOnHold property value. This field indicates the item content related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding inquiry content is on hold due to eBay policy violation; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInquiryContentOnHold() {
        return this.inquiryContentOnHold;
    }
    /**
     * Gets the inquiryDetails property value. Type used by the &lt;b&gt;inquiryDetails&lt;/b&gt; container of the &lt;b&gt;GET /post-order/v2/inquiry/{inquiryId}&lt;/b&gt; response. The &lt;b&gt;inquiryDetails&lt;/b&gt; container provides details about a specific INR inquiry that is identified through a path parameter in the request.
     * @return a {@link InquiryDetails}
     */
    @jakarta.annotation.Nullable
    public InquiryDetails getInquiryDetails() {
        return this.inquiryDetails;
    }
    /**
     * Gets the inquiryHistoryDetails property value. This type is used to provide the history of events associated with an INR inquiry or a case.
     * @return a {@link ClaimHistoryResponse}
     */
    @jakarta.annotation.Nullable
    public ClaimHistoryResponse getInquiryHistoryDetails() {
        return this.inquiryHistoryDetails;
    }
    /**
     * Gets the inquiryId property value. The unique identifier of the INR inquiry for which details have been retrieved. All information returned in the response is relevant to this specific INR inquiry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInquiryId() {
        return this.inquiryId;
    }
    /**
     * Gets the inquiryQuantity property value. This integer is the quantity of the line item purchased by the buyer. This value is the same value passed into the &lt;b&gt;claimQuantity&lt;/b&gt; field when the INR inquiry was created. If the &lt;b&gt;claimQuantity&lt;/b&gt; field was omitted when the INR inquiry was created, this value defaults to &lt;code&gt;1&lt;/code&gt;. 
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInquiryQuantity() {
        return this.inquiryQuantity;
    }
    /**
     * Gets the itemDetails property value. This type provides information about the line item associated with the INR inquiry.
     * @return a {@link ItemDetails}
     */
    @jakarta.annotation.Nullable
    public ItemDetails getItemDetails() {
        return this.itemDetails;
    }
    /**
     * Gets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the INR inquiry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the resolutionEstimate property value. This type defines the estimated resolution date for the inquiry.
     * @return a {@link ResolutionEstimate}
     */
    @jakarta.annotation.Nullable
    public ResolutionEstimate getResolutionEstimate() {
        return this.resolutionEstimate;
    }
    /**
     * Gets the returnDetails property value. This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
     * @return a {@link ReturnAddress}
     */
    @jakarta.annotation.Nullable
    public ReturnAddress getReturnDetails() {
        return this.returnDetails;
    }
    /**
     * Gets the sellerMakeItRightByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getSellerMakeItRightByDate() {
        return this.sellerMakeItRightByDate;
    }
    /**
     * Gets the shippingCost property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Gets the state property value. This enumeration value indicates the current state of the INR inquiry. &lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStateEnum.html&quot;&gt;InquiryStateEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the status property value. This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the INR inquiry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the viewPPTrasanctionUrl property value. &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getViewPPTrasanctionUrl() {
        return this.viewPPTrasanctionUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("claimAmount", this.getClaimAmount());
        writer.writeStringValue("creationReason", this.getCreationReason());
        writer.writeStringValue("extTransactionId", this.getExtTransactionId());
        writer.writeEnumValue("initiator", this.getInitiator());
        writer.writeObjectValue("inquiryClosureDate", this.getInquiryClosureDate());
        writer.writeBooleanValue("inquiryContentOnHold", this.getInquiryContentOnHold());
        writer.writeObjectValue("inquiryDetails", this.getInquiryDetails());
        writer.writeObjectValue("inquiryHistoryDetails", this.getInquiryHistoryDetails());
        writer.writeStringValue("inquiryId", this.getInquiryId());
        writer.writeIntegerValue("inquiryQuantity", this.getInquiryQuantity());
        writer.writeObjectValue("itemDetails", this.getItemDetails());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeObjectValue("resolutionEstimate", this.getResolutionEstimate());
        writer.writeObjectValue("returnDetails", this.getReturnDetails());
        writer.writeObjectValue("sellerMakeItRightByDate", this.getSellerMakeItRightByDate());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeStringValue("viewPPTrasanctionUrl", this.getViewPPTrasanctionUrl());
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
     * Sets the claimAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the claimAmount property.
     */
    public void setClaimAmount(@jakarta.annotation.Nullable final Amount value) {
        this.claimAmount = value;
    }
    /**
     * Sets the creationReason property value. The enumeration value in this field indicates why the buyer created an INR inquiry for the line item.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/INRCreationReasonEnum.html&quot;&gt;INRCreationReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the creationReason property.
     */
    public void setCreationReason(@jakarta.annotation.Nullable final String value) {
        this.creationReason = value;
    }
    /**
     * Sets the extTransactionId property value. This string value is the unique identifier of the payment transaction for the order. This field will only be returned if the payment transaction happened outside of eBay&apos;s system.
     * @param value Value to set for the extTransactionId property.
     */
    public void setExtTransactionId(@jakarta.annotation.Nullable final String value) {
        this.extTransactionId = value;
    }
    /**
     * Sets the initiator property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final UserPartyEnum value) {
        this.initiator = value;
    }
    /**
     * Sets the inquiryClosureDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the inquiryClosureDate property.
     */
    public void setInquiryClosureDate(@jakarta.annotation.Nullable final DateTime value) {
        this.inquiryClosureDate = value;
    }
    /**
     * Sets the inquiryContentOnHold property value. This field indicates the item content related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding inquiry content is on hold due to eBay policy violation; false otherwise.
     * @param value Value to set for the inquiryContentOnHold property.
     */
    public void setInquiryContentOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.inquiryContentOnHold = value;
    }
    /**
     * Sets the inquiryDetails property value. Type used by the &lt;b&gt;inquiryDetails&lt;/b&gt; container of the &lt;b&gt;GET /post-order/v2/inquiry/{inquiryId}&lt;/b&gt; response. The &lt;b&gt;inquiryDetails&lt;/b&gt; container provides details about a specific INR inquiry that is identified through a path parameter in the request.
     * @param value Value to set for the inquiryDetails property.
     */
    public void setInquiryDetails(@jakarta.annotation.Nullable final InquiryDetails value) {
        this.inquiryDetails = value;
    }
    /**
     * Sets the inquiryHistoryDetails property value. This type is used to provide the history of events associated with an INR inquiry or a case.
     * @param value Value to set for the inquiryHistoryDetails property.
     */
    public void setInquiryHistoryDetails(@jakarta.annotation.Nullable final ClaimHistoryResponse value) {
        this.inquiryHistoryDetails = value;
    }
    /**
     * Sets the inquiryId property value. The unique identifier of the INR inquiry for which details have been retrieved. All information returned in the response is relevant to this specific INR inquiry.
     * @param value Value to set for the inquiryId property.
     */
    public void setInquiryId(@jakarta.annotation.Nullable final String value) {
        this.inquiryId = value;
    }
    /**
     * Sets the inquiryQuantity property value. This integer is the quantity of the line item purchased by the buyer. This value is the same value passed into the &lt;b&gt;claimQuantity&lt;/b&gt; field when the INR inquiry was created. If the &lt;b&gt;claimQuantity&lt;/b&gt; field was omitted when the INR inquiry was created, this value defaults to &lt;code&gt;1&lt;/code&gt;. 
     * @param value Value to set for the inquiryQuantity property.
     */
    public void setInquiryQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.inquiryQuantity = value;
    }
    /**
     * Sets the itemDetails property value. This type provides information about the line item associated with the INR inquiry.
     * @param value Value to set for the itemDetails property.
     */
    public void setItemDetails(@jakarta.annotation.Nullable final ItemDetails value) {
        this.itemDetails = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the INR inquiry.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the resolutionEstimate property value. This type defines the estimated resolution date for the inquiry.
     * @param value Value to set for the resolutionEstimate property.
     */
    public void setResolutionEstimate(@jakarta.annotation.Nullable final ResolutionEstimate value) {
        this.resolutionEstimate = value;
    }
    /**
     * Sets the returnDetails property value. This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
     * @param value Value to set for the returnDetails property.
     */
    public void setReturnDetails(@jakarta.annotation.Nullable final ReturnAddress value) {
        this.returnDetails = value;
    }
    /**
     * Sets the sellerMakeItRightByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the sellerMakeItRightByDate property.
     */
    public void setSellerMakeItRightByDate(@jakarta.annotation.Nullable final DateTime value) {
        this.sellerMakeItRightByDate = value;
    }
    /**
     * Sets the shippingCost property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
    /**
     * Sets the state property value. This enumeration value indicates the current state of the INR inquiry. &lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStateEnum.html&quot;&gt;InquiryStateEnum&lt;/a&gt; type definition.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the status property value. This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the INR inquiry.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the viewPPTrasanctionUrl property value. &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     * @param value Value to set for the viewPPTrasanctionUrl property.
     */
    public void setViewPPTrasanctionUrl(@jakarta.annotation.Nullable final String value) {
        this.viewPPTrasanctionUrl = value;
    }
}
