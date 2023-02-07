package com.mycompany.java_practice_project;

import java.util.Scanner;

public class TimeTable {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, result;

        System.out.println("Which number of time table you want to see? please enter the number");
        n = input.nextInt();

        for(int i = 1; i<=10; i++){

            result = i * n;
            System.out.println(i+" Time "+n+" = "+ result );
        }
    }
}
