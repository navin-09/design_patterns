package Behavioural_Design_patterns.Strategy_Design_Pattern.app;

import Behavioural_Design_patterns.Strategy_Design_Pattern.Model.PaymentType;
import Behavioural_Design_patterns.Strategy_Design_Pattern.factory.PaymentStrategyFactory;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using factory to obtain strategy for CREDIT_CARD
        PaymentStrategy creditCardStrategy = PaymentStrategyFactory.create(
                PaymentType.CREDIT_CARD, "4111222233334444", "Alice");
        cart.setPaymentStrategy(creditCardStrategy);
        cart.checkout(1500.0);

        // // Switch to PayPal using factory
        // PaymentStrategy paypal = PaymentStrategyFactory.create(PaymentType.PAYPAL, "alice@example.com");
        // cart.setPaymentStrategy(paypal);
        // cart.checkout(2200.5);

        // // Switch to UPI using factory
        // PaymentStrategy upi = PaymentStrategyFactory.create(PaymentType.UPI, "alice@upi");
        // cart.setPaymentStrategy(upi);
        // cart.checkout(799.99);
    }
}
