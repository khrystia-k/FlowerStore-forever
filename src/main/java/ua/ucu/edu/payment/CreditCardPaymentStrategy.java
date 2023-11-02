package ua.ucu.edu.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Payment method: Credit Card";
    }
    
}
