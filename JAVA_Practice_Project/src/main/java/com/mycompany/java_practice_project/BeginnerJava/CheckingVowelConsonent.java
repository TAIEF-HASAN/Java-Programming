package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class CheckingVowelConsonent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char letter;

        System.out.print("Enter Letter and check if vowel or consonant:");
        letter = input.next().charAt(0);

        if(letter=='a'){
            System.out.println("vowel");
        }
        else if(letter=='e'){
            System.out.println("vowel");
        }
        else if(letter=='i'){
            System.out.println("vowel");
        }
        else if(letter=='o'){
            System.out.println("vowel");
        }
        else if(letter=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }

    }
}
