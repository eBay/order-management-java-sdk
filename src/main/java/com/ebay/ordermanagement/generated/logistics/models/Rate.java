package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type contains live quote information about a shipping service that&apos;s available for a given shipping quote request, including the shipping carrier and service, delivery window, shipping cost, and additional shipping options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Rate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains service and pricing information for one or more shipping options that are offered by the carrier and can be purchased in addition to the base shipping service provided by this rate. Shipping options can include items such as &lt;code&gt;INSURANCE&lt;/code&gt; and &lt;code&gt;SIGNATURE&lt;/code&gt;.
     */
    private java.util.List<AdditionalOption> additionalOptions;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount baseShippingCost;
    /**
     * The name of the time zone region, as defined in the &lt;a href=&quot;http://www.iana.org/time-zones &quot;  target=&quot;_blank&quot;&gt;IANA Time Zone Database&lt;/a&gt;, to which the package is being shipped.  &lt;br&gt;&lt;br&gt;Delivery dates are calculated relative to this time zone.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is different from a Coordinated Universal Time (UTC) offset. For example, the &lt;i&gt;America/Los_Angeles&lt;/i&gt; time zone identifies a region with the UTC standard time offset of &lt;code&gt;-08:00&lt;/code&gt;, but so do several other time zones, including &lt;i&gt;America/Tijuana&lt;/i&gt;,&lt;i&gt;America/Dawson&lt;/i&gt;, and &lt;i&gt;Pacific/Pitcairn&lt;/i&gt;.&lt;/span&gt;
     */
    private String destinationTimeZone;
    /**
     * The latest stated date and time the shipment will be delivered at this rate.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String maxEstimatedDeliveryDate;
    /**
     * The estimated earliest date and time the shipment will be delivered at this rate. The time stamp is formatted as an ISO 8601 UTC string.
     */
    private String minEstimatedDeliveryDate;
    /**
     * A list of pickup networks compatible with the shipping service.
     */
    private java.util.List<String> pickupNetworks;
    /**
     * A list of available pickup slots for the package.
     */
    private java.util.List<PickupSlot> pickupSlots;
    /**
     * The type of pickup or drop-off service associated with the &lt;b&gt;pickupSlots&lt;/b&gt; time frames. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:PickupTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String pickupType;
    /**
     * The unique eBay-assigned ID for this shipping rate.
     */
    private String rateId;
    /**
     * A list of reasons this rate is recommended. Available values are: &lt;ul&gt; &lt;li&gt;&lt;code&gt;BUYER_CHOSEN&lt;/code&gt; &amp;mdash; The rate meets or exceeds the requirements of the buyer&apos;s preferred shipping option.&lt;/li&gt; &lt;li&gt;&lt;code&gt;CHEAPEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate is the cheapest rate available that will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;EBAY_PLUS_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Plus program.&lt;/li&gt; &lt;li&gt;&lt;code&gt;FASTEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate has the fastest shipping time, and will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GUARANTEED_DELIVERY_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<String> rateRecommendation;
    /**
     * The code name of the shipping carrier who will provide the service identified by &lt;b&gt;shippingServiceCode&lt;/b&gt;.
     */
    private String shippingCarrierCode;
    /**
     * The common name of the shipping carrier.
     */
    private String shippingCarrierName;
    /**
     * The code name of the shipping service to be provided by the carrier identified by &lt;b&gt;shippingCarrierCode&lt;/b&gt;.
     */
    private String shippingServiceCode;
    /**
     * The common name of the shipping service.
     */
    private String shippingServiceName;
    /**
     * Instantiates a new {@link Rate} and sets the default values.
     */
    public Rate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Rate}
     */
    @jakarta.annotation.Nonnull
    public static Rate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Rate();
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
     * Gets the additionalOptions property value. Contains service and pricing information for one or more shipping options that are offered by the carrier and can be purchased in addition to the base shipping service provided by this rate. Shipping options can include items such as &lt;code&gt;INSURANCE&lt;/code&gt; and &lt;code&gt;SIGNATURE&lt;/code&gt;.
     * @return a {@link java.util.List<AdditionalOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdditionalOption> getAdditionalOptions() {
        return this.additionalOptions;
    }
    /**
     * Gets the baseShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBaseShippingCost() {
        return this.baseShippingCost;
    }
    /**
     * Gets the destinationTimeZone property value. The name of the time zone region, as defined in the &lt;a href=&quot;http://www.iana.org/time-zones &quot;  target=&quot;_blank&quot;&gt;IANA Time Zone Database&lt;/a&gt;, to which the package is being shipped.  &lt;br&gt;&lt;br&gt;Delivery dates are calculated relative to this time zone.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is different from a Coordinated Universal Time (UTC) offset. For example, the &lt;i&gt;America/Los_Angeles&lt;/i&gt; time zone identifies a region with the UTC standard time offset of &lt;code&gt;-08:00&lt;/code&gt;, but so do several other time zones, including &lt;i&gt;America/Tijuana&lt;/i&gt;,&lt;i&gt;America/Dawson&lt;/i&gt;, and &lt;i&gt;Pacific/Pitcairn&lt;/i&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationTimeZone() {
        return this.destinationTimeZone;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getCollectionOfObjectValues(AdditionalOption::createFromDiscriminatorValue)); });
        deserializerMap.put("baseShippingCost", (n) -> { this.setBaseShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationTimeZone", (n) -> { this.setDestinationTimeZone(n.getStringValue()); });
        deserializerMap.put("maxEstimatedDeliveryDate", (n) -> { this.setMaxEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("minEstimatedDeliveryDate", (n) -> { this.setMinEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("pickupNetworks", (n) -> { this.setPickupNetworks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("pickupSlots", (n) -> { this.setPickupSlots(n.getCollectionOfObjectValues(PickupSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("pickupType", (n) -> { this.setPickupType(n.getStringValue()); });
        deserializerMap.put("rateId", (n) -> { this.setRateId(n.getStringValue()); });
        deserializerMap.put("rateRecommendation", (n) -> { this.setRateRecommendation(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("shippingCarrierName", (n) -> { this.setShippingCarrierName(n.getStringValue()); });
        deserializerMap.put("shippingServiceCode", (n) -> { this.setShippingServiceCode(n.getStringValue()); });
        deserializerMap.put("shippingServiceName", (n) -> { this.setShippingServiceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxEstimatedDeliveryDate property value. The latest stated date and time the shipment will be delivered at this rate.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxEstimatedDeliveryDate() {
        return this.maxEstimatedDeliveryDate;
    }
    /**
     * Gets the minEstimatedDeliveryDate property value. The estimated earliest date and time the shipment will be delivered at this rate. The time stamp is formatted as an ISO 8601 UTC string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinEstimatedDeliveryDate() {
        return this.minEstimatedDeliveryDate;
    }
    /**
     * Gets the pickupNetworks property value. A list of pickup networks compatible with the shipping service.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPickupNetworks() {
        return this.pickupNetworks;
    }
    /**
     * Gets the pickupSlots property value. A list of available pickup slots for the package.
     * @return a {@link java.util.List<PickupSlot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PickupSlot> getPickupSlots() {
        return this.pickupSlots;
    }
    /**
     * Gets the pickupType property value. The type of pickup or drop-off service associated with the &lt;b&gt;pickupSlots&lt;/b&gt; time frames. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:PickupTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupType() {
        return this.pickupType;
    }
    /**
     * Gets the rateId property value. The unique eBay-assigned ID for this shipping rate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateId() {
        return this.rateId;
    }
    /**
     * Gets the rateRecommendation property value. A list of reasons this rate is recommended. Available values are: &lt;ul&gt; &lt;li&gt;&lt;code&gt;BUYER_CHOSEN&lt;/code&gt; &amp;mdash; The rate meets or exceeds the requirements of the buyer&apos;s preferred shipping option.&lt;/li&gt; &lt;li&gt;&lt;code&gt;CHEAPEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate is the cheapest rate available that will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;EBAY_PLUS_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Plus program.&lt;/li&gt; &lt;li&gt;&lt;code&gt;FASTEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate has the fastest shipping time, and will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GUARANTEED_DELIVERY_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRateRecommendation() {
        return this.rateRecommendation;
    }
    /**
     * Gets the shippingCarrierCode property value. The code name of the shipping carrier who will provide the service identified by &lt;b&gt;shippingServiceCode&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the shippingCarrierName property value. The common name of the shipping carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierName() {
        return this.shippingCarrierName;
    }
    /**
     * Gets the shippingServiceCode property value. The code name of the shipping service to be provided by the carrier identified by &lt;b&gt;shippingCarrierCode&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceCode() {
        return this.shippingServiceCode;
    }
    /**
     * Gets the shippingServiceName property value. The common name of the shipping service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceName() {
        return this.shippingServiceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalOptions", this.getAdditionalOptions());
        writer.writeObjectValue("baseShippingCost", this.getBaseShippingCost());
        writer.writeStringValue("destinationTimeZone", this.getDestinationTimeZone());
        writer.writeStringValue("maxEstimatedDeliveryDate", this.getMaxEstimatedDeliveryDate());
        writer.writeStringValue("minEstimatedDeliveryDate", this.getMinEstimatedDeliveryDate());
        writer.writeCollectionOfPrimitiveValues("pickupNetworks", this.getPickupNetworks());
        writer.writeCollectionOfObjectValues("pickupSlots", this.getPickupSlots());
        writer.writeStringValue("pickupType", this.getPickupType());
        writer.writeStringValue("rateId", this.getRateId());
        writer.writeCollectionOfPrimitiveValues("rateRecommendation", this.getRateRecommendation());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
        writer.writeStringValue("shippingCarrierName", this.getShippingCarrierName());
        writer.writeStringValue("shippingServiceCode", this.getShippingServiceCode());
        writer.writeStringValue("shippingServiceName", this.getShippingServiceName());
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
     * Sets the additionalOptions property value. Contains service and pricing information for one or more shipping options that are offered by the carrier and can be purchased in addition to the base shipping service provided by this rate. Shipping options can include items such as &lt;code&gt;INSURANCE&lt;/code&gt; and &lt;code&gt;SIGNATURE&lt;/code&gt;.
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final java.util.List<AdditionalOption> value) {
        this.additionalOptions = value;
    }
    /**
     * Sets the baseShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the baseShippingCost property.
     */
    public void setBaseShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.baseShippingCost = value;
    }
    /**
     * Sets the destinationTimeZone property value. The name of the time zone region, as defined in the &lt;a href=&quot;http://www.iana.org/time-zones &quot;  target=&quot;_blank&quot;&gt;IANA Time Zone Database&lt;/a&gt;, to which the package is being shipped.  &lt;br&gt;&lt;br&gt;Delivery dates are calculated relative to this time zone.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is different from a Coordinated Universal Time (UTC) offset. For example, the &lt;i&gt;America/Los_Angeles&lt;/i&gt; time zone identifies a region with the UTC standard time offset of &lt;code&gt;-08:00&lt;/code&gt;, but so do several other time zones, including &lt;i&gt;America/Tijuana&lt;/i&gt;,&lt;i&gt;America/Dawson&lt;/i&gt;, and &lt;i&gt;Pacific/Pitcairn&lt;/i&gt;.&lt;/span&gt;
     * @param value Value to set for the destinationTimeZone property.
     */
    public void setDestinationTimeZone(@jakarta.annotation.Nullable final String value) {
        this.destinationTimeZone = value;
    }
    /**
     * Sets the maxEstimatedDeliveryDate property value. The latest stated date and time the shipment will be delivered at this rate.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the maxEstimatedDeliveryDate property.
     */
    public void setMaxEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.maxEstimatedDeliveryDate = value;
    }
    /**
     * Sets the minEstimatedDeliveryDate property value. The estimated earliest date and time the shipment will be delivered at this rate. The time stamp is formatted as an ISO 8601 UTC string.
     * @param value Value to set for the minEstimatedDeliveryDate property.
     */
    public void setMinEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.minEstimatedDeliveryDate = value;
    }
    /**
     * Sets the pickupNetworks property value. A list of pickup networks compatible with the shipping service.
     * @param value Value to set for the pickupNetworks property.
     */
    public void setPickupNetworks(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.pickupNetworks = value;
    }
    /**
     * Sets the pickupSlots property value. A list of available pickup slots for the package.
     * @param value Value to set for the pickupSlots property.
     */
    public void setPickupSlots(@jakarta.annotation.Nullable final java.util.List<PickupSlot> value) {
        this.pickupSlots = value;
    }
    /**
     * Sets the pickupType property value. The type of pickup or drop-off service associated with the &lt;b&gt;pickupSlots&lt;/b&gt; time frames. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:PickupTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the pickupType property.
     */
    public void setPickupType(@jakarta.annotation.Nullable final String value) {
        this.pickupType = value;
    }
    /**
     * Sets the rateId property value. The unique eBay-assigned ID for this shipping rate.
     * @param value Value to set for the rateId property.
     */
    public void setRateId(@jakarta.annotation.Nullable final String value) {
        this.rateId = value;
    }
    /**
     * Sets the rateRecommendation property value. A list of reasons this rate is recommended. Available values are: &lt;ul&gt; &lt;li&gt;&lt;code&gt;BUYER_CHOSEN&lt;/code&gt; &amp;mdash; The rate meets or exceeds the requirements of the buyer&apos;s preferred shipping option.&lt;/li&gt; &lt;li&gt;&lt;code&gt;CHEAPEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate is the cheapest rate available that will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;EBAY_PLUS_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Plus program.&lt;/li&gt; &lt;li&gt;&lt;code&gt;FASTEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate has the fastest shipping time, and will provide delivery within the seller&apos;s time frame commitment.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GUARANTEED_DELIVERY_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the rateRecommendation property.
     */
    public void setRateRecommendation(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.rateRecommendation = value;
    }
    /**
     * Sets the shippingCarrierCode property value. The code name of the shipping carrier who will provide the service identified by &lt;b&gt;shippingServiceCode&lt;/b&gt;.
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the shippingCarrierName property value. The common name of the shipping carrier.
     * @param value Value to set for the shippingCarrierName property.
     */
    public void setShippingCarrierName(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierName = value;
    }
    /**
     * Sets the shippingServiceCode property value. The code name of the shipping service to be provided by the carrier identified by &lt;b&gt;shippingCarrierCode&lt;/b&gt;.
     * @param value Value to set for the shippingServiceCode property.
     */
    public void setShippingServiceCode(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceCode = value;
    }
    /**
     * Sets the shippingServiceName property value. The common name of the shipping service.
     * @param value Value to set for the shippingServiceName property.
     */
    public void setShippingServiceName(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceName = value;
    }
}
