package com.collection.illustration.javaDesignPatterns.SingletonDesignPattern;

public class Logger {

    public static Logger instance;

    private Logger() { // make constructor private to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger(); //Lazy initialization
        }
        return instance;
    }

    public void log(String message)
    {
        System.out.println(message); //Basic logging
    }
}
