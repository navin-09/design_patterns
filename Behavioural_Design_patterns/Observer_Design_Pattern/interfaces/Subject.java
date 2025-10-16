package Behavioural_Design_patterns.Observer_Design_Pattern.interfaces;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
