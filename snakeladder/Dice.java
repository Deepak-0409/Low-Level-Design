package com.practice.java.lld.snakeladder;

import java.util.Random;

public class Dice {
    int diceCount=0;

    public Dice(int n) {
        diceCount = n;
    }

    public int rollDice() {
        int totalSum=0;
        int cnt=diceCount;
        while(cnt>0) {
            totalSum += new Random().nextInt(1,7);
            cnt--;
        }
        return totalSum;
    }
}
