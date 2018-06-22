package com.codecool;

public class Truck extends Vehicle {
    int normalSpeed = 100;
    int breakDownTurnsLeft = 0;
    final int brokingDownLength = 2;

    Truck() {
        name = Integer.toString(rand.nextInt(1000));
        if (isBrokingDown()) {
            brokeDown();
        }
    }

    boolean isBrokenDown() {
        return this.breakDownTurnsLeft != 0;
    }

    boolean isBrokingDown() {
        return rand.nextInt(101) <= 5;
    }

    void brokeDown() {
        breakDownTurnsLeft = brokingDownLength;
    }

    void moveForAnHour(Race race) {
        if (!isBrokenDown() && isBrokingDown()) {
            brokeDown();
        }
        if (isBrokenDown()) {
            breakDownTurnsLeft--;
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
