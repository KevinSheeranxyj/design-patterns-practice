package com.bitsnake.prototype_pattern;

public class Ford extends BasicCar {

    public int basePrice = 200000;

    public Ford(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() {
        return super.clone();
    }

}
