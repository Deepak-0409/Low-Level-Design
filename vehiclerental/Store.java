package com.practice.java.lld.vehiclerental;

import java.util.List;

public class Store {
    int id;
    Location location;
    List<Reservation> reservationList;
    VehicleInventory vehicleInventory;

    public List<Vehicle> getVehicles() {
        return vehicleInventory.getVehicles();
    }

    public void setVehicle(Vehicle vehicle) {
        vehicleInventory.setVehicle(vehicle);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        //create a new reservation and return
        return new Reservation(vehicle,user);
    }

    public boolean completeReservation(Reservation reservation) {
        //complete the reservation
        return true;
    }

    //cancel reservation

    //update reservation

}
