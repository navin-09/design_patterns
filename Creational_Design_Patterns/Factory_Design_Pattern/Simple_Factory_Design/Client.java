package Creational_Design_Patterns.Factory_Design_Pattern.Simple_Factory_Design;

public class Client {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.start();

    }

}
