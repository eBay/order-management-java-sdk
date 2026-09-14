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
 * This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserPartyEnum implements ValuedEnum {
    UNKNOWN("UNKNOWN"),
    SELLER("SELLER"),
    BUYER("BUYER"),
    CSR("CSR"),
    SYSTEM("SYSTEM");
    public final String value;
    UserPartyEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserPartyEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "UNKNOWN": return UNKNOWN;
            case "SELLER": return SELLER;
            case "BUYER": return BUYER;
            case "CSR": return CSR;
            case "SYSTEM": return SYSTEM;
            default: return null;
        }
    }
}
