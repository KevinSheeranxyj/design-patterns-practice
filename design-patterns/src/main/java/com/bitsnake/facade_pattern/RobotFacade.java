package com.bitsnake.facade_pattern;

public class RobotFacade {
    public RobotBody robotBody;
    public RobotHands robotHands;
    public RobotColor robotColor;

    public RobotFacade() {
        robotBody = new RobotBody();
        robotHands = new RobotHands();
        robotColor = new RobotColor();
    }

    public void constructMilanoRobot() {
        System.out.println("Initialization of MilanoRobot creation");
        RobotBody.createRobot();
        robotBody.createHands();
        robotBody.createRemainingParts();
        robotHands.setMilanoRobotHands();
    }


    public void constructRobonaut() {
        System.out.println("Initialization of Robonaut Robot creation");
        RobotBody.createRobot();
        robotBody.createHands();
        robotHands.setRobonautHands();
        robotBody.createRemainingParts();
        robotColor.setBlackColor();
    }


}
