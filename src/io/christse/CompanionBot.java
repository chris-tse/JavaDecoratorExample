package io.christse;

public class CompanionBot extends Robot {
    public CompanionBot(String newName) {
        System.out.println("Creating CompanionBot...");
        name = newName;
    }

    @Override
    public void run() {
        System.out.println(this.name + " beeps and boops happily.");
    }
}
