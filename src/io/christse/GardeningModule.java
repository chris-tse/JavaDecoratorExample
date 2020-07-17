package io.christse;

public class GardeningModule extends RobotModule {
    Robot robot;

    public GardeningModule(Robot robot) {
        System.out.println("Adding gardening module...");
        this.robot = robot;
    }

    @Override
    public String getName() {
        return this.robot.getName();
    }

    @Override
    public void run() {
        this.robot.run();
        System.out.println(this.robot.getName() + " waters the flowers and mows the lawn.");
    }
}
