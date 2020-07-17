package io.christse;

public class ToyRobot extends Robot {
    public ToyRobot(String newName) {
        System.out.println("Creating CompanionBot...");
        name = newName;
    }

    @Override
    public void run() {
        System.out.println(name + " beeps and boops happily.");
    }
}
