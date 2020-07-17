package io.christse;

public class Main {

    public static void main(String[] args) {
        Robot r = new ToyRobot("My Brand New Bot");
        r = new CookingModule(r);
        r = new GardeningModule(r);

        System.out.println("*******");
        System.out.println("Thank you for your purchase of " + r.getName() + "! Give your robot a try now!");

        r.run();

    }
}
