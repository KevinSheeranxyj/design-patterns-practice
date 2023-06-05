package com.bitsnake.singleton.eager_initialization;


public class Captain {
    public static Captain captain = new Captain();

    private Captain() {
        System.out.println("Captain is elected for your team.");
    }

    public static Captain getCaptain() {
        System.out.println("you have a captain for your team.");
        return captain;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }
}
