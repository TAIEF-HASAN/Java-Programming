package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "Taief", nName;
        int pass = 123456, nPass;

        System.out.println("Enter Your Username:");
        nName = input.nextLine();

        System.out.println("Enter Your Password: ");
        nPass = input.nextInt();

        if(nName!=name && nPass!=pass){

            System.out.println("username/password is incorrect. Please try again");
            System.out.println("welcome to the system");
        }
        else{
            System.out.println("login Successful");
        }
        
       

        
    }
}
