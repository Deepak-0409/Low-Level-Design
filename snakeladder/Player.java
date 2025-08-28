package com.practice.java.lld.snakeladder;

public class Player {
    public int id;
    private int currentPosition;

    public Player(int id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
