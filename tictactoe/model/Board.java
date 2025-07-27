package com.practice.java.lld.tictactoe.model;

public class Board {
    private int size;
    private Player[][]board;
    private static Board INSTANCE;

    private Board(int n) {
        //Initialize the n*n board
        size = n;
        board = new Player[3][3];
    }
    public static Board getInstance(int n) {
        if(INSTANCE!=null)
            return INSTANCE;
        return new Board(n);
    }
    public void printBoard() {
        System.out.println("___________");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(board[i][j]==null) {
                    System.out.print(" | ");
                } else {
                    System.out.print(board[i][j].piece.getPieceSymbol() + " | ");
                }
            }
            System.out.println("\n___________");
        }
    }

    public void playMove(Player p, int i, int j) {
        board[i][j] = p;
    }

    public boolean isInvalidMove(int i, int j) {
        return (i<0 || i>=3 || j<0 || j>=3 || board[i][j]!=null);
    }

    public boolean isGameTie() {
        boolean isTie = true;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(board[i][j]==null) {
                    isTie = false;
                    break;
                }
            }
        }

        return isTie;
    }

    public boolean isPlayerWinner(int row, int col, Player p) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0; i<3; i++) {
            if(board[row][i]==null || board[row][i]!=p) {
                rowMatch = false;
                break;
            }
        }

        for(int i=0; i<3; i++) {
            if(board[i][col]==null || board[i][col]!=p) {
                columnMatch = false;
                break;
            }
        }

        for(int i=0; i<3; i++) {
            if(board[i][i]==null || board[i][i]!=p) {
                diagonalMatch = false;
                break;
            }
        }

        for(int i=0; i<3; i++) {
            if(board[2-i][i]==null || board[2-i][i]!=p) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return (rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch);
    }
}
