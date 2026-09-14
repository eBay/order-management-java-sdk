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
 * This enumeration value indicates if the seller is fully protected, partially protected, or not protected by eBay for the payment dispute. This field is always returned once the payment dispute is resolved.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtectionStatusEnum implements ValuedEnum {
    FULLY_PROTECTED("FULLY_PROTECTED"),
    PARTIALLY_PROTECTED("PARTIALLY_PROTECTED"),
    NOT_PROTECTED("NOT_PROTECTED"),
    MANUAL_REVIEW("MANUAL_REVIEW");
    public final String value;
    ProtectionStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtectionStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FULLY_PROTECTED": return FULLY_PROTECTED;
            case "PARTIALLY_PROTECTED": return PARTIALLY_PROTECTED;
            case "NOT_PROTECTED": return NOT_PROTECTED;
            case "MANUAL_REVIEW": return MANUAL_REVIEW;
            default: return null;
        }
    }
}
