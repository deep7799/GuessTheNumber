package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int attempts=0;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrect(){
        attempts++;
        if(inputNumber==number){
            System.out.format("Right, it was %d\n You get it in %d attempts",number,attempts);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Less");
        }
        else if(inputNumber>number){
            System.out.println("High");
        }
        return false;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b) {
            g.takeInput();
            b = g.isCorrect();
        }
    }
}
