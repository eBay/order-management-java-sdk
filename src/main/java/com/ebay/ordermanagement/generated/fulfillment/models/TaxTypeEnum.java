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
 * The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TaxTypeEnum implements ValuedEnum {
    STATE_SALES_TAX("STATE_SALES_TAX"),
    PROVINCE_SALES_TAX("PROVINCE_SALES_TAX"),
    REGION("REGION"),
    VAT("VAT"),
    GST("GST"),
    ELECTRONIC_RECYCLING_FEE("ELECTRONIC_RECYCLING_FEE"),
    MATTRESS_RECYCLING_FEE("MATTRESS_RECYCLING_FEE"),
    ADDITIONAL_FEE("ADDITIONAL_FEE"),
    BATTERY_RECYCLING_FEE("BATTERY_RECYCLING_FEE"),
    TIRE_RECYCLING_FEE("TIRE_RECYCLING_FEE"),
    WHITE_GOODS_DISPOSABLE_TAX("WHITE_GOODS_DISPOSABLE_TAX"),
    IMPORT_VAT("IMPORT_VAT"),
    SST("SST");
    public final String value;
    TaxTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TaxTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "STATE_SALES_TAX": return STATE_SALES_TAX;
            case "PROVINCE_SALES_TAX": return PROVINCE_SALES_TAX;
            case "REGION": return REGION;
            case "VAT": return VAT;
            case "GST": return GST;
            case "ELECTRONIC_RECYCLING_FEE": return ELECTRONIC_RECYCLING_FEE;
            case "MATTRESS_RECYCLING_FEE": return MATTRESS_RECYCLING_FEE;
            case "ADDITIONAL_FEE": return ADDITIONAL_FEE;
            case "BATTERY_RECYCLING_FEE": return BATTERY_RECYCLING_FEE;
            case "TIRE_RECYCLING_FEE": return TIRE_RECYCLING_FEE;
            case "WHITE_GOODS_DISPOSABLE_TAX": return WHITE_GOODS_DISPOSABLE_TAX;
            case "IMPORT_VAT": return IMPORT_VAT;
            case "SST": return SST;
            default: return null;
        }
    }
}
