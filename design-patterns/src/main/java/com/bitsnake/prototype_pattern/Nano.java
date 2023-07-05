package com.bitsnake.prototype_pattern;

public class Nano extends BasicCar {

    public int basePrice = 10000;

    public Nano(String m) {
        modelName = m;
    }


    @Override
    public BasicCar clone() {
        return super.clone();
    }

}
