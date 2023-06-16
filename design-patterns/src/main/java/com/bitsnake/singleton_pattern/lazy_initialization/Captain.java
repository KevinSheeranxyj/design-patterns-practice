package com.bitsnake.singleton_pattern.lazy_initialization;

public class Captain {
    private static Captain captain;

    // We make this constructor private to prevent the use of 'new'
    private Captain() {

    }

    static int numberOfInstance=0;

    public static synchronized Captain getCaptain() {
        // Lazy Initialization
        if (captain == null) {
            captain = new Captain();
            numberOfInstance++;
            System.out.println("New captain is selected for your team.");
        } else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
}
