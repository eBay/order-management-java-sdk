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
 * This enumeration type lists the possible credit card brands that can be used by eBay to fund a seller&apos;s refund to a buyer. This type is only applicable if a buyer refund will be funded using a seller&apos;s credit card as the funding source.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FundingMethodBrandEnum implements ValuedEnum {
    VISA("VISA"),
    MASTERCARD("MASTERCARD"),
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    DISCOVER("DISCOVER");
    public final String value;
    FundingMethodBrandEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FundingMethodBrandEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "VISA": return VISA;
            case "MASTERCARD": return MASTERCARD;
            case "AMERICAN_EXPRESS": return AMERICAN_EXPRESS;
            case "DISCOVER": return DISCOVER;
            default: return null;
        }
    }
}
