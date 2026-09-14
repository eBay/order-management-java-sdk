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

package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum specifies the current cancellation status of a shipment, if a cancellation request has been made.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShipmentCancellationStatusEnum implements ValuedEnum {
    CANCELLATION_REQUESTED("CANCELLATION_REQUESTED"),
    CANCELLATION_ACCEPTED("CANCELLATION_ACCEPTED"),
    CANCELLATION_REJECTED("CANCELLATION_REJECTED");
    public final String value;
    ShipmentCancellationStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShipmentCancellationStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CANCELLATION_REQUESTED": return CANCELLATION_REQUESTED;
            case "CANCELLATION_ACCEPTED": return CANCELLATION_ACCEPTED;
            case "CANCELLATION_REJECTED": return CANCELLATION_REJECTED;
            default: return null;
        }
    }
}
