package com.practice.java.lld.bookmyshow.model;


import com.practice.java.lld.bookmyshow.enums.BookingStatus;

import java.util.List;

public class Booking {
    int id;
    User user;
    Payment payment;
    BookingStatus status;
    Show bookedShow;
    List<Seat> bookedSeats;

}
