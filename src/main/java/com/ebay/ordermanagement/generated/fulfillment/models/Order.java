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
 * This type contains the details of an order, including information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Order implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container consists of information about the order&apos;s buyer. At this time, only the buyer&apos;s eBay user ID is returned, but it&apos;s possible that more buyer information can be added to this container in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private Buyer buyer;
    /**
     * This field contains any comments that the buyer left for the seller about the order during the checkout process. This field is only returned if a buyer left comments at checkout time. 
     */
    private String buyerCheckoutNotes;
    /**
     * This container consists of order cancellation information if a cancel request has been made. This container is always returned, and if no cancel request has been made, the &lt;strong&gt;cancelState&lt;/strong&gt; field is returned with a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt;, and an empty &lt;strong&gt;cancelRequests&lt;/strong&gt; array is also returned.
     */
    private CancelStatus cancelStatus;
    /**
     * The date and time that the order was created. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String creationDate;
    /**
     * This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that eBay will collect tax (US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK and EU countries,) for at least one line item in the order, and remit the tax to the taxing authority of the buyer&apos;s residence. If this field is returned, the seller should search for one or more &lt;strong&gt;ebayCollectAndRemitTaxes&lt;/strong&gt; containers at the line item level to get more information about the type of tax and the amount.
     */
    private Boolean ebayCollectAndRemitTax;
    /**
     * This array contains a list of one or more &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-shipping_fulfillment-getshippingfulfillment&quot; target=&quot;_blank&quot;&gt;getShippingFulfillment&lt;/a&gt; call URIs that can be used to retrieve shipping fulfillments that have been set up for the order.
     */
    private java.util.List<String> fulfillmentHrefs;
    /**
     * This container consists of a set of specifications for fulfilling the order, including the type of fulfillment, shipping carrier and service, shipping address, and estimated delivery window. These instructions are derived from the buyer&apos;s and seller&apos;s eBay account preferences, the listing parameters, and the buyer&apos;s checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although this container is presented as an array, it currently returns only one set of fulfillment specifications. Additional array members will be supported in future functionality.&lt;/span&gt;
     */
    private java.util.List<FulfillmentStartInstruction> fulfillmentStartInstructions;
    /**
     * The date and time that the order was last modified. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String lastModifiedDate;
    /**
     * This array contains the details for all line items that comprise the order.
     */
    private java.util.List<LineItem> lineItems;
    /**
     * The degree to which fulfillment of the order is complete. See the &lt;strong&gt;OrderFulfillmentStatus&lt;/strong&gt; type definition for more information about each possible fulfillment state.
     */
    private OrderFulfillmentStatus orderFulfillmentStatus;
    /**
     * The unique identifier of the order. This field is always returned.
     */
    private String orderId;
    /**
     * The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the &lt;strong&gt;OrderPaymentStatusEnum&lt;/strong&gt; type definition for more information about each possible payment/refund state.
     */
    private OrderPaymentStatusEnum orderPaymentStatus;
    /**
     * This container consists of detailed payment information for the order, including buyer payment for the order, refund information (if applicable), and seller payment holds (if applicable).
     */
    private PaymentSummary paymentSummary;
    /**
     * This container consists of a summary of cumulative costs and charges for all line items of an order, including item price, price adjustments, sales taxes, delivery costs, and order discounts.
     */
    private PricingSummary pricingSummary;
    /**
     * This container is returned for orders that are eligible for eBay&apos;s Authenticity Guarantee service. The seller ships Authenticity Guarantee service items to the authentication partner instead of the buyer. The authenticator address is found in the &lt;code&gt;fulfillmentStartInstructions.shippingStep.shipTo&lt;/code&gt; container. If the item is successfully authenticated, the authenticator will ship the item to the buyer.
     */
    private Program program;
    /**
     * An eBay-generated identifier that is used to identify and manage orders through the Selling Manager and Selling Manager Pro tools. This order identifier can also be found on the Orders grid page and in the Sales Record pages in Seller Hub. A &lt;strong&gt;salesRecordReference&lt;/strong&gt; number is only generated and returned at the order level, and not at the order line item level.&lt;br&gt;&lt;br&gt; In cases where the seller does not have a Selling Manager or Selling Manager Pro subscription nor access to Seller Hub, this field may not be returned.
     */
    private String salesRecordReference;
    /**
     * The unique eBay user ID of the seller who sold the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String sellerId;
    /**
     * This is the cumulative base amount used to calculate the final value fees for each order. The final value fees are deducted from the seller payout associated with the order. Final value fees are calculated as a percentage of order cost (item cost + shipping cost) and the percentage rate can vary by eBay category. 
     */
    private Amount totalFeeBasisAmount;
    /**
     * This is the cumulative fees accrued for the order and deducted from the seller payout.
     */
    private Amount totalMarketplaceFee;
    /**
     * Instantiates a new {@link Order} and sets the default values.
     */
    public Order() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Order}
     */
    @jakarta.annotation.Nonnull
    public static Order createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Order();
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
     * Gets the buyer property value. This container consists of information about the order&apos;s buyer. At this time, only the buyer&apos;s eBay user ID is returned, but it&apos;s possible that more buyer information can be added to this container in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link Buyer}
     */
    @jakarta.annotation.Nullable
    public Buyer getBuyer() {
        return this.buyer;
    }
    /**
     * Gets the buyerCheckoutNotes property value. This field contains any comments that the buyer left for the seller about the order during the checkout process. This field is only returned if a buyer left comments at checkout time. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerCheckoutNotes() {
        return this.buyerCheckoutNotes;
    }
    /**
     * Gets the cancelStatus property value. This container consists of order cancellation information if a cancel request has been made. This container is always returned, and if no cancel request has been made, the &lt;strong&gt;cancelState&lt;/strong&gt; field is returned with a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt;, and an empty &lt;strong&gt;cancelRequests&lt;/strong&gt; array is also returned.
     * @return a {@link CancelStatus}
     */
    @jakarta.annotation.Nullable
    public CancelStatus getCancelStatus() {
        return this.cancelStatus;
    }
    /**
     * Gets the creationDate property value. The date and time that the order was created. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the ebayCollectAndRemitTax property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that eBay will collect tax (US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK and EU countries,) for at least one line item in the order, and remit the tax to the taxing authority of the buyer&apos;s residence. If this field is returned, the seller should search for one or more &lt;strong&gt;ebayCollectAndRemitTaxes&lt;/strong&gt; containers at the line item level to get more information about the type of tax and the amount.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayCollectAndRemitTax() {
        return this.ebayCollectAndRemitTax;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getObjectValue(Buyer::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerCheckoutNotes", (n) -> { this.setBuyerCheckoutNotes(n.getStringValue()); });
        deserializerMap.put("cancelStatus", (n) -> { this.setCancelStatus(n.getObjectValue(CancelStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("ebayCollectAndRemitTax", (n) -> { this.setEbayCollectAndRemitTax(n.getBooleanValue()); });
        deserializerMap.put("fulfillmentHrefs", (n) -> { this.setFulfillmentHrefs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("fulfillmentStartInstructions", (n) -> { this.setFulfillmentStartInstructions(n.getCollectionOfObjectValues(FulfillmentStartInstruction::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getStringValue()); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(LineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("orderFulfillmentStatus", (n) -> { this.setOrderFulfillmentStatus(n.getEnumValue(OrderFulfillmentStatus::forValue)); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("orderPaymentStatus", (n) -> { this.setOrderPaymentStatus(n.getEnumValue(OrderPaymentStatusEnum::forValue)); });
        deserializerMap.put("paymentSummary", (n) -> { this.setPaymentSummary(n.getObjectValue(PaymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("pricingSummary", (n) -> { this.setPricingSummary(n.getObjectValue(PricingSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("program", (n) -> { this.setProgram(n.getObjectValue(Program::createFromDiscriminatorValue)); });
        deserializerMap.put("salesRecordReference", (n) -> { this.setSalesRecordReference(n.getStringValue()); });
        deserializerMap.put("sellerId", (n) -> { this.setSellerId(n.getStringValue()); });
        deserializerMap.put("totalFeeBasisAmount", (n) -> { this.setTotalFeeBasisAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalMarketplaceFee", (n) -> { this.setTotalMarketplaceFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentHrefs property value. This array contains a list of one or more &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-shipping_fulfillment-getshippingfulfillment&quot; target=&quot;_blank&quot;&gt;getShippingFulfillment&lt;/a&gt; call URIs that can be used to retrieve shipping fulfillments that have been set up for the order.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFulfillmentHrefs() {
        return this.fulfillmentHrefs;
    }
    /**
     * Gets the fulfillmentStartInstructions property value. This container consists of a set of specifications for fulfilling the order, including the type of fulfillment, shipping carrier and service, shipping address, and estimated delivery window. These instructions are derived from the buyer&apos;s and seller&apos;s eBay account preferences, the listing parameters, and the buyer&apos;s checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although this container is presented as an array, it currently returns only one set of fulfillment specifications. Additional array members will be supported in future functionality.&lt;/span&gt;
     * @return a {@link java.util.List<FulfillmentStartInstruction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FulfillmentStartInstruction> getFulfillmentStartInstructions() {
        return this.fulfillmentStartInstructions;
    }
    /**
     * Gets the lastModifiedDate property value. The date and time that the order was last modified. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Gets the lineItems property value. This array contains the details for all line items that comprise the order.
     * @return a {@link java.util.List<LineItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LineItem> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the orderFulfillmentStatus property value. The degree to which fulfillment of the order is complete. See the &lt;strong&gt;OrderFulfillmentStatus&lt;/strong&gt; type definition for more information about each possible fulfillment state.
     * @return a {@link OrderFulfillmentStatus}
     */
    @jakarta.annotation.Nullable
    public OrderFulfillmentStatus getOrderFulfillmentStatus() {
        return this.orderFulfillmentStatus;
    }
    /**
     * Gets the orderId property value. The unique identifier of the order. This field is always returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the orderPaymentStatus property value. The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the &lt;strong&gt;OrderPaymentStatusEnum&lt;/strong&gt; type definition for more information about each possible payment/refund state.
     * @return a {@link OrderPaymentStatusEnum}
     */
    @jakarta.annotation.Nullable
    public OrderPaymentStatusEnum getOrderPaymentStatus() {
        return this.orderPaymentStatus;
    }
    /**
     * Gets the paymentSummary property value. This container consists of detailed payment information for the order, including buyer payment for the order, refund information (if applicable), and seller payment holds (if applicable).
     * @return a {@link PaymentSummary}
     */
    @jakarta.annotation.Nullable
    public PaymentSummary getPaymentSummary() {
        return this.paymentSummary;
    }
    /**
     * Gets the pricingSummary property value. This container consists of a summary of cumulative costs and charges for all line items of an order, including item price, price adjustments, sales taxes, delivery costs, and order discounts.
     * @return a {@link PricingSummary}
     */
    @jakarta.annotation.Nullable
    public PricingSummary getPricingSummary() {
        return this.pricingSummary;
    }
    /**
     * Gets the program property value. This container is returned for orders that are eligible for eBay&apos;s Authenticity Guarantee service. The seller ships Authenticity Guarantee service items to the authentication partner instead of the buyer. The authenticator address is found in the &lt;code&gt;fulfillmentStartInstructions.shippingStep.shipTo&lt;/code&gt; container. If the item is successfully authenticated, the authenticator will ship the item to the buyer.
     * @return a {@link Program}
     */
    @jakarta.annotation.Nullable
    public Program getProgram() {
        return this.program;
    }
    /**
     * Gets the salesRecordReference property value. An eBay-generated identifier that is used to identify and manage orders through the Selling Manager and Selling Manager Pro tools. This order identifier can also be found on the Orders grid page and in the Sales Record pages in Seller Hub. A &lt;strong&gt;salesRecordReference&lt;/strong&gt; number is only generated and returned at the order level, and not at the order line item level.&lt;br&gt;&lt;br&gt; In cases where the seller does not have a Selling Manager or Selling Manager Pro subscription nor access to Seller Hub, this field may not be returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesRecordReference() {
        return this.salesRecordReference;
    }
    /**
     * Gets the sellerId property value. The unique eBay user ID of the seller who sold the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerId() {
        return this.sellerId;
    }
    /**
     * Gets the totalFeeBasisAmount property value. This is the cumulative base amount used to calculate the final value fees for each order. The final value fees are deducted from the seller payout associated with the order. Final value fees are calculated as a percentage of order cost (item cost + shipping cost) and the percentage rate can vary by eBay category. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFeeBasisAmount() {
        return this.totalFeeBasisAmount;
    }
    /**
     * Gets the totalMarketplaceFee property value. This is the cumulative fees accrued for the order and deducted from the seller payout.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalMarketplaceFee() {
        return this.totalMarketplaceFee;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buyer", this.getBuyer());
        writer.writeStringValue("buyerCheckoutNotes", this.getBuyerCheckoutNotes());
        writer.writeObjectValue("cancelStatus", this.getCancelStatus());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeBooleanValue("ebayCollectAndRemitTax", this.getEbayCollectAndRemitTax());
        writer.writeCollectionOfPrimitiveValues("fulfillmentHrefs", this.getFulfillmentHrefs());
        writer.writeCollectionOfObjectValues("fulfillmentStartInstructions", this.getFulfillmentStartInstructions());
        writer.writeStringValue("lastModifiedDate", this.getLastModifiedDate());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeEnumValue("orderFulfillmentStatus", this.getOrderFulfillmentStatus());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeEnumValue("orderPaymentStatus", this.getOrderPaymentStatus());
        writer.writeObjectValue("paymentSummary", this.getPaymentSummary());
        writer.writeObjectValue("pricingSummary", this.getPricingSummary());
        writer.writeObjectValue("program", this.getProgram());
        writer.writeStringValue("salesRecordReference", this.getSalesRecordReference());
        writer.writeStringValue("sellerId", this.getSellerId());
        writer.writeObjectValue("totalFeeBasisAmount", this.getTotalFeeBasisAmount());
        writer.writeObjectValue("totalMarketplaceFee", this.getTotalMarketplaceFee());
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
     * Sets the buyer property value. This container consists of information about the order&apos;s buyer. At this time, only the buyer&apos;s eBay user ID is returned, but it&apos;s possible that more buyer information can be added to this container in the future.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final Buyer value) {
        this.buyer = value;
    }
    /**
     * Sets the buyerCheckoutNotes property value. This field contains any comments that the buyer left for the seller about the order during the checkout process. This field is only returned if a buyer left comments at checkout time. 
     * @param value Value to set for the buyerCheckoutNotes property.
     */
    public void setBuyerCheckoutNotes(@jakarta.annotation.Nullable final String value) {
        this.buyerCheckoutNotes = value;
    }
    /**
     * Sets the cancelStatus property value. This container consists of order cancellation information if a cancel request has been made. This container is always returned, and if no cancel request has been made, the &lt;strong&gt;cancelState&lt;/strong&gt; field is returned with a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt;, and an empty &lt;strong&gt;cancelRequests&lt;/strong&gt; array is also returned.
     * @param value Value to set for the cancelStatus property.
     */
    public void setCancelStatus(@jakarta.annotation.Nullable final CancelStatus value) {
        this.cancelStatus = value;
    }
    /**
     * Sets the creationDate property value. The date and time that the order was created. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the ebayCollectAndRemitTax property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that eBay will collect tax (US state-mandated sales tax, Federal and Provincial Sales Tax in Canada, &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand, and VAT collected for UK and EU countries,) for at least one line item in the order, and remit the tax to the taxing authority of the buyer&apos;s residence. If this field is returned, the seller should search for one or more &lt;strong&gt;ebayCollectAndRemitTaxes&lt;/strong&gt; containers at the line item level to get more information about the type of tax and the amount.
     * @param value Value to set for the ebayCollectAndRemitTax property.
     */
    public void setEbayCollectAndRemitTax(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayCollectAndRemitTax = value;
    }
    /**
     * Sets the fulfillmentHrefs property value. This array contains a list of one or more &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-shipping_fulfillment-getshippingfulfillment&quot; target=&quot;_blank&quot;&gt;getShippingFulfillment&lt;/a&gt; call URIs that can be used to retrieve shipping fulfillments that have been set up for the order.
     * @param value Value to set for the fulfillmentHrefs property.
     */
    public void setFulfillmentHrefs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fulfillmentHrefs = value;
    }
    /**
     * Sets the fulfillmentStartInstructions property value. This container consists of a set of specifications for fulfilling the order, including the type of fulfillment, shipping carrier and service, shipping address, and estimated delivery window. These instructions are derived from the buyer&apos;s and seller&apos;s eBay account preferences, the listing parameters, and the buyer&apos;s checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although this container is presented as an array, it currently returns only one set of fulfillment specifications. Additional array members will be supported in future functionality.&lt;/span&gt;
     * @param value Value to set for the fulfillmentStartInstructions property.
     */
    public void setFulfillmentStartInstructions(@jakarta.annotation.Nullable final java.util.List<FulfillmentStartInstruction> value) {
        this.fulfillmentStartInstructions = value;
    }
    /**
     * Sets the lastModifiedDate property value. The date and time that the order was last modified. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the lastModifiedDate property.
     */
    public void setLastModifiedDate(@jakarta.annotation.Nullable final String value) {
        this.lastModifiedDate = value;
    }
    /**
     * Sets the lineItems property value. This array contains the details for all line items that comprise the order.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<LineItem> value) {
        this.lineItems = value;
    }
    /**
     * Sets the orderFulfillmentStatus property value. The degree to which fulfillment of the order is complete. See the &lt;strong&gt;OrderFulfillmentStatus&lt;/strong&gt; type definition for more information about each possible fulfillment state.
     * @param value Value to set for the orderFulfillmentStatus property.
     */
    public void setOrderFulfillmentStatus(@jakarta.annotation.Nullable final OrderFulfillmentStatus value) {
        this.orderFulfillmentStatus = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the order. This field is always returned.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the orderPaymentStatus property value. The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the &lt;strong&gt;OrderPaymentStatusEnum&lt;/strong&gt; type definition for more information about each possible payment/refund state.
     * @param value Value to set for the orderPaymentStatus property.
     */
    public void setOrderPaymentStatus(@jakarta.annotation.Nullable final OrderPaymentStatusEnum value) {
        this.orderPaymentStatus = value;
    }
    /**
     * Sets the paymentSummary property value. This container consists of detailed payment information for the order, including buyer payment for the order, refund information (if applicable), and seller payment holds (if applicable).
     * @param value Value to set for the paymentSummary property.
     */
    public void setPaymentSummary(@jakarta.annotation.Nullable final PaymentSummary value) {
        this.paymentSummary = value;
    }
    /**
     * Sets the pricingSummary property value. This container consists of a summary of cumulative costs and charges for all line items of an order, including item price, price adjustments, sales taxes, delivery costs, and order discounts.
     * @param value Value to set for the pricingSummary property.
     */
    public void setPricingSummary(@jakarta.annotation.Nullable final PricingSummary value) {
        this.pricingSummary = value;
    }
    /**
     * Sets the program property value. This container is returned for orders that are eligible for eBay&apos;s Authenticity Guarantee service. The seller ships Authenticity Guarantee service items to the authentication partner instead of the buyer. The authenticator address is found in the &lt;code&gt;fulfillmentStartInstructions.shippingStep.shipTo&lt;/code&gt; container. If the item is successfully authenticated, the authenticator will ship the item to the buyer.
     * @param value Value to set for the program property.
     */
    public void setProgram(@jakarta.annotation.Nullable final Program value) {
        this.program = value;
    }
    /**
     * Sets the salesRecordReference property value. An eBay-generated identifier that is used to identify and manage orders through the Selling Manager and Selling Manager Pro tools. This order identifier can also be found on the Orders grid page and in the Sales Record pages in Seller Hub. A &lt;strong&gt;salesRecordReference&lt;/strong&gt; number is only generated and returned at the order level, and not at the order line item level.&lt;br&gt;&lt;br&gt; In cases where the seller does not have a Selling Manager or Selling Manager Pro subscription nor access to Seller Hub, this field may not be returned.
     * @param value Value to set for the salesRecordReference property.
     */
    public void setSalesRecordReference(@jakarta.annotation.Nullable final String value) {
        this.salesRecordReference = value;
    }
    /**
     * Sets the sellerId property value. The unique eBay user ID of the seller who sold the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the sellerId property.
     */
    public void setSellerId(@jakarta.annotation.Nullable final String value) {
        this.sellerId = value;
    }
    /**
     * Sets the totalFeeBasisAmount property value. This is the cumulative base amount used to calculate the final value fees for each order. The final value fees are deducted from the seller payout associated with the order. Final value fees are calculated as a percentage of order cost (item cost + shipping cost) and the percentage rate can vary by eBay category. 
     * @param value Value to set for the totalFeeBasisAmount property.
     */
    public void setTotalFeeBasisAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalFeeBasisAmount = value;
    }
    /**
     * Sets the totalMarketplaceFee property value. This is the cumulative fees accrued for the order and deducted from the seller payout.
     * @param value Value to set for the totalMarketplaceFee property.
     */
    public void setTotalMarketplaceFee(@jakarta.annotation.Nullable final Amount value) {
        this.totalMarketplaceFee = value;
    }
}
