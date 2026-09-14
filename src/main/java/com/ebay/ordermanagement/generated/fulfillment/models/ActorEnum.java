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
 * This enumeration value indicates the actor that performed the action. Possible values include the &lt;code&gt;BUYER&lt;/code&gt;, &lt;code&gt;SELLER&lt;/code&gt;, &lt;code&gt;CS_AGENT&lt;/code&gt; (eBay customer service), or &lt;code&gt;SYSTEM&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActorEnum implements ValuedEnum {
    SELLER("SELLER"),
    BUYER("BUYER"),
    CS_AGENT("CS_AGENT"),
    SYSTEM("SYSTEM");
    public final String value;
    ActorEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActorEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELLER": return SELLER;
            case "BUYER": return BUYER;
            case "CS_AGENT": return CS_AGENT;
            case "SYSTEM": return SYSTEM;
            default: return null;
        }
    }
}
