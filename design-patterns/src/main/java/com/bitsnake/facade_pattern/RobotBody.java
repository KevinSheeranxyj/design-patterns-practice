package com.bitsnake.facade_pattern;

public class RobotBody {

    public static void createRobot() {
        System.out.println("Refer this manual before creating Robot");
    }

    public void createRemainingParts() {
        System.out.println("  Remaining parts are created");
    }

    public void createHands() {
        System.out.println(" Hands manufactured");
    }

    public void destroyRobot() {
        System.out.println("Refer this manual before destroying this robot");
    }

}
