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
 * This enumeration type defines the different options that a seller can take against a payment dispute initiated by a buyer. | - **SELLER_ACCEPT**: This enumeration value indicates that the seller has the option of accepting the payment dispute and agrees to issue a refund to buyer. - **SELLER_ACCEPT_WITH_RETURN**: This enumeration value indicates that the seller has the option of accepting the payment dispute and agrees to issue a refund to buyer as soon as the item is returned to the seller. - **SELLER_CONTEST**: This enumeration value indicates that the seller has the option of contesting the payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SellerDecisionEnum implements ValuedEnum {
    SELLER_ACCEPT("SELLER_ACCEPT"),
    SELLER_ACCEPT_WITH_RETURN("SELLER_ACCEPT_WITH_RETURN"),
    SELLER_CONTEST("SELLER_CONTEST");
    public final String value;
    SellerDecisionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SellerDecisionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELLER_ACCEPT": return SELLER_ACCEPT;
            case "SELLER_ACCEPT_WITH_RETURN": return SELLER_ACCEPT_WITH_RETURN;
            case "SELLER_CONTEST": return SELLER_CONTEST;
            default: return null;
        }
    }
}
