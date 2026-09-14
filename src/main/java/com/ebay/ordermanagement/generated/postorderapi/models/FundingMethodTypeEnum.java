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
 * This enumeration type lists the possible funding methods that can be used by eBay to fund a seller&apos;s refund to a buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FundingMethodTypeEnum implements ValuedEnum {
    CREDIT_CARD("CREDIT_CARD"),
    DIRECT_DEBIT("DIRECT_DEBIT"),
    PAY_UPON_INVOICE("PAY_UPON_INVOICE"),
    AVAILABLE_FUNDS("AVAILABLE_FUNDS");
    public final String value;
    FundingMethodTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FundingMethodTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CREDIT_CARD": return CREDIT_CARD;
            case "DIRECT_DEBIT": return DIRECT_DEBIT;
            case "PAY_UPON_INVOICE": return PAY_UPON_INVOICE;
            case "AVAILABLE_FUNDS": return AVAILABLE_FUNDS;
            default: return null;
        }
    }
}
