package com.collection.illustration.javaDesignPatterns.FactoryDesignPattern;

public class Bike implements Vehicle{

    @Override
    public void createVehicle()
    {
        System.out.println("Creating bike");
    }
}
