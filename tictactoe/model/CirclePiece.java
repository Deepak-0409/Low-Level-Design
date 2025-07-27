package com.practice.java.lld.tictactoe.model;

public class CirclePiece implements Piece{
    private PiecesType pieceType = PiecesType.CIRCLE;
    @Override
    public PiecesType getPieceType() {
        return pieceType;
    }

    @Override
    public String getPieceSymbol() {
        return pieceType.getPieceSymbol();
    }
}
