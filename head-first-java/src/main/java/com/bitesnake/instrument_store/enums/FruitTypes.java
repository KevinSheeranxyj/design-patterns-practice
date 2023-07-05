package com.bitesnake.instrument_store.enums;


import java.util.List;

public enum FruitTypes {

    APPLE(0, "Apple", List.of(Location.AFRICA, Location.ASIA)),
    DRUPE(1, "Drupe", null),
    GRAPE(2, "Grape", null),
    PINEAPPLE(3, "PINEAPPLE",null),
    KIWI(4, "KIWI", null),
    PLUM(5, "Plum", List.of(Location.ANTARCTICA));

    public final int number;
    public final String desc;
    public final List<Location> list;

    FruitTypes(int number, String desc, List<Location> E) {
        this.number = number;
        this.desc = desc;
        this.list = E;
    }

}
