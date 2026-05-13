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
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount amount;
    /**
     * This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CollectionMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String collectionMethod;
    /**
     * This type describes the VAT tax details. The eBay VAT tax type and the eBay VAT identifier number will be returned if a VAT tax is applicable for the order.&lt;br&gt;
     */
    private EbayTaxReference ebayReference;
    /**
     * The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String taxType;
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
     * Gets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the collectionMethod property value. This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CollectionMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCollectionMethod() {
        return this.collectionMethod;
    }
    /**
     * Gets the ebayReference property value. This type describes the VAT tax details. The eBay VAT tax type and the eBay VAT identifier number will be returned if a VAT tax is applicable for the order.&lt;br&gt;
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
        deserializerMap.put("collectionMethod", (n) -> { this.setCollectionMethod(n.getStringValue()); });
        deserializerMap.put("ebayReference", (n) -> { this.setEbayReference(n.getObjectValue(EbayTaxReference::createFromDiscriminatorValue)); });
        deserializerMap.put("taxType", (n) -> { this.setTaxType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the taxType property value. The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxType() {
        return this.taxType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("collectionMethod", this.getCollectionMethod());
        writer.writeObjectValue("ebayReference", this.getEbayReference());
        writer.writeStringValue("taxType", this.getTaxType());
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
     * Sets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the collectionMethod property value. This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CollectionMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the collectionMethod property.
     */
    public void setCollectionMethod(@jakarta.annotation.Nullable final String value) {
        this.collectionMethod = value;
    }
    /**
     * Sets the ebayReference property value. This type describes the VAT tax details. The eBay VAT tax type and the eBay VAT identifier number will be returned if a VAT tax is applicable for the order.&lt;br&gt;
     * @param value Value to set for the ebayReference property.
     */
    public void setEbayReference(@jakarta.annotation.Nullable final EbayTaxReference value) {
        this.ebayReference = value;
    }
    /**
     * Sets the taxType property value. The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the taxType property.
     */
    public void setTaxType(@jakarta.annotation.Nullable final String value) {
        this.taxType = value;
    }
}
