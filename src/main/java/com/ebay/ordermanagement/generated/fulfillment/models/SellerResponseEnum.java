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
 * The enumeration value returned in this field indicates how the seller has responded to the payment dispute. The seller has the option of accepting the payment dispute and agreeing to issue a refund, accepting the payment dispute and agreeing to issue a refund as long as the buyer returns the item, or contesting the payment dispute. This field is returned as soon as the seller makes an initial decision on the payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SellerResponseEnum implements ValuedEnum {
    SELLER_ACCEPT("SELLER_ACCEPT"),
    SELLER_ACCEPT_WITH_RETURN("SELLER_ACCEPT_WITH_RETURN"),
    SELLER_CONTEST("SELLER_CONTEST"),
    SELLER_RESPONSE_OVERDUE("SELLER_RESPONSE_OVERDUE");
    public final String value;
    SellerResponseEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SellerResponseEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELLER_ACCEPT": return SELLER_ACCEPT;
            case "SELLER_ACCEPT_WITH_RETURN": return SELLER_ACCEPT_WITH_RETURN;
            case "SELLER_CONTEST": return SELLER_CONTEST;
            case "SELLER_RESPONSE_OVERDUE": return SELLER_RESPONSE_OVERDUE;
            default: return null;
        }
    }
}
