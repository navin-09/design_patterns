package Structural_Design_Patterns.Facade_Design_Pattern;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String productId, String paymentType) {
        if (inventoryService.checkStock(productId)) {
            paymentService.processPayment(paymentType);
            shippingService.shipProduct(productId);
            notificationService.sendEmail("Your order for " + productId + " has been placed!");
            System.out.println("✅ Order placed successfully!");
        } else {
            System.out.println("❌ Product out of stock!");
        }
    }
}
