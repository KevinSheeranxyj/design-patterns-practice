package com.bitsnake.singleton_pattern.lazy_initialization;


public class SingletonCaptain {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        // Constructor is private.We cannot use
//        Captain captain3 = new Captain();
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance.");
        }
    }
}
