package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char letter;

        System.out.println("Do you love java? take user input y / Y / n / N");
        letter = input.next().charAt(0);

        if(letter=='y' || letter=='Y'){
            System.out.println("you are a java lover");
        }
        else if(letter=='n' || letter=='N'){
            System.out.println("your are not a java lover");
        }


    }
}
