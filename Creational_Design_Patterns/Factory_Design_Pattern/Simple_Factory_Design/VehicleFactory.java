package Creational_Design_Patterns.Factory_Design_Pattern.Simple_Factory_Design;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) {return null;}
        
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
