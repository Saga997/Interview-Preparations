package com.collection.illustration.javaDesignPatterns.ObserverDesignPattern;

public interface
Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
