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
 * This type is used by each recorded activity on a payment dispute, from creation to resolution.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeActivity implements AdditionalDataHolder, Parsable {
    /**
     * The timestamp in this field shows the date/time of the payment dispute activity.&lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String activityDate;
    /**
     * This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of &lt;code&gt;DISPUTE_OPENED&lt;/code&gt; is returned when a payment disute is first created,  a value indicating the seller&apos;s decision on the dispute, such as &lt;code&gt;SELLER_CONTEST&lt;/code&gt;, is returned when seller makes a decision to accept or contest dispute, and a value of &lt;code&gt;DISPUTE_CLOSED&lt;/code&gt; is returned when a payment disute is resolved. See &lt;strong&gt;ActivityEnum&lt;/strong&gt; for an explanation of each of the values that may be returned here.
     */
    private ActivityEnum activityType;
    /**
     * This enumeration value indicates the actor that performed the action. Possible values include the &lt;code&gt;BUYER&lt;/code&gt;, &lt;code&gt;SELLER&lt;/code&gt;, &lt;code&gt;CS_AGENT&lt;/code&gt; (eBay customer service), or &lt;code&gt;SYSTEM&lt;/code&gt;.
     */
    private ActorEnum actor;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link PaymentDisputeActivity} and sets the default values.
     */
    public PaymentDisputeActivity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentDisputeActivity}
     */
    @jakarta.annotation.Nonnull
    public static PaymentDisputeActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentDisputeActivity();
    }
    /**
     * Gets the activityDate property value. The timestamp in this field shows the date/time of the payment dispute activity.&lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityDate() {
        return this.activityDate;
    }
    /**
     * Gets the activityType property value. This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of &lt;code&gt;DISPUTE_OPENED&lt;/code&gt; is returned when a payment disute is first created,  a value indicating the seller&apos;s decision on the dispute, such as &lt;code&gt;SELLER_CONTEST&lt;/code&gt;, is returned when seller makes a decision to accept or contest dispute, and a value of &lt;code&gt;DISPUTE_CLOSED&lt;/code&gt; is returned when a payment disute is resolved. See &lt;strong&gt;ActivityEnum&lt;/strong&gt; for an explanation of each of the values that may be returned here.
     * @return a {@link ActivityEnum}
     */
    @jakarta.annotation.Nullable
    public ActivityEnum getActivityType() {
        return this.activityType;
    }
    /**
     * Gets the actor property value. This enumeration value indicates the actor that performed the action. Possible values include the &lt;code&gt;BUYER&lt;/code&gt;, &lt;code&gt;SELLER&lt;/code&gt;, &lt;code&gt;CS_AGENT&lt;/code&gt; (eBay customer service), or &lt;code&gt;SYSTEM&lt;/code&gt;.
     * @return a {@link ActorEnum}
     */
    @jakarta.annotation.Nullable
    public ActorEnum getActor() {
        return this.actor;
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
        deserializerMap.put("activityDate", (n) -> { this.setActivityDate(n.getStringValue()); });
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getEnumValue(ActivityEnum::forValue)); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getEnumValue(ActorEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityDate", this.getActivityDate());
        writer.writeEnumValue("activityType", this.getActivityType());
        writer.writeEnumValue("actor", this.getActor());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityDate property value. The timestamp in this field shows the date/time of the payment dispute activity.&lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the activityDate property.
     */
    public void setActivityDate(@jakarta.annotation.Nullable final String value) {
        this.activityDate = value;
    }
    /**
     * Sets the activityType property value. This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of &lt;code&gt;DISPUTE_OPENED&lt;/code&gt; is returned when a payment disute is first created,  a value indicating the seller&apos;s decision on the dispute, such as &lt;code&gt;SELLER_CONTEST&lt;/code&gt;, is returned when seller makes a decision to accept or contest dispute, and a value of &lt;code&gt;DISPUTE_CLOSED&lt;/code&gt; is returned when a payment disute is resolved. See &lt;strong&gt;ActivityEnum&lt;/strong&gt; for an explanation of each of the values that may be returned here.
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final ActivityEnum value) {
        this.activityType = value;
    }
    /**
     * Sets the actor property value. This enumeration value indicates the actor that performed the action. Possible values include the &lt;code&gt;BUYER&lt;/code&gt;, &lt;code&gt;SELLER&lt;/code&gt;, &lt;code&gt;CS_AGENT&lt;/code&gt; (eBay customer service), or &lt;code&gt;SYSTEM&lt;/code&gt;.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final ActorEnum value) {
        this.actor = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
