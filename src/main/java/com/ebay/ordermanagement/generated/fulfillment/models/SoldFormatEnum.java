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
 * The eBay listing type of the line item. The most common listing types are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SoldFormatEnum implements ValuedEnum {
    AUCTION("AUCTION"),
    FIXED_PRICE("FIXED_PRICE"),
    OTHER("OTHER"),
    SECOND_CHANCE_OFFER("SECOND_CHANCE_OFFER");
    public final String value;
    SoldFormatEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SoldFormatEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUCTION": return AUCTION;
            case "FIXED_PRICE": return FIXED_PRICE;
            case "OTHER": return OTHER;
            case "SECOND_CHANCE_OFFER": return SECOND_CHANCE_OFFER;
            default: return null;
        }
    }
}
