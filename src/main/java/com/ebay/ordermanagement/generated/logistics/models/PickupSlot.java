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

package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type defines a time window for the pickup of a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PickupSlot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time the pickup slot ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String pickupSlotEndTime;
    /**
     * Seller-defined name for the pickup slot. &lt;!-- Max characters? --&gt;
     */
    private String pickupSlotId;
    /**
     * The date and time the pickup slot begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     */
    private String pickupSlotStartTime;
    /**
     * The time zone of the pickup location, returned as &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt; ID (also know as an Olson time zone ID).
     */
    private String pickupSlotTimeZone;
    /**
     * Instantiates a new {@link PickupSlot} and sets the default values.
     */
    public PickupSlot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PickupSlot}
     */
    @jakarta.annotation.Nonnull
    public static PickupSlot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PickupSlot();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("pickupSlotEndTime", (n) -> { this.setPickupSlotEndTime(n.getStringValue()); });
        deserializerMap.put("pickupSlotId", (n) -> { this.setPickupSlotId(n.getStringValue()); });
        deserializerMap.put("pickupSlotStartTime", (n) -> { this.setPickupSlotStartTime(n.getStringValue()); });
        deserializerMap.put("pickupSlotTimeZone", (n) -> { this.setPickupSlotTimeZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pickupSlotEndTime property value. The date and time the pickup slot ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupSlotEndTime() {
        return this.pickupSlotEndTime;
    }
    /**
     * Gets the pickupSlotId property value. Seller-defined name for the pickup slot. &lt;!-- Max characters? --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupSlotId() {
        return this.pickupSlotId;
    }
    /**
     * Gets the pickupSlotStartTime property value. The date and time the pickup slot begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupSlotStartTime() {
        return this.pickupSlotStartTime;
    }
    /**
     * Gets the pickupSlotTimeZone property value. The time zone of the pickup location, returned as &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt; ID (also know as an Olson time zone ID).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupSlotTimeZone() {
        return this.pickupSlotTimeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("pickupSlotEndTime", this.getPickupSlotEndTime());
        writer.writeStringValue("pickupSlotId", this.getPickupSlotId());
        writer.writeStringValue("pickupSlotStartTime", this.getPickupSlotStartTime());
        writer.writeStringValue("pickupSlotTimeZone", this.getPickupSlotTimeZone());
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
     * Sets the pickupSlotEndTime property value. The date and time the pickup slot ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the pickupSlotEndTime property.
     */
    public void setPickupSlotEndTime(@jakarta.annotation.Nullable final String value) {
        this.pickupSlotEndTime = value;
    }
    /**
     * Sets the pickupSlotId property value. Seller-defined name for the pickup slot. &lt;!-- Max characters? --&gt;
     * @param value Value to set for the pickupSlotId property.
     */
    public void setPickupSlotId(@jakarta.annotation.Nullable final String value) {
        this.pickupSlotId = value;
    }
    /**
     * Sets the pickupSlotStartTime property value. The date and time the pickup slot begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     * @param value Value to set for the pickupSlotStartTime property.
     */
    public void setPickupSlotStartTime(@jakarta.annotation.Nullable final String value) {
        this.pickupSlotStartTime = value;
    }
    /**
     * Sets the pickupSlotTimeZone property value. The time zone of the pickup location, returned as &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt; ID (also know as an Olson time zone ID).
     * @param value Value to set for the pickupSlotTimeZone property.
     */
    public void setPickupSlotTimeZone(@jakarta.annotation.Nullable final String value) {
        this.pickupSlotTimeZone = value;
    }
}
