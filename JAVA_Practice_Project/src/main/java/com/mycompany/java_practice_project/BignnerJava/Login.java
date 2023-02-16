package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        String Username = "Taief";
        String Password = "123";

        while(true){

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Your Username");
            String username = input1.next();

            //Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Your Password");
            String password = input1.next();

            if(Username.equals(username) && Password.equals(password)){
                System.out.println("Login Successful");
                break;
            }
            else if(Password.equals(password)){
                System.out.println("Invalid Username");
            }
            else if(Username.equals(username)){
                System.out.println("Invalid Password");
            }
            else{
                System.out.println("username & password is incorrect. Please try again");
                System.out.println("welcome to the system");
            }
        }
        

    }

}
