package com.company;

import java.util.Random;
import java.util.Scanner;
// 0 --> Rock
// 1 --> Paper
// 2 --> Scissors

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : \n 0 for Rock \n 1 for Paper \n 2 for Scissors : ");
        int a = sc.nextInt();

        Random rand = new Random();
        int b = rand.nextInt(3);

        if(a==b){
            System.out.println("Draw");
        }
        else if(a==0 && b==2 || a==1 && b==0 || a==2 && b==1){
            System.out.println("You Win");
        }
        else{
            System.out.println("You Loose");
        }
        System.out.println("Because computer choose : "+b);
    }
}
