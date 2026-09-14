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
 * The base response type for the &lt;b&gt;GET /post-order/v2/casemanagement/{caseId}&lt;/b&gt; method. This type contains detailed information about an INR or Return case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseDetailsResponse implements AdditionalDataHolder, Parsable {
    /**
     * This type is used by the &lt;b&gt;actionDeadlines&lt;/b&gt; container, which  provides the number of remaining days that a buyer or seller has before being required to take action on an INR or Return case.
     */
    private ActionDeadlines actionDeadlines;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type provides information related to the appeal of a case decision.
     */
    private AppealDetails appealDetails;
    /**
     * This enumeration value indicates why the buyer chose to close the case. This field is only returned if the buyer closed the case, or if the case was closed on behalf of the buyer.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     */
    private String buyerClosureReason;
    /**
     * This string value is the URL for the eBay Resolution Center.
     */
    private String buyerProtectedProgramLink;
    /**
     * This field indicates the item content related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding case content is on hold due to eBay policy violation; false otherwise.
     */
    private Boolean caseContentOnHold;
    /**
     * This type is used by the &lt;b&gt;caseDetails&lt;/b&gt; container that is returned in the &lt;b&gt;GET /post-order/v2/casemanagement/{caseId}&lt;/b&gt; method to provide detailed information about the case.
     */
    private CaseDetails caseDetails;
    /**
     * This type is used to provide the history of events associated with an INR inquiry or a case.
     */
    private ClaimHistoryResponse caseHistoryDetails;
    /**
     * The unique identifier of an INR or Return case.
     */
    private String caseId;
    /**
     * This integer value indicates the quantity of the line item purchased by the buyer.
     */
    private Integer caseQuantity;
    /**
     * This enumeration type lists the types of cases that may be created by the buyer or seller.
     */
    private CaseTypeEnum caseType;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount claimAmount;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime creationDate;
    /**
     * This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     */
    private UserPartyEnum escalatedBy;
    /**
     * Indicates why the buyer or seller escalated an INR inquiry or a return request into a case.&lt;br/&gt;&lt;br/&gt;For an INR inquiry that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition. type.&lt;br/&gt;&lt;br/&gt;For a return request that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/EscalateReasonEnum.html&quot;&gt;EscalateReasonEnum&lt;/a&gt; type definition.
     */
    private String escalateReason;
    /**
     * This string value is the URL for the event tickets page, where electronic event tickets can be downloaded by the purchaser. This field is only returned if the case involves an event tickets order.
     */
    private String eventTicketsLink;
    /**
     * This string value is the unique identifier of the payment transaction for the order. This field will only be returned if the payment transaction happened outside of eBay&apos;s system.
     */
    private String extTransactionId;
    /**
     * This integer value indicates the number of days that the buyer has to provide shipment tracking information for an item that is being returned to the seller.&lt;br/&gt;&lt;br/&gt; This field is only returned for Return cases, and only if the buyer is being required to provide shipment tracking information for the item being returned.
     */
    private Integer fsnadDaysToAddTrackingAfterShippingItem;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime fsnadShipToSellerByDate;
    /**
     * This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     */
    private UserPartyEnum initiator;
    /**
     * The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     */
    private String itemId;
    /**
     * This field indicates the item related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding item is on hold due to eBay policy violation; false otherwise.
     */
    private Boolean itemOnHold;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime lastModifiedDate;
    /**
     * This string value is the URL for the purchase item page. This field will be returned if available/applicable.
     */
    private String payForItemLink;
    /**
     * This string value indicates the dollar value threshold for the signature confirmation add-on. The buyer must purchase the signature confirmation add-on for high-value items at or above this dollar value.
     */
    private String priceSignatureConfirmationAmount;
    /**
     * This string is the URL for the recalled item page. This field will be returned if available/applicable.
     */
    private String recalledItemLink;
    /**
     * This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
     */
    private ReturnAddress returnDetails;
    /**
     * The unique identifier of a return. This field is only returned if the case type is a Return.
     */
    private String returnId;
    /**
     * This enumeration value indicates why the seller chose to close the case. This field is only returned if the seller closed the case, or if the case was closed on behalf of the seller.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     */
    private String sellerClosureReason;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount shippingFee;
    /**
     * This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     */
    private String status;
    /**
     * The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     */
    private String transactionId;
    /**
     * Instantiates a new {@link CaseDetailsResponse} and sets the default values.
     */
    public CaseDetailsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseDetailsResponse}
     */
    @jakarta.annotation.Nonnull
    public static CaseDetailsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseDetailsResponse();
    }
    /**
     * Gets the actionDeadlines property value. This type is used by the &lt;b&gt;actionDeadlines&lt;/b&gt; container, which  provides the number of remaining days that a buyer or seller has before being required to take action on an INR or Return case.
     * @return a {@link ActionDeadlines}
     */
    @jakarta.annotation.Nullable
    public ActionDeadlines getActionDeadlines() {
        return this.actionDeadlines;
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
     * Gets the appealDetails property value. This type provides information related to the appeal of a case decision.
     * @return a {@link AppealDetails}
     */
    @jakarta.annotation.Nullable
    public AppealDetails getAppealDetails() {
        return this.appealDetails;
    }
    /**
     * Gets the buyerClosureReason property value. This enumeration value indicates why the buyer chose to close the case. This field is only returned if the buyer closed the case, or if the case was closed on behalf of the buyer.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerClosureReason() {
        return this.buyerClosureReason;
    }
    /**
     * Gets the buyerProtectedProgramLink property value. This string value is the URL for the eBay Resolution Center.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerProtectedProgramLink() {
        return this.buyerProtectedProgramLink;
    }
    /**
     * Gets the caseContentOnHold property value. This field indicates the item content related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding case content is on hold due to eBay policy violation; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCaseContentOnHold() {
        return this.caseContentOnHold;
    }
    /**
     * Gets the caseDetails property value. This type is used by the &lt;b&gt;caseDetails&lt;/b&gt; container that is returned in the &lt;b&gt;GET /post-order/v2/casemanagement/{caseId}&lt;/b&gt; method to provide detailed information about the case.
     * @return a {@link CaseDetails}
     */
    @jakarta.annotation.Nullable
    public CaseDetails getCaseDetails() {
        return this.caseDetails;
    }
    /**
     * Gets the caseHistoryDetails property value. This type is used to provide the history of events associated with an INR inquiry or a case.
     * @return a {@link ClaimHistoryResponse}
     */
    @jakarta.annotation.Nullable
    public ClaimHistoryResponse getCaseHistoryDetails() {
        return this.caseHistoryDetails;
    }
    /**
     * Gets the caseId property value. The unique identifier of an INR or Return case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaseId() {
        return this.caseId;
    }
    /**
     * Gets the caseQuantity property value. This integer value indicates the quantity of the line item purchased by the buyer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCaseQuantity() {
        return this.caseQuantity;
    }
    /**
     * Gets the caseType property value. This enumeration type lists the types of cases that may be created by the buyer or seller.
     * @return a {@link CaseTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CaseTypeEnum getCaseType() {
        return this.caseType;
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
     * Gets the creationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the escalatedBy property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @return a {@link UserPartyEnum}
     */
    @jakarta.annotation.Nullable
    public UserPartyEnum getEscalatedBy() {
        return this.escalatedBy;
    }
    /**
     * Gets the escalateReason property value. Indicates why the buyer or seller escalated an INR inquiry or a return request into a case.&lt;br/&gt;&lt;br/&gt;For an INR inquiry that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition. type.&lt;br/&gt;&lt;br/&gt;For a return request that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/EscalateReasonEnum.html&quot;&gt;EscalateReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEscalateReason() {
        return this.escalateReason;
    }
    /**
     * Gets the eventTicketsLink property value. This string value is the URL for the event tickets page, where electronic event tickets can be downloaded by the purchaser. This field is only returned if the case involves an event tickets order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventTicketsLink() {
        return this.eventTicketsLink;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("actionDeadlines", (n) -> { this.setActionDeadlines(n.getObjectValue(ActionDeadlines::createFromDiscriminatorValue)); });
        deserializerMap.put("appealDetails", (n) -> { this.setAppealDetails(n.getObjectValue(AppealDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerClosureReason", (n) -> { this.setBuyerClosureReason(n.getStringValue()); });
        deserializerMap.put("buyerProtectedProgramLink", (n) -> { this.setBuyerProtectedProgramLink(n.getStringValue()); });
        deserializerMap.put("caseContentOnHold", (n) -> { this.setCaseContentOnHold(n.getBooleanValue()); });
        deserializerMap.put("caseDetails", (n) -> { this.setCaseDetails(n.getObjectValue(CaseDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("caseHistoryDetails", (n) -> { this.setCaseHistoryDetails(n.getObjectValue(ClaimHistoryResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("caseId", (n) -> { this.setCaseId(n.getStringValue()); });
        deserializerMap.put("caseQuantity", (n) -> { this.setCaseQuantity(n.getIntegerValue()); });
        deserializerMap.put("caseType", (n) -> { this.setCaseType(n.getEnumValue(CaseTypeEnum::forValue)); });
        deserializerMap.put("claimAmount", (n) -> { this.setClaimAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("escalatedBy", (n) -> { this.setEscalatedBy(n.getEnumValue(UserPartyEnum::forValue)); });
        deserializerMap.put("escalateReason", (n) -> { this.setEscalateReason(n.getStringValue()); });
        deserializerMap.put("eventTicketsLink", (n) -> { this.setEventTicketsLink(n.getStringValue()); });
        deserializerMap.put("extTransactionId", (n) -> { this.setExtTransactionId(n.getStringValue()); });
        deserializerMap.put("fsnadDaysToAddTrackingAfterShippingItem", (n) -> { this.setFsnadDaysToAddTrackingAfterShippingItem(n.getIntegerValue()); });
        deserializerMap.put("fsnadShipToSellerByDate", (n) -> { this.setFsnadShipToSellerByDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getEnumValue(UserPartyEnum::forValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("itemOnHold", (n) -> { this.setItemOnHold(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("payForItemLink", (n) -> { this.setPayForItemLink(n.getStringValue()); });
        deserializerMap.put("priceSignatureConfirmationAmount", (n) -> { this.setPriceSignatureConfirmationAmount(n.getStringValue()); });
        deserializerMap.put("recalledItemLink", (n) -> { this.setRecalledItemLink(n.getStringValue()); });
        deserializerMap.put("returnDetails", (n) -> { this.setReturnDetails(n.getObjectValue(ReturnAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("returnId", (n) -> { this.setReturnId(n.getStringValue()); });
        deserializerMap.put("sellerClosureReason", (n) -> { this.setSellerClosureReason(n.getStringValue()); });
        deserializerMap.put("shippingFee", (n) -> { this.setShippingFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fsnadDaysToAddTrackingAfterShippingItem property value. This integer value indicates the number of days that the buyer has to provide shipment tracking information for an item that is being returned to the seller.&lt;br/&gt;&lt;br/&gt; This field is only returned for Return cases, and only if the buyer is being required to provide shipment tracking information for the item being returned.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFsnadDaysToAddTrackingAfterShippingItem() {
        return this.fsnadDaysToAddTrackingAfterShippingItem;
    }
    /**
     * Gets the fsnadShipToSellerByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getFsnadShipToSellerByDate() {
        return this.fsnadShipToSellerByDate;
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
     * Gets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the itemOnHold property value. This field indicates the item related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding item is on hold due to eBay policy violation; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getItemOnHold() {
        return this.itemOnHold;
    }
    /**
     * Gets the lastModifiedDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Gets the payForItemLink property value. This string value is the URL for the purchase item page. This field will be returned if available/applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayForItemLink() {
        return this.payForItemLink;
    }
    /**
     * Gets the priceSignatureConfirmationAmount property value. This string value indicates the dollar value threshold for the signature confirmation add-on. The buyer must purchase the signature confirmation add-on for high-value items at or above this dollar value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPriceSignatureConfirmationAmount() {
        return this.priceSignatureConfirmationAmount;
    }
    /**
     * Gets the recalledItemLink property value. This string is the URL for the recalled item page. This field will be returned if available/applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecalledItemLink() {
        return this.recalledItemLink;
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
     * Gets the returnId property value. The unique identifier of a return. This field is only returned if the case type is a Return.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Gets the sellerClosureReason property value. This enumeration value indicates why the seller chose to close the case. This field is only returned if the seller closed the case, or if the case was closed on behalf of the seller.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerClosureReason() {
        return this.sellerClosureReason;
    }
    /**
     * Gets the shippingFee property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingFee() {
        return this.shippingFee;
    }
    /**
     * Gets the status property value. This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actionDeadlines", this.getActionDeadlines());
        writer.writeObjectValue("appealDetails", this.getAppealDetails());
        writer.writeStringValue("buyerClosureReason", this.getBuyerClosureReason());
        writer.writeStringValue("buyerProtectedProgramLink", this.getBuyerProtectedProgramLink());
        writer.writeBooleanValue("caseContentOnHold", this.getCaseContentOnHold());
        writer.writeObjectValue("caseDetails", this.getCaseDetails());
        writer.writeObjectValue("caseHistoryDetails", this.getCaseHistoryDetails());
        writer.writeStringValue("caseId", this.getCaseId());
        writer.writeIntegerValue("caseQuantity", this.getCaseQuantity());
        writer.writeEnumValue("caseType", this.getCaseType());
        writer.writeObjectValue("claimAmount", this.getClaimAmount());
        writer.writeObjectValue("creationDate", this.getCreationDate());
        writer.writeEnumValue("escalatedBy", this.getEscalatedBy());
        writer.writeStringValue("escalateReason", this.getEscalateReason());
        writer.writeStringValue("eventTicketsLink", this.getEventTicketsLink());
        writer.writeStringValue("extTransactionId", this.getExtTransactionId());
        writer.writeIntegerValue("fsnadDaysToAddTrackingAfterShippingItem", this.getFsnadDaysToAddTrackingAfterShippingItem());
        writer.writeObjectValue("fsnadShipToSellerByDate", this.getFsnadShipToSellerByDate());
        writer.writeEnumValue("initiator", this.getInitiator());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeBooleanValue("itemOnHold", this.getItemOnHold());
        writer.writeObjectValue("lastModifiedDate", this.getLastModifiedDate());
        writer.writeStringValue("payForItemLink", this.getPayForItemLink());
        writer.writeStringValue("priceSignatureConfirmationAmount", this.getPriceSignatureConfirmationAmount());
        writer.writeStringValue("recalledItemLink", this.getRecalledItemLink());
        writer.writeObjectValue("returnDetails", this.getReturnDetails());
        writer.writeStringValue("returnId", this.getReturnId());
        writer.writeStringValue("sellerClosureReason", this.getSellerClosureReason());
        writer.writeObjectValue("shippingFee", this.getShippingFee());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionDeadlines property value. This type is used by the &lt;b&gt;actionDeadlines&lt;/b&gt; container, which  provides the number of remaining days that a buyer or seller has before being required to take action on an INR or Return case.
     * @param value Value to set for the actionDeadlines property.
     */
    public void setActionDeadlines(@jakarta.annotation.Nullable final ActionDeadlines value) {
        this.actionDeadlines = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appealDetails property value. This type provides information related to the appeal of a case decision.
     * @param value Value to set for the appealDetails property.
     */
    public void setAppealDetails(@jakarta.annotation.Nullable final AppealDetails value) {
        this.appealDetails = value;
    }
    /**
     * Sets the buyerClosureReason property value. This enumeration value indicates why the buyer chose to close the case. This field is only returned if the buyer closed the case, or if the case was closed on behalf of the buyer.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the buyerClosureReason property.
     */
    public void setBuyerClosureReason(@jakarta.annotation.Nullable final String value) {
        this.buyerClosureReason = value;
    }
    /**
     * Sets the buyerProtectedProgramLink property value. This string value is the URL for the eBay Resolution Center.
     * @param value Value to set for the buyerProtectedProgramLink property.
     */
    public void setBuyerProtectedProgramLink(@jakarta.annotation.Nullable final String value) {
        this.buyerProtectedProgramLink = value;
    }
    /**
     * Sets the caseContentOnHold property value. This field indicates the item content related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding case content is on hold due to eBay policy violation; false otherwise.
     * @param value Value to set for the caseContentOnHold property.
     */
    public void setCaseContentOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.caseContentOnHold = value;
    }
    /**
     * Sets the caseDetails property value. This type is used by the &lt;b&gt;caseDetails&lt;/b&gt; container that is returned in the &lt;b&gt;GET /post-order/v2/casemanagement/{caseId}&lt;/b&gt; method to provide detailed information about the case.
     * @param value Value to set for the caseDetails property.
     */
    public void setCaseDetails(@jakarta.annotation.Nullable final CaseDetails value) {
        this.caseDetails = value;
    }
    /**
     * Sets the caseHistoryDetails property value. This type is used to provide the history of events associated with an INR inquiry or a case.
     * @param value Value to set for the caseHistoryDetails property.
     */
    public void setCaseHistoryDetails(@jakarta.annotation.Nullable final ClaimHistoryResponse value) {
        this.caseHistoryDetails = value;
    }
    /**
     * Sets the caseId property value. The unique identifier of an INR or Return case.
     * @param value Value to set for the caseId property.
     */
    public void setCaseId(@jakarta.annotation.Nullable final String value) {
        this.caseId = value;
    }
    /**
     * Sets the caseQuantity property value. This integer value indicates the quantity of the line item purchased by the buyer.
     * @param value Value to set for the caseQuantity property.
     */
    public void setCaseQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.caseQuantity = value;
    }
    /**
     * Sets the caseType property value. This enumeration type lists the types of cases that may be created by the buyer or seller.
     * @param value Value to set for the caseType property.
     */
    public void setCaseType(@jakarta.annotation.Nullable final CaseTypeEnum value) {
        this.caseType = value;
    }
    /**
     * Sets the claimAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the claimAmount property.
     */
    public void setClaimAmount(@jakarta.annotation.Nullable final Amount value) {
        this.claimAmount = value;
    }
    /**
     * Sets the creationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final DateTime value) {
        this.creationDate = value;
    }
    /**
     * Sets the escalatedBy property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @param value Value to set for the escalatedBy property.
     */
    public void setEscalatedBy(@jakarta.annotation.Nullable final UserPartyEnum value) {
        this.escalatedBy = value;
    }
    /**
     * Sets the escalateReason property value. Indicates why the buyer or seller escalated an INR inquiry or a return request into a case.&lt;br/&gt;&lt;br/&gt;For an INR inquiry that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition. type.&lt;br/&gt;&lt;br/&gt;For a return request that was escalated, the applicable values are defined in the &lt;a href=&quot;/devzone/post-order/types/EscalateReasonEnum.html&quot;&gt;EscalateReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the escalateReason property.
     */
    public void setEscalateReason(@jakarta.annotation.Nullable final String value) {
        this.escalateReason = value;
    }
    /**
     * Sets the eventTicketsLink property value. This string value is the URL for the event tickets page, where electronic event tickets can be downloaded by the purchaser. This field is only returned if the case involves an event tickets order.
     * @param value Value to set for the eventTicketsLink property.
     */
    public void setEventTicketsLink(@jakarta.annotation.Nullable final String value) {
        this.eventTicketsLink = value;
    }
    /**
     * Sets the extTransactionId property value. This string value is the unique identifier of the payment transaction for the order. This field will only be returned if the payment transaction happened outside of eBay&apos;s system.
     * @param value Value to set for the extTransactionId property.
     */
    public void setExtTransactionId(@jakarta.annotation.Nullable final String value) {
        this.extTransactionId = value;
    }
    /**
     * Sets the fsnadDaysToAddTrackingAfterShippingItem property value. This integer value indicates the number of days that the buyer has to provide shipment tracking information for an item that is being returned to the seller.&lt;br/&gt;&lt;br/&gt; This field is only returned for Return cases, and only if the buyer is being required to provide shipment tracking information for the item being returned.
     * @param value Value to set for the fsnadDaysToAddTrackingAfterShippingItem property.
     */
    public void setFsnadDaysToAddTrackingAfterShippingItem(@jakarta.annotation.Nullable final Integer value) {
        this.fsnadDaysToAddTrackingAfterShippingItem = value;
    }
    /**
     * Sets the fsnadShipToSellerByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the fsnadShipToSellerByDate property.
     */
    public void setFsnadShipToSellerByDate(@jakarta.annotation.Nullable final DateTime value) {
        this.fsnadShipToSellerByDate = value;
    }
    /**
     * Sets the initiator property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final UserPartyEnum value) {
        this.initiator = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the itemOnHold property value. This field indicates the item related to the case is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the corresponding item is on hold due to eBay policy violation; false otherwise.
     * @param value Value to set for the itemOnHold property.
     */
    public void setItemOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.itemOnHold = value;
    }
    /**
     * Sets the lastModifiedDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the lastModifiedDate property.
     */
    public void setLastModifiedDate(@jakarta.annotation.Nullable final DateTime value) {
        this.lastModifiedDate = value;
    }
    /**
     * Sets the payForItemLink property value. This string value is the URL for the purchase item page. This field will be returned if available/applicable.
     * @param value Value to set for the payForItemLink property.
     */
    public void setPayForItemLink(@jakarta.annotation.Nullable final String value) {
        this.payForItemLink = value;
    }
    /**
     * Sets the priceSignatureConfirmationAmount property value. This string value indicates the dollar value threshold for the signature confirmation add-on. The buyer must purchase the signature confirmation add-on for high-value items at or above this dollar value.
     * @param value Value to set for the priceSignatureConfirmationAmount property.
     */
    public void setPriceSignatureConfirmationAmount(@jakarta.annotation.Nullable final String value) {
        this.priceSignatureConfirmationAmount = value;
    }
    /**
     * Sets the recalledItemLink property value. This string is the URL for the recalled item page. This field will be returned if available/applicable.
     * @param value Value to set for the recalledItemLink property.
     */
    public void setRecalledItemLink(@jakarta.annotation.Nullable final String value) {
        this.recalledItemLink = value;
    }
    /**
     * Sets the returnDetails property value. This type provides the seller&apos;s return address and the Return Merchandise Authorization (RMA) number associated with the item (if applicable).
     * @param value Value to set for the returnDetails property.
     */
    public void setReturnDetails(@jakarta.annotation.Nullable final ReturnAddress value) {
        this.returnDetails = value;
    }
    /**
     * Sets the returnId property value. The unique identifier of a return. This field is only returned if the case type is a Return.
     * @param value Value to set for the returnId property.
     */
    public void setReturnId(@jakarta.annotation.Nullable final String value) {
        this.returnId = value;
    }
    /**
     * Sets the sellerClosureReason property value. This enumeration value indicates why the seller chose to close the case. This field is only returned if the seller closed the case, or if the case was closed on behalf of the seller.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseCloseReasonEnum.html&quot;&gt;CaseCloseReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the sellerClosureReason property.
     */
    public void setSellerClosureReason(@jakarta.annotation.Nullable final String value) {
        this.sellerClosureReason = value;
    }
    /**
     * Sets the shippingFee property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the shippingFee property.
     */
    public void setShippingFee(@jakarta.annotation.Nullable final Amount value) {
        this.shippingFee = value;
    }
    /**
     * Sets the status property value. This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
}
