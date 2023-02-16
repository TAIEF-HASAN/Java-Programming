package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class conditional_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter you Number: ");
        number = input.nextInt();

        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
