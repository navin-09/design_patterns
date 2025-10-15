package Structural_Design_Patterns.Adapter_Design_Pattern.externalApi;

public class PayPalGateway {
    public void makePayment(String currencyCode, double amt) {
        System.out.println("Payment of " + amt + " " + currencyCode + " made using PayPal");
    }
}
