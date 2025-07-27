package com.practice.java.lld.tictactoe.model;

public class CrossPiece implements Piece{
    private PiecesType pieceType = PiecesType.CROSS;
    @Override
    public PiecesType getPieceType() {
        return pieceType;
    }

    @Override
    public String getPieceSymbol() {
        return pieceType.getPieceSymbol();
    }
}
