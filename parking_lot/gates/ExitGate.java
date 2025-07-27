package com.practice.java.lld.parking_lot.gates;

import com.practice.java.lld.parking_lot.ticket.Ticket;
import com.practice.java.lld.parking_lot.payment.Payment;
import com.practice.java.lld.parking_lot.payment.PaymentStrategy;

import java.time.LocalTime;

public class ExitGate {
    private String id;

    public ExitGate(String id) {
        this.id = id;
    }
    public void makePayment(PaymentStrategy paymentStrategy, Ticket ticket) {
        if(ticket==null) {
            System.out.println("Invalid Ticket");
            return;
        }
        ticket.setExitTime(LocalTime.now());
        long amount = ticket.getParkingSpot().calculateCost(ticket);
        Payment payment = paymentStrategy.makePayment(amount);
        ticket.setExpired(true);
        ticket.getParkingSpot().unpark();
        System.out.println("Payment Successful, payment id: " + payment.getPayment_id());
        System.out.println("Vehicle: " + ticket.getVehicle().getLicenseNumber() + " exited successfully");
    }
}
