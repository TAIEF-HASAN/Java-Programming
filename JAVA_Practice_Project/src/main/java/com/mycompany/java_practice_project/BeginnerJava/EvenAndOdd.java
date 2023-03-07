package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter Your Number: ");
        number = input.nextInt();

        if(number % 2 ==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
