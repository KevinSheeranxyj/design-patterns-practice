package com.bitsnake.singleton_pattern.lazy_initialization;

public class SingletonPatternExample {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error
        Captain2 captain1 = Captain2.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain2 captain2 = Captain2.getCaptain();
        if (captain2 == captain1) {
            System.out.println("Captain1 and Captain2 are same instance.");
        }
        Captain2.CaptainDerived derived = captain1.new CaptainDerived();
    }
}
