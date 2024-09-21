//package com.collection.illustration.OOPs.tightCoupling;
//
//
//    public class Engine {
//        public void start() {
//            System.out.println("Engine started.");
//        }
//    }
//
//    class Car {
//        private Engine engine; // Direct dependency on Engine class
//
//        public Car() {
//            engine = new Engine();  // Car is tightly coupled to Engine
//        }
//
//        public void startCar() {
//            engine.start();
//            System.out.println("Car is running.");
//        }
//    }
//
//
