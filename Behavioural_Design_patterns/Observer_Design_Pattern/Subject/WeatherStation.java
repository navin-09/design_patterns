package Behavioural_Design_patterns.Observer_Design_Pattern.Subject;

import java.util.ArrayList;
import java.util.List;

import Behavioural_Design_patterns.Observer_Design_Pattern.interfaces.Observer;
import Behavioural_Design_patterns.Observer_Design_Pattern.interfaces.Subject;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("\n🌡️ WeatherStation: New temperature = " + temperature + "°C");
        notifyObservers();
    }
}
