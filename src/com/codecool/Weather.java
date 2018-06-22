package com.codecool;

import java.util.Random;

public class Weather {
    static boolean isRainingNow = false;

    static Random rand = new Random();

    static void setRaining() {
        //TODO: There is 30% chance of raining.
        if (rand.nextInt(101) <= 30) {
            isRainingNow = true;
        } else {
            isRainingNow = false;
        }
    }

    static boolean isRaining() {
        //TODO: Is it raining currently?
        return isRainingNow;
    }
}
