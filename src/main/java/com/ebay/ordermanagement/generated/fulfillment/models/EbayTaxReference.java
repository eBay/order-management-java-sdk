package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type describes the VAT tax details. The eBay VAT tax type and the eBay VAT identifier number will be returned if a VAT tax is applicable for the order.&lt;br&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EbayTaxReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field value is returned to indicate the VAT tax type, which will vary by country/region. This string value will be one of the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABN&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an Australia tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDG&lt;/code&gt;: if this string is returned, it indicates that tax has been collected and remitted for Digitally Delivered Goods (DDG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;IOSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay EU or UK IOSS number&lt;/li&gt;&lt;li&gt;&lt;code&gt;IRD&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay New Zealand tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;SST&lt;/code&gt;: if this string is returned, the ID in the &lt;b&gt;value&lt;/b&gt; field is an eBay Malaysia taxNumber&lt;/li&gt;&lt;li&gt;&lt;code&gt;OSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an  eBay Germany VAT ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOEC&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay Norway tax ID&lt;/li&gt;&lt;/ul&gt;
     */
    private String name;
    /**
     * The value returned in this field is the VAT identifier number (VATIN), which will vary by country/region. This field will be returned if VAT tax is applicable for the order. The &lt;strong&gt;name&lt;/strong&gt; field indicates the VAT tax type, which will vary by country/region: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;ABN&lt;/strong&gt;: &lt;em&gt;eBay AU tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IOSS&lt;/strong&gt;: &lt;em&gt;eBay EU IOSS number&lt;/em&gt; / &lt;em&gt;eBay UK IOSS number&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IRD&lt;/strong&gt;: &lt;em&gt;eBay NZ tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;OSS&lt;/strong&gt;: &lt;em&gt;eBay DE VAT ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;SST&lt;/b&gt;: &lt;i&gt;eBay MY taxNumber&lt;/i&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;VOEC&lt;/strong&gt;: &lt;em&gt;eBay NO number&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String value;
    /**
     * Instantiates a new {@link EbayTaxReference} and sets the default values.
     */
    public EbayTaxReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EbayTaxReference}
     */
    @jakarta.annotation.Nonnull
    public static EbayTaxReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EbayTaxReference();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. This field value is returned to indicate the VAT tax type, which will vary by country/region. This string value will be one of the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABN&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an Australia tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDG&lt;/code&gt;: if this string is returned, it indicates that tax has been collected and remitted for Digitally Delivered Goods (DDG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;IOSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay EU or UK IOSS number&lt;/li&gt;&lt;li&gt;&lt;code&gt;IRD&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay New Zealand tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;SST&lt;/code&gt;: if this string is returned, the ID in the &lt;b&gt;value&lt;/b&gt; field is an eBay Malaysia taxNumber&lt;/li&gt;&lt;li&gt;&lt;code&gt;OSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an  eBay Germany VAT ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOEC&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay Norway tax ID&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the value property value. The value returned in this field is the VAT identifier number (VATIN), which will vary by country/region. This field will be returned if VAT tax is applicable for the order. The &lt;strong&gt;name&lt;/strong&gt; field indicates the VAT tax type, which will vary by country/region: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;ABN&lt;/strong&gt;: &lt;em&gt;eBay AU tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IOSS&lt;/strong&gt;: &lt;em&gt;eBay EU IOSS number&lt;/em&gt; / &lt;em&gt;eBay UK IOSS number&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IRD&lt;/strong&gt;: &lt;em&gt;eBay NZ tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;OSS&lt;/strong&gt;: &lt;em&gt;eBay DE VAT ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;SST&lt;/b&gt;: &lt;i&gt;eBay MY taxNumber&lt;/i&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;VOEC&lt;/strong&gt;: &lt;em&gt;eBay NO number&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the name property value. This field value is returned to indicate the VAT tax type, which will vary by country/region. This string value will be one of the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABN&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an Australia tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDG&lt;/code&gt;: if this string is returned, it indicates that tax has been collected and remitted for Digitally Delivered Goods (DDG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;IOSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay EU or UK IOSS number&lt;/li&gt;&lt;li&gt;&lt;code&gt;IRD&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay New Zealand tax ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;SST&lt;/code&gt;: if this string is returned, the ID in the &lt;b&gt;value&lt;/b&gt; field is an eBay Malaysia taxNumber&lt;/li&gt;&lt;li&gt;&lt;code&gt;OSS&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an  eBay Germany VAT ID&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOEC&lt;/code&gt;: if this string is returned, the ID in the &lt;strong&gt;value&lt;/strong&gt; field is an eBay Norway tax ID&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the value property value. The value returned in this field is the VAT identifier number (VATIN), which will vary by country/region. This field will be returned if VAT tax is applicable for the order. The &lt;strong&gt;name&lt;/strong&gt; field indicates the VAT tax type, which will vary by country/region: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;ABN&lt;/strong&gt;: &lt;em&gt;eBay AU tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IOSS&lt;/strong&gt;: &lt;em&gt;eBay EU IOSS number&lt;/em&gt; / &lt;em&gt;eBay UK IOSS number&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;IRD&lt;/strong&gt;: &lt;em&gt;eBay NZ tax ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;OSS&lt;/strong&gt;: &lt;em&gt;eBay DE VAT ID&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;SST&lt;/b&gt;: &lt;i&gt;eBay MY taxNumber&lt;/i&gt;&lt;/li&gt;&lt;li&gt;&lt;strong&gt;VOEC&lt;/strong&gt;: &lt;em&gt;eBay NO number&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
