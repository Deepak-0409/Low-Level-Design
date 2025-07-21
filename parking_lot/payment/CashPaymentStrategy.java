package com.practice.java.lld.parking_lot.payment;

public class CashPaymentStrategy implements PaymentStrategy{
    public static final CashPaymentStrategy INSTANCE = new CashPaymentStrategy();
    private CashPaymentStrategy() {
    }
    @Override
    public Payment makePayment(long amount) {
        System.out.println("Paid amount: " + amount + "Rs by Cash");
        return new Payment(PaymentType.CASH, amount);
    }
}
