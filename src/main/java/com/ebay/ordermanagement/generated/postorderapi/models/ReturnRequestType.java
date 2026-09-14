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
 * This type is used by the &lt;b&gt;returnRequest&lt;/b&gt; container that is used in numerous methods to provide details about the buyer&apos;s return request, including the order line item (and quantity) that is being returned and the reason for the return.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnRequestType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration value indicates the shipping carrier that will be used to ship the return item.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing shipping carriers are defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     */
    private String carrier;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * The unique identifier of the eBay listing where the item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item within an order.
     */
    private String itemId;
    /**
     * This enumerated value indicates the buyer&apos;s reason for creating a return request or draft.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing valid return reasons are defined in the &lt;a href=&quot;/devzone/post-order/types/ReturnReasonEnum.html&quot;&gt;ReturnReasonEnum&lt;/a&gt; type definition.
     */
    private String reason;
    /**
     * This enumerated type allows a user to differentiate between a return request and a return request draft.
     */
    private RequestTypeEnum requestType;
    /**
     * This integer value indicates the quantity of the line item being returned. This number is generally &lt;code&gt;1&lt;/code&gt;, unless the buyer bought multiple quantity of the item in a multiple-quantity, fixed-price listing. This value defaults to &lt;code&gt;1&lt;/code&gt; if this field is omitted when a return is created.
     */
    private Integer returnQuantity;
    /**
     * The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item within an order.
     */
    private String transactionId;
    /**
     * This enumerated type lists the possible values that the buyer can pass in the &lt;b&gt;type&lt;/b&gt; field when the buyer is creating a return request or draft with the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/return/draft&lt;/b&gt; methods. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;MONEY_BACK&lt;/code&gt; is the only supported value.&lt;/p&gt;
     */
    private ReturnTypeEnum type;
    /**
     * Instantiates a new {@link ReturnRequestType} and sets the default values.
     */
    public ReturnRequestType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReturnRequestType}
     */
    @jakarta.annotation.Nonnull
    public static ReturnRequestType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReturnRequestType();
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
     * Gets the carrier property value. This enumeration value indicates the shipping carrier that will be used to ship the return item.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing shipping carriers are defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrier() {
        return this.carrier;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("carrier", (n) -> { this.setCarrier(n.getStringValue()); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getEnumValue(RequestTypeEnum::forValue)); });
        deserializerMap.put("returnQuantity", (n) -> { this.setReturnQuantity(n.getIntegerValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ReturnTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. The unique identifier of the eBay listing where the item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item within an order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the reason property value. This enumerated value indicates the buyer&apos;s reason for creating a return request or draft.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing valid return reasons are defined in the &lt;a href=&quot;/devzone/post-order/types/ReturnReasonEnum.html&quot;&gt;ReturnReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the requestType property value. This enumerated type allows a user to differentiate between a return request and a return request draft.
     * @return a {@link RequestTypeEnum}
     */
    @jakarta.annotation.Nullable
    public RequestTypeEnum getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the returnQuantity property value. This integer value indicates the quantity of the line item being returned. This number is generally &lt;code&gt;1&lt;/code&gt;, unless the buyer bought multiple quantity of the item in a multiple-quantity, fixed-price listing. This value defaults to &lt;code&gt;1&lt;/code&gt; if this field is omitted when a return is created.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReturnQuantity() {
        return this.returnQuantity;
    }
    /**
     * Gets the transactionId property value. The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item within an order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the type property value. This enumerated type lists the possible values that the buyer can pass in the &lt;b&gt;type&lt;/b&gt; field when the buyer is creating a return request or draft with the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/return/draft&lt;/b&gt; methods. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;MONEY_BACK&lt;/code&gt; is the only supported value.&lt;/p&gt;
     * @return a {@link ReturnTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ReturnTypeEnum getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("carrier", this.getCarrier());
        writer.writeObjectValue("comments", this.getComments());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("reason", this.getReason());
        writer.writeEnumValue("requestType", this.getRequestType());
        writer.writeIntegerValue("returnQuantity", this.getReturnQuantity());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the carrier property value. This enumeration value indicates the shipping carrier that will be used to ship the return item.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing shipping carriers are defined in the &lt;a href=&quot;/devzone/post-order/types/ShippingCarrierEnum.html&quot;&gt;ShippingCarrierEnum&lt;/a&gt; type definition.
     * @param value Value to set for the carrier property.
     */
    public void setCarrier(@jakarta.annotation.Nullable final String value) {
        this.carrier = value;
    }
    /**
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item within an order.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the reason property value. This enumerated value indicates the buyer&apos;s reason for creating a return request or draft.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing valid return reasons are defined in the &lt;a href=&quot;/devzone/post-order/types/ReturnReasonEnum.html&quot;&gt;ReturnReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the requestType property value. This enumerated type allows a user to differentiate between a return request and a return request draft.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final RequestTypeEnum value) {
        this.requestType = value;
    }
    /**
     * Sets the returnQuantity property value. This integer value indicates the quantity of the line item being returned. This number is generally &lt;code&gt;1&lt;/code&gt;, unless the buyer bought multiple quantity of the item in a multiple-quantity, fixed-price listing. This value defaults to &lt;code&gt;1&lt;/code&gt; if this field is omitted when a return is created.
     * @param value Value to set for the returnQuantity property.
     */
    public void setReturnQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.returnQuantity = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier for the purchase of a item. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item within an order.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the type property value. This enumerated type lists the possible values that the buyer can pass in the &lt;b&gt;type&lt;/b&gt; field when the buyer is creating a return request or draft with the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/return/draft&lt;/b&gt; methods. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;MONEY_BACK&lt;/code&gt; is the only supported value.&lt;/p&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ReturnTypeEnum value) {
        this.type = value;
    }
}
