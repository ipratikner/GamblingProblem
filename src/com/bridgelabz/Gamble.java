package com.bridgelabz;

import java.util.Random;

public class Gamble{

    int everyGameBet=1;
    public void winLosse(){
        int afterBet=0;
        Random r1=new Random();

        for (int j=1; j<=12; j++)
        {
            int winCount=0;
            int looseCount=0;
            int profitAmt=0;
            int looseAmt=0;
            int tempEverydayStake=0;
            System.out.println("**********");
            System.out.println("MONTH "+j);
            for (int i=1; i<=30; i++)
            {
                tempEverydayStake=afterBet+100;
                int stakeCheck=tempEverydayStake;
                System.out.println("bet amount for day "+i+" is:"+tempEverydayStake);

                int fPer=tempEverydayStake/2;
                int winPer=tempEverydayStake+fPer;
                int loosePer=tempEverydayStake-fPer;

                while(tempEverydayStake>loosePer && tempEverydayStake<winPer)
                {
                    int winLoose=r1.nextInt(2);
                    if(winLoose==1)
                    {
                        //System.out.println("win");
                        afterBet=tempEverydayStake+everyGameBet;
                    }
                    else
                    {
                        //System.out.println("loose");
                        afterBet=tempEverydayStake-everyGameBet;
                    }
                    tempEverydayStake=afterBet;
                    //System.out.println("after play="+afterBet);
                }
                System.out.println("-----------------------");
                System.out.println("day "+i+" after the bet amount:"+tempEverydayStake);

                if(stakeCheck<afterBet)
                {
                    int profit=afterBet-stakeCheck;
                    winCount++;
                    profitAmt +=profit;
                    System.out.println("day "+i+" in profit:"+profit);
                }
                else
                {
                    int loose=stakeCheck-afterBet;
                    looseCount++;
                    looseAmt +=loose;
                    System.out.println("day "+i+" in loose:"+loose);
                }

            }
            System.out.println("WIN COUNT FOR MONTH "+j+" is::"+winCount);
            System.out.println("MONTH "+j+" profit amt:"+profitAmt);
            System.out.println("LOOSE COUNT FOR MONTH "+j+" is::"+looseCount);
            System.out.println("MONTH "+j+" loost amt:"+looseAmt);
        }

    }
    public static void main(String[] args) {
        Gamble g = new Gamble();
        g.winLosse();
    }
}