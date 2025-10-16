package Behavioural_Design_patterns.Observer_Design_Pattern.Observers;

import Behavioural_Design_patterns.Observer_Design_Pattern.interfaces.Observer;

public class WindowDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("🪟 Window display shows: " + temperature + "°C");
    }
}
