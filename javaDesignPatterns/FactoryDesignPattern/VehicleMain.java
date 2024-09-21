package com.collection.illustration.javaDesignPatterns.FactoryDesignPattern;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

       String vehicleType = scn.nextLine();
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        if(vehicle!=null)
        {
            vehicle.createVehicle();
        }
        else {
            System.out.println("Unknown vehicle type");
        }

        //        Vehicle vehicle = null;
//        if(vehicleType.equalsIgnoreCase("Car") )
//        {
//            vehicle = new Car();
//        }
//        else if(vehicleType.equalsIgnoreCase("Bike"))
//        {
//            vehicle = new Bike();
//        }
//        else {
//            System.out.println("Unknown vehicle type.");
//            return; // Exit if the vehicle type is unknown
//        }
//
//        vehicle.createVehicle();
        //tomowrrow if request comes to create tempo , scooter then f else will have many sectiosn now
        // so this entire code will move to factory

    }
}

//The Factory Design Pattern is a creational design pattern that provides a way to create objects without
// exposing the instantiation logic to the client. Instead of calling the constructor directly, the client calls a
// factory method, which abstracts the object creation process. This allows for flexibility in deciding which object
// to create based on the given conditions.
