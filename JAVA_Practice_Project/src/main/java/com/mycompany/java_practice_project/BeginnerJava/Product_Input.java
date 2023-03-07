package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class Product_Input {
    
    public static void main(String[] args) {
        
        
        String title, Description, catagory;
        int id;
        double price;

        Scanner input = new Scanner(System.in);

        

        System.out.print("title: ");
        title = input.nextLine();

        System.out.print("Description: ");
        Description = input.nextLine();

        System.out.print("catagory: ");
        catagory = input.nextLine();

        System.out.print("ID: ");
        id = input.nextInt();

        System.out.print("Price: ");
        price = input.nextDouble();
        System.out.println();

        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Description: "+Description);
        System.out.println("Catagory "+catagory);
        System.out.println("Price "+price);



    }
}
