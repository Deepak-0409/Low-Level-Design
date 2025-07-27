package com.practice.java.lld.tictactoe.model;

public class Player {
    private String id;
    public Piece piece;

    public Player(String id, Piece piece) {
        this.id = id;
        this.piece = piece;
    }

    public String getId() {
        return id;
    }
}
