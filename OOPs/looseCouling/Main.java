//package com.collection.illustration.OOPs.looseCouling;
//
//import com.collection.illustration.OOPs.tightCoupling.Car;
//
//// Interface for Engine (Abstraction)
//interface Engine {
//    void start();
//}
//
//// Concrete implementation of Engine
//class DieselEngine implements Engine {
//    public void start() {
//        System.out.println("Diesel engine started.");
//    }
//}
//
//// Concrete implementation of another Engine type
//class ElectricEngine implements Engine {
//    public void start() {
//        System.out.println("Electric engine started.");
//    }
//}
//
//// Car class depends on abstraction (loose coupling)
//class LooseCouplingCar {
//    private Engine engine; // Car depends on Engine interface, not a specific class
//
//    public LooseCouplingCar(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void startCar() {
//        engine.start();
//        System.out.println("Car is running.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Engine dieselEngine = new DieselEngine();
//        LooseCouplingCar car = new LooseCouplingCar(dieselEngine);  // Injecting DieselEngine into Car
//        car.startCar();
//
//        Engine electricEngine = new ElectricEngine();
//        LooseCouplingCar electricCar = new LooseCouplingCar(electricEngine);  // Injecting ElectricEngine into Car
//        electricCar.startCar();
//    }
//}
