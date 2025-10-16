package Behavioural_Design_patterns.Observer_Design_Pattern.Observers;

import Behavioural_Design_patterns.Observer_Design_Pattern.interfaces.Observer;

public class MobileDisplay implements Observer {
    private String name;

    public MobileDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("📱 " + name + " display updated: " + temperature + "°C");
    }
}
