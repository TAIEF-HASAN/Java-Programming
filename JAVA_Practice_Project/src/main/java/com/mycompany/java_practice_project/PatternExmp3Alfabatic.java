package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternExmp3Alfabatic {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Pattern Number:");
        int n = input.nextInt();
    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf(" %c",j+64);
            }
            System.out.println();
        }
    }
}
