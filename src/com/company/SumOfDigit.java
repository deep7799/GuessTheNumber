package com.company;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("0");
        } else if (n % 9 == 0) {
            System.out.println("9");
        } else if (n % 9 != 0) {
            System.out.println(n % 9);
        }
    }
}