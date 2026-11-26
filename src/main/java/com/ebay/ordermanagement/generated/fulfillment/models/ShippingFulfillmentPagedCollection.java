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
 * This type contains the specifications for the entire collection of shipping fulfillments that are associated with the order specified by a &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-shipping_fulfillment-getshippingfulfillments&quot; target=&quot;_blank&quot;&gt;getShippingFulfillments&lt;/a&gt; call. The &lt;strong&gt;fulfillments&lt;/strong&gt; container returns an array of all the fulfillments in the collection.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingFulfillmentPagedCollection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains one or more fulfillments required for the order that was specified in method endpoint.
     */
    private java.util.List<ShippingFulfillment> fulfillments;
    /**
     * Maximum number of fulfillments returned per page.
     */
    private Integer limit;
    /**
     * URI of the next page of results, if one exists.
     */
    private String next;
    /**
     * Number of fulfillments skipped before this page.
     */
    private Integer offset;
    /**
     * URI of the previous page of results, if one exists.
     */
    private String prev;
    /**
     * The total number of fulfillments in the specified order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no fulfillments are found for the order, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     */
    private Integer total;
    /**
     * This array is only returned if one or more errors or warnings occur with the call request.
     */
    private java.util.List<ErrorDetail> warnings;
    /**
     * Instantiates a new {@link ShippingFulfillmentPagedCollection} and sets the default values.
     */
    public ShippingFulfillmentPagedCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingFulfillmentPagedCollection}
     */
    @jakarta.annotation.Nonnull
    public static ShippingFulfillmentPagedCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingFulfillmentPagedCollection();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("fulfillments", (n) -> { this.setFulfillments(n.getCollectionOfObjectValues(ShippingFulfillment::createFromDiscriminatorValue)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillments property value. This array contains one or more fulfillments required for the order that was specified in method endpoint.
     * @return a {@link java.util.List<ShippingFulfillment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingFulfillment> getFulfillments() {
        return this.fulfillments;
    }
    /**
     * Gets the limit property value. Maximum number of fulfillments returned per page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. URI of the next page of results, if one exists.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. Number of fulfillments skipped before this page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the prev property value. URI of the previous page of results, if one exists.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. The total number of fulfillments in the specified order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no fulfillments are found for the order, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Gets the warnings property value. This array is only returned if one or more errors or warnings occur with the call request.
     * @return a {@link java.util.List<ErrorDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetail> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("fulfillments", this.getFulfillments());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the fulfillments property value. This array contains one or more fulfillments required for the order that was specified in method endpoint.
     * @param value Value to set for the fulfillments property.
     */
    public void setFulfillments(@jakarta.annotation.Nullable final java.util.List<ShippingFulfillment> value) {
        this.fulfillments = value;
    }
    /**
     * Sets the limit property value. Maximum number of fulfillments returned per page.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. URI of the next page of results, if one exists.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. Number of fulfillments skipped before this page.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the prev property value. URI of the previous page of results, if one exists.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. The total number of fulfillments in the specified order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no fulfillments are found for the order, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
    /**
     * Sets the warnings property value. This array is only returned if one or more errors or warnings occur with the call request.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetail> value) {
        this.warnings = value;
    }
}
