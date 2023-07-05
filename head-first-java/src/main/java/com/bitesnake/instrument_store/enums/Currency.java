package com.bitesnake.instrument_store.enums;

public enum Currency {

    USD (1, "US Dollar"),
    JPY (2, "Japanese Yen"),
    CNY (3, "Chinese Yen"),
    SGD (4, "Singapore Dollar"),
    EUR (5, "Europe Dollar"),
    ;

    public final int no;
    public final String desc;

    Currency(int no, String desc) {
        this.no = no;
        this.desc = desc;
    }

    public static Currency getCurrency(int no) {
        if (0 == no) {
            return null;
        }

        return getCurrency(no);
    }

    public int getNo() {
        return no;
    }

    public String getDesc() {
        return desc;
    }
}
