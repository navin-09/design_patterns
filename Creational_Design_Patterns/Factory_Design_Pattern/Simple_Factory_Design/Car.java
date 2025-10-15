package Creational_Design_Patterns.Factory_Design_Pattern.Simple_Factory_Design;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("🚗 Car started...");
    }
}
