package com.practice.java.lld.elevatorsystem.model.request;

import com.practice.java.lld.elevatorsystem.enums.Direction;

public class PendingRequest {
    public Direction dir;
    public int floor;

    public PendingRequest(Direction dir, int floor) {
        this.dir = dir;
        this.floor = floor;
    }
}
