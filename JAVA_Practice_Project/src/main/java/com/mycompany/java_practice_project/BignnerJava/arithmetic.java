package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class arithmetic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x = 3;
        int y = 2;

        x+=y; // x = x + y;  x = 5
        System.out.println("x: "+x);

        x-=y; // x = x - y; x = 3
        System.out.println("x: "+x);

        x*=y; //x = x * y; x = 6
        System.out.println("x: "+x);

        x/=y; //x = x / y; x = 3
        System.out.println("x: "+x);

        x%=y; //x = x % y; x = 1
        System.out.println("x: "+x);
    }
}
