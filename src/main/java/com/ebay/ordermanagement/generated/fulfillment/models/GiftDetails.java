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
 * This type contains information about a digital gift card line item that was purchased as a gift and sent to the recipient by email.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; &lt;b&gt;GiftDetails&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GiftDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field contains the gift message from the buyer to the gift recipient. This field is only returned if the buyer of the gift included a message for the gift.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;message&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String message;
    /**
     * The email address of the gift recipient. The seller will send the digital gift card to this email address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;recipientEmail&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String recipientEmail;
    /**
     * The name of the buyer, which will appear on the email that is sent to the gift recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;senderName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     */
    private String senderName;
    /**
     * Instantiates a new {@link GiftDetails} and sets the default values.
     */
    public GiftDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GiftDetails}
     */
    @jakarta.annotation.Nonnull
    public static GiftDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GiftDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("recipientEmail", (n) -> { this.setRecipientEmail(n.getStringValue()); });
        deserializerMap.put("senderName", (n) -> { this.setSenderName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. This field contains the gift message from the buyer to the gift recipient. This field is only returned if the buyer of the gift included a message for the gift.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;message&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the recipientEmail property value. The email address of the gift recipient. The seller will send the digital gift card to this email address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;recipientEmail&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmail() {
        return this.recipientEmail;
    }
    /**
     * Gets the senderName property value. The name of the buyer, which will appear on the email that is sent to the gift recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;senderName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderName() {
        return this.senderName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
        writer.writeStringValue("senderName", this.getSenderName());
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
     * Sets the message property value. This field contains the gift message from the buyer to the gift recipient. This field is only returned if the buyer of the gift included a message for the gift.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;message&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the recipientEmail property value. The email address of the gift recipient. The seller will send the digital gift card to this email address.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;recipientEmail&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the recipientEmail property.
     */
    public void setRecipientEmail(@jakarta.annotation.Nullable final String value) {
        this.recipientEmail = value;
    }
    /**
     * Sets the senderName property value. The name of the buyer, which will appear on the email that is sent to the gift recipient.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;b&gt;senderName&lt;/b&gt; will not be returned for any order that is more than 90 days old.&lt;/span&gt;
     * @param value Value to set for the senderName property.
     */
    public void setSenderName(@jakarta.annotation.Nullable final String value) {
        this.senderName = value;
    }
}
