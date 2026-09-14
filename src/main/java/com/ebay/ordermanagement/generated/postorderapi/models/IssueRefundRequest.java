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
 * The base request type for the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method, which is used to issue a refund to the buyer for a returned item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IssueRefundRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * This type is used by &lt;b&gt;refundDetail&lt;/b&gt; container in the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; and &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; methods to specify the total amount of the refund, as well as an &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type (refund on purchase price, refund on original shipping, or any other costs paid by the buyer). The amount(s) in the &lt;b&gt;itemizedRefundDetail.amount&lt;/b&gt; field(s) should equal the amount in the &lt;b&gt;refundDetail.totalAmount&lt;/b&gt; field. This type is also used by the &lt;b&gt;actualRefund&lt;/b&gt; container in the response of a &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method to provide information about a successful refund for a return.
     */
    private RefundDetailType refundDetail;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to relist/restock the returned item automatically after the refund operation succeeds. &lt;br/&gt;&lt;br/&gt;Sellers can check the eligibility for an item to be relisted by calling &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistStatus&quot;&gt;Get Return&lt;/a&gt;. In the response, check the &lt;b&gt;itemDetail.relistStatus&lt;/b&gt; field for eligibility. This field will also show the status of a relist request as either &lt;code&gt;SUCCESS&lt;/code&gt; (the relist succeeded) or &lt;code&gt;FAILED&lt;/code&gt; (the relist request did not succeed).  &lt;br/&gt;&lt;br/&gt;If the relist request succeeds, call &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistedItemId&quot;&gt;Get Return&lt;/a&gt; and check the &lt;b&gt;itemDetail.relistedItemId&lt;/b&gt; to get the listing ID of the newly relisted item (the ID should match the ID of the original item listing).
     */
    private Boolean relistItem;
    /**
     * Instantiates a new {@link IssueRefundRequest} and sets the default values.
     */
    public IssueRefundRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IssueRefundRequest}
     */
    @jakarta.annotation.Nonnull
    public static IssueRefundRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IssueRefundRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("refundDetail", (n) -> { this.setRefundDetail(n.getObjectValue(RefundDetailType::createFromDiscriminatorValue)); });
        deserializerMap.put("relistItem", (n) -> { this.setRelistItem(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refundDetail property value. This type is used by &lt;b&gt;refundDetail&lt;/b&gt; container in the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; and &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; methods to specify the total amount of the refund, as well as an &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type (refund on purchase price, refund on original shipping, or any other costs paid by the buyer). The amount(s) in the &lt;b&gt;itemizedRefundDetail.amount&lt;/b&gt; field(s) should equal the amount in the &lt;b&gt;refundDetail.totalAmount&lt;/b&gt; field. This type is also used by the &lt;b&gt;actualRefund&lt;/b&gt; container in the response of a &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method to provide information about a successful refund for a return.
     * @return a {@link RefundDetailType}
     */
    @jakarta.annotation.Nullable
    public RefundDetailType getRefundDetail() {
        return this.refundDetail;
    }
    /**
     * Gets the relistItem property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to relist/restock the returned item automatically after the refund operation succeeds. &lt;br/&gt;&lt;br/&gt;Sellers can check the eligibility for an item to be relisted by calling &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistStatus&quot;&gt;Get Return&lt;/a&gt;. In the response, check the &lt;b&gt;itemDetail.relistStatus&lt;/b&gt; field for eligibility. This field will also show the status of a relist request as either &lt;code&gt;SUCCESS&lt;/code&gt; (the relist succeeded) or &lt;code&gt;FAILED&lt;/code&gt; (the relist request did not succeed).  &lt;br/&gt;&lt;br/&gt;If the relist request succeeds, call &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistedItemId&quot;&gt;Get Return&lt;/a&gt; and check the &lt;b&gt;itemDetail.relistedItemId&lt;/b&gt; to get the listing ID of the newly relisted item (the ID should match the ID of the original item listing).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRelistItem() {
        return this.relistItem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("comments", this.getComments());
        writer.writeObjectValue("refundDetail", this.getRefundDetail());
        writer.writeBooleanValue("relistItem", this.getRelistItem());
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
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the refundDetail property value. This type is used by &lt;b&gt;refundDetail&lt;/b&gt; container in the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; and &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; methods to specify the total amount of the refund, as well as an &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type (refund on purchase price, refund on original shipping, or any other costs paid by the buyer). The amount(s) in the &lt;b&gt;itemizedRefundDetail.amount&lt;/b&gt; field(s) should equal the amount in the &lt;b&gt;refundDetail.totalAmount&lt;/b&gt; field. This type is also used by the &lt;b&gt;actualRefund&lt;/b&gt; container in the response of a &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method to provide information about a successful refund for a return.
     * @param value Value to set for the refundDetail property.
     */
    public void setRefundDetail(@jakarta.annotation.Nullable final RefundDetailType value) {
        this.refundDetail = value;
    }
    /**
     * Sets the relistItem property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to relist/restock the returned item automatically after the refund operation succeeds. &lt;br/&gt;&lt;br/&gt;Sellers can check the eligibility for an item to be relisted by calling &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistStatus&quot;&gt;Get Return&lt;/a&gt;. In the response, check the &lt;b&gt;itemDetail.relistStatus&lt;/b&gt; field for eligibility. This field will also show the status of a relist request as either &lt;code&gt;SUCCESS&lt;/code&gt; (the relist succeeded) or &lt;code&gt;FAILED&lt;/code&gt; (the relist request did not succeed).  &lt;br/&gt;&lt;br/&gt;If the relist request succeeds, call &lt;a href=&quot;/devzone/post-order/post-order_v2_return-returnId__get.html#Response.detail.itemDetail.relistedItemId&quot;&gt;Get Return&lt;/a&gt; and check the &lt;b&gt;itemDetail.relistedItemId&lt;/b&gt; to get the listing ID of the newly relisted item (the ID should match the ID of the original item listing).
     * @param value Value to set for the relistItem property.
     */
    public void setRelistItem(@jakarta.annotation.Nullable final Boolean value) {
        this.relistItem = value;
    }
}
