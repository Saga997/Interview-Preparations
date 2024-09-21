package com.collection.illustration.javaDesignPatterns.FactoryDesignPattern;

public class Car implements Vehicle{

    @Override
    public void createVehicle()
    {
        System.out.println("Creating car");
    }
}
