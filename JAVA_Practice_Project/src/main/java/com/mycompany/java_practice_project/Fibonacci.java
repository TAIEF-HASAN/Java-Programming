package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter the Fibonacci number you want to see");
        n = input.nextInt();

        int first = 0;
        int Secound = 1;
        int fiboo;

        System.out.print(" "+first);
        System.out.print(" "+Secound);

        for(int i=3; i<=n; i++){

            fiboo = first + Secound;
            System.out.print(" "+fiboo);
            first = Secound;
            Secound = fiboo;
        }
    }
}
