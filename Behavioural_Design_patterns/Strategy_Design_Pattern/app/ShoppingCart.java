package Behavioural_Design_patterns.Strategy_Design_Pattern.app;

import Behavioural_Design_patterns.Strategy_Design_Pattern.Model.PaymentType;
import Behavioural_Design_patterns.Strategy_Design_Pattern.factory.PaymentStrategyFactory;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PaymentStrategy;


public class ShoppingCart {

    public void checkoutWith(PaymentType type, double amount, String... credentials) {
        PaymentStrategy strategy = PaymentStrategyFactory.create(type, credentials);
        System.out.println("\n--- Checkout Started (" + type + ") ---");
        strategy.pay(amount);
        System.out.println("--- Checkout Complete ---\n");
    }
}
