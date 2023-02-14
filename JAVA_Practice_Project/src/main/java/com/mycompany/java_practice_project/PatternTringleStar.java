package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternTringleStar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the Pattern number:");
        n = input.nextInt();
        for(int row=1; row<=n; row++){

            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++){

                if(row==1||row==n||col==1||col==row)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
