package com.mycompany.java_practice_project;

import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number and it will get you reverse:");
        n = input.nextInt();

        int temp = n;
        int r;
        int sum = 0;

        while(temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp/10;
        }
        System.out.println("The reverse number is "+sum);
    }
}
