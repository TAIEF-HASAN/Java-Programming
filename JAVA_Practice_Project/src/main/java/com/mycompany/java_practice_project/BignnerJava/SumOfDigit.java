package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, r;

        System.out.println("Enter The Number");
        n = input.nextInt();

        int temp = n;
        int sum = 0;

        while(temp != 0){
            r= temp % 10 ;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("The Digit of Sum is"+sum);
    }
}
