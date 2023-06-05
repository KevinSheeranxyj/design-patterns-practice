package com.bitsnake.singleton.lazy_initialization;

public class Captain2 {

    private static Captain2 captain;
    static int numberOfInstance = 0;

    private Captain2() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment="+ numberOfInstance);
    }

    public static Captain2 getCaptain() {
        if (captain == null) {
            synchronized (Captain2.class) {
                if (captain == null) {
                    captain = new Captain2();
                    System.out.println("New Captain is elected for your team");
                } else {
                    System.out.println("You already have a captain for your team.");
                    System.out.println("Send him for the toss");
                }
            }
        }
            return captain;
    }

    public class CaptainDerived extends Captain2 {

    }
}
