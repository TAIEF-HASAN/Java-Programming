package com.mycompany.java_practice_project;

import java.util.Scanner;

public class arithmetic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Secound Number: ");
        num2 = input.nextInt();
        
        result = num1+num2;
        System.out.println("Sum :"+result);

        result = num1-num2;
        System.out.println("Sub :"+result);

        double result1 = (double)num1/num2;
        System.out.printf("Divided : %.2f\n",result1);

        result = num1%num2;
        System.out.println("Division :"+result);
    }
}
