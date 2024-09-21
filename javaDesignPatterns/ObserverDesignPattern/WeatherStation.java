package com.collection.illustration.javaDesignPatterns.ObserverDesignPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register observers
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);

        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
