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
 * The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the &lt;strong&gt;OrderPaymentStatusEnum&lt;/strong&gt; type definition for more information about each possible payment/refund state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrderPaymentStatusEnum implements ValuedEnum {
    FAILED("FAILED"),
    FULLY_REFUNDED("FULLY_REFUNDED"),
    PAID("PAID"),
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    PENDING("PENDING");
    public final String value;
    OrderPaymentStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrderPaymentStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FAILED": return FAILED;
            case "FULLY_REFUNDED": return FULLY_REFUNDED;
            case "PAID": return PAID;
            case "PARTIALLY_REFUNDED": return PARTIALLY_REFUNDED;
            case "PENDING": return PENDING;
            default: return null;
        }
    }
}
