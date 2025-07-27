package com.practice.java.lld.parking_lot.payment;

public class UpiPaymentStrategy implements PaymentStrategy{
    public static final UpiPaymentStrategy INSTANCE = new UpiPaymentStrategy();
    private UpiPaymentStrategy() {
    }
    @Override
    public Payment makePayment(long amount) {
        System.out.println("Paid amount: " + amount + "Rs by UPI");
        return new Payment(PaymentType.UPI, amount);
    }
}
