package Behavioural_Design_patterns.Strategy_Design_Pattern.app;

import Behavioural_Design_patterns.Strategy_Design_Pattern.Model.PaymentType;
import Behavioural_Design_patterns.Strategy_Design_Pattern.factory.PaymentStrategyFactory;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.checkoutWith(PaymentType.CREDIT_CARD, 1500.0, "4111222233334444", "Alice");
        cart.checkoutWith(PaymentType.PAYPAL, 2200.5, "alice@example.com");
        cart.checkoutWith(PaymentType.UPI, 799.99, "alice@upi");
    }
}