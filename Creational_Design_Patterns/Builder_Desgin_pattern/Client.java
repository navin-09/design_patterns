package Creational_Design_Patterns.Builder_Desgin_pattern;

public class Client {
    public static void main(String[] args) {
        // Using the Builder to create a complex object
        House house = new House.HouseBuilder()
                .setWalls(4)
                .setDoors(2)
                .setWindows(6)
                .setRoof("Gable")
                .setGarage(true)
                .setSwimmingPool(false)
                .build();

        System.out.println(house);
    }
}


