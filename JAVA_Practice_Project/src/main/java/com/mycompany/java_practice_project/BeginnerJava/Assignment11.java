package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class Assignment11 {
    
    public static void main(String[] args) {
        

        Scanner input  = new Scanner(System.in);
        int fact=1, fact2 = 1, i=1, n;
        System.out.print("Enter a Number for calculate the factorial:");
        n = input.nextInt();

        //a way to define a factorial
        for(i=1; i<=n; i++){

            fact = fact * i;
        }

        System.out.println("The factorial of "+ n + " is "+fact);

        //another way to define a factorial
        for(i=n; i>=1; i--){

            fact2 = fact2 * i;
        }

        System.out.println("The factorial of "+ n + " is "+fact2);

    }
}
