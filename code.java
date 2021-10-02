package com.NumberGuessGame;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        start();
        System.out.print(" NUMBER GUESS GAME ");
        start();
        System.out.println();
        System.out.println("^^^level^^^");
        System.out.println("press only 1,2 or 3 ");
        System.out.println("1 EASY   (1 - 10)");
        System.out.println("2 MEDIUM (1 - 50)");
        System.out.println("3 HARD   (1 - 100)");
        int L=0;
        int lvl;
      do {
           lvl = in.nextInt();
          if (lvl == 1) L = 10;
          if (lvl == 2) L = 50;
          if (lvl == 3) L = 100;
          else if(lvl>3){
              System.out.println("wrong choice");
          }
      }while (lvl !=1 && lvl!=2 && lvl!=3);
        System.out.println("Guess Any Number Between 1 to "+ L);
        int num;
        Random rendom = new SecureRandom();
        int Ans = rendom.nextInt(L);
        int count =0;

        do {
            count++;
            num = in.nextInt();
            if (num < Ans){
                System.out.println("number is greater then " + num);
            }
            if (num > Ans){
                System.out.println("number is less then "+ num);
            }
            if (num==Ans){
                System.out.println("congrats you guess right number in " + count + " attempt");
            }
        }while (num!=Ans);
       start();
        System.out.print("THE END");
        start();

    }

    static void start (){
        for (int i=0; i<20; i++){
        System.out.print("*");
        }
    }
}
