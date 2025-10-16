package Behavioural_Design_patterns.Strategy_Design_Pattern.strategies;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card (" + cardHolder + ", " + mask(cardNumber) + ")");
    }

    private String mask(String card) {
        if (card == null || card.length() < 4) return "****";
        return "****-****-****-" + card.substring(card.length() - 4);
    }
}
