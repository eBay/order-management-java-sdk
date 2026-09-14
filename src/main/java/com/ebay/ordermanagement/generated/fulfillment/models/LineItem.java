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
 * This type contains the details of each line item in an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LineItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains information about one or more sales promotions or discounts applied to the line item. It is always returned, but will be returned as an empty array if no special sales promotions or discounts apply to the order line item.
     */
    private java.util.List<AppliedPromotion> appliedPromotions;
    /**
     * This array is only returned for a Parts &amp; Accessory item and identifies the buyer&apos;s motor vehicle that is compatible with the part or accessory.
     */
    private java.util.List<Property> compatibilityProperties;
    /**
     * This container consists of a breakdown of all costs associated with the fulfillment of the line item.
     */
    private DeliveryCost deliveryCost;
    /**
     * The cost of the line item after applying any discounts. This container is only returned if the order line item was discounted through a promotion.
     */
    private Amount discountedLineItemCost;
    /**
     * This container will be returned if the order line item is subject to a &apos;Collect and Remit&apos; tax that eBay will collect and remit to the proper taxing authority on the buyer&apos;s behalf.&lt;br&gt;&lt;br&gt;&apos;Collect and Remit&apos; tax includes:&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;The amount of this tax is shown in the &lt;strong&gt;amount&lt;/strong&gt; field, and the type of tax is shown in the &lt;strong&gt;taxType&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;EBay will display the tax type and amount during checkout in accordance with the buyer&apos;s address, and handle collection and remittance of the tax without requiring the seller to take any action.
     */
    private java.util.List<EbayCollectAndRemitTax> ebayCollectAndRemitTaxes;
    /**
     * This container consists of a breakdown of costs that are collected by eBay from the buyer for this order. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, this container is returned only if eBay is directly charging the buyer for eBay shipping.&lt;/span&gt;
     */
    private EbayCollectedCharges ebayCollectedCharges;
    /**
     * This container consists of information that is needed by the seller to send a digital gift card to the buyer or recipient of the digital gift card. This container is only returned and applicable for digital gift card line items.
     */
    private GiftDetails giftDetails;
    /**
     * This container field describes the physical location of the order line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi&amp;#8209;Warehouse Program, this container will return the location details of the fulfillment center closest to the buyer.&lt;/span&gt;
     */
    private ItemLocation itemLocation;
    /**
     * The eBay-generated legacy listing item ID of the listing. Note that the unique identifier of a listing in REST-based APIs is called the &lt;strong&gt;listingId&lt;/strong&gt; instead.
     */
    private String legacyItemId;
    /**
     * The unique identifier of a single variation within a multiple-variation listing. This field is only returned if the line item purchased was from a multiple-variation listing.
     */
    private String legacyVariationId;
    /**
     * The selling price of the line item before applying any discounts. The value of this field is calculated by multiplying the single unit price by the number of units purchased (value of the &lt;strong&gt;quantity&lt;/strong&gt; field).
     */
    private Amount lineItemCost;
    /**
     * This container consists of information related to shipping dates and expectations, including the &apos;ship-by date&apos; and expected delivery windows that are based on the seller&apos;s stated handling time and the shipping service option that will be used. These fields provide guidance on making sure expected delivery dates are made, whether the order is an &lt;em&gt;eBay Guaranteed Delivery&lt;/em&gt; order or a non-guaranteed delivery order.
     */
    private LineItemFulfillmentInstructions lineItemFulfillmentInstructions;
    /**
     * This enumeration value indicates the current fulfillment status of the line item.
     */
    private LineItemFulfillmentStatusEnum lineItemFulfillmentStatus;
    /**
     * This is the unique identifier of an eBay order line item. This field is created as soon as there is a commitment to buy from the seller.
     */
    private String lineItemId;
    /**
     * An array of one or more line items related to the corresponding order, but not a part of that order. Details include the order ID, line item ID and title of the linked line item, the seller of that item, item specifics, estimated delivery times, and shipment tracking (if available).
     */
    private java.util.List<LinkedOrderLineItem> linkedOrderLineItems;
    /**
     * The unique identifier of the eBay marketplace where the line item was listed.
     */
    private MarketplaceIdEnum listingMarketplaceId;
    /**
     * Contains information about the eBay programs, if any, under which the line item was listed.
     */
    private LineItemProperties properties;
    /**
     * The unique identifier of the eBay marketplace where the line item was listed. Often, the &lt;strong&gt;listingMarketplaceId&lt;/strong&gt; and the &lt;strong&gt;purchaseMarketplaceId&lt;/strong&gt; identifier are the same, but there are occasions when an item will surface on multiple eBay marketplaces.
     */
    private MarketplaceIdEnum purchaseMarketplaceId;
    /**
     * The number of units of the line item in the order. These are represented as a group by a single &lt;strong&gt;lineItemId&lt;/strong&gt;.
     */
    private Integer quantity;
    /**
     * This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     */
    private java.util.List<LineItemRefund> refunds;
    /**
     * Seller-defined Stock-Keeping Unit (SKU). This inventory identifier must be unique within the seller&apos;s eBay inventory. SKUs are optional when listing in the legacy Trading API system, but SKUs are required when listing items through the Inventory API model.
     */
    private String sku;
    /**
     * The eBay listing type of the line item. The most common listing types are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE&lt;/code&gt;.
     */
    private SoldFormatEnum soldFormat;
    /**
     * Contains a list of taxes applied to the line item, if any. This array is always returned, but will be returned as empty if no taxes are applicable to the line item.
     */
    private java.util.List<Tax> taxes;
    /**
     * The title of the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     */
    private String title;
    /**
     * This is the total price that the buyer must pay for the line item after all costs (item cost, delivery cost, taxes) are added, minus any discounts and/or promotions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Amount total;
    /**
     * An array of aspect name-value pairs that identifies the specific variation of a multi-variation listing. This array can contain multiple name-value pairs, such as &lt;code&gt;color:blue&lt;/code&gt; and &lt;code&gt;size:large&lt;/code&gt;, and will only be returned for orders created from a multiple-variation listing.
     */
    private java.util.List<NameValuePair> variationAspects;
    /**
     * Instantiates a new {@link LineItem} and sets the default values.
     */
    public LineItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LineItem}
     */
    @jakarta.annotation.Nonnull
    public static LineItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LineItem();
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
     * Gets the appliedPromotions property value. This array contains information about one or more sales promotions or discounts applied to the line item. It is always returned, but will be returned as an empty array if no special sales promotions or discounts apply to the order line item.
     * @return a {@link java.util.List<AppliedPromotion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedPromotion> getAppliedPromotions() {
        return this.appliedPromotions;
    }
    /**
     * Gets the compatibilityProperties property value. This array is only returned for a Parts &amp; Accessory item and identifies the buyer&apos;s motor vehicle that is compatible with the part or accessory.
     * @return a {@link java.util.List<Property>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Property> getCompatibilityProperties() {
        return this.compatibilityProperties;
    }
    /**
     * Gets the deliveryCost property value. This container consists of a breakdown of all costs associated with the fulfillment of the line item.
     * @return a {@link DeliveryCost}
     */
    @jakarta.annotation.Nullable
    public DeliveryCost getDeliveryCost() {
        return this.deliveryCost;
    }
    /**
     * Gets the discountedLineItemCost property value. The cost of the line item after applying any discounts. This container is only returned if the order line item was discounted through a promotion.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDiscountedLineItemCost() {
        return this.discountedLineItemCost;
    }
    /**
     * Gets the ebayCollectAndRemitTaxes property value. This container will be returned if the order line item is subject to a &apos;Collect and Remit&apos; tax that eBay will collect and remit to the proper taxing authority on the buyer&apos;s behalf.&lt;br&gt;&lt;br&gt;&apos;Collect and Remit&apos; tax includes:&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;The amount of this tax is shown in the &lt;strong&gt;amount&lt;/strong&gt; field, and the type of tax is shown in the &lt;strong&gt;taxType&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;EBay will display the tax type and amount during checkout in accordance with the buyer&apos;s address, and handle collection and remittance of the tax without requiring the seller to take any action.
     * @return a {@link java.util.List<EbayCollectAndRemitTax>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EbayCollectAndRemitTax> getEbayCollectAndRemitTaxes() {
        return this.ebayCollectAndRemitTaxes;
    }
    /**
     * Gets the ebayCollectedCharges property value. This container consists of a breakdown of costs that are collected by eBay from the buyer for this order. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, this container is returned only if eBay is directly charging the buyer for eBay shipping.&lt;/span&gt;
     * @return a {@link EbayCollectedCharges}
     */
    @jakarta.annotation.Nullable
    public EbayCollectedCharges getEbayCollectedCharges() {
        return this.ebayCollectedCharges;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("appliedPromotions", (n) -> { this.setAppliedPromotions(n.getCollectionOfObjectValues(AppliedPromotion::createFromDiscriminatorValue)); });
        deserializerMap.put("compatibilityProperties", (n) -> { this.setCompatibilityProperties(n.getCollectionOfObjectValues(Property::createFromDiscriminatorValue)); });
        deserializerMap.put("deliveryCost", (n) -> { this.setDeliveryCost(n.getObjectValue(DeliveryCost::createFromDiscriminatorValue)); });
        deserializerMap.put("discountedLineItemCost", (n) -> { this.setDiscountedLineItemCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("ebayCollectAndRemitTaxes", (n) -> { this.setEbayCollectAndRemitTaxes(n.getCollectionOfObjectValues(EbayCollectAndRemitTax::createFromDiscriminatorValue)); });
        deserializerMap.put("ebayCollectedCharges", (n) -> { this.setEbayCollectedCharges(n.getObjectValue(EbayCollectedCharges::createFromDiscriminatorValue)); });
        deserializerMap.put("giftDetails", (n) -> { this.setGiftDetails(n.getObjectValue(GiftDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("itemLocation", (n) -> { this.setItemLocation(n.getObjectValue(ItemLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("legacyItemId", (n) -> { this.setLegacyItemId(n.getStringValue()); });
        deserializerMap.put("legacyVariationId", (n) -> { this.setLegacyVariationId(n.getStringValue()); });
        deserializerMap.put("lineItemCost", (n) -> { this.setLineItemCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItemFulfillmentInstructions", (n) -> { this.setLineItemFulfillmentInstructions(n.getObjectValue(LineItemFulfillmentInstructions::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItemFulfillmentStatus", (n) -> { this.setLineItemFulfillmentStatus(n.getEnumValue(LineItemFulfillmentStatusEnum::forValue)); });
        deserializerMap.put("lineItemId", (n) -> { this.setLineItemId(n.getStringValue()); });
        deserializerMap.put("linkedOrderLineItems", (n) -> { this.setLinkedOrderLineItems(n.getCollectionOfObjectValues(LinkedOrderLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("listingMarketplaceId", (n) -> { this.setListingMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(LineItemProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("purchaseMarketplaceId", (n) -> { this.setPurchaseMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        deserializerMap.put("refunds", (n) -> { this.setRefunds(n.getCollectionOfObjectValues(LineItemRefund::createFromDiscriminatorValue)); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("soldFormat", (n) -> { this.setSoldFormat(n.getEnumValue(SoldFormatEnum::forValue)); });
        deserializerMap.put("taxes", (n) -> { this.setTaxes(n.getCollectionOfObjectValues(Tax::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("variationAspects", (n) -> { this.setVariationAspects(n.getCollectionOfObjectValues(NameValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the giftDetails property value. This container consists of information that is needed by the seller to send a digital gift card to the buyer or recipient of the digital gift card. This container is only returned and applicable for digital gift card line items.
     * @return a {@link GiftDetails}
     */
    @jakarta.annotation.Nullable
    public GiftDetails getGiftDetails() {
        return this.giftDetails;
    }
    /**
     * Gets the itemLocation property value. This container field describes the physical location of the order line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi&amp;#8209;Warehouse Program, this container will return the location details of the fulfillment center closest to the buyer.&lt;/span&gt;
     * @return a {@link ItemLocation}
     */
    @jakarta.annotation.Nullable
    public ItemLocation getItemLocation() {
        return this.itemLocation;
    }
    /**
     * Gets the legacyItemId property value. The eBay-generated legacy listing item ID of the listing. Note that the unique identifier of a listing in REST-based APIs is called the &lt;strong&gt;listingId&lt;/strong&gt; instead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLegacyItemId() {
        return this.legacyItemId;
    }
    /**
     * Gets the legacyVariationId property value. The unique identifier of a single variation within a multiple-variation listing. This field is only returned if the line item purchased was from a multiple-variation listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLegacyVariationId() {
        return this.legacyVariationId;
    }
    /**
     * Gets the lineItemCost property value. The selling price of the line item before applying any discounts. The value of this field is calculated by multiplying the single unit price by the number of units purchased (value of the &lt;strong&gt;quantity&lt;/strong&gt; field).
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getLineItemCost() {
        return this.lineItemCost;
    }
    /**
     * Gets the lineItemFulfillmentInstructions property value. This container consists of information related to shipping dates and expectations, including the &apos;ship-by date&apos; and expected delivery windows that are based on the seller&apos;s stated handling time and the shipping service option that will be used. These fields provide guidance on making sure expected delivery dates are made, whether the order is an &lt;em&gt;eBay Guaranteed Delivery&lt;/em&gt; order or a non-guaranteed delivery order.
     * @return a {@link LineItemFulfillmentInstructions}
     */
    @jakarta.annotation.Nullable
    public LineItemFulfillmentInstructions getLineItemFulfillmentInstructions() {
        return this.lineItemFulfillmentInstructions;
    }
    /**
     * Gets the lineItemFulfillmentStatus property value. This enumeration value indicates the current fulfillment status of the line item.
     * @return a {@link LineItemFulfillmentStatusEnum}
     */
    @jakarta.annotation.Nullable
    public LineItemFulfillmentStatusEnum getLineItemFulfillmentStatus() {
        return this.lineItemFulfillmentStatus;
    }
    /**
     * Gets the lineItemId property value. This is the unique identifier of an eBay order line item. This field is created as soon as there is a commitment to buy from the seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }
    /**
     * Gets the linkedOrderLineItems property value. An array of one or more line items related to the corresponding order, but not a part of that order. Details include the order ID, line item ID and title of the linked line item, the seller of that item, item specifics, estimated delivery times, and shipment tracking (if available).
     * @return a {@link java.util.List<LinkedOrderLineItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LinkedOrderLineItem> getLinkedOrderLineItems() {
        return this.linkedOrderLineItems;
    }
    /**
     * Gets the listingMarketplaceId property value. The unique identifier of the eBay marketplace where the line item was listed.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getListingMarketplaceId() {
        return this.listingMarketplaceId;
    }
    /**
     * Gets the properties property value. Contains information about the eBay programs, if any, under which the line item was listed.
     * @return a {@link LineItemProperties}
     */
    @jakarta.annotation.Nullable
    public LineItemProperties getProperties() {
        return this.properties;
    }
    /**
     * Gets the purchaseMarketplaceId property value. The unique identifier of the eBay marketplace where the line item was listed. Often, the &lt;strong&gt;listingMarketplaceId&lt;/strong&gt; and the &lt;strong&gt;purchaseMarketplaceId&lt;/strong&gt; identifier are the same, but there are occasions when an item will surface on multiple eBay marketplaces.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getPurchaseMarketplaceId() {
        return this.purchaseMarketplaceId;
    }
    /**
     * Gets the quantity property value. The number of units of the line item in the order. These are represented as a group by a single &lt;strong&gt;lineItemId&lt;/strong&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the refunds property value. This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @return a {@link java.util.List<LineItemRefund>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LineItemRefund> getRefunds() {
        return this.refunds;
    }
    /**
     * Gets the sku property value. Seller-defined Stock-Keeping Unit (SKU). This inventory identifier must be unique within the seller&apos;s eBay inventory. SKUs are optional when listing in the legacy Trading API system, but SKUs are required when listing items through the Inventory API model.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Gets the soldFormat property value. The eBay listing type of the line item. The most common listing types are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE&lt;/code&gt;.
     * @return a {@link SoldFormatEnum}
     */
    @jakarta.annotation.Nullable
    public SoldFormatEnum getSoldFormat() {
        return this.soldFormat;
    }
    /**
     * Gets the taxes property value. Contains a list of taxes applied to the line item, if any. This array is always returned, but will be returned as empty if no taxes are applicable to the line item.
     * @return a {@link java.util.List<Tax>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tax> getTaxes() {
        return this.taxes;
    }
    /**
     * Gets the title property value. The title of the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the total property value. This is the total price that the buyer must pay for the line item after all costs (item cost, delivery cost, taxes) are added, minus any discounts and/or promotions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotal() {
        return this.total;
    }
    /**
     * Gets the variationAspects property value. An array of aspect name-value pairs that identifies the specific variation of a multi-variation listing. This array can contain multiple name-value pairs, such as &lt;code&gt;color:blue&lt;/code&gt; and &lt;code&gt;size:large&lt;/code&gt;, and will only be returned for orders created from a multiple-variation listing.
     * @return a {@link java.util.List<NameValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NameValuePair> getVariationAspects() {
        return this.variationAspects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("appliedPromotions", this.getAppliedPromotions());
        writer.writeCollectionOfObjectValues("compatibilityProperties", this.getCompatibilityProperties());
        writer.writeObjectValue("deliveryCost", this.getDeliveryCost());
        writer.writeObjectValue("discountedLineItemCost", this.getDiscountedLineItemCost());
        writer.writeCollectionOfObjectValues("ebayCollectAndRemitTaxes", this.getEbayCollectAndRemitTaxes());
        writer.writeObjectValue("ebayCollectedCharges", this.getEbayCollectedCharges());
        writer.writeObjectValue("giftDetails", this.getGiftDetails());
        writer.writeObjectValue("itemLocation", this.getItemLocation());
        writer.writeStringValue("legacyItemId", this.getLegacyItemId());
        writer.writeStringValue("legacyVariationId", this.getLegacyVariationId());
        writer.writeObjectValue("lineItemCost", this.getLineItemCost());
        writer.writeObjectValue("lineItemFulfillmentInstructions", this.getLineItemFulfillmentInstructions());
        writer.writeEnumValue("lineItemFulfillmentStatus", this.getLineItemFulfillmentStatus());
        writer.writeStringValue("lineItemId", this.getLineItemId());
        writer.writeCollectionOfObjectValues("linkedOrderLineItems", this.getLinkedOrderLineItems());
        writer.writeEnumValue("listingMarketplaceId", this.getListingMarketplaceId());
        writer.writeObjectValue("properties", this.getProperties());
        writer.writeEnumValue("purchaseMarketplaceId", this.getPurchaseMarketplaceId());
        writer.writeIntegerValue("quantity", this.getQuantity());
        writer.writeCollectionOfObjectValues("refunds", this.getRefunds());
        writer.writeStringValue("sku", this.getSku());
        writer.writeEnumValue("soldFormat", this.getSoldFormat());
        writer.writeCollectionOfObjectValues("taxes", this.getTaxes());
        writer.writeStringValue("title", this.getTitle());
        writer.writeObjectValue("total", this.getTotal());
        writer.writeCollectionOfObjectValues("variationAspects", this.getVariationAspects());
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
     * Sets the appliedPromotions property value. This array contains information about one or more sales promotions or discounts applied to the line item. It is always returned, but will be returned as an empty array if no special sales promotions or discounts apply to the order line item.
     * @param value Value to set for the appliedPromotions property.
     */
    public void setAppliedPromotions(@jakarta.annotation.Nullable final java.util.List<AppliedPromotion> value) {
        this.appliedPromotions = value;
    }
    /**
     * Sets the compatibilityProperties property value. This array is only returned for a Parts &amp; Accessory item and identifies the buyer&apos;s motor vehicle that is compatible with the part or accessory.
     * @param value Value to set for the compatibilityProperties property.
     */
    public void setCompatibilityProperties(@jakarta.annotation.Nullable final java.util.List<Property> value) {
        this.compatibilityProperties = value;
    }
    /**
     * Sets the deliveryCost property value. This container consists of a breakdown of all costs associated with the fulfillment of the line item.
     * @param value Value to set for the deliveryCost property.
     */
    public void setDeliveryCost(@jakarta.annotation.Nullable final DeliveryCost value) {
        this.deliveryCost = value;
    }
    /**
     * Sets the discountedLineItemCost property value. The cost of the line item after applying any discounts. This container is only returned if the order line item was discounted through a promotion.
     * @param value Value to set for the discountedLineItemCost property.
     */
    public void setDiscountedLineItemCost(@jakarta.annotation.Nullable final Amount value) {
        this.discountedLineItemCost = value;
    }
    /**
     * Sets the ebayCollectAndRemitTaxes property value. This container will be returned if the order line item is subject to a &apos;Collect and Remit&apos; tax that eBay will collect and remit to the proper taxing authority on the buyer&apos;s behalf.&lt;br&gt;&lt;br&gt;&apos;Collect and Remit&apos; tax includes:&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;The amount of this tax is shown in the &lt;strong&gt;amount&lt;/strong&gt; field, and the type of tax is shown in the &lt;strong&gt;taxType&lt;/strong&gt; field.&lt;br&gt;&lt;br&gt;EBay will display the tax type and amount during checkout in accordance with the buyer&apos;s address, and handle collection and remittance of the tax without requiring the seller to take any action.
     * @param value Value to set for the ebayCollectAndRemitTaxes property.
     */
    public void setEbayCollectAndRemitTaxes(@jakarta.annotation.Nullable final java.util.List<EbayCollectAndRemitTax> value) {
        this.ebayCollectAndRemitTaxes = value;
    }
    /**
     * Sets the ebayCollectedCharges property value. This container consists of a breakdown of costs that are collected by eBay from the buyer for this order. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, this container is returned only if eBay is directly charging the buyer for eBay shipping.&lt;/span&gt;
     * @param value Value to set for the ebayCollectedCharges property.
     */
    public void setEbayCollectedCharges(@jakarta.annotation.Nullable final EbayCollectedCharges value) {
        this.ebayCollectedCharges = value;
    }
    /**
     * Sets the giftDetails property value. This container consists of information that is needed by the seller to send a digital gift card to the buyer or recipient of the digital gift card. This container is only returned and applicable for digital gift card line items.
     * @param value Value to set for the giftDetails property.
     */
    public void setGiftDetails(@jakarta.annotation.Nullable final GiftDetails value) {
        this.giftDetails = value;
    }
    /**
     * Sets the itemLocation property value. This container field describes the physical location of the order line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the item is shipped from a fulfillment center location through the Multi&amp;#8209;Warehouse Program, this container will return the location details of the fulfillment center closest to the buyer.&lt;/span&gt;
     * @param value Value to set for the itemLocation property.
     */
    public void setItemLocation(@jakarta.annotation.Nullable final ItemLocation value) {
        this.itemLocation = value;
    }
    /**
     * Sets the legacyItemId property value. The eBay-generated legacy listing item ID of the listing. Note that the unique identifier of a listing in REST-based APIs is called the &lt;strong&gt;listingId&lt;/strong&gt; instead.
     * @param value Value to set for the legacyItemId property.
     */
    public void setLegacyItemId(@jakarta.annotation.Nullable final String value) {
        this.legacyItemId = value;
    }
    /**
     * Sets the legacyVariationId property value. The unique identifier of a single variation within a multiple-variation listing. This field is only returned if the line item purchased was from a multiple-variation listing.
     * @param value Value to set for the legacyVariationId property.
     */
    public void setLegacyVariationId(@jakarta.annotation.Nullable final String value) {
        this.legacyVariationId = value;
    }
    /**
     * Sets the lineItemCost property value. The selling price of the line item before applying any discounts. The value of this field is calculated by multiplying the single unit price by the number of units purchased (value of the &lt;strong&gt;quantity&lt;/strong&gt; field).
     * @param value Value to set for the lineItemCost property.
     */
    public void setLineItemCost(@jakarta.annotation.Nullable final Amount value) {
        this.lineItemCost = value;
    }
    /**
     * Sets the lineItemFulfillmentInstructions property value. This container consists of information related to shipping dates and expectations, including the &apos;ship-by date&apos; and expected delivery windows that are based on the seller&apos;s stated handling time and the shipping service option that will be used. These fields provide guidance on making sure expected delivery dates are made, whether the order is an &lt;em&gt;eBay Guaranteed Delivery&lt;/em&gt; order or a non-guaranteed delivery order.
     * @param value Value to set for the lineItemFulfillmentInstructions property.
     */
    public void setLineItemFulfillmentInstructions(@jakarta.annotation.Nullable final LineItemFulfillmentInstructions value) {
        this.lineItemFulfillmentInstructions = value;
    }
    /**
     * Sets the lineItemFulfillmentStatus property value. This enumeration value indicates the current fulfillment status of the line item.
     * @param value Value to set for the lineItemFulfillmentStatus property.
     */
    public void setLineItemFulfillmentStatus(@jakarta.annotation.Nullable final LineItemFulfillmentStatusEnum value) {
        this.lineItemFulfillmentStatus = value;
    }
    /**
     * Sets the lineItemId property value. This is the unique identifier of an eBay order line item. This field is created as soon as there is a commitment to buy from the seller.
     * @param value Value to set for the lineItemId property.
     */
    public void setLineItemId(@jakarta.annotation.Nullable final String value) {
        this.lineItemId = value;
    }
    /**
     * Sets the linkedOrderLineItems property value. An array of one or more line items related to the corresponding order, but not a part of that order. Details include the order ID, line item ID and title of the linked line item, the seller of that item, item specifics, estimated delivery times, and shipment tracking (if available).
     * @param value Value to set for the linkedOrderLineItems property.
     */
    public void setLinkedOrderLineItems(@jakarta.annotation.Nullable final java.util.List<LinkedOrderLineItem> value) {
        this.linkedOrderLineItems = value;
    }
    /**
     * Sets the listingMarketplaceId property value. The unique identifier of the eBay marketplace where the line item was listed.
     * @param value Value to set for the listingMarketplaceId property.
     */
    public void setListingMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.listingMarketplaceId = value;
    }
    /**
     * Sets the properties property value. Contains information about the eBay programs, if any, under which the line item was listed.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final LineItemProperties value) {
        this.properties = value;
    }
    /**
     * Sets the purchaseMarketplaceId property value. The unique identifier of the eBay marketplace where the line item was listed. Often, the &lt;strong&gt;listingMarketplaceId&lt;/strong&gt; and the &lt;strong&gt;purchaseMarketplaceId&lt;/strong&gt; identifier are the same, but there are occasions when an item will surface on multiple eBay marketplaces.
     * @param value Value to set for the purchaseMarketplaceId property.
     */
    public void setPurchaseMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.purchaseMarketplaceId = value;
    }
    /**
     * Sets the quantity property value. The number of units of the line item in the order. These are represented as a group by a single &lt;strong&gt;lineItemId&lt;/strong&gt;.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
    /**
     * Sets the refunds property value. This array is always returned, but it is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @param value Value to set for the refunds property.
     */
    public void setRefunds(@jakarta.annotation.Nullable final java.util.List<LineItemRefund> value) {
        this.refunds = value;
    }
    /**
     * Sets the sku property value. Seller-defined Stock-Keeping Unit (SKU). This inventory identifier must be unique within the seller&apos;s eBay inventory. SKUs are optional when listing in the legacy Trading API system, but SKUs are required when listing items through the Inventory API model.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
    /**
     * Sets the soldFormat property value. The eBay listing type of the line item. The most common listing types are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE&lt;/code&gt;.
     * @param value Value to set for the soldFormat property.
     */
    public void setSoldFormat(@jakarta.annotation.Nullable final SoldFormatEnum value) {
        this.soldFormat = value;
    }
    /**
     * Sets the taxes property value. Contains a list of taxes applied to the line item, if any. This array is always returned, but will be returned as empty if no taxes are applicable to the line item.
     * @param value Value to set for the taxes property.
     */
    public void setTaxes(@jakarta.annotation.Nullable final java.util.List<Tax> value) {
        this.taxes = value;
    }
    /**
     * Sets the title property value. The title of the listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the total property value. This is the total price that the buyer must pay for the line item after all costs (item cost, delivery cost, taxes) are added, minus any discounts and/or promotions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For orders that are subject to eBay &apos;Collect and Remit&apos; tax, the &apos;Collect and Remit&apos; tax amount for the order will be included in this &lt;strong&gt;total&lt;/strong&gt; value only when the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;. If the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter is not set to &lt;code&gt;TAX_BREAKDOWN&lt;/code&gt;, &apos;Collect and Remit&apos; will not be added into this &lt;strong&gt;total&lt;/strong&gt; value.&lt;br&gt;&lt;br&gt;To determine if &apos;Collect and Remit&apos; taxes were added into this &lt;strong&gt;total&lt;/strong&gt; value, the user can check for the corresponding &lt;strong&gt;lineItems.ebayCollectAndRemitTaxes&lt;/strong&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; containers in the response. If both of these containers appear for one or more line items in the response with the following &lt;strong&gt;taxType&lt;/strong&gt; values, the &apos;Collect and Remit&apos; tax amount that the buyer paid is in this amount:&lt;ul&gt;&lt;li&gt;&lt;code&gt;STATE_SALES_TAX&lt;/code&gt;: US state-mandated sales tax&lt;/li&gt;&lt;li&gt;&lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;: Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&lt;code&gt;GST&lt;/code&gt;: &apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;&lt;code&gt;VAT&lt;/code&gt;: VAT collected for UK and EU countries&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Amount value) {
        this.total = value;
    }
    /**
     * Sets the variationAspects property value. An array of aspect name-value pairs that identifies the specific variation of a multi-variation listing. This array can contain multiple name-value pairs, such as &lt;code&gt;color:blue&lt;/code&gt; and &lt;code&gt;size:large&lt;/code&gt;, and will only be returned for orders created from a multiple-variation listing.
     * @param value Value to set for the variationAspects property.
     */
    public void setVariationAspects(@jakarta.annotation.Nullable final java.util.List<NameValuePair> value) {
        this.variationAspects = value;
    }
}
