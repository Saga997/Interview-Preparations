package com.collection.illustration.javaDesignPatterns.BuilderDesignPattern;

public class HouseBuilderDemo {
    public static void main(String[] args) {
        // Using the builder to construct a House object
        House house = new House.Builder("Brick Walls", "Concrete Roof")
                .setDoors(4)
                .setWindows(6)
                .setGarage(true)
                .build();

        // Displaying the house properties
        System.out.println("House Details:");
        System.out.println("Walls: " + house.getWalls());
        System.out.println("Roof: " + house.getRoof());
        System.out.println("Doors: " + house.getDoors());
        System.out.println("Windows: " + house.getWindows());
        System.out.println("Garage: " + house.hasGarage());
    }
}
