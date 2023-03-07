package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class FarenheitToCelciusCalcu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double F, C;

        System.out.print("Enter Temparature in Farenheit: ");
        F = input.nextDouble();

        C = 0.55 * (F - 32);

        System.out.printf("Celcius : %.0f",C);
    }

    
    
}
