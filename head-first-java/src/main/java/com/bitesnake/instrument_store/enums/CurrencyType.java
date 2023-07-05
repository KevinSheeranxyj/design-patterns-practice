package com.bitesnake.instrument_store.enums;

public enum CurrencyType {
    SGD(Currency.SGD, Institution.DTC),
    USD(Currency.USD, Institution.WECHAT);


    public final Currency currency;
    public final Institution institution;

    CurrencyType(final Currency currency, final Institution institution) {
        this.currency = currency;
        this.institution = institution;
    }


}
