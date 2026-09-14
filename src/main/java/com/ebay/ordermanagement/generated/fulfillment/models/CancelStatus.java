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
 * This type contains information about any requests that have been made to cancel an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time the order was cancelled, if applicable. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String cancelledDate;
    /**
     * This array contains details of one or more buyer requests to cancel the order. &lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; call:&lt;/strong&gt;  This array is returned but is always empty.&lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call:&lt;/strong&gt; This array is returned fully populated with information about any cancellation requests.
     */
    private java.util.List<CancelRequest> cancelRequests;
    /**
     * The state of the order with regard to cancellation. This field is always returned, and if there are no cancellation requests, a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt; is returned. 
     */
    private CancelStateEnum cancelState;
    /**
     * Instantiates a new {@link CancelStatus} and sets the default values.
     */
    public CancelStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelStatus}
     */
    @jakarta.annotation.Nonnull
    public static CancelStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelStatus();
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
     * Gets the cancelledDate property value. The date and time the order was cancelled, if applicable. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelledDate() {
        return this.cancelledDate;
    }
    /**
     * Gets the cancelRequests property value. This array contains details of one or more buyer requests to cancel the order. &lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; call:&lt;/strong&gt;  This array is returned but is always empty.&lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call:&lt;/strong&gt; This array is returned fully populated with information about any cancellation requests.
     * @return a {@link java.util.List<CancelRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CancelRequest> getCancelRequests() {
        return this.cancelRequests;
    }
    /**
     * Gets the cancelState property value. The state of the order with regard to cancellation. This field is always returned, and if there are no cancellation requests, a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt; is returned. 
     * @return a {@link CancelStateEnum}
     */
    @jakarta.annotation.Nullable
    public CancelStateEnum getCancelState() {
        return this.cancelState;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cancelledDate", (n) -> { this.setCancelledDate(n.getStringValue()); });
        deserializerMap.put("cancelRequests", (n) -> { this.setCancelRequests(n.getCollectionOfObjectValues(CancelRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("cancelState", (n) -> { this.setCancelState(n.getEnumValue(CancelStateEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cancelledDate", this.getCancelledDate());
        writer.writeCollectionOfObjectValues("cancelRequests", this.getCancelRequests());
        writer.writeEnumValue("cancelState", this.getCancelState());
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
     * Sets the cancelledDate property value. The date and time the order was cancelled, if applicable. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the cancelledDate property.
     */
    public void setCancelledDate(@jakarta.annotation.Nullable final String value) {
        this.cancelledDate = value;
    }
    /**
     * Sets the cancelRequests property value. This array contains details of one or more buyer requests to cancel the order. &lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; call:&lt;/strong&gt;  This array is returned but is always empty.&lt;br&gt;&lt;br&gt;&lt;strong&gt;For the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; call:&lt;/strong&gt; This array is returned fully populated with information about any cancellation requests.
     * @param value Value to set for the cancelRequests property.
     */
    public void setCancelRequests(@jakarta.annotation.Nullable final java.util.List<CancelRequest> value) {
        this.cancelRequests = value;
    }
    /**
     * Sets the cancelState property value. The state of the order with regard to cancellation. This field is always returned, and if there are no cancellation requests, a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt; is returned. 
     * @param value Value to set for the cancelState property.
     */
    public void setCancelState(@jakarta.annotation.Nullable final CancelStateEnum value) {
        this.cancelState = value;
    }
}
