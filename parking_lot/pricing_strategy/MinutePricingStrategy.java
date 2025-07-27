package com.practice.java.lld.parking_lot.pricing_strategy;

import com.practice.java.lld.parking_lot.ticket.Ticket;

import java.time.Duration;

public class MinutePricingStrategy implements PricingStrategy{
    @Override
    public long calculateCost(Ticket ticket) {
        long duration = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toMinutes() + 1;
        int price = ticket.getParkingSpot().getPrice();
        return duration*(price);
    }
}
