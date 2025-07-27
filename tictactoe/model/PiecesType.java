package com.practice.java.lld.tictactoe.model;

public enum PiecesType {
    CROSS("X"),CIRCLE("O");
    private String pieceSymbol;
    PiecesType(String pieceSymbol) {
        this.pieceSymbol = pieceSymbol;
    }
    public String getPieceSymbol() {
        return pieceSymbol;
    }
}
