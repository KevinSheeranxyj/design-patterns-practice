package com.bitesnake.instrument_store;

import java.math.BigDecimal;

public abstract class Instrument {
    public String serialNumber;
    public BigDecimal price;
    public InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, BigDecimal price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
        this.instrumentSpec = instrumentSpec;
    }

}
