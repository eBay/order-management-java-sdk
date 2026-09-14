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
 * This enumerated type is used to indicate if eBay was able to successfully &apos;fund&apos; a refund to the buyer using the seller&apos;s preferred method of payment for refunds.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FundingStatusEnum implements ValuedEnum {
    FUNDED("FUNDED"),
    FAILED("FAILED");
    public final String value;
    FundingStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FundingStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FUNDED": return FUNDED;
            case "FAILED": return FAILED;
            default: return null;
        }
    }
}
