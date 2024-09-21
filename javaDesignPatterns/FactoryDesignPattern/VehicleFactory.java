package com.collection.illustration.javaDesignPatterns.FactoryDesignPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) // you don't need any object of the class you can
    // create it with className only s
            // so we have create static method

    {

        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else {
            return null; // or throw an exception if an unknown type is provided
        }

    }
}

//so next time we get some additional info we jst to need to add that option her and inside main no need
//how are we implementing it no need for that