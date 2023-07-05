package com.bitsnake.strategy_pattern;

public class StrategyPatternExample {

    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo***");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
