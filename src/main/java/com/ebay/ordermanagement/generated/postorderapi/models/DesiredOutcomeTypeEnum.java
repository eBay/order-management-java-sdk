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
 * This enumerated type lists the desired outcomes that the buyer may specify when creating an INR inquiry.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DesiredOutcomeTypeEnum implements ValuedEnum {
    FULL_REFUND("FULL_REFUND"),
    STILL_WANT_ITEM("STILL_WANT_ITEM");
    public final String value;
    DesiredOutcomeTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DesiredOutcomeTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FULL_REFUND": return FULL_REFUND;
            case "STILL_WANT_ITEM": return STILL_WANT_ITEM;
            default: return null;
        }
    }
}
