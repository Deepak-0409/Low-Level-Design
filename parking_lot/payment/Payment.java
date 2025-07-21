package com.practice.java.lld.parking_lot.payment;

import java.util.UUID;

public class Payment {
    private String payment_id;
    private PaymentType paymentType;
    private long amount;
    public Payment(PaymentType paymentType, long amount) {
        this.payment_id = UUID.randomUUID().toString();
        this.paymentType = paymentType;
        this.amount = amount;
    }
    public String getPayment_id() {
        return payment_id;
    }
}
