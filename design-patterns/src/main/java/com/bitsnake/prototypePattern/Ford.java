package com.bitsnake.prototypePattern;

public class Ford extends BasicCar {

    public int basicPrice = 100000;


    @Override
    public BasicCar clone() {
        return super.clone();
    }

}
