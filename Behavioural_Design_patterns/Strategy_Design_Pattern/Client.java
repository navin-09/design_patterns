package Behavioural_Design_patterns.Strategy_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // use Credit Card strategy
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9000"));
        cart.checkout(1500);

        // switch to PayPal at runtime
        cart.setPaymentStrategy(new PayPalPayment("user@email.com"));
        cart.checkout(2200);

        // switch to UPI
        cart.setPaymentStrategy(new UpiPayment("user@upi"));
        cart.checkout(800);
    }
}
