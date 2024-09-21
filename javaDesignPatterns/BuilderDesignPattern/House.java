package com.collection.illustration.javaDesignPatterns.BuilderDesignPattern;

public class House {

    private String walls;
    private String roof;

    // Optional parameters
    private int doors;
    private int windows;
    private boolean garage;

    // Private constructor to be used by the Builder
    private House(Builder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.garage = builder.garage;
    }

    // Getters for demonstration purposes
    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public boolean hasGarage() {
        return garage;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String walls;
        private String roof;

        // Optional parameters - initialized to default values
        private int doors = 0;
        private int windows = 0;
        private boolean garage = false;

        // Builder constructor with required parameters
        public Builder(String walls, String roof) {
            this.walls = walls;
            this.roof = roof;
        }

        // Methods to set optional parameters
        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        // Method to build the final House object
        public House build() {
            return new House(this);
        }
    }

}