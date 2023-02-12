package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternSpaceDesc {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the patttern number:");
        n = input.nextInt();

        for(int row=n; row>=1; row--){

            //printing Space
            for(int col=1; col<=n-row;col++){
                System.out.print(" ");

            }
            //Printing Number 
            for(int col=1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
