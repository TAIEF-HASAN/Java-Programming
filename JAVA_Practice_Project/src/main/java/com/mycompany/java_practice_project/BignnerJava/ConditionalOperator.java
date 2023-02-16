package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class ConditionalOperator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2, large;

        System.out.print("find the large number between two number:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        large= (num1>num2) ? num1 : num2;

        System.out.println("the large number is "+large);


    }
}
