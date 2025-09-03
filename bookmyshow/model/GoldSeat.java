package com.practice.java.lld.bookmyshow.model;

import com.practice.java.lld.bookmyshow.enums.SeatType;

public class GoldSeat extends Seat{
    public GoldSeat(int id) {
        super(id, SeatType.GOLD);
    }
}
