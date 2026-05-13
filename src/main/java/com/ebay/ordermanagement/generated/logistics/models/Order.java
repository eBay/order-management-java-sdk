package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type defines an order from which a seller is including one or more line items in a single package to be shipped.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Order implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The marketplace where the order was created.&lt;br&gt;&lt;br&gt;Use the value &lt;code&gt;EBAY&lt;/code&gt; to get the rates available for eBay orders.
     */
    private String channel;
    /**
     * The unique identifier of the order. The &lt;a href=/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; method of the &lt;b&gt;Fulfillment API&lt;/b&gt; can be used to retrieve order IDs.
     */
    private String orderId;
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
     * Gets the channel property value. The marketplace where the order was created.&lt;br&gt;&lt;br&gt;Use the value &lt;code&gt;EBAY&lt;/code&gt; to get the rates available for eBay orders.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orderId property value. The unique identifier of the order. The &lt;a href=/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; method of the &lt;b&gt;Fulfillment API&lt;/b&gt; can be used to retrieve order IDs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("channel", this.getChannel());
        writer.writeStringValue("orderId", this.getOrderId());
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
     * Sets the channel property value. The marketplace where the order was created.&lt;br&gt;&lt;br&gt;Use the value &lt;code&gt;EBAY&lt;/code&gt; to get the rates available for eBay orders.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final String value) {
        this.channel = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the order. The &lt;a href=/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; method of the &lt;b&gt;Fulfillment API&lt;/b&gt; can be used to retrieve order IDs.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
}
