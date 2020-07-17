package io.christse;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot {
    String name = "GENERIC-BOT";

    public String getName() {
        return name;
    }

    public abstract void run();
}
