package Behavioural_Design_patterns.Strategy_Design_Pattern.app;

import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PaymentStrategy;


public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("PaymentStrategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
