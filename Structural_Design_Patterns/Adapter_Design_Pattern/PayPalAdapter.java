package Structural_Design_Patterns.Adapter_Design_Pattern;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void pay(String currency, double amount) {
        payPalGateway.makePayment(currency, amount); // adapting the call
    }
}