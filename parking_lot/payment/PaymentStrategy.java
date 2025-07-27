package com.practice.java.lld.parking_lot.payment;

public interface PaymentStrategy {
    Payment makePayment(long amount);
}
