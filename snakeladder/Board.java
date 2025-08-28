package com.practice.java.lld.snakeladder;

import java.util.Random;

public class Board {
    Cell[][] cells;
    int n;
    public Board(int n, int snakes, int ladders) {
        this.n = n;
        cells = new Cell[n][n];
        initializeCells();
        addSnakesLadders(snakes,ladders);
    }

    public void initializeCells() {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void addSnakesLadders(int snakes, int ladders) {
        while(snakes>0) {
            int snakeHead = new Random().nextInt(1,cells.length*cells.length-1);
            int snakeTail = new Random().nextInt(1,cells.length*cells.length-1);
            if(snakeHead<=snakeTail)
                continue;

            Cell cell = getCell(snakeHead);
            cell.setJump(new Jump(snakeHead,snakeTail));
            snakes--;
        }

        while(ladders>0) {
            int ladderHead = new Random().nextInt(1,cells.length*cells.length-1);
            int ladderTail = new Random().nextInt(1,cells.length*cells.length-1);
            if(ladderHead>=ladderTail)
                continue;

            Cell cell = getCell(ladderHead);
            cell.setJump(new Jump(ladderHead,ladderTail));
            ladders--;
        }

    }

    public Cell getCell(int playerPosition) {
        int row = playerPosition/ cells.length;
        int col = playerPosition% cells.length;

        return cells[row][col];
    }
}
