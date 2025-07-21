package com.practice.java.lld.parking_lot.pricing_strategy;

import com.practice.java.lld.parking_lot.ticket.Ticket;

public interface PricingStrategy {
    long calculateCost(Ticket ticket);
}
