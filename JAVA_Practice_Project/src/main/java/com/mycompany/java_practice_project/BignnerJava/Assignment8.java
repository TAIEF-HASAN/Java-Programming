package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char G, E ;

        System.out.println("have you completed your masters? y/n ");
        G = input.next().charAt(0);

        System.out.println("are you fulent in English? y/n  ");
        E = input.next().charAt(0);

        if(G=='y' && E=='y'){
            System.out.println("you are eligible to for the job interview");
        }
        else{
            System.out.println("Sorry. you are not eligible to for the job interview");
        }

    }
}
