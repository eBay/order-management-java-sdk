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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The enumeration value passed in this field indicates the reason for the refund. One of the defined enumeration values in the &lt;strong&gt;ReasonForRefundEnum&lt;/strong&gt; type must be used.&lt;br&gt;&lt;br&gt;This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or &apos;buyer remorse&apos; return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate &lt;strong&gt;issueRefund&lt;/strong&gt; calls, one for each refund reason. &lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReasonForRefundEnum implements ValuedEnum {
    BUYER_CANCEL("BUYER_CANCEL"),
    SELLER_CANCEL("SELLER_CANCEL"),
    ITEM_NOT_RECEIVED("ITEM_NOT_RECEIVED"),
    BUYER_RETURN("BUYER_RETURN"),
    ITEM_NOT_AS_DESCRIBED("ITEM_NOT_AS_DESCRIBED"),
    OTHER_ADJUSTMENT("OTHER_ADJUSTMENT"),
    SHIPPING_DISCOUNT("SHIPPING_DISCOUNT");
    public final String value;
    ReasonForRefundEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReasonForRefundEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUYER_CANCEL": return BUYER_CANCEL;
            case "SELLER_CANCEL": return SELLER_CANCEL;
            case "ITEM_NOT_RECEIVED": return ITEM_NOT_RECEIVED;
            case "BUYER_RETURN": return BUYER_RETURN;
            case "ITEM_NOT_AS_DESCRIBED": return ITEM_NOT_AS_DESCRIBED;
            case "OTHER_ADJUSTMENT": return OTHER_ADJUSTMENT;
            case "SHIPPING_DISCOUNT": return SHIPPING_DISCOUNT;
            default: return null;
        }
    }
}
