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
 * The state of the order with regard to cancellation. This field is always returned, and if there are no cancellation requests, a value of &lt;code&gt;NONE_REQUESTED&lt;/code&gt; is returned. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CancelStateEnum implements ValuedEnum {
    CANCELED("CANCELED"),
    IN_PROGRESS("IN_PROGRESS"),
    NONE_REQUESTED("NONE_REQUESTED");
    public final String value;
    CancelStateEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CancelStateEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CANCELED": return CANCELED;
            case "IN_PROGRESS": return IN_PROGRESS;
            case "NONE_REQUESTED": return NONE_REQUESTED;
            default: return null;
        }
    }
}
