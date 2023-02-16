package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class UsingAndCapitalSmall {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char letter;

        System.out.print("Check The letter is capital or small:");
        letter = input.next().charAt(0);

        if(letter>='a' && letter<='z'){
            System.out.println("The letter is small");
        }
        else if(letter>='A' && letter<='Z'){
            System.out.println("The Letter is Capital");
        }
        else{
            System.out.println("not a letter");
        }
    }
}
