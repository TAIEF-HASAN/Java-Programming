package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternSpace {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the patttern number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){

            //printing Space
            for(int col=1; col<=n-row;col++){
                System.out.print(" ");

            }
            //Printing Number 
            for(int col=1; col<=row;col++){
                System.out.printf("%c",row+64);
            }
            System.out.println();
        }
    }
}
