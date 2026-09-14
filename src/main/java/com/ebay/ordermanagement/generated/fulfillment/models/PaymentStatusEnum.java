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
 * The enumeration value returned in this field indicates the status of the payment for the order. See the &lt;strong&gt;PaymentStatusEnum&lt;/strong&gt; type definition for more information on the possible payment states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentStatusEnum implements ValuedEnum {
    FAILED("FAILED"),
    PAID("PAID"),
    PENDING("PENDING");
    public final String value;
    PaymentStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FAILED": return FAILED;
            case "PAID": return PAID;
            case "PENDING": return PENDING;
            default: return null;
        }
    }
}
