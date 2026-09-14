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
 * This enumerated type allows a user to differentiate between a return request and a return request draft.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequestTypeEnum implements ValuedEnum {
    CREATE("CREATE"),
    REQUEST("REQUEST"),
    UNKNOWN("UNKNOWN");
    public final String value;
    RequestTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequestTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CREATE": return CREATE;
            case "REQUEST": return REQUEST;
            case "UNKNOWN": return UNKNOWN;
            default: return null;
        }
    }
}
