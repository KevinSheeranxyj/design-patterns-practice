package com.bitesnake.instrument_store.enums;


public enum Institution {


    DTC (1, "Digital Treasure Center"),
    WECHAT (2, "Wechat Pay");


    public Integer no;
    public String desc;

     Institution(int no, String desc) {
        no = no;
        desc = desc;
    }




}
