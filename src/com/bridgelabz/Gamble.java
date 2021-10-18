package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class Gamble{

    public static void main(String[] args) {

        System.out.println("Do you want to play??? press 1 for yes and 0 for no");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        if (a==1){
            System.out.println("lets play");
        }
        else{
            System.out.println("thanks for playing");
        }
    }
}