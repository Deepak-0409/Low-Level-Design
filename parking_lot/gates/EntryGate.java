package com.practice.java.lld.parking_lot.gates;

import com.practice.java.lld.parking_lot.ParkingLot;
import com.practice.java.lld.parking_lot.ticket.Ticket;
import com.practice.java.lld.parking_lot.parking_spot.ParkingSpot;
import com.practice.java.lld.parking_lot.vehicle.Vehicle;

public class EntryGate {
    private String id;

    public EntryGate(String id) {
        this.id = id;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        Ticket ticket = null;
        if(!ParkingLot.INSTANCE.isParkingAvailable(vehicle)) {
            System.out.println("Sorry, no " +  vehicle.getVehicleType() + " parking available !!");
            return ticket;
        }

        ParkingSpot spot = ParkingLot.INSTANCE.getParkingSpot(vehicle);
        spot.park(vehicle);
        System.out.println("Vehicle " + vehicle.getLicenseNumber() + " parked at spot: " + spot.getId());

        ticket = new Ticket(vehicle,spot);
        System.out.println("Ticket id for vehicle " + vehicle.getLicenseNumber() + ": " + ticket.getId());

        return ticket;
    }
}
