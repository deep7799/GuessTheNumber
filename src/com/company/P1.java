package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class P1 {
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      pattern(4);
    }
}
