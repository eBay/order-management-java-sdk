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
 * This enumeration type lists the types of cases that may be created by the buyer or seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseTypeEnum implements ValuedEnum {
    ITEM_NOT_RECEIVED("ITEM_NOT_RECEIVED"),
    RETURN("RETURN");
    public final String value;
    CaseTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM_NOT_RECEIVED": return ITEM_NOT_RECEIVED;
            case "RETURN": return RETURN;
            default: return null;
        }
    }
}
