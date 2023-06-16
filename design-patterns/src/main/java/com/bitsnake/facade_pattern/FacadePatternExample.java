package com.bitsnake.facade_pattern;

public class FacadePatternExample {

    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***\n");
        // Creating Robots
        RobotFacade milanoRobot = new RobotFacade();
        milanoRobot.constructMilanoRobot();

        RobotFacade robotnaut = new RobotFacade();
        robotnaut.constructRobonaut();

    }
}
