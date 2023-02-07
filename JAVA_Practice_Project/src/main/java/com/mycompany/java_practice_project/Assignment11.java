package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Assignment11 {
    
    public static void main(String[] args) {
        

        Scanner input  = new Scanner(System.in);
        int fact=1, i=1, n;
        System.out.print("Enter a Number for calculate the factorial:");
        n = input.nextInt();

        for(i=1; i<=n; i++){

            fact = fact * i;
        }

        System.out.println("The factorial of "+ n + " is "+fact);

    }
}
