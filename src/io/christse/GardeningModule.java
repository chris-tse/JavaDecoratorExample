package io.christse;

public class GardeningModule extends RobotModule {
    Robot robot;

    public GardeningModule(Robot robot) {
        System.out.println("Adding gardening module...");
        this.robot = robot;
    }

    @Override
    public void run() {
        this.robot.run();
        System.out.println(this.name + " waters the flowers and mows the lawn.");
    }
}
