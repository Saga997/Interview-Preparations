package com.collection.illustration.javaDesignPatterns.SingletonDesignPattern;

public class LoggerMain {
    public static void main(String[] args)
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("hello from user 1");
        Logger logger2 = Logger.getInstance();
        logger2.log("hello from user 2");

        // Verify that both references point to the same instance
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
    }
}

