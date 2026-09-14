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
 * This type contains information about the type and amount of tax that eBay will collect and remit to the state, province, country, or other taxing authority in the buyer&apos;s location, as required by that taxing authority.&lt;br&gt;&lt;br&gt;&apos;Collect and Remit&apos; tax includes:&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, and New Zealand&lt;/li&gt;&lt;li&gt;VAT collected for the UK and EU countries&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EbayCollectAndRemitTax implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The monetary amount of the &apos;Collect and Remit&apos; tax. This currently includes the following:&lt;br&gt;&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the corresponding &lt;strong&gt;taxType&lt;/strong&gt; is &lt;code&gt;STATE_SALES_TAX&lt;/code&gt;, &lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;, &lt;code&gt;GST&lt;/code&gt;, &lt;code&gt;VAT&lt;/code&gt;, or &lt;code&gt;SST&lt;/code&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; container also appears for this line item with the same tax amount, the order is subject to &apos;eBay Collect and Remit&apos; tax. For orders that are subject to &apos;eBay Collect and Remit&apos; tax, the tax amount in this field will be included in the &lt;strong&gt;lineItems.total&lt;/strong&gt;, &lt;strong&gt;paymentSummary.payments.amount&lt;/strong&gt;, &lt;strong&gt;paymentSummary.totalDueSeller&lt;/strong&gt;, and &lt;strong&gt;pricingSummary.total&lt;/strong&gt; fields.&lt;/span&gt;
     */
    private Amount amount;
    /**
     * This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt;
     */
    private CollectionMethodEnum collectionMethod;
    /**
     * This container field describes the line-item level VAT tax details.&lt;br&gt;
     */
    private EbayTaxReference ebayReference;
    /**
     * The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type.
     */
    private TaxTypeEnum taxType;
    /**
     * Instantiates a new {@link EbayCollectAndRemitTax} and sets the default values.
     */
    public EbayCollectAndRemitTax() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EbayCollectAndRemitTax}
     */
    @jakarta.annotation.Nonnull
    public static EbayCollectAndRemitTax createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EbayCollectAndRemitTax();
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
     * Gets the amount property value. The monetary amount of the &apos;Collect and Remit&apos; tax. This currently includes the following:&lt;br&gt;&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the corresponding &lt;strong&gt;taxType&lt;/strong&gt; is &lt;code&gt;STATE_SALES_TAX&lt;/code&gt;, &lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;, &lt;code&gt;GST&lt;/code&gt;, &lt;code&gt;VAT&lt;/code&gt;, or &lt;code&gt;SST&lt;/code&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; container also appears for this line item with the same tax amount, the order is subject to &apos;eBay Collect and Remit&apos; tax. For orders that are subject to &apos;eBay Collect and Remit&apos; tax, the tax amount in this field will be included in the &lt;strong&gt;lineItems.total&lt;/strong&gt;, &lt;strong&gt;paymentSummary.payments.amount&lt;/strong&gt;, &lt;strong&gt;paymentSummary.totalDueSeller&lt;/strong&gt;, and &lt;strong&gt;pricingSummary.total&lt;/strong&gt; fields.&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the collectionMethod property value. This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt;
     * @return a {@link CollectionMethodEnum}
     */
    @jakarta.annotation.Nullable
    public CollectionMethodEnum getCollectionMethod() {
        return this.collectionMethod;
    }
    /**
     * Gets the ebayReference property value. This container field describes the line-item level VAT tax details.&lt;br&gt;
     * @return a {@link EbayTaxReference}
     */
    @jakarta.annotation.Nullable
    public EbayTaxReference getEbayReference() {
        return this.ebayReference;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("collectionMethod", (n) -> { this.setCollectionMethod(n.getEnumValue(CollectionMethodEnum::forValue)); });
        deserializerMap.put("ebayReference", (n) -> { this.setEbayReference(n.getObjectValue(EbayTaxReference::createFromDiscriminatorValue)); });
        deserializerMap.put("taxType", (n) -> { this.setTaxType(n.getEnumValue(TaxTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the taxType property value. The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type.
     * @return a {@link TaxTypeEnum}
     */
    @jakarta.annotation.Nullable
    public TaxTypeEnum getTaxType() {
        return this.taxType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeEnumValue("collectionMethod", this.getCollectionMethod());
        writer.writeObjectValue("ebayReference", this.getEbayReference());
        writer.writeEnumValue("taxType", this.getTaxType());
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
     * Sets the amount property value. The monetary amount of the &apos;Collect and Remit&apos; tax. This currently includes the following:&lt;br&gt;&lt;ul&gt;&lt;li&gt;US state-mandated sales tax&lt;/li&gt;&lt;li&gt;Federal and Provincial Sales Tax in Canada&lt;/li&gt;&lt;li&gt;&apos;Goods and Services&apos; tax in Canada, Australia, New Zealand, and Jersey&lt;/li&gt;&lt;li&gt;VAT collected for the UK, EU countries, Kazakhstan, and Belarus&lt;/li&gt;&lt;li&gt;Sales &amp; Service Tax (SST) in Malaysia&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the corresponding &lt;strong&gt;taxType&lt;/strong&gt; is &lt;code&gt;STATE_SALES_TAX&lt;/code&gt;, &lt;code&gt;PROVINCE_SALES_TAX&lt;/code&gt;, &lt;code&gt;GST&lt;/code&gt;, &lt;code&gt;VAT&lt;/code&gt;, or &lt;code&gt;SST&lt;/code&gt; and the &lt;strong&gt;lineItems.taxes&lt;/strong&gt; container also appears for this line item with the same tax amount, the order is subject to &apos;eBay Collect and Remit&apos; tax. For orders that are subject to &apos;eBay Collect and Remit&apos; tax, the tax amount in this field will be included in the &lt;strong&gt;lineItems.total&lt;/strong&gt;, &lt;strong&gt;paymentSummary.payments.amount&lt;/strong&gt;, &lt;strong&gt;paymentSummary.totalDueSeller&lt;/strong&gt;, and &lt;strong&gt;pricingSummary.total&lt;/strong&gt; fields.&lt;/span&gt;
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the collectionMethod property value. This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt;
     * @param value Value to set for the collectionMethod property.
     */
    public void setCollectionMethod(@jakarta.annotation.Nullable final CollectionMethodEnum value) {
        this.collectionMethod = value;
    }
    /**
     * Sets the ebayReference property value. This container field describes the line-item level VAT tax details.&lt;br&gt;
     * @param value Value to set for the ebayReference property.
     */
    public void setEbayReference(@jakarta.annotation.Nullable final EbayTaxReference value) {
        this.ebayReference = value;
    }
    /**
     * Sets the taxType property value. The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type.
     * @param value Value to set for the taxType property.
     */
    public void setTaxType(@jakarta.annotation.Nullable final TaxTypeEnum value) {
        this.taxType = value;
    }
}
