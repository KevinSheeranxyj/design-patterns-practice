package com.bitsnake.strategy_pattern;

public abstract class Vehicle {

    public TransportMedium transportMedium;

    public Vehicle() {

    }

    public void showTransportMedium() {
        transportMedium.transport();
    }

    public void commonJob() {
        System.out.println("We can do all the transport");
    }

    public abstract void showMe();

}
