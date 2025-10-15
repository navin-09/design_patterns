package Structural_Design_Patterns.Facade_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("iPhone15", "Credit Card");
    }
}