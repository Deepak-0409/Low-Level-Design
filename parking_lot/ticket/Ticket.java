package com.practice.java.lld.parking_lot.ticket;

import com.practice.java.lld.parking_lot.parking_spot.ParkingSpot;
import com.practice.java.lld.parking_lot.vehicle.Vehicle;

import java.time.LocalTime;
import java.util.UUID;

public class Ticket {
    private String id;
    private LocalTime entryTime;
    private LocalTime exitTime;

    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Boolean isExpired;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID().toString();
        this.entryTime = LocalTime.now();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.isExpired = false;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public LocalTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public String getId() {
        return id;
    }
}
