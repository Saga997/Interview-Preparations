package com.collection.illustration.Multithreading;

class ObjectLevelLock2
{
    public synchronized void instanceMethod() {
        // This method locks only the current object
        System.out.println("Thread " + Thread.currentThread().getName() + " is executing.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ObjectLevelLock {
    public static void main(String[] args) {
        ObjectLevelLock2 obj1 = new ObjectLevelLock2();
        ObjectLevelLock2 obj2 = new ObjectLevelLock2();

        // Two threads working on different objects (no interference)
        Thread t1 = new Thread(() -> obj1.instanceMethod(), "T1");
        Thread t2 = new Thread(() -> obj2.instanceMethod(), "T2");

        t1.start();
        t2.start();
    }
}


//Object-level locking is used to synchronize access to non-static methods or instance variables that are unique
// to an object. The lock is associated with a specific object instance, meaning that different threads can operate
// on different instances of the class concurrently, but only one thread can access synchronized methods of the same
// instance at any given time.
//
//Use Case: Bank Account Transactions
//A common use case for object-level locking is ensuring thread safety when performing transactions on a bank account.
// Each account can be represented as an object, and we want to ensure that only one thread can modify a particular
// account at a time, while allowing other threads to operate on different accounts simultaneously.
