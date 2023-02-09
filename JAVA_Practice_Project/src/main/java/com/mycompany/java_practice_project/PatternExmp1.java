package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternExmp1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Pattern numbr:");
        int n = input.nextInt();

        for(int row=1; row<=n; row++){
            for(int colm=1; colm<=row; colm++){
                System.out.print(" "+colm);
            }
            System.out.println();

        }
    }
}
