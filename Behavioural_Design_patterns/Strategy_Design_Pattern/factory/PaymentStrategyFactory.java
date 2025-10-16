package Behavioural_Design_patterns.Strategy_Design_Pattern.factory;

import Behavioural_Design_patterns.Strategy_Design_Pattern.Model.PaymentType;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.CreditCardPayment;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PayPalPayment;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.PaymentStrategy;
import Behavioural_Design_patterns.Strategy_Design_Pattern.strategies.UpiPayment;

/**
 * Simple factory that creates PaymentStrategy instances based on PaymentType.
 * The credentials parameter is used differently per strategy:
 *  - CREDIT_CARD -> credentials[0] = cardNumber, credentials[1] = cardHolder
 *  - PAYPAL      -> credentials[0] = email
 *  - UPI         -> credentials[0] = upiId
 */
public final class PaymentStrategyFactory {

    private PaymentStrategyFactory() { }

    public static PaymentStrategy create(PaymentType type, String... credentials) {
        switch (type) {
            case CREDIT_CARD:
                if (credentials.length < 2) {
                    throw new IllegalArgumentException("CREDIT_CARD requires cardNumber and cardHolder");
                }
                return new CreditCardPayment(credentials[0], credentials[1]);
            case PAYPAL:
                if (credentials.length < 1) {
                    throw new IllegalArgumentException("PAYPAL requires email");
                }
                return new PayPalPayment(credentials[0]);
            case UPI:
                if (credentials.length < 1) {
                    throw new IllegalArgumentException("UPI requires upiId");
                }
                return new UpiPayment(credentials[0]);
            default:
                throw new IllegalArgumentException("Unknown PaymentType: " + type);
        }
    }
}
