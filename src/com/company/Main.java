package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                System.out.println("Your Phy marks: " + number[0]);
            } else if (i == 1) {
                System.out.println("Your Chem marks: " + number[1]);
            }
            else if(i == 2){
                System.out.println("Your Math marks: " + number[2]);
            }
        }
    }
}