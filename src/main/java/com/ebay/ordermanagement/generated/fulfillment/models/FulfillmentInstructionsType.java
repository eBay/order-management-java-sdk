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
 * The enumeration value returned in this field indicates the method of fulfillment that will be used to deliver this set of line items (this package) to the buyer. This field will have a value of &lt;code&gt;SHIP_TO&lt;/code&gt; if the &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is returned with a value of &lt;code&gt;true&lt;/code&gt;. See the &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; definition for more information about different fulfillment types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FulfillmentInstructionsType implements ValuedEnum {
    DIGITAL("DIGITAL"),
    PREPARE_FOR_PICKUP("PREPARE_FOR_PICKUP"),
    SELLER_DEFINED("SELLER_DEFINED"),
    SHIP_TO("SHIP_TO"),
    FULFILLED_BY_EBAY("FULFILLED_BY_EBAY");
    public final String value;
    FulfillmentInstructionsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FulfillmentInstructionsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DIGITAL": return DIGITAL;
            case "PREPARE_FOR_PICKUP": return PREPARE_FOR_PICKUP;
            case "SELLER_DEFINED": return SELLER_DEFINED;
            case "SHIP_TO": return SHIP_TO;
            case "FULFILLED_BY_EBAY": return FULFILLED_BY_EBAY;
            default: return null;
        }
    }
}
