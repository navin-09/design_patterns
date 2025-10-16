package Behavioural_Design_patterns.Observer_Design_Pattern.app;

import Behavioural_Design_patterns.Observer_Design_Pattern.Observers.MobileDisplay;
import Behavioural_Design_patterns.Observer_Design_Pattern.Observers.WindowDisplay;
import Behavioural_Design_patterns.Observer_Design_Pattern.Subject.WeatherStation;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        MobileDisplay phone1 = new MobileDisplay("Alice");
        MobileDisplay phone2 = new MobileDisplay("Bob");
        WindowDisplay window = new WindowDisplay();

        station.registerObserver(phone1);
        station.registerObserver(phone2);
        station.registerObserver(window);

        station.setTemperature(25.3f);
        station.setTemperature(30.1f);

        station.removeObserver(phone2);

        station.setTemperature(27.5f);
    }
}
