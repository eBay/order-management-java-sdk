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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides information about the line item associated with the INR inquiry.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field indicates the item related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the item is on hold due to eBay policy violation; false otherwise.
     */
    private Boolean itemOnHold;
    /**
     * This field provides an URL where the gallery picture of the item may be viewed. This field is returned when available. If the item is on hold, this field may not be returned.
     */
    private String itemPictureUrl;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount itemPrice;
    /**
     * The title of the eBay listing. If the item is on hold, the &lt;b&gt;itemID&lt;/b&gt; of the listing is returned instead of the title.
     */
    private String itemTitle;
    /**
     * When available, this field provides the URL to the item purchase page. If the item is on hold, a placeholder may be returned instead of the gallery picture.
     */
    private String viewPurchasedItemUrl;
    /**
     * Instantiates a new {@link ItemDetails} and sets the default values.
     */
    public ItemDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemDetails}
     */
    @jakarta.annotation.Nonnull
    public static ItemDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("itemOnHold", (n) -> { this.setItemOnHold(n.getBooleanValue()); });
        deserializerMap.put("itemPictureUrl", (n) -> { this.setItemPictureUrl(n.getStringValue()); });
        deserializerMap.put("itemPrice", (n) -> { this.setItemPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("itemTitle", (n) -> { this.setItemTitle(n.getStringValue()); });
        deserializerMap.put("viewPurchasedItemUrl", (n) -> { this.setViewPurchasedItemUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemOnHold property value. This field indicates the item related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the item is on hold due to eBay policy violation; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getItemOnHold() {
        return this.itemOnHold;
    }
    /**
     * Gets the itemPictureUrl property value. This field provides an URL where the gallery picture of the item may be viewed. This field is returned when available. If the item is on hold, this field may not be returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemPictureUrl() {
        return this.itemPictureUrl;
    }
    /**
     * Gets the itemPrice property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getItemPrice() {
        return this.itemPrice;
    }
    /**
     * Gets the itemTitle property value. The title of the eBay listing. If the item is on hold, the &lt;b&gt;itemID&lt;/b&gt; of the listing is returned instead of the title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemTitle() {
        return this.itemTitle;
    }
    /**
     * Gets the viewPurchasedItemUrl property value. When available, this field provides the URL to the item purchase page. If the item is on hold, a placeholder may be returned instead of the gallery picture.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getViewPurchasedItemUrl() {
        return this.viewPurchasedItemUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("itemOnHold", this.getItemOnHold());
        writer.writeStringValue("itemPictureUrl", this.getItemPictureUrl());
        writer.writeObjectValue("itemPrice", this.getItemPrice());
        writer.writeStringValue("itemTitle", this.getItemTitle());
        writer.writeStringValue("viewPurchasedItemUrl", this.getViewPurchasedItemUrl());
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
     * Sets the itemOnHold property value. This field indicates the item related to the inquiry is hidden (the respective content is not returned). This field is returned as &apos;true&apos; if the item is on hold due to eBay policy violation; false otherwise.
     * @param value Value to set for the itemOnHold property.
     */
    public void setItemOnHold(@jakarta.annotation.Nullable final Boolean value) {
        this.itemOnHold = value;
    }
    /**
     * Sets the itemPictureUrl property value. This field provides an URL where the gallery picture of the item may be viewed. This field is returned when available. If the item is on hold, this field may not be returned.
     * @param value Value to set for the itemPictureUrl property.
     */
    public void setItemPictureUrl(@jakarta.annotation.Nullable final String value) {
        this.itemPictureUrl = value;
    }
    /**
     * Sets the itemPrice property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the itemPrice property.
     */
    public void setItemPrice(@jakarta.annotation.Nullable final Amount value) {
        this.itemPrice = value;
    }
    /**
     * Sets the itemTitle property value. The title of the eBay listing. If the item is on hold, the &lt;b&gt;itemID&lt;/b&gt; of the listing is returned instead of the title.
     * @param value Value to set for the itemTitle property.
     */
    public void setItemTitle(@jakarta.annotation.Nullable final String value) {
        this.itemTitle = value;
    }
    /**
     * Sets the viewPurchasedItemUrl property value. When available, this field provides the URL to the item purchase page. If the item is on hold, a placeholder may be returned instead of the gallery picture.
     * @param value Value to set for the viewPurchasedItemUrl property.
     */
    public void setViewPurchasedItemUrl(@jakarta.annotation.Nullable final String value) {
        this.viewPurchasedItemUrl = value;
    }
}
