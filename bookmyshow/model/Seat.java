package com.practice.java.lld.bookmyshow.model;

import com.practice.java.lld.bookmyshow.enums.SeatType;

public class Seat {
    int id;
    SeatType seatType;
    int row;
    long price;

    public Seat(int id, SeatType seatType) {
        this.id = id;
        this.seatType = seatType;
        this.price = seatType.getPrice();
    }
}
