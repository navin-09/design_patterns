package Structural_Design_Patterns.Adapter_Design_Pattern;

import Structural_Design_Patterns.Adapter_Design_Pattern.externalApi.PayPalGateway;

public class Client {

    public static void main(String[] args) {
        PayPalGateway payPal = new PayPalGateway();
        PaymentAdapter paymentProcessor = new PayPalAdapter(payPal);

        paymentProcessor.pay("USD", 120.75);
    }
    
}
