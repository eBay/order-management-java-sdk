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
 * This type contains information about a sales promotion that is applied to a line item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppliedPromotion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A description of the applied sales promotion.
     */
    private String description;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount discountAmount;
    /**
     * An eBay-generated unique identifier of the sales promotion.&lt;br&gt;&lt;br&gt; Multiple types of sales promotions are available to eBay Store owners, including order size/volume discounts, shipping discounts, special coupons, and price markdowns. Sales promotions can be managed through the Marketing tab of Seller Hub in My eBay, or by using the Trading API&apos;s &lt;b&gt;SetPromotionalSale&lt;/b&gt; call or the Marketing API&apos;s &lt;b&gt;createItemPromotion&lt;/b&gt; method.
     */
    private String promotionId;
    /**
     * Instantiates a new {@link AppliedPromotion} and sets the default values.
     */
    public AppliedPromotion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppliedPromotion}
     */
    @jakarta.annotation.Nonnull
    public static AppliedPromotion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedPromotion();
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
     * Gets the description property value. A description of the applied sales promotion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discountAmount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDiscountAmount() {
        return this.discountAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionId", (n) -> { this.setPromotionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the promotionId property value. An eBay-generated unique identifier of the sales promotion.&lt;br&gt;&lt;br&gt; Multiple types of sales promotions are available to eBay Store owners, including order size/volume discounts, shipping discounts, special coupons, and price markdowns. Sales promotions can be managed through the Marketing tab of Seller Hub in My eBay, or by using the Trading API&apos;s &lt;b&gt;SetPromotionalSale&lt;/b&gt; call or the Marketing API&apos;s &lt;b&gt;createItemPromotion&lt;/b&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionId() {
        return this.promotionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("discountAmount", this.getDiscountAmount());
        writer.writeStringValue("promotionId", this.getPromotionId());
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
     * Sets the description property value. A description of the applied sales promotion.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the discountAmount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the discountAmount property.
     */
    public void setDiscountAmount(@jakarta.annotation.Nullable final Amount value) {
        this.discountAmount = value;
    }
    /**
     * Sets the promotionId property value. An eBay-generated unique identifier of the sales promotion.&lt;br&gt;&lt;br&gt; Multiple types of sales promotions are available to eBay Store owners, including order size/volume discounts, shipping discounts, special coupons, and price markdowns. Sales promotions can be managed through the Marketing tab of Seller Hub in My eBay, or by using the Trading API&apos;s &lt;b&gt;SetPromotionalSale&lt;/b&gt; call or the Marketing API&apos;s &lt;b&gt;createItemPromotion&lt;/b&gt; method.
     * @param value Value to set for the promotionId property.
     */
    public void setPromotionId(@jakarta.annotation.Nullable final String value) {
        this.promotionId = value;
    }
}
