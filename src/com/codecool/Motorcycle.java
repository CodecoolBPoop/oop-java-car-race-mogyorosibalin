package com.codecool;

public class Motorcycle extends Vehicle {
    static int nameNumber = 1;
    int normalSpeed = 100;

    Motorcycle() {
        name = "Motorcycle " + nameNumber++;
    }

    void moveForAnHour(Race race) {
        if (race.isRaining()) {
            distanceTraveled += normalSpeed - (rand.nextInt(46) + 5);
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
