package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class PatternFloydTringle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter the patttern number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){

            //Printing Number 
            for(int col=1; col<=row;col++){
                System.out.printf(" %d",(++count));
                
            }
            System.out.println();
        }
    }
}
