package com.bitsnake.singleton_pattern.eager_initialization;

public class Captain1 {
    private Captain1() {
        System.out.println("A captain is elected for your team");
    }

    private static class SingletonHelper {
        private static final Captain1 captain1 = new Captain1();
    }

    public static Captain1 getCaptain() {
        return SingletonHelper.captain1;
    }
}
