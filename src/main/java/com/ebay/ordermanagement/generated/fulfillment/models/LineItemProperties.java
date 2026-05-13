package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about the eBay programs under which a line item was listed and sold.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LineItemProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that the line item is covered by eBay&apos;s Buyer Protection program.
     */
    private Boolean buyerProtection;
    /**
     * This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the purchase occurred by the buyer and seller mutually agreeing on a Best Offer amount. The Best Offer feature can be set up for any listing type, but if this feature is set up for an auction listing, it will no longer be available once a bid has been placed on the listing.
     */
    private Boolean fromBestOffer;
    /**
     * This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the line item was sold as a result of a seller&apos;s ad campaign.
     */
    private Boolean soldViaAdCampaign;
    /**
     * Instantiates a new {@link LineItemProperties} and sets the default values.
     */
    public LineItemProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LineItemProperties}
     */
    @jakarta.annotation.Nonnull
    public static LineItemProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LineItemProperties();
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
     * Gets the buyerProtection property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the line item is covered by eBay&apos;s Buyer Protection program.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBuyerProtection() {
        return this.buyerProtection;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("buyerProtection", (n) -> { this.setBuyerProtection(n.getBooleanValue()); });
        deserializerMap.put("fromBestOffer", (n) -> { this.setFromBestOffer(n.getBooleanValue()); });
        deserializerMap.put("soldViaAdCampaign", (n) -> { this.setSoldViaAdCampaign(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromBestOffer property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the purchase occurred by the buyer and seller mutually agreeing on a Best Offer amount. The Best Offer feature can be set up for any listing type, but if this feature is set up for an auction listing, it will no longer be available once a bid has been placed on the listing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFromBestOffer() {
        return this.fromBestOffer;
    }
    /**
     * Gets the soldViaAdCampaign property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the line item was sold as a result of a seller&apos;s ad campaign.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSoldViaAdCampaign() {
        return this.soldViaAdCampaign;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("buyerProtection", this.getBuyerProtection());
        writer.writeBooleanValue("fromBestOffer", this.getFromBestOffer());
        writer.writeBooleanValue("soldViaAdCampaign", this.getSoldViaAdCampaign());
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
     * Sets the buyerProtection property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the line item is covered by eBay&apos;s Buyer Protection program.
     * @param value Value to set for the buyerProtection property.
     */
    public void setBuyerProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.buyerProtection = value;
    }
    /**
     * Sets the fromBestOffer property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the purchase occurred by the buyer and seller mutually agreeing on a Best Offer amount. The Best Offer feature can be set up for any listing type, but if this feature is set up for an auction listing, it will no longer be available once a bid has been placed on the listing.
     * @param value Value to set for the fromBestOffer property.
     */
    public void setFromBestOffer(@jakarta.annotation.Nullable final Boolean value) {
        this.fromBestOffer = value;
    }
    /**
     * Sets the soldViaAdCampaign property value. This field is only returned if &lt;code&gt;true&lt;/code&gt; and indicates that the line item was sold as a result of a seller&apos;s ad campaign.
     * @param value Value to set for the soldViaAdCampaign property.
     */
    public void setSoldViaAdCampaign(@jakarta.annotation.Nullable final Boolean value) {
        this.soldViaAdCampaign = value;
    }
}
