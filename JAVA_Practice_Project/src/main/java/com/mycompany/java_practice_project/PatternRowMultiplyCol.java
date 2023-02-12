package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternRowMultiplyCol {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the pattern number:");
        n = input. nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" "+row*col);
            }
            System.out.println();
        }
    }
}
