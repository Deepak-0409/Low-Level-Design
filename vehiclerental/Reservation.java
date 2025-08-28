package com.practice.java.lld.vehiclerental;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {
    User user;
    Vehicle vehicle;
    ReservationStatus status;
    Location pickupLocation;
    Location dropLocation;
    Location bookedForLocation;
    LocalDateTime bookingDateTime;
    Date bookedFromDate;
    Date bookedToDate;
    Time bookedFromTime;
    Time bookedToTime;
    int id;

    public Reservation(Vehicle vehicle, User user) {
        // add logic
    }
}
