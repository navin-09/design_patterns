package Structural_Design_Patterns.Adapter_Design_Pattern;

import Structural_Design_Patterns.Adapter_Design_Pattern.externalApi.PayPalGateway;

public class PayPalAdapter implements PaymentAdapter {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void pay(String currency, double amount) {
        payPalGateway.makePayment(currency, amount); // adapting the call
    }
}