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
 * This type is used by the base response of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method. The &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method retrieves detailed information on a specific payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDispute implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount amount;
    /**
     * The value(s) returned in this array indicate the choices that the seller has when responding to the payment dispute. Once the seller has responded to the payment dispute, this field will no longer be shown, and instead, the &lt;strong&gt;sellerResponse&lt;/strong&gt; field will show the decision that the seller made.
     */
    private java.util.List<String> availableChoices;
    /**
     * This container is returned if the buyer is returning one or more line items in an order that is associated with the payment dispute, and that buyer has provided return shipping tracking information and/or a note about the return.
     */
    private InfoFromBuyer buyerProvided;
    /**
     * This is the eBay user ID of the buyer that initiated the payment dispute.
     */
    private String buyerUsername;
    /**
     * The timestamp in this field shows the date/time when the payment dispute was closed, so this field is only returned for payment disputes in the &lt;code&gt;CLOSED&lt;/code&gt; state.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String closedDate;
    /**
     * This container shows any evidence that has been provided by the seller to contest the payment dispute. Evidence may include shipment tracking information, proof of authentication documentation, image(s) to proof that an item is as described, or financial documentation/invoice.&lt;br&gt;&lt;br&gt;This container is only returned if the seller has provided at least one document used as evidence against the payment dispute.
     */
    private java.util.List<DisputeEvidence> evidence;
    /**
     * This container is returned if one or more evidence documents are being requested from the seller.
     */
    private java.util.List<EvidenceRequest> evidenceRequests;
    /**
     * This array is used to identify one or more order line items associated with the payment dispute. There will always be at least one &lt;b&gt;itemId&lt;/b&gt;/&lt;b&gt;lineItemId&lt;/b&gt; pair returned in this array.
     */
    private java.util.List<OrderLineItems> lineItems;
    /**
     * This array provide details about one or more monetary transactions that occur as part of a payment dispute. This array is only returned once one or more monetary transacations occur with a payment dispute.
     */
    private java.util.List<MonetaryTransaction> monetaryTransactions;
    /**
     * This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;This field is limited to 1000 characters.
     */
    private String note;
    /**
     * The timestamp in this field shows the date/time when the payment dispute was opened. This field is returned for payment disputes in all states.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String openDate;
    /**
     * This is the unique identifier of the order involved in the payment dispute.
     */
    private String orderId;
    /**
     * This is the unique identifier of the payment dispute. This is the same identifier that is passed in to the call URI. This identifier is automatically created by eBay once the payment dispute comes into the eBay system.
     */
    private String paymentDisputeId;
    /**
     * The enumeration value in this field gives the current status of the payment dispute. The status of a payment dispute partially determines other fields that are returned in the response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String paymentDisputeStatus;
    /**
     * The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reason;
    /**
     * This type is used by the &lt;strong&gt;resolution&lt;/strong&gt; container that is returned for payment disputes that have been resolved.
     */
    private PaymentDisputeOutcomeDetail resolution;
    /**
     * The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that currently require action by the seller, that same seller should look at the &lt;strong&gt;availableChoices&lt;/strong&gt; array to see the available actions.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String respondByDate;
    /**
     * This type is used by the payment dispute methods, and is relevant if the buyer will be returning the item to the seller.
     */
    private ReturnAddress returnAddress;
    /**
     * This integer value indicates the revision number of the payment dispute. Each time an action is taken against a payment dispute, this integer value increases by 1.
     */
    private Integer revision;
    /**
     * The enumeration value returned in this field indicates how the seller has responded to the payment dispute. The seller has the option of accepting the payment dispute and agreeing to issue a refund, accepting the payment dispute and agreeing to issue a refund as long as the buyer returns the item, or contesting the payment dispute. This field is returned as soon as the seller makes an initial decision on the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:SellerResponseEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String sellerResponse;
    /**
     * Instantiates a new {@link PaymentDispute} and sets the default values.
     */
    public PaymentDispute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentDispute}
     */
    @jakarta.annotation.Nonnull
    public static PaymentDispute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentDispute();
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
     * Gets the amount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getAmount() {
        return this.amount;
    }
    /**
     * Gets the availableChoices property value. The value(s) returned in this array indicate the choices that the seller has when responding to the payment dispute. Once the seller has responded to the payment dispute, this field will no longer be shown, and instead, the &lt;strong&gt;sellerResponse&lt;/strong&gt; field will show the decision that the seller made.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableChoices() {
        return this.availableChoices;
    }
    /**
     * Gets the buyerProvided property value. This container is returned if the buyer is returning one or more line items in an order that is associated with the payment dispute, and that buyer has provided return shipping tracking information and/or a note about the return.
     * @return a {@link InfoFromBuyer}
     */
    @jakarta.annotation.Nullable
    public InfoFromBuyer getBuyerProvided() {
        return this.buyerProvided;
    }
    /**
     * Gets the buyerUsername property value. This is the eBay user ID of the buyer that initiated the payment dispute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerUsername() {
        return this.buyerUsername;
    }
    /**
     * Gets the closedDate property value. The timestamp in this field shows the date/time when the payment dispute was closed, so this field is only returned for payment disputes in the &lt;code&gt;CLOSED&lt;/code&gt; state.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClosedDate() {
        return this.closedDate;
    }
    /**
     * Gets the evidence property value. This container shows any evidence that has been provided by the seller to contest the payment dispute. Evidence may include shipment tracking information, proof of authentication documentation, image(s) to proof that an item is as described, or financial documentation/invoice.&lt;br&gt;&lt;br&gt;This container is only returned if the seller has provided at least one document used as evidence against the payment dispute.
     * @return a {@link java.util.List<DisputeEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DisputeEvidence> getEvidence() {
        return this.evidence;
    }
    /**
     * Gets the evidenceRequests property value. This container is returned if one or more evidence documents are being requested from the seller.
     * @return a {@link java.util.List<EvidenceRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EvidenceRequest> getEvidenceRequests() {
        return this.evidenceRequests;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("availableChoices", (n) -> { this.setAvailableChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("buyerProvided", (n) -> { this.setBuyerProvided(n.getObjectValue(InfoFromBuyer::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerUsername", (n) -> { this.setBuyerUsername(n.getStringValue()); });
        deserializerMap.put("closedDate", (n) -> { this.setClosedDate(n.getStringValue()); });
        deserializerMap.put("evidence", (n) -> { this.setEvidence(n.getCollectionOfObjectValues(DisputeEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("evidenceRequests", (n) -> { this.setEvidenceRequests(n.getCollectionOfObjectValues(EvidenceRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(OrderLineItems::createFromDiscriminatorValue)); });
        deserializerMap.put("monetaryTransactions", (n) -> { this.setMonetaryTransactions(n.getCollectionOfObjectValues(MonetaryTransaction::createFromDiscriminatorValue)); });
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("openDate", (n) -> { this.setOpenDate(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("paymentDisputeId", (n) -> { this.setPaymentDisputeId(n.getStringValue()); });
        deserializerMap.put("paymentDisputeStatus", (n) -> { this.setPaymentDisputeStatus(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("resolution", (n) -> { this.setResolution(n.getObjectValue(PaymentDisputeOutcomeDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("respondByDate", (n) -> { this.setRespondByDate(n.getStringValue()); });
        deserializerMap.put("returnAddress", (n) -> { this.setReturnAddress(n.getObjectValue(ReturnAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getIntegerValue()); });
        deserializerMap.put("sellerResponse", (n) -> { this.setSellerResponse(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineItems property value. This array is used to identify one or more order line items associated with the payment dispute. There will always be at least one &lt;b&gt;itemId&lt;/b&gt;/&lt;b&gt;lineItemId&lt;/b&gt; pair returned in this array.
     * @return a {@link java.util.List<OrderLineItems>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderLineItems> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the monetaryTransactions property value. This array provide details about one or more monetary transactions that occur as part of a payment dispute. This array is only returned once one or more monetary transacations occur with a payment dispute.
     * @return a {@link java.util.List<MonetaryTransaction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MonetaryTransaction> getMonetaryTransactions() {
        return this.monetaryTransactions;
    }
    /**
     * Gets the note property value. This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;This field is limited to 1000 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.note;
    }
    /**
     * Gets the openDate property value. The timestamp in this field shows the date/time when the payment dispute was opened. This field is returned for payment disputes in all states.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOpenDate() {
        return this.openDate;
    }
    /**
     * Gets the orderId property value. This is the unique identifier of the order involved in the payment dispute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the paymentDisputeId property value. This is the unique identifier of the payment dispute. This is the same identifier that is passed in to the call URI. This identifier is automatically created by eBay once the payment dispute comes into the eBay system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDisputeId() {
        return this.paymentDisputeId;
    }
    /**
     * Gets the paymentDisputeStatus property value. The enumeration value in this field gives the current status of the payment dispute. The status of a payment dispute partially determines other fields that are returned in the response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDisputeStatus() {
        return this.paymentDisputeStatus;
    }
    /**
     * Gets the reason property value. The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the resolution property value. This type is used by the &lt;strong&gt;resolution&lt;/strong&gt; container that is returned for payment disputes that have been resolved.
     * @return a {@link PaymentDisputeOutcomeDetail}
     */
    @jakarta.annotation.Nullable
    public PaymentDisputeOutcomeDetail getResolution() {
        return this.resolution;
    }
    /**
     * Gets the respondByDate property value. The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that currently require action by the seller, that same seller should look at the &lt;strong&gt;availableChoices&lt;/strong&gt; array to see the available actions.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRespondByDate() {
        return this.respondByDate;
    }
    /**
     * Gets the returnAddress property value. This type is used by the payment dispute methods, and is relevant if the buyer will be returning the item to the seller.
     * @return a {@link ReturnAddress}
     */
    @jakarta.annotation.Nullable
    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }
    /**
     * Gets the revision property value. This integer value indicates the revision number of the payment dispute. Each time an action is taken against a payment dispute, this integer value increases by 1.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * Gets the sellerResponse property value. The enumeration value returned in this field indicates how the seller has responded to the payment dispute. The seller has the option of accepting the payment dispute and agreeing to issue a refund, accepting the payment dispute and agreeing to issue a refund as long as the buyer returns the item, or contesting the payment dispute. This field is returned as soon as the seller makes an initial decision on the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:SellerResponseEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerResponse() {
        return this.sellerResponse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeCollectionOfPrimitiveValues("availableChoices", this.getAvailableChoices());
        writer.writeObjectValue("buyerProvided", this.getBuyerProvided());
        writer.writeStringValue("buyerUsername", this.getBuyerUsername());
        writer.writeStringValue("closedDate", this.getClosedDate());
        writer.writeCollectionOfObjectValues("evidence", this.getEvidence());
        writer.writeCollectionOfObjectValues("evidenceRequests", this.getEvidenceRequests());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeCollectionOfObjectValues("monetaryTransactions", this.getMonetaryTransactions());
        writer.writeStringValue("note", this.getNote());
        writer.writeStringValue("openDate", this.getOpenDate());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("paymentDisputeId", this.getPaymentDisputeId());
        writer.writeStringValue("paymentDisputeStatus", this.getPaymentDisputeStatus());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("resolution", this.getResolution());
        writer.writeStringValue("respondByDate", this.getRespondByDate());
        writer.writeObjectValue("returnAddress", this.getReturnAddress());
        writer.writeIntegerValue("revision", this.getRevision());
        writer.writeStringValue("sellerResponse", this.getSellerResponse());
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
     * Sets the amount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.amount = value;
    }
    /**
     * Sets the availableChoices property value. The value(s) returned in this array indicate the choices that the seller has when responding to the payment dispute. Once the seller has responded to the payment dispute, this field will no longer be shown, and instead, the &lt;strong&gt;sellerResponse&lt;/strong&gt; field will show the decision that the seller made.
     * @param value Value to set for the availableChoices property.
     */
    public void setAvailableChoices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableChoices = value;
    }
    /**
     * Sets the buyerProvided property value. This container is returned if the buyer is returning one or more line items in an order that is associated with the payment dispute, and that buyer has provided return shipping tracking information and/or a note about the return.
     * @param value Value to set for the buyerProvided property.
     */
    public void setBuyerProvided(@jakarta.annotation.Nullable final InfoFromBuyer value) {
        this.buyerProvided = value;
    }
    /**
     * Sets the buyerUsername property value. This is the eBay user ID of the buyer that initiated the payment dispute.
     * @param value Value to set for the buyerUsername property.
     */
    public void setBuyerUsername(@jakarta.annotation.Nullable final String value) {
        this.buyerUsername = value;
    }
    /**
     * Sets the closedDate property value. The timestamp in this field shows the date/time when the payment dispute was closed, so this field is only returned for payment disputes in the &lt;code&gt;CLOSED&lt;/code&gt; state.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the closedDate property.
     */
    public void setClosedDate(@jakarta.annotation.Nullable final String value) {
        this.closedDate = value;
    }
    /**
     * Sets the evidence property value. This container shows any evidence that has been provided by the seller to contest the payment dispute. Evidence may include shipment tracking information, proof of authentication documentation, image(s) to proof that an item is as described, or financial documentation/invoice.&lt;br&gt;&lt;br&gt;This container is only returned if the seller has provided at least one document used as evidence against the payment dispute.
     * @param value Value to set for the evidence property.
     */
    public void setEvidence(@jakarta.annotation.Nullable final java.util.List<DisputeEvidence> value) {
        this.evidence = value;
    }
    /**
     * Sets the evidenceRequests property value. This container is returned if one or more evidence documents are being requested from the seller.
     * @param value Value to set for the evidenceRequests property.
     */
    public void setEvidenceRequests(@jakarta.annotation.Nullable final java.util.List<EvidenceRequest> value) {
        this.evidenceRequests = value;
    }
    /**
     * Sets the lineItems property value. This array is used to identify one or more order line items associated with the payment dispute. There will always be at least one &lt;b&gt;itemId&lt;/b&gt;/&lt;b&gt;lineItemId&lt;/b&gt; pair returned in this array.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<OrderLineItems> value) {
        this.lineItems = value;
    }
    /**
     * Sets the monetaryTransactions property value. This array provide details about one or more monetary transactions that occur as part of a payment dispute. This array is only returned once one or more monetary transacations occur with a payment dispute.
     * @param value Value to set for the monetaryTransactions property.
     */
    public void setMonetaryTransactions(@jakarta.annotation.Nullable final java.util.List<MonetaryTransaction> value) {
        this.monetaryTransactions = value;
    }
    /**
     * Sets the note property value. This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;This field is limited to 1000 characters.
     * @param value Value to set for the note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the openDate property value. The timestamp in this field shows the date/time when the payment dispute was opened. This field is returned for payment disputes in all states.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the openDate property.
     */
    public void setOpenDate(@jakarta.annotation.Nullable final String value) {
        this.openDate = value;
    }
    /**
     * Sets the orderId property value. This is the unique identifier of the order involved in the payment dispute.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the paymentDisputeId property value. This is the unique identifier of the payment dispute. This is the same identifier that is passed in to the call URI. This identifier is automatically created by eBay once the payment dispute comes into the eBay system.
     * @param value Value to set for the paymentDisputeId property.
     */
    public void setPaymentDisputeId(@jakarta.annotation.Nullable final String value) {
        this.paymentDisputeId = value;
    }
    /**
     * Sets the paymentDisputeStatus property value. The enumeration value in this field gives the current status of the payment dispute. The status of a payment dispute partially determines other fields that are returned in the response. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the paymentDisputeStatus property.
     */
    public void setPaymentDisputeStatus(@jakarta.annotation.Nullable final String value) {
        this.paymentDisputeStatus = value;
    }
    /**
     * Sets the reason property value. The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the resolution property value. This type is used by the &lt;strong&gt;resolution&lt;/strong&gt; container that is returned for payment disputes that have been resolved.
     * @param value Value to set for the resolution property.
     */
    public void setResolution(@jakarta.annotation.Nullable final PaymentDisputeOutcomeDetail value) {
        this.resolution = value;
    }
    /**
     * Sets the respondByDate property value. The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that currently require action by the seller, that same seller should look at the &lt;strong&gt;availableChoices&lt;/strong&gt; array to see the available actions.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the respondByDate property.
     */
    public void setRespondByDate(@jakarta.annotation.Nullable final String value) {
        this.respondByDate = value;
    }
    /**
     * Sets the returnAddress property value. This type is used by the payment dispute methods, and is relevant if the buyer will be returning the item to the seller.
     * @param value Value to set for the returnAddress property.
     */
    public void setReturnAddress(@jakarta.annotation.Nullable final ReturnAddress value) {
        this.returnAddress = value;
    }
    /**
     * Sets the revision property value. This integer value indicates the revision number of the payment dispute. Each time an action is taken against a payment dispute, this integer value increases by 1.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final Integer value) {
        this.revision = value;
    }
    /**
     * Sets the sellerResponse property value. The enumeration value returned in this field indicates how the seller has responded to the payment dispute. The seller has the option of accepting the payment dispute and agreeing to issue a refund, accepting the payment dispute and agreeing to issue a refund as long as the buyer returns the item, or contesting the payment dispute. This field is returned as soon as the seller makes an initial decision on the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:SellerResponseEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the sellerResponse property.
     */
    public void setSellerResponse(@jakarta.annotation.Nullable final String value) {
        this.sellerResponse = value;
    }
}
