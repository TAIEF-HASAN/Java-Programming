/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_practice_project;

import java.util.Scanner;

/**
 *
 * @author PIYAL
 */
public class Input_practice {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int phone_num;
        double CGPA;
        
        
        System.out.print("Enter Your CGPA:");
        //phone_num = input.nextInt();
        //String name = input.nextLine();
        CGPA = input.nextDouble();

        System.out.println("Is this your cgpa is correct?: "+CGPA);
    }
    
}
