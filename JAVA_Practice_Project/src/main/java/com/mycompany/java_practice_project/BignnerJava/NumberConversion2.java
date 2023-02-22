package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class NumberConversion2 {
    public static void main(String[] args) {

        //Conversion binary, octal, hexadecimal to decimal number
        Scanner input = new Scanner(System.in);
        String n;
        System.out.print("Enter a Decimal number: ");
        n = input.next();
        Integer m = Integer.parseInt(n, 2);
        System.out.println("The Number of Binary to Decimal: "+m);

        n = input.next();
        Integer p = Integer.parseInt(n, 8);
        System.out.println("The Number of Binary to Octal: "+p);
        
        n = input.next();
        Integer q = Integer.parseInt(n, 16);
        System.out.println("The Number of Binary to HExadecimal : "+q);


        /*String binary = "B";
        Integer m = Integer.parseInt(binary, 16);
        System.out.println(m);*/
    }
}
