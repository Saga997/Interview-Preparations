package com.collection.illustration.Multithreading;

    class ClassLevelLock2 {
        public static synchronized void staticMethod() {
            // This method locks the class
            System.out.println("Thread " + Thread.currentThread().getName() + " is executing.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class ClassLevelLock {
        public static void main(String[] args) {
            ClassLevelLock2 obj1 = new ClassLevelLock2();
            ClassLevelLock2 obj2 = new ClassLevelLock2();

            // Two threads working on the same class (class-level lock)
            Thread t1 = new Thread(() -> ClassLevelLock2.staticMethod(), "T1");
            Thread t2 = new Thread(() -> ClassLevelLock2.staticMethod(), "T2");

            t1.start();
            t2.start();
        }
    }


    //Class-level locking is used when you want to synchronize access to static data or methods that are shared across
// all instances of a class. The lock is associated with the class object itself (Class<?>), rather than with
// individual object instances.
//
//Use Case: Singleton Pattern
//A common use case for class-level locking is ensuring thread safety when lazy initializing a singleton object in
// a multithreaded environment. The goal is to ensure that only one instance of the class is created, even when multiple threads attempt to create the object simultaneously.
