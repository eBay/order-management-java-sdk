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
 * This enumeration type lists the possible reasons why a buyer may close an INR inquiry or a case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BuyerCloseReasonEnum implements ValuedEnum {
    ITEM_ARRIVED("ITEM_ARRIVED"),
    WORKED_OUT_WITH_SELLER("WORKED_OUT_WITH_SELLER"),
    WOULD_RATHER_KEEP_THE_ITEM("WOULD_RATHER_KEEP_THE_ITEM"),
    OTHER("OTHER");
    public final String value;
    BuyerCloseReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BuyerCloseReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM_ARRIVED": return ITEM_ARRIVED;
            case "WORKED_OUT_WITH_SELLER": return WORKED_OUT_WITH_SELLER;
            case "WOULD_RATHER_KEEP_THE_ITEM": return WOULD_RATHER_KEEP_THE_ITEM;
            case "OTHER": return OTHER;
            default: return null;
        }
    }
}
