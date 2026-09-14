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
 * The degree to which fulfillment of the order is complete. See the &lt;strong&gt;OrderFulfillmentStatus&lt;/strong&gt; type definition for more information about each possible fulfillment state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrderFulfillmentStatus implements ValuedEnum {
    FULFILLED("FULFILLED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED");
    public final String value;
    OrderFulfillmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrderFulfillmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FULFILLED": return FULFILLED;
            case "IN_PROGRESS": return IN_PROGRESS;
            case "NOT_STARTED": return NOT_STARTED;
            default: return null;
        }
    }
}
