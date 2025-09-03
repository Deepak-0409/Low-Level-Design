package com.practice.java.lld.bookmyshow;

public enum SeatType {
    SILVER("silver", 250),
    GOLD("gold", 500),
    PLATINUM("platinum", 1000);

    private final String seatType;
    private final long price;

    private SeatType(String seatType, long price) {
        this.seatType = seatType;
        this.price = price;
    }

    //getter and setter

    public String getSeatType() {
        return seatType;
    }

    public long getPrice() {
        return price;
    }
}
