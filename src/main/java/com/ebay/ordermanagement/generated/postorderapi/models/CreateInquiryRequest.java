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
 * The base request type of the &lt;b&gt;POST /post-order/v2/inquiry&lt;/b&gt; method, which is used to create an Item Not Received (INR) inquiry on behalf of the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateInquiryRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This integer is the quantity of the line item purchased by the buyer. This value will usually be &lt;code&gt;1&lt;/code&gt; unless the buyer purchased multiple quantity of a line item in a multiple-quantity, fixed-priced listing. &lt;br/&gt;&lt;br/&gt;If this field is omitted, its value defaults to &lt;code&gt;1&lt;/code&gt;.
     */
    private Integer claimQuantity;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * This enumerated type lists the desired outcomes that the buyer may specify when creating an INR inquiry.
     */
    private DesiredOutcomeTypeEnum desiredOutcome;
    /**
     * The unique identifier of the eBay listing where the line item was purchased. This field and the &lt;b&gt;transactionId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     */
    private String itemId;
    /**
     * The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field and the &lt;b&gt;itemId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     */
    private String transactionId;
    /**
     * Instantiates a new {@link CreateInquiryRequest} and sets the default values.
     */
    public CreateInquiryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateInquiryRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateInquiryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateInquiryRequest();
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
     * Gets the claimQuantity property value. This integer is the quantity of the line item purchased by the buyer. This value will usually be &lt;code&gt;1&lt;/code&gt; unless the buyer purchased multiple quantity of a line item in a multiple-quantity, fixed-priced listing. &lt;br/&gt;&lt;br/&gt;If this field is omitted, its value defaults to &lt;code&gt;1&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClaimQuantity() {
        return this.claimQuantity;
    }
    /**
     * Gets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @return a {@link Text}
     */
    @jakarta.annotation.Nullable
    public Text getComments() {
        return this.comments;
    }
    /**
     * Gets the desiredOutcome property value. This enumerated type lists the desired outcomes that the buyer may specify when creating an INR inquiry.
     * @return a {@link DesiredOutcomeTypeEnum}
     */
    @jakarta.annotation.Nullable
    public DesiredOutcomeTypeEnum getDesiredOutcome() {
        return this.desiredOutcome;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("claimQuantity", (n) -> { this.setClaimQuantity(n.getIntegerValue()); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("desiredOutcome", (n) -> { this.setDesiredOutcome(n.getEnumValue(DesiredOutcomeTypeEnum::forValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field and the &lt;b&gt;transactionId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the transactionId property value. The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field and the &lt;b&gt;itemId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("claimQuantity", this.getClaimQuantity());
        writer.writeObjectValue("comments", this.getComments());
        writer.writeEnumValue("desiredOutcome", this.getDesiredOutcome());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("transactionId", this.getTransactionId());
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
     * Sets the claimQuantity property value. This integer is the quantity of the line item purchased by the buyer. This value will usually be &lt;code&gt;1&lt;/code&gt; unless the buyer purchased multiple quantity of a line item in a multiple-quantity, fixed-priced listing. &lt;br/&gt;&lt;br/&gt;If this field is omitted, its value defaults to &lt;code&gt;1&lt;/code&gt;.
     * @param value Value to set for the claimQuantity property.
     */
    public void setClaimQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.claimQuantity = value;
    }
    /**
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the desiredOutcome property value. This enumerated type lists the desired outcomes that the buyer may specify when creating an INR inquiry.
     * @param value Value to set for the desiredOutcome property.
     */
    public void setDesiredOutcome(@jakarta.annotation.Nullable final DesiredOutcomeTypeEnum value) {
        this.desiredOutcome = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field and the &lt;b&gt;transactionId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field and the &lt;b&gt;itemId&lt;/b&gt; field are required in order to identify the line item for which an INR inquiry will be created.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
}
