package com.codecool;

public class Race {
    Weather weather = new Weather();

    void createVehicles() {
        //TODO: Creates 10 cars, 10 trucks and 10 motorcycles
    }

    void simulateRace() {
        //TODO: Simulates the race by
        // - calling moveForAnHour() on every vehicle 50 times
        // - setting whether its raining.
    }

    void printRaceResults() {
        //TODO: Prints each vehicle's name, distance traveled and type.
    }

    boolean isThereBrokenTruck() {
        //TODO: Decide if there is a broken truck in the race.
        return false;
    }

    boolean isRaining() {
        //TODO: Decide if it is raining now.
        return weather.isRaining();
    }

    public static void main(String[] args) {
	    // write your code here
    }
}
