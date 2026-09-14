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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumerated type lists all values that can be passed in the &lt;b&gt;decision&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; request. With the values supported in the &lt;b&gt;decision&lt;/b&gt; field, the seller can offer the return option to the buyer, approve or decline a return request, offer a partial refund to the buyer, or provide a Return Merchandise Authorization (RMA) number to the buyer. There are only a few supported values for a buyer, and these are discussed in the descriptions below.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DecisionEnum implements ValuedEnum {
    PROVIDE_RMA("PROVIDE_RMA"),
    APPROVE("APPROVE"),
    APPROVE_WITHOUT_EBAY_LABEL("APPROVE_WITHOUT_EBAY_LABEL"),
    DECLINE("DECLINE"),
    OFFER_RETURN("OFFER_RETURN"),
    OFFER_RETURN_WITHOUT_LABEL("OFFER_RETURN_WITHOUT_LABEL"),
    OFFER_PARTIAL_REFUND("OFFER_PARTIAL_REFUND"),
    ACCEPT_PARTIAL_REFUND("ACCEPT_PARTIAL_REFUND"),
    DECLINE_PARTIAL_REFUND("DECLINE_PARTIAL_REFUND"),
    OFFER_REPLACEMENT("OFFER_REPLACEMENT"),
    ACCEPT_REPLACEMENT_OFFER("ACCEPT_REPLACEMENT_OFFER"),
    DECLINE_REPLACEMENT_OFFER("DECLINE_REPLACEMENT_OFFER"),
    UNKNOWN("UNKNOWN");
    public final String value;
    DecisionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DecisionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PROVIDE_RMA": return PROVIDE_RMA;
            case "APPROVE": return APPROVE;
            case "APPROVE_WITHOUT_EBAY_LABEL": return APPROVE_WITHOUT_EBAY_LABEL;
            case "DECLINE": return DECLINE;
            case "OFFER_RETURN": return OFFER_RETURN;
            case "OFFER_RETURN_WITHOUT_LABEL": return OFFER_RETURN_WITHOUT_LABEL;
            case "OFFER_PARTIAL_REFUND": return OFFER_PARTIAL_REFUND;
            case "ACCEPT_PARTIAL_REFUND": return ACCEPT_PARTIAL_REFUND;
            case "DECLINE_PARTIAL_REFUND": return DECLINE_PARTIAL_REFUND;
            case "OFFER_REPLACEMENT": return OFFER_REPLACEMENT;
            case "ACCEPT_REPLACEMENT_OFFER": return ACCEPT_REPLACEMENT_OFFER;
            case "DECLINE_REPLACEMENT_OFFER": return DECLINE_REPLACEMENT_OFFER;
            case "UNKNOWN": return UNKNOWN;
            default: return null;
        }
    }
}
