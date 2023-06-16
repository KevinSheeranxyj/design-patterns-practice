package com.bitesnake.instrument_store;

import java.math.BigDecimal;

public class Guitar extends Instrument {
    public String model;

    public Guitar(String serialNumber, BigDecimal price, InstrumentSpec instrumentSpec) {
        super(serialNumber, price, instrumentSpec);
    }

}
