package com.collection.illustration.javaDesignPatterns.FactoryDesignPattern;

public interface Vehicle {
     default void createVehicle()
    {
        System.out.println("Vehicle has four wheels");
    }
}
