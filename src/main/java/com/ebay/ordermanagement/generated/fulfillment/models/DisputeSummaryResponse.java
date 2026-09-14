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
 * This type defines the base response payload of the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method. Each payment dispute that matches the input criteria is returned under the &lt;strong&gt;paymentDisputeSummaries&lt;/strong&gt; array.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DisputeSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URI of the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call request that produced the current page of the result set.
     */
    private String href;
    /**
     * This value shows the maximum number of payment disputes that will appear on one page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;200&lt;/code&gt;. If the value in the &lt;strong&gt;total&lt;/strong&gt; field exceeds this &lt;strong&gt;limit&lt;/strong&gt; value, there are multiple pages in the current result set.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Min&lt;/strong&gt;: 1; &lt;strong&gt;Max&lt;/strong&gt;: 200; &lt;strong&gt;Default&lt;/strong&gt;: 200
     */
    private Integer limit;
    /**
     * The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the next page of the result set. For example, the following URI returns records 11 through 20 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=10&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     */
    private String next;
    /**
     * This integer value indicates the number of payment disputes skipped before listing the first payment dispute from the result set. The &lt;strong&gt;offset&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;0&lt;/code&gt; and the first payment dispute of the result set is shown at the top of the response.
     */
    private Integer offset;
    /**
     * Each payment dispute that matches the input criteria is returned under this array. If no payment disputes are found, an empty array is returned.
     */
    private java.util.List<PaymentDisputeSummary> paymentDisputeSummaries;
    /**
     * The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the previous page of the result set. For example, the following URI returns records 1 through 10 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=0&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     */
    private String prev;
    /**
     * This integer value is the total number of payment disputes that matched the input criteria. If the total number of entries exceeds the value that was set for &lt;strong&gt;limit&lt;/strong&gt; in the request payload, you will have to make multiple API calls to see all pages of the results set. This field is returned even if it is &lt;code&gt;0&lt;/code&gt;.
     */
    private Integer total;
    /**
     * Instantiates a new {@link DisputeSummaryResponse} and sets the default values.
     */
    public DisputeSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DisputeSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static DisputeSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisputeSummaryResponse();
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
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("paymentDisputeSummaries", (n) -> { this.setPaymentDisputeSummaries(n.getCollectionOfObjectValues(PaymentDisputeSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URI of the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call request that produced the current page of the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. This value shows the maximum number of payment disputes that will appear on one page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;200&lt;/code&gt;. If the value in the &lt;strong&gt;total&lt;/strong&gt; field exceeds this &lt;strong&gt;limit&lt;/strong&gt; value, there are multiple pages in the current result set.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Min&lt;/strong&gt;: 1; &lt;strong&gt;Max&lt;/strong&gt;: 200; &lt;strong&gt;Default&lt;/strong&gt;: 200
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the next page of the result set. For example, the following URI returns records 11 through 20 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=10&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. This integer value indicates the number of payment disputes skipped before listing the first payment dispute from the result set. The &lt;strong&gt;offset&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;0&lt;/code&gt; and the first payment dispute of the result set is shown at the top of the response.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the paymentDisputeSummaries property value. Each payment dispute that matches the input criteria is returned under this array. If no payment disputes are found, an empty array is returned.
     * @return a {@link java.util.List<PaymentDisputeSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentDisputeSummary> getPaymentDisputeSummaries() {
        return this.paymentDisputeSummaries;
    }
    /**
     * Gets the prev property value. The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the previous page of the result set. For example, the following URI returns records 1 through 10 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=0&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. This integer value is the total number of payment disputes that matched the input criteria. If the total number of entries exceeds the value that was set for &lt;strong&gt;limit&lt;/strong&gt; in the request payload, you will have to make multiple API calls to see all pages of the results set. This field is returned even if it is &lt;code&gt;0&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
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
        writer.writeCollectionOfObjectValues("paymentDisputeSummaries", this.getPaymentDisputeSummaries());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. The URI of the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call request that produced the current page of the result set.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. This value shows the maximum number of payment disputes that will appear on one page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;200&lt;/code&gt;. If the value in the &lt;strong&gt;total&lt;/strong&gt; field exceeds this &lt;strong&gt;limit&lt;/strong&gt; value, there are multiple pages in the current result set.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Min&lt;/strong&gt;: 1; &lt;strong&gt;Max&lt;/strong&gt;: 200; &lt;strong&gt;Default&lt;/strong&gt;: 200
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the next page of the result set. For example, the following URI returns records 11 through 20 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=10&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. This integer value indicates the number of payment disputes skipped before listing the first payment dispute from the result set. The &lt;strong&gt;offset&lt;/strong&gt; value can be passed in as a query parameter in the request, or if it is not used, it defaults to &lt;code&gt;0&lt;/code&gt; and the first payment dispute of the result set is shown at the top of the response.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the paymentDisputeSummaries property value. Each payment dispute that matches the input criteria is returned under this array. If no payment disputes are found, an empty array is returned.
     * @param value Value to set for the paymentDisputeSummaries property.
     */
    public void setPaymentDisputeSummaries(@jakarta.annotation.Nullable final java.util.List<PaymentDisputeSummary> value) {
        this.paymentDisputeSummaries = value;
    }
    /**
     * Sets the prev property value. The &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; call URI to use if you wish to view the previous page of the result set. For example, the following URI returns records 1 through 10 from the collection of payment disputes:&lt;br&gt;&lt;br&gt;&lt;code&gt;path/payment_dispute_summary?limit=10&amp;offset=0&lt;/code&gt;&lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. This integer value is the total number of payment disputes that matched the input criteria. If the total number of entries exceeds the value that was set for &lt;strong&gt;limit&lt;/strong&gt; in the request payload, you will have to make multiple API calls to see all pages of the results set. This field is returned even if it is &lt;code&gt;0&lt;/code&gt;.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
