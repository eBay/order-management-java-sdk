package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the monetary value of the payment dispute, and the currency used.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimpleAmount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A three-letter ISO 4217 code (such as &lt;code&gt;USD&lt;/code&gt; for US site) that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String currency;
    /**
     * The monetary amount of the payment dispute. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container.
     */
    private String value;
    /**
     * Instantiates a new {@link SimpleAmount} and sets the default values.
     */
    public SimpleAmount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nonnull
    public static SimpleAmount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimpleAmount();
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
     * Gets the currency property value. A three-letter ISO 4217 code (such as &lt;code&gt;USD&lt;/code&gt; for US site) that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount of the payment dispute. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container.
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
        writer.writeStringValue("currency", this.getCurrency());
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
     * Sets the currency property value. A three-letter ISO 4217 code (such as &lt;code&gt;USD&lt;/code&gt; for US site) that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. The monetary amount of the payment dispute. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
