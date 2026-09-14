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
 * The type of appointment. &lt;code&gt;MACRO&lt;/code&gt; appointments only have a start time (not bounded with end time). &lt;code&gt;TIME_SLOT&lt;/code&gt; appointments have a period (both start time and end time). Required for tire installation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppointmentTypeEnum implements ValuedEnum {
    TIME_SLOT("TIME_SLOT"),
    MACRO("MACRO");
    public final String value;
    AppointmentTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppointmentTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TIME_SLOT": return TIME_SLOT;
            case "MACRO": return MACRO;
            default: return null;
        }
    }
}
