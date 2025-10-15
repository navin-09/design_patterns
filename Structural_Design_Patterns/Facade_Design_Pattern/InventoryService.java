package Structural_Design_Patterns.Facade_Design_Pattern;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for " + productId);
        return true;
    }
}
