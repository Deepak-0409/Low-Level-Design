package com.practice.java.lld.parking_lot.parking_spot;

import com.practice.java.lld.parking_lot.ticket.Ticket;
import com.practice.java.lld.parking_lot.pricing_strategy.PricingStrategy;
import com.practice.java.lld.parking_lot.vehicle.Vehicle;

public class ParkingSpot {
    private String id;
    private Vehicle vehicle;
    private Boolean isEmpty;
    private int price;
    private ParkingSpotType parkingSpotType;
    private PricingStrategy pricingStrategy;

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Boolean isEmpty() {
        return isEmpty;
    }

    public int getPrice() {
        return price;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public ParkingSpot(String id, ParkingSpotType parkingSpotType, int price, PricingStrategy pricingStrategy) {
        this.id = id;
        this.parkingSpotType = parkingSpotType;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
        this.isEmpty = true;
    }
    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void unpark() {
        this.vehicle = null;
        isEmpty = true;
    }

    public long calculateCost(Ticket ticket) {
        return pricingStrategy.calculateCost(ticket);
    }

}
