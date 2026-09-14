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
 * The type of pickup or drop-off configured for the shipment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PickupTypeEnum implements ValuedEnum {
    REGULAR_PICKUP("REGULAR_PICKUP"),
    SCHEDULED_PICKUP("SCHEDULED_PICKUP"),
    DROP_OFF("DROP_OFF");
    public final String value;
    PickupTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PickupTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "REGULAR_PICKUP": return REGULAR_PICKUP;
            case "SCHEDULED_PICKUP": return SCHEDULED_PICKUP;
            case "DROP_OFF": return DROP_OFF;
            default: return null;
        }
    }
}
