package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {

        
        String Username;
        String Password;

        Password = "123";
        Username = "Taief";


        while(true){

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = input1.next();
    
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();
    
            if (username.equals(Username) && password.equals(Password)) {
    
                System.out.println("Access Granted! Welcome!");
                break;
            }
    
            else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }

       
    }
        
}
