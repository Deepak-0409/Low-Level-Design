package com.practice.java.lld.snakeladder;


import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    private Queue<Player> players = new ArrayDeque<>();
    private Dice dice;
    private Board board;
    private Player winnerPlayer;
    //Can add winning strategy object to decide the dynamic rule for winning

    public Game() {
        initializeGame();
    }


    public void startGame() {

        while(winnerPlayer==null) {
            Player currPlayer = players.poll();
            players.add(currPlayer);

            System.out.println("Player-"+currPlayer.id+" turn");

            int diceNumbers = dice.rollDice();

            System.out.println("Dice: "+diceNumbers);
            System.out.println("Current Position: "+currPlayer.getCurrentPosition());

            int newPosition = currPlayer.getCurrentPosition()+diceNumbers;
            newPosition = makeJump(newPosition);
            currPlayer.setCurrentPosition(newPosition);
            System.out.println("New Position: "+currPlayer.getCurrentPosition());

            if(isPlayerWinner(newPosition))
                winnerPlayer=currPlayer;
        }

        System.out.println("Winner is: Player-"+winnerPlayer.id);
    }

    private void initializeGame() {

        dice = new Dice(1);
        board = new Board(10,5,4);
        winnerPlayer = null;
        addPlayers();

    }

    private void addPlayers() {
        Player p1 = new Player(1,0);
        Player p2 = new Player(2,0);
        players.add(p1);
        players.add(p2);
    }

    private int makeJump(int playerPosition){
        if(playerPosition>board.n* board.n-1)
            return playerPosition;

        Cell cell = board.getCell(playerPosition);
        if(cell.jump!=null && cell.jump.start==playerPosition) {
            String jumpType = cell.jump.start < cell.jump.end ? "ladder" : "snake";
            System.out.println("jump by: " + jumpType);
            return cell.jump.end;
        }

        return playerPosition;
    }

    private boolean isPlayerWinner(int playerPosition) {
        // return winningStrategy.isPlayerWinner();
        return playerPosition>= board.n* board.n;
    }
}
