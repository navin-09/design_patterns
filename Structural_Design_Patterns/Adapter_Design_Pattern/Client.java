package Structural_Design_Patterns.Adapter_Design_Pattern;

public class Client {

    public static void main(String[] args) {
        PayPalGateway payPal = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PayPalAdapter(payPal);

        paymentProcessor.pay("USD", 120.75);
    }
    
}
