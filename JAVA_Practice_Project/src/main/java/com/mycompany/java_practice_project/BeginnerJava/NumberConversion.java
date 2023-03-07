package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        
        //Conversion decimal to binary, octal, hexadecimal number

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a Decimal number: ");
        n = input.nextInt();
        String m = Integer.toBinaryString(n);
        System.out.println("The Binary Number of: "+m);

        String p = Integer.toOctalString(n);
        System.out.println("The Binary Number of: "+p);
        
        String q = Integer.toHexString(n);
        System.out.println("The Binary Number of : "+q);


    }
}
