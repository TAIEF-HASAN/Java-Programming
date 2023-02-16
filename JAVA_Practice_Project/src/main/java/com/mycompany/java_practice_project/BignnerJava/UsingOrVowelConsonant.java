package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class UsingOrVowelConsonant {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char letter;

        System.out.print("Enter Letter and check if vowel or consonant:");
        letter = input.next().charAt(0);

        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
