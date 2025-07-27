package com.practice.java.lld.tictactoe;

import com.practice.java.lld.tictactoe.model.Board;
import com.practice.java.lld.tictactoe.model.CirclePiece;
import com.practice.java.lld.tictactoe.model.CrossPiece;
import com.practice.java.lld.tictactoe.model.Player;

import java.util.*;

public class TicTacToe {
    private List<Player> playersList = new ArrayList<>();
    private Board board;
    private Deque<Player> playerTurn = new ArrayDeque<>();


    public TicTacToe(int players, int boardSize) {
        board = Board.getInstance(boardSize);
        initializeGame();
    }

    private void initializeGame() {
        Player p1 = new Player("1",new CirclePiece());
        Player p2 = new Player("2",new CrossPiece());
        addPlayer(p1);
        addPlayer(p2);
    }

    public void addPlayer(Player p) {
        // check player already exist or not
        playersList.add(p);
    }

    //remove player

    public void playGame() {
        boolean isWinner = false;
        initializeTurn();
        while(!isWinner) {
            Player playerWithChance = playerTurn.poll();
            System.out.println("Player " + playerWithChance.getId() + "'s Turn");

            //Take user move input - checkout it as a new method
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Your Move: ");
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            boolean isMovePlayed = playMove(playerWithChance,i,j);
            if(!isMovePlayed) {
                playerTurn.addFirst(playerWithChance);
                continue;
            }

            isWinner = checkIsPlayerWinner(i,j,playerWithChance);
            playerTurn.add(playerWithChance);

            if(isWinner) {
                System.out.println("Player-" + playerWithChance.getId() + " is Winner!!");
            } else if(isGameTie()) {
                System.out.println("Game Tie !!");
                break;
            }

        }
    }
    private void initializeTurn() {
        playerTurn.addAll(playersList);
    }

    private boolean playMove(Player p, int i, int j) {
        if(board.isInvalidMove(i,j)) {
            System.out.println("Invalid Move");
            board.printBoard();
            return false;
        }
        board.playMove(p,i,j);
        board.printBoard();
        return true;
    }

    private boolean checkIsPlayerWinner(int row, int col, Player p) {
        return board.isPlayerWinner(row, col, p);
    }

    private boolean isGameTie() {
        return board.isGameTie();
    }
}
