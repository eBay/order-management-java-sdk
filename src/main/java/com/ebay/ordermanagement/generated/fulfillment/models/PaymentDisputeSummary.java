package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by each payment dispute that is returned with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount amount;
    /**
     * This is the buyer&apos;s eBay user ID. This field is returned for all payment disputes returned in the response.
     */
    private String buyerUsername;
    /**
     * The timestamp in this field shows the date/time when the payment dispute was closed, so this field is only returned for payment disputes in the &lt;code&gt;CLOSED&lt;/code&gt; state.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String closedDate;
    /**
     * The timestamp in this field shows the date/time when the payment dispute was opened. This field is returned for payment disputes in all states.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String openDate;
    /**
     * This is the unique identifier of the order involved in the payment dispute.
     */
    private String orderId;
    /**
     * This is the unique identifier of the payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. This identifier is passed in at the end of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; call URI to retrieve a specific payment dispute. The &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method returns more details about a payment dispute than the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.
     */
    private String paymentDisputeId;
    /**
     * The enumeration value in this field gives the current status of the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String paymentDisputeStatus;
    /**
     * The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reason;
    /**
     * The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that require action by the seller, that same seller must call &lt;strong&gt;getPaymentDispute&lt;/strong&gt; to see the next action(s) that they can take against the payment dispute.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String respondByDate;
    /**
     * Instantiates a new {@link PaymentDisputeSummary} and sets the default values.
     */
    public PaymentDisputeSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentDisputeSummary}
     */
    @jakarta.annotation.Nonnull
    public static PaymentDisputeSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentDisputeSummary();
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
     * Gets the buyerUsername property value. This is the buyer&apos;s eBay user ID. This field is returned for all payment disputes returned in the response.
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerUsername", (n) -> { this.setBuyerUsername(n.getStringValue()); });
        deserializerMap.put("closedDate", (n) -> { this.setClosedDate(n.getStringValue()); });
        deserializerMap.put("openDate", (n) -> { this.setOpenDate(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("paymentDisputeId", (n) -> { this.setPaymentDisputeId(n.getStringValue()); });
        deserializerMap.put("paymentDisputeStatus", (n) -> { this.setPaymentDisputeStatus(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("respondByDate", (n) -> { this.setRespondByDate(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the paymentDisputeId property value. This is the unique identifier of the payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. This identifier is passed in at the end of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; call URI to retrieve a specific payment dispute. The &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method returns more details about a payment dispute than the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDisputeId() {
        return this.paymentDisputeId;
    }
    /**
     * Gets the paymentDisputeStatus property value. The enumeration value in this field gives the current status of the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * Gets the respondByDate property value. The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that require action by the seller, that same seller must call &lt;strong&gt;getPaymentDispute&lt;/strong&gt; to see the next action(s) that they can take against the payment dispute.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRespondByDate() {
        return this.respondByDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("buyerUsername", this.getBuyerUsername());
        writer.writeStringValue("closedDate", this.getClosedDate());
        writer.writeStringValue("openDate", this.getOpenDate());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("paymentDisputeId", this.getPaymentDisputeId());
        writer.writeStringValue("paymentDisputeStatus", this.getPaymentDisputeStatus());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("respondByDate", this.getRespondByDate());
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
     * Sets the buyerUsername property value. This is the buyer&apos;s eBay user ID. This field is returned for all payment disputes returned in the response.
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
     * Sets the paymentDisputeId property value. This is the unique identifier of the payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. This identifier is passed in at the end of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; call URI to retrieve a specific payment dispute. The &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method returns more details about a payment dispute than the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.
     * @param value Value to set for the paymentDisputeId property.
     */
    public void setPaymentDisputeId(@jakarta.annotation.Nullable final String value) {
        this.paymentDisputeId = value;
    }
    /**
     * Sets the paymentDisputeStatus property value. The enumeration value in this field gives the current status of the payment dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * Sets the respondByDate property value. The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that require action by the seller, that same seller must call &lt;strong&gt;getPaymentDispute&lt;/strong&gt; to see the next action(s) that they can take against the payment dispute.&lt;br&gt;&lt;br&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the respondByDate property.
     */
    public void setRespondByDate(@jakarta.annotation.Nullable final String value) {
        this.respondByDate = value;
    }
}
