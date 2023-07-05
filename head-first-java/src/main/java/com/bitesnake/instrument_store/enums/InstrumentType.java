package com.bitesnake.instrument_store.enums;

public enum InstrumentType {

    STRING(1, "String instrument"),
    WOODWIND(2, "Woodwind instrument"),
    PERCUSSION(3, "Percussion instrument"),
    ;

    public final int id;
    public final String desc;

    InstrumentType(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
