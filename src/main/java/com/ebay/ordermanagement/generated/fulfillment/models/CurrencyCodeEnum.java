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
 * A three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code (such as &lt;code&gt;USD&lt;/code&gt; for US site) that indicates the currency of the amount in the &lt;strong&gt;value&lt;/strong&gt; field. Both the &lt;strong&gt;value&lt;/strong&gt; and &lt;strong&gt;currency&lt;/strong&gt; fields are always returned with the &lt;strong&gt;amount&lt;/strong&gt; container.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CurrencyCodeEnum implements ValuedEnum {
    AED("AED"),
    AFN("AFN"),
    ALL("ALL"),
    AMD("AMD"),
    AOA("AOA"),
    ARS("ARS"),
    AWG("AWG"),
    AZN("AZN"),
    BAM("BAM"),
    BBD("BBD"),
    BDT("BDT"),
    BGN("BGN"),
    BHD("BHD"),
    BIF("BIF"),
    BMD("BMD"),
    BND("BND"),
    BOB("BOB"),
    BRL("BRL"),
    BSD("BSD"),
    BTN("BTN"),
    BWP("BWP"),
    BYR("BYR"),
    BZD("BZD"),
    CAD("CAD"),
    CDF("CDF"),
    CLP("CLP"),
    CNY("CNY"),
    COP("COP"),
    CRC("CRC"),
    CUP("CUP"),
    CVE("CVE"),
    CZK("CZK"),
    DJF("DJF"),
    DOP("DOP"),
    DZD("DZD"),
    EGP("EGP"),
    ERN("ERN"),
    ETB("ETB"),
    FJD("FJD"),
    FKP("FKP"),
    GEL("GEL"),
    GHS("GHS"),
    GIP("GIP"),
    DKK("DKK"),
    GMD("GMD"),
    GNF("GNF"),
    GTQ("GTQ"),
    GYD("GYD"),
    HKD("HKD"),
    HNL("HNL"),
    HRK("HRK"),
    HTG("HTG"),
    HUF("HUF"),
    IDR("IDR"),
    INR("INR"),
    IQD("IQD"),
    IRR("IRR"),
    ISK("ISK"),
    GBP("GBP"),
    JMD("JMD"),
    JOD("JOD"),
    JPY("JPY"),
    KES("KES"),
    KGS("KGS"),
    KHR("KHR"),
    KMF("KMF"),
    KPW("KPW"),
    KRW("KRW"),
    KWD("KWD"),
    KYD("KYD"),
    KZT("KZT"),
    LAK("LAK"),
    LBP("LBP"),
    CHF("CHF"),
    LKR("LKR"),
    LRD("LRD"),
    LSL("LSL"),
    LTL("LTL"),
    LYD("LYD"),
    MAD("MAD"),
    MDL("MDL"),
    MGA("MGA"),
    MKD("MKD"),
    MMK("MMK"),
    MNT("MNT"),
    MOP("MOP"),
    MRO("MRO"),
    XCD("XCD"),
    MUR("MUR"),
    MVR("MVR"),
    MWK("MWK"),
    MXN("MXN"),
    MYR("MYR"),
    MZN("MZN"),
    NAD("NAD"),
    NGN("NGN"),
    NIO("NIO"),
    NPR("NPR"),
    OMR("OMR"),
    PAB("PAB"),
    PEN("PEN"),
    XPF("XPF"),
    PGK("PGK"),
    PHP("PHP"),
    PKR("PKR"),
    PLN("PLN"),
    ILS("ILS"),
    PYG("PYG"),
    QAR("QAR"),
    RON("RON"),
    RSD("RSD"),
    RUB("RUB"),
    RWF("RWF"),
    SAR("SAR"),
    SBD("SBD"),
    SCR("SCR"),
    SDG("SDG"),
    SEK("SEK"),
    SGD("SGD"),
    SHP("SHP"),
    NOK("NOK"),
    SLL("SLL"),
    SOS("SOS"),
    SRD("SRD"),
    STD("STD"),
    ANG("ANG"),
    SYP("SYP"),
    SZL("SZL"),
    XAF("XAF"),
    XOF("XOF"),
    THB("THB"),
    TJS("TJS"),
    NZD("NZD"),
    TMT("TMT"),
    TND("TND"),
    TOP("TOP"),
    TRY("TRY"),
    TTD("TTD"),
    AUD("AUD"),
    TWD("TWD"),
    TZS("TZS"),
    UAH("UAH"),
    UGX("UGX"),
    USD("USD"),
    UYU("UYU"),
    UZS("UZS"),
    VEF("VEF"),
    VND("VND"),
    VUV("VUV"),
    WST("WST"),
    YER("YER"),
    EUR("EUR"),
    ZAR("ZAR"),
    ZMW("ZMW"),
    ZWL("ZWL");
    public final String value;
    CurrencyCodeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CurrencyCodeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AED": return AED;
            case "AFN": return AFN;
            case "ALL": return ALL;
            case "AMD": return AMD;
            case "AOA": return AOA;
            case "ARS": return ARS;
            case "AWG": return AWG;
            case "AZN": return AZN;
            case "BAM": return BAM;
            case "BBD": return BBD;
            case "BDT": return BDT;
            case "BGN": return BGN;
            case "BHD": return BHD;
            case "BIF": return BIF;
            case "BMD": return BMD;
            case "BND": return BND;
            case "BOB": return BOB;
            case "BRL": return BRL;
            case "BSD": return BSD;
            case "BTN": return BTN;
            case "BWP": return BWP;
            case "BYR": return BYR;
            case "BZD": return BZD;
            case "CAD": return CAD;
            case "CDF": return CDF;
            case "CLP": return CLP;
            case "CNY": return CNY;
            case "COP": return COP;
            case "CRC": return CRC;
            case "CUP": return CUP;
            case "CVE": return CVE;
            case "CZK": return CZK;
            case "DJF": return DJF;
            case "DOP": return DOP;
            case "DZD": return DZD;
            case "EGP": return EGP;
            case "ERN": return ERN;
            case "ETB": return ETB;
            case "FJD": return FJD;
            case "FKP": return FKP;
            case "GEL": return GEL;
            case "GHS": return GHS;
            case "GIP": return GIP;
            case "DKK": return DKK;
            case "GMD": return GMD;
            case "GNF": return GNF;
            case "GTQ": return GTQ;
            case "GYD": return GYD;
            case "HKD": return HKD;
            case "HNL": return HNL;
            case "HRK": return HRK;
            case "HTG": return HTG;
            case "HUF": return HUF;
            case "IDR": return IDR;
            case "INR": return INR;
            case "IQD": return IQD;
            case "IRR": return IRR;
            case "ISK": return ISK;
            case "GBP": return GBP;
            case "JMD": return JMD;
            case "JOD": return JOD;
            case "JPY": return JPY;
            case "KES": return KES;
            case "KGS": return KGS;
            case "KHR": return KHR;
            case "KMF": return KMF;
            case "KPW": return KPW;
            case "KRW": return KRW;
            case "KWD": return KWD;
            case "KYD": return KYD;
            case "KZT": return KZT;
            case "LAK": return LAK;
            case "LBP": return LBP;
            case "CHF": return CHF;
            case "LKR": return LKR;
            case "LRD": return LRD;
            case "LSL": return LSL;
            case "LTL": return LTL;
            case "LYD": return LYD;
            case "MAD": return MAD;
            case "MDL": return MDL;
            case "MGA": return MGA;
            case "MKD": return MKD;
            case "MMK": return MMK;
            case "MNT": return MNT;
            case "MOP": return MOP;
            case "MRO": return MRO;
            case "XCD": return XCD;
            case "MUR": return MUR;
            case "MVR": return MVR;
            case "MWK": return MWK;
            case "MXN": return MXN;
            case "MYR": return MYR;
            case "MZN": return MZN;
            case "NAD": return NAD;
            case "NGN": return NGN;
            case "NIO": return NIO;
            case "NPR": return NPR;
            case "OMR": return OMR;
            case "PAB": return PAB;
            case "PEN": return PEN;
            case "XPF": return XPF;
            case "PGK": return PGK;
            case "PHP": return PHP;
            case "PKR": return PKR;
            case "PLN": return PLN;
            case "ILS": return ILS;
            case "PYG": return PYG;
            case "QAR": return QAR;
            case "RON": return RON;
            case "RSD": return RSD;
            case "RUB": return RUB;
            case "RWF": return RWF;
            case "SAR": return SAR;
            case "SBD": return SBD;
            case "SCR": return SCR;
            case "SDG": return SDG;
            case "SEK": return SEK;
            case "SGD": return SGD;
            case "SHP": return SHP;
            case "NOK": return NOK;
            case "SLL": return SLL;
            case "SOS": return SOS;
            case "SRD": return SRD;
            case "STD": return STD;
            case "ANG": return ANG;
            case "SYP": return SYP;
            case "SZL": return SZL;
            case "XAF": return XAF;
            case "XOF": return XOF;
            case "THB": return THB;
            case "TJS": return TJS;
            case "NZD": return NZD;
            case "TMT": return TMT;
            case "TND": return TND;
            case "TOP": return TOP;
            case "TRY": return TRY;
            case "TTD": return TTD;
            case "AUD": return AUD;
            case "TWD": return TWD;
            case "TZS": return TZS;
            case "UAH": return UAH;
            case "UGX": return UGX;
            case "USD": return USD;
            case "UYU": return UYU;
            case "UZS": return UZS;
            case "VEF": return VEF;
            case "VND": return VND;
            case "VUV": return VUV;
            case "WST": return WST;
            case "YER": return YER;
            case "EUR": return EUR;
            case "ZAR": return ZAR;
            case "ZMW": return ZMW;
            case "ZWL": return ZWL;
            default: return null;
        }
    }
}
