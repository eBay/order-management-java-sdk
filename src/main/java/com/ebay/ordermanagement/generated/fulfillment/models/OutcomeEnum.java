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
 * The enumeration value returned in this field indicates the outcome of the payment dispute for the seller. This field is always returned once the payment dispute is resolved.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutcomeEnum implements ValuedEnum {
    SELLER_LOST("SELLER_LOST"),
    SELLER_WON("SELLER_WON"),
    SELLER_ACCEPT("SELLER_ACCEPT");
    public final String value;
    OutcomeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutcomeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELLER_LOST": return SELLER_LOST;
            case "SELLER_WON": return SELLER_WON;
            case "SELLER_ACCEPT": return SELLER_ACCEPT;
            default: return null;
        }
    }
}
