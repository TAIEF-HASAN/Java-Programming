package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class CelciusToFarenheitCalcu {
    
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        double F, C;

        System.out.print("Enter Temparature in Celcius: ");
        C = input.nextDouble();

        F = 1.8 * C + 32;

        System.out.printf("Farenheit : %.0f",F);


    }
}
