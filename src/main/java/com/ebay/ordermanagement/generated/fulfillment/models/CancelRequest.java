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
 * This type contains information about a buyer request to cancel an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String cancelCompletedDate;
    /**
     * This string value indicates the party who made the initial cancellation request. Typically, either the &apos;Buyer&apos; or &apos;Seller&apos;. If a cancellation request has been made, this field should be returned.
     */
    private String cancelInitiator;
    /**
     * The reason why the &lt;b&gt;cancelInitiator&lt;/b&gt; initiated the cancellation request. Cancellation reasons for a buyer might include &apos;order placed by mistake&apos; or &apos;order won&apos;t arrive in time&apos;. For a seller, a typical cancellation reason is &apos;out of stock&apos;. If a cancellation request has been made, this field should be returned.
     */
    private String cancelReason;
    /**
     * The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String cancelRequestedDate;
    /**
     * The unique identifier of the order cancellation request. This field is returned for each cancellation request.
     */
    private String cancelRequestId;
    /**
     * The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String cancelRequestState;
    /**
     * Instantiates a new {@link CancelRequest} and sets the default values.
     */
    public CancelRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelRequest}
     */
    @jakarta.annotation.Nonnull
    public static CancelRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelRequest();
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
     * Gets the cancelCompletedDate property value. The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelCompletedDate() {
        return this.cancelCompletedDate;
    }
    /**
     * Gets the cancelInitiator property value. This string value indicates the party who made the initial cancellation request. Typically, either the &apos;Buyer&apos; or &apos;Seller&apos;. If a cancellation request has been made, this field should be returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelInitiator() {
        return this.cancelInitiator;
    }
    /**
     * Gets the cancelReason property value. The reason why the &lt;b&gt;cancelInitiator&lt;/b&gt; initiated the cancellation request. Cancellation reasons for a buyer might include &apos;order placed by mistake&apos; or &apos;order won&apos;t arrive in time&apos;. For a seller, a typical cancellation reason is &apos;out of stock&apos;. If a cancellation request has been made, this field should be returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelReason() {
        return this.cancelReason;
    }
    /**
     * Gets the cancelRequestedDate property value. The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelRequestedDate() {
        return this.cancelRequestedDate;
    }
    /**
     * Gets the cancelRequestId property value. The unique identifier of the order cancellation request. This field is returned for each cancellation request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelRequestId() {
        return this.cancelRequestId;
    }
    /**
     * Gets the cancelRequestState property value. The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelRequestState() {
        return this.cancelRequestState;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("cancelCompletedDate", (n) -> { this.setCancelCompletedDate(n.getStringValue()); });
        deserializerMap.put("cancelInitiator", (n) -> { this.setCancelInitiator(n.getStringValue()); });
        deserializerMap.put("cancelReason", (n) -> { this.setCancelReason(n.getStringValue()); });
        deserializerMap.put("cancelRequestedDate", (n) -> { this.setCancelRequestedDate(n.getStringValue()); });
        deserializerMap.put("cancelRequestId", (n) -> { this.setCancelRequestId(n.getStringValue()); });
        deserializerMap.put("cancelRequestState", (n) -> { this.setCancelRequestState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cancelCompletedDate", this.getCancelCompletedDate());
        writer.writeStringValue("cancelInitiator", this.getCancelInitiator());
        writer.writeStringValue("cancelReason", this.getCancelReason());
        writer.writeStringValue("cancelRequestedDate", this.getCancelRequestedDate());
        writer.writeStringValue("cancelRequestId", this.getCancelRequestId());
        writer.writeStringValue("cancelRequestState", this.getCancelRequestState());
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
     * Sets the cancelCompletedDate property value. The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the cancelCompletedDate property.
     */
    public void setCancelCompletedDate(@jakarta.annotation.Nullable final String value) {
        this.cancelCompletedDate = value;
    }
    /**
     * Sets the cancelInitiator property value. This string value indicates the party who made the initial cancellation request. Typically, either the &apos;Buyer&apos; or &apos;Seller&apos;. If a cancellation request has been made, this field should be returned.
     * @param value Value to set for the cancelInitiator property.
     */
    public void setCancelInitiator(@jakarta.annotation.Nullable final String value) {
        this.cancelInitiator = value;
    }
    /**
     * Sets the cancelReason property value. The reason why the &lt;b&gt;cancelInitiator&lt;/b&gt; initiated the cancellation request. Cancellation reasons for a buyer might include &apos;order placed by mistake&apos; or &apos;order won&apos;t arrive in time&apos;. For a seller, a typical cancellation reason is &apos;out of stock&apos;. If a cancellation request has been made, this field should be returned.
     * @param value Value to set for the cancelReason property.
     */
    public void setCancelReason(@jakarta.annotation.Nullable final String value) {
        this.cancelReason = value;
    }
    /**
     * Sets the cancelRequestedDate property value. The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the cancelRequestedDate property.
     */
    public void setCancelRequestedDate(@jakarta.annotation.Nullable final String value) {
        this.cancelRequestedDate = value;
    }
    /**
     * Sets the cancelRequestId property value. The unique identifier of the order cancellation request. This field is returned for each cancellation request.
     * @param value Value to set for the cancelRequestId property.
     */
    public void setCancelRequestId(@jakarta.annotation.Nullable final String value) {
        this.cancelRequestId = value;
    }
    /**
     * Sets the cancelRequestState property value. The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the cancelRequestState property.
     */
    public void setCancelRequestState(@jakarta.annotation.Nullable final String value) {
        this.cancelRequestState = value;
    }
}
