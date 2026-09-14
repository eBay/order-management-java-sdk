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
 * This type contains information about a hold placed on a payment to a seller for an order, including the reason why the buyer&apos;s payment for the order is being held, the expected release date of the funds into the seller&apos;s account, the current state of the hold, the actual release date if the payment has been released, and possible actions the seller can take to expedite the payout of funds into their account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentHold implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time that the payment being held is expected to be released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field will be returned if known by eBay. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String expectedReleaseDate;
    /**
     * The monetary amount of the payment being held. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array. 
     */
    private Amount holdAmount;
    /**
     * The reason that the payment is being held. A seller&apos;s payment may be held for a number of reasons, including when the seller is new, the seller&apos;s level is below standard, or if a return case or &apos;Significantly not as described&apos; case is pending against the seller. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.
     */
    private String holdReason;
    /**
     * The current stage or condition of the hold. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Applicable values:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HELD_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NOT_HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_CONFIRMED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_FAILED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String holdState;
    /**
     * The date and time that the payment being held was actually released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the seller&apos;s payment is actually released into the seller&apos;s account.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String releaseDate;
    /**
     * A list of one or more possible actions that the seller can take to expedite the release of the payment hold.
     */
    private java.util.List<SellerActionsToRelease> sellerActionsToRelease;
    /**
     * Instantiates a new {@link PaymentHold} and sets the default values.
     */
    public PaymentHold() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentHold}
     */
    @jakarta.annotation.Nonnull
    public static PaymentHold createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentHold();
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
     * Gets the expectedReleaseDate property value. The date and time that the payment being held is expected to be released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field will be returned if known by eBay. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpectedReleaseDate() {
        return this.expectedReleaseDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("expectedReleaseDate", (n) -> { this.setExpectedReleaseDate(n.getStringValue()); });
        deserializerMap.put("holdAmount", (n) -> { this.setHoldAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("holdReason", (n) -> { this.setHoldReason(n.getStringValue()); });
        deserializerMap.put("holdState", (n) -> { this.setHoldState(n.getStringValue()); });
        deserializerMap.put("releaseDate", (n) -> { this.setReleaseDate(n.getStringValue()); });
        deserializerMap.put("sellerActionsToRelease", (n) -> { this.setSellerActionsToRelease(n.getCollectionOfObjectValues(SellerActionsToRelease::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the holdAmount property value. The monetary amount of the payment being held. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getHoldAmount() {
        return this.holdAmount;
    }
    /**
     * Gets the holdReason property value. The reason that the payment is being held. A seller&apos;s payment may be held for a number of reasons, including when the seller is new, the seller&apos;s level is below standard, or if a return case or &apos;Significantly not as described&apos; case is pending against the seller. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHoldReason() {
        return this.holdReason;
    }
    /**
     * Gets the holdState property value. The current stage or condition of the hold. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Applicable values:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HELD_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NOT_HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_CONFIRMED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_FAILED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHoldState() {
        return this.holdState;
    }
    /**
     * Gets the releaseDate property value. The date and time that the payment being held was actually released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the seller&apos;s payment is actually released into the seller&apos;s account.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReleaseDate() {
        return this.releaseDate;
    }
    /**
     * Gets the sellerActionsToRelease property value. A list of one or more possible actions that the seller can take to expedite the release of the payment hold.
     * @return a {@link java.util.List<SellerActionsToRelease>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SellerActionsToRelease> getSellerActionsToRelease() {
        return this.sellerActionsToRelease;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expectedReleaseDate", this.getExpectedReleaseDate());
        writer.writeObjectValue("holdAmount", this.getHoldAmount());
        writer.writeStringValue("holdReason", this.getHoldReason());
        writer.writeStringValue("holdState", this.getHoldState());
        writer.writeStringValue("releaseDate", this.getReleaseDate());
        writer.writeCollectionOfObjectValues("sellerActionsToRelease", this.getSellerActionsToRelease());
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
     * Sets the expectedReleaseDate property value. The date and time that the payment being held is expected to be released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field will be returned if known by eBay. &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the expectedReleaseDate property.
     */
    public void setExpectedReleaseDate(@jakarta.annotation.Nullable final String value) {
        this.expectedReleaseDate = value;
    }
    /**
     * Sets the holdAmount property value. The monetary amount of the payment being held. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array. 
     * @param value Value to set for the holdAmount property.
     */
    public void setHoldAmount(@jakarta.annotation.Nullable final Amount value) {
        this.holdAmount = value;
    }
    /**
     * Sets the holdReason property value. The reason that the payment is being held. A seller&apos;s payment may be held for a number of reasons, including when the seller is new, the seller&apos;s level is below standard, or if a return case or &apos;Significantly not as described&apos; case is pending against the seller. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.
     * @param value Value to set for the holdReason property.
     */
    public void setHoldReason(@jakarta.annotation.Nullable final String value) {
        this.holdReason = value;
    }
    /**
     * Sets the holdState property value. The current stage or condition of the hold. This field is always returned with the &lt;strong&gt;paymentHolds&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Applicable values:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HELD_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NOT_HELD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_CONFIRMED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_FAILED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASE_PENDING&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RELEASED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the holdState property.
     */
    public void setHoldState(@jakarta.annotation.Nullable final String value) {
        this.holdState = value;
    }
    /**
     * Sets the releaseDate property value. The date and time that the payment being held was actually released to the seller. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the seller&apos;s payment is actually released into the seller&apos;s account.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the releaseDate property.
     */
    public void setReleaseDate(@jakarta.annotation.Nullable final String value) {
        this.releaseDate = value;
    }
    /**
     * Sets the sellerActionsToRelease property value. A list of one or more possible actions that the seller can take to expedite the release of the payment hold.
     * @param value Value to set for the sellerActionsToRelease property.
     */
    public void setSellerActionsToRelease(@jakarta.annotation.Nullable final java.util.List<SellerActionsToRelease> value) {
        this.sellerActionsToRelease = value;
    }
}
