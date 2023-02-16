package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class PatternExmp2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Pattern numbr:");
        int n = input.nextInt();

        for(int row=n; row>=1; row--){
            //for(int colm=1; colm<=row; colm++)
            for(int colm=row; colm>=1; colm--){
                System.out.print(" "+colm);
            }
            System.out.println();

        }
    }
}
