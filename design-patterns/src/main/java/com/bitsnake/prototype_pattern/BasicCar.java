package com.bitsnake.prototype_pattern;

import java.util.Random;

public class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice, onRoadPrice;

    public static int setAdditionalPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() {
        try {
            BasicCar clone = (BasicCar) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
