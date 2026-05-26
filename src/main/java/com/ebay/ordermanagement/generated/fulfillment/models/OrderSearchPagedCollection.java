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
 * This type contains the specifications for the collection of orders that match the search or filter criteria of a &lt;b&gt;getOrders&lt;/b&gt; call. The collection is grouped into a result set, and based on the query parameters that are set (including the &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt; parameters), the result set may included multiple pages, but only one page of the result set can be viewed at a time.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderSearchPagedCollection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URI of the &lt;b&gt;getOrders&lt;/b&gt; call request that produced the current page of the result set.
     */
    private String href;
    /**
     * The maximum number of orders returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;50&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer orders than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of orders matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total orders) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 orders per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getOrders&lt;/strong&gt; calls to view all orders matching the input criteria. &lt;/span&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;50&lt;/code&gt;
     */
    private Integer limit;
    /**
     * The &lt;b&gt;getOrders&lt;/b&gt; call URI to use if you wish to view the  next page of the result set. For example, the following URI returns records 41 thru 50 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=40 &lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.&lt;br&gt;
     */
    private String next;
    /**
     * The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     */
    private Integer offset;
    /**
     * This array contains one or more orders that are part of the current result set, that is controlled by the input criteria. The details of each order include information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status. &lt;br&gt;&lt;br&gt;By default, orders are returned according to creation date (oldest to newest), but the order will vary according to any filter that is set in request.
     */
    private java.util.List<Order> orders;
    /**
     * The &lt;b&gt;getOrders&lt;/b&gt; call URI for the previous result set. For example, the following URI returns orders 21 thru 30 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=20&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     */
    private String prev;
    /**
     * The total number of orders in the results set based on the current input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no orders are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     */
    private Integer total;
    /**
     * This array is returned if one or more errors or warnings occur with the call request.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link OrderSearchPagedCollection} and sets the default values.
     */
    public OrderSearchPagedCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderSearchPagedCollection}
     */
    @jakarta.annotation.Nonnull
    public static OrderSearchPagedCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderSearchPagedCollection();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("orders", (n) -> { this.setOrders(n.getCollectionOfObjectValues(Order::createFromDiscriminatorValue)); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URI of the &lt;b&gt;getOrders&lt;/b&gt; call request that produced the current page of the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The maximum number of orders returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;50&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer orders than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of orders matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total orders) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 orders per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getOrders&lt;/strong&gt; calls to view all orders matching the input criteria. &lt;/span&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;50&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The &lt;b&gt;getOrders&lt;/b&gt; call URI to use if you wish to view the  next page of the result set. For example, the following URI returns records 41 thru 50 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=40 &lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.&lt;br&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the orders property value. This array contains one or more orders that are part of the current result set, that is controlled by the input criteria. The details of each order include information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status. &lt;br&gt;&lt;br&gt;By default, orders are returned according to creation date (oldest to newest), but the order will vary according to any filter that is set in request.
     * @return a {@link java.util.List<Order>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Order> getOrders() {
        return this.orders;
    }
    /**
     * Gets the prev property value. The &lt;b&gt;getOrders&lt;/b&gt; call URI for the previous result set. For example, the following URI returns orders 21 thru 30 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=20&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. The total number of orders in the results set based on the current input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no orders are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Gets the warnings property value. This array is returned if one or more errors or warnings occur with the call request.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeCollectionOfObjectValues("orders", this.getOrders());
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
     * Sets the href property value. The URI of the &lt;b&gt;getOrders&lt;/b&gt; call request that produced the current page of the result set.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The maximum number of orders returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;50&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer orders than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of orders matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total orders) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 orders per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getOrders&lt;/strong&gt; calls to view all orders matching the input criteria. &lt;/span&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;50&lt;/code&gt;
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The &lt;b&gt;getOrders&lt;/b&gt; call URI to use if you wish to view the  next page of the result set. For example, the following URI returns records 41 thru 50 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=40 &lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.&lt;br&gt;
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the orders property value. This array contains one or more orders that are part of the current result set, that is controlled by the input criteria. The details of each order include information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status. &lt;br&gt;&lt;br&gt;By default, orders are returned according to creation date (oldest to newest), but the order will vary according to any filter that is set in request.
     * @param value Value to set for the orders property.
     */
    public void setOrders(@jakarta.annotation.Nullable final java.util.List<Order> value) {
        this.orders = value;
    }
    /**
     * Sets the prev property value. The &lt;b&gt;getOrders&lt;/b&gt; call URI for the previous result set. For example, the following URI returns orders 21 thru 30 from the collection of orders: &lt;br&gt;&lt;br&gt;&lt;code&gt;&lt;i&gt;path&lt;/i&gt;/order?limit=10&amp;offset=20&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. The total number of orders in the results set based on the current input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If no orders are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
    /**
     * Sets the warnings property value. This array is returned if one or more errors or warnings occur with the call request.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
