package com.bridgelabz;

public class Gamble {
    int everydayStake=100;
    int everyGameBet=1;

    public static void main(String[] args)
    {
        Gamble g = new Gamble();

        System.out.println("The user can start for the day is:"+g.everydayStake+"$");
        System.out.println("Minimum amount user can bet every game is:"+g.everyGameBet+"$");

    }
}