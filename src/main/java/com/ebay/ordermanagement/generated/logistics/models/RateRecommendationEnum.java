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
 * This enumerated type contains a list of the available reasons for recommending a given shipping rate. | - **BUYER_CHOSEN**: The rate meets or exceeds the requirements of the buyer&apos;s preferred shipping option. - **CHEAPEST_ON_TIME**: The rate is the cheapest rate available that will provide delivery within the seller&apos;s time frame commitment. - **EBAY_PLUS_OK**: The rate complies with the shipping requirements of the eBay Plus program. - **FASTEST_ON_TIME**: The rate has the fastest shipping time, and will provide delivery within the seller&apos;s time frame commitment. - **GUARANTEED_DELIVERY_OK**: The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RateRecommendationEnum implements ValuedEnum {
    BUYER_CHOSEN("BUYER_CHOSEN"),
    CHEAPEST_ON_TIME("CHEAPEST_ON_TIME"),
    EBAY_PLUS_OK("EBAY_PLUS_OK"),
    FASTEST_ON_TIME("FASTEST_ON_TIME"),
    GUARANTEED_DELIVERY_OK("GUARANTEED_DELIVERY_OK");
    public final String value;
    RateRecommendationEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RateRecommendationEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUYER_CHOSEN": return BUYER_CHOSEN;
            case "CHEAPEST_ON_TIME": return CHEAPEST_ON_TIME;
            case "EBAY_PLUS_OK": return EBAY_PLUS_OK;
            case "FASTEST_ON_TIME": return FASTEST_ON_TIME;
            case "GUARANTEED_DELIVERY_OK": return GUARANTEED_DELIVERY_OK;
            default: return null;
        }
    }
}
