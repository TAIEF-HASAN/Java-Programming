package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternRowEqualRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Pattern Number:");
        n = input.nextInt();

        for(int row=1; row<=n;row++){
            for(int col=1; col<=n; col++){
                System.out.printf(" "+row);
            }

            System.out.println();
            
            
        }
    }
}
