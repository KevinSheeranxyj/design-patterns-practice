package com.bitsnake.prototype_pattern;

public class Nano extends BasicCar {

    public int basicPrice;

    public String modelName;

    public Nano(String modelName) {
        this.modelName = modelName;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public BasicCar clone() {
        return super.clone();
    }

}
