package com.bridgelabz;

import java.util.Random;

public class Gamble {
    int everydayStake = 100;
    int everyGameBet = 1;

    public void winLosse() {


        Random r1 = new Random();
        int check = r1.nextInt(2);
        if (check == 0) {
            System.out.println("WIN");
        } else
            System.out.println("LOSE");
    }

    public static void main(String[] args) {
        Gamble g = new Gamble();
        g.winLosse();
    }
}