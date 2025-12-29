package designPattern.behavioural.Strategy;

// Concrete Strategy 1: Credit Card Payment
public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
