package com.codecool;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Race {
    Weather weather = new Weather();

    final int vehicleNum = 30;

    List<Vehicle> vehicleList = new ArrayList<Vehicle>(vehicleNum);

    final int raceHours = 50;

    void createVehicles() {
        //TODO: Creates 10 cars, 10 trucks and 10 motorcycles
        for (int i = 0; i < vehicleNum; i++) {
            switch (i % 3) {
                case 0:
                    vehicleList.add(new Car());
                    break;
                case 1:
                    vehicleList.add(new Motorcycle());
                    break;
                case 2:
                    vehicleList.add(new Truck());
                    break;
            }
        }
    }

    void simulateRace() {
        //TODO: Simulates the race by
        // - calling moveForAnHour() on every vehicle 50 times
        // - setting whether its raining.
        for (int i = 0; i < raceHours; i++) {
            weather.setRaining();
            for (Vehicle vehicle : vehicleList) {
                vehicle.moveForAnHour(this);
            }
        }
    }

    void sortVehiclesByDistanceTraveled() {
        Collections.sort(vehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return (int)o2.getDistanceTraveled() - (int)o1.getDistanceTraveled();
            }
        });
    }

    void printRaceResults() {
        //TODO: Prints each vehicle's name, distance traveled and type.
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }
    }

    boolean isThereBrokenTruck() {
        //TODO: Decide if there is a broken truck in the race.
        for (Vehicle vehicle : vehicleList) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBrokenDown()) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isRaining() {
        //TODO: Decide if it is raining now.
        return weather.isRaining();
    }

    public static void main(String[] args) {
	    // write your code here
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.sortVehiclesByDistanceTraveled();
        race.printRaceResults();
    }
}
