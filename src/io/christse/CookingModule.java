package io.christse;

public class CookingModule extends RobotModule {
    Robot robot;

    public CookingModule(Robot robot) {
        System.out.println("Adding cooking module...");
        this.robot = robot;
    }

    @Override
    public String getName() {
        return this.robot.getName();
    }

    @Override
    public void run() {
        this.robot.run();
        System.out.println(this.robot.getName() + " chops up some veggies and makes a nice salad.");
    }
}
