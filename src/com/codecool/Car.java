package com.codecool;

public class Car extends Vehicle {
    final int limitedSpeed = 75;
    static String[] carNames = new String[] {"Whim", "Centurion", "Conqueror", "Tigress",
            "Daydream", "Aurora", "Spirit", "Expedition", "Freedom", "Aeon", "Prime", "Vortex",
            "Portrait", "Purity", "Radiance", "Obsidian", "Vanish", "Scorpion", "Pinnacle", "Fragment"};

    Car() {
        normalSpeed = rand.nextInt(31) + 80;
        name = rand.nextInt(carNames.length) + " " + rand.nextInt(carNames.length);
    }

    void moveForAnHour(Race race) {
        if (race.isThereBrokenTruck()) {
            distanceTraveled += limitedSpeed;
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
