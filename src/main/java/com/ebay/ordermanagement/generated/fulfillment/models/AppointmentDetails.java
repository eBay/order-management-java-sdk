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
 * This type contains information used by the installation provider concerning appointment details selected by the buyer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppointmentDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time the appointment ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock. Required for tire installation. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:00:00.000Z&lt;/code&gt;
     */
    private String appointmentEndTime;
    /**
     * The date and time the appointment begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:10:00.000Z&lt;/code&gt;
     */
    private String appointmentStartTime;
    /**
     * The status of the appointment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String appointmentStatus;
    /**
     * The type of appointment. MACRO appointments only have a start time (not bounded with end time). TIME_SLOT appointments have a period (both start time and end time). Required for tire installation. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String appointmentType;
    /**
     * Appointment window for MACRO appointments. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentWindowEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String appointmentWindow;
    /**
     * Service provider date of the appointment (no time stamp). Returned only for MACRO appointment types.
     */
    private String serviceProviderAppointmentDate;
    /**
     * Instantiates a new {@link AppointmentDetails} and sets the default values.
     */
    public AppointmentDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppointmentDetails}
     */
    @jakarta.annotation.Nonnull
    public static AppointmentDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppointmentDetails();
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
     * Gets the appointmentEndTime property value. The date and time the appointment ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock. Required for tire installation. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:00:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentEndTime() {
        return this.appointmentEndTime;
    }
    /**
     * Gets the appointmentStartTime property value. The date and time the appointment begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:10:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentStartTime() {
        return this.appointmentStartTime;
    }
    /**
     * Gets the appointmentStatus property value. The status of the appointment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentStatus() {
        return this.appointmentStatus;
    }
    /**
     * Gets the appointmentType property value. The type of appointment. MACRO appointments only have a start time (not bounded with end time). TIME_SLOT appointments have a period (both start time and end time). Required for tire installation. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentType() {
        return this.appointmentType;
    }
    /**
     * Gets the appointmentWindow property value. Appointment window for MACRO appointments. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentWindowEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentWindow() {
        return this.appointmentWindow;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("appointmentEndTime", (n) -> { this.setAppointmentEndTime(n.getStringValue()); });
        deserializerMap.put("appointmentStartTime", (n) -> { this.setAppointmentStartTime(n.getStringValue()); });
        deserializerMap.put("appointmentStatus", (n) -> { this.setAppointmentStatus(n.getStringValue()); });
        deserializerMap.put("appointmentType", (n) -> { this.setAppointmentType(n.getStringValue()); });
        deserializerMap.put("appointmentWindow", (n) -> { this.setAppointmentWindow(n.getStringValue()); });
        deserializerMap.put("serviceProviderAppointmentDate", (n) -> { this.setServiceProviderAppointmentDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the serviceProviderAppointmentDate property value. Service provider date of the appointment (no time stamp). Returned only for MACRO appointment types.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceProviderAppointmentDate() {
        return this.serviceProviderAppointmentDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appointmentEndTime", this.getAppointmentEndTime());
        writer.writeStringValue("appointmentStartTime", this.getAppointmentStartTime());
        writer.writeStringValue("appointmentStatus", this.getAppointmentStatus());
        writer.writeStringValue("appointmentType", this.getAppointmentType());
        writer.writeStringValue("appointmentWindow", this.getAppointmentWindow());
        writer.writeStringValue("serviceProviderAppointmentDate", this.getServiceProviderAppointmentDate());
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
     * Sets the appointmentEndTime property value. The date and time the appointment ends, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock. Required for tire installation. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:00:00.000Z&lt;/code&gt;
     * @param value Value to set for the appointmentEndTime property.
     */
    public void setAppointmentEndTime(@jakarta.annotation.Nullable final String value) {
        this.appointmentEndTime = value;
    }
    /**
     * Sets the appointmentStartTime property value. The date and time the appointment begins, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-10-28T00:10:00.000Z&lt;/code&gt;
     * @param value Value to set for the appointmentStartTime property.
     */
    public void setAppointmentStartTime(@jakarta.annotation.Nullable final String value) {
        this.appointmentStartTime = value;
    }
    /**
     * Sets the appointmentStatus property value. The status of the appointment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the appointmentStatus property.
     */
    public void setAppointmentStatus(@jakarta.annotation.Nullable final String value) {
        this.appointmentStatus = value;
    }
    /**
     * Sets the appointmentType property value. The type of appointment. MACRO appointments only have a start time (not bounded with end time). TIME_SLOT appointments have a period (both start time and end time). Required for tire installation. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the appointmentType property.
     */
    public void setAppointmentType(@jakarta.annotation.Nullable final String value) {
        this.appointmentType = value;
    }
    /**
     * Sets the appointmentWindow property value. Appointment window for MACRO appointments. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:AppointmentWindowEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the appointmentWindow property.
     */
    public void setAppointmentWindow(@jakarta.annotation.Nullable final String value) {
        this.appointmentWindow = value;
    }
    /**
     * Sets the serviceProviderAppointmentDate property value. Service provider date of the appointment (no time stamp). Returned only for MACRO appointment types.
     * @param value Value to set for the serviceProviderAppointmentDate property.
     */
    public void setServiceProviderAppointmentDate(@jakarta.annotation.Nullable final String value) {
        this.serviceProviderAppointmentDate = value;
    }
}
