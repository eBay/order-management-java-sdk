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
 * This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the &lt;strong&gt;TaxIdentifierTypeEnum&lt;/strong&gt; type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TaxIdentifierTypeEnum implements ValuedEnum {
    CODICE_FISCALE("CODICE_FISCALE"),
    CURP("CURP"),
    DNI("DNI"),
    NIE("NIE"),
    NIF("NIF"),
    NIT("NIT"),
    RFC("RFC"),
    RUT("RUT"),
    VATIN("VATIN");
    public final String value;
    TaxIdentifierTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TaxIdentifierTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CODICE_FISCALE": return CODICE_FISCALE;
            case "CURP": return CURP;
            case "DNI": return DNI;
            case "NIE": return NIE;
            case "NIF": return NIF;
            case "NIT": return NIT;
            case "RFC": return RFC;
            case "RUT": return RUT;
            case "VATIN": return VATIN;
            default: return null;
        }
    }
}
