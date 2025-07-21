package com.practice.java.lld.parking_lot;

import java.time.Duration;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public long calculateCost(Ticket ticket) {
        long duration = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours() + 1;
        int price = ticket.getParkingSpot().getPrice();
        return duration*price*60;
    }
}
