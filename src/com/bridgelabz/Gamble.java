package com.bridgelabz;

import java.util.Random;

public class Gamble {
    int tempEverydayStake=100;
    int everyGameBet=1;

    public void winLosse(){
        Random r1=new Random();
        int winCal=everyGameBet;
        int looseCal=everyGameBet;
        int fPer=tempEverydayStake/2;
        int winPer=fPer+tempEverydayStake;
        int loosePer=tempEverydayStake-fPer;

        while(tempEverydayStake>loosePer && tempEverydayStake<winPer){
            int check=r1.nextInt(2);
            if(check==0){
                //System.out.println("WIN");
                tempEverydayStake=tempEverydayStake+winCal;
                //System.out.println("changed amount after a win"+tempEverydayStake);
            }
            else{
                //System.out.println("LOSSE");

                tempEverydayStake=tempEverydayStake-looseCal;
                //System.out.println("changed amount after a loose"+tempEverydayStake);

            }
            //System.out.println("earning"+tempEverydayStake);
        }
        System.out.println("earning"+tempEverydayStake);


    }

    public static void main(String[] args) {
        Gamble g = new Gamble();
        g.winLosse();
    }
}