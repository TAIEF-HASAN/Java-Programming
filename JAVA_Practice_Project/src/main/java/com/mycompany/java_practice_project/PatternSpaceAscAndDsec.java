package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternSpaceAscAndDsec {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the patttern number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){

            //printing Space
            for(int col=1; col<=n-row;col++){
                System.out.print("  ");

            }
            //Printing Number 
            for(int col=1; col<=row;col++){
                System.out.print(" "+row);
                //System.out.println("*");
                //System.out.println(" "+col);
                //System.out.println(" "+col%2);
                //System.out.println(" "+row%2);
            }
            System.out.println();
        }

        for(int row=n-1; row>=1; row--){

            //printing Space
            for(int col=1; col<=n-row;col++){
                System.out.print("  ");

            }
            //Printing Number 
            for(int col=1; col<=row;col++){
                System.out.print(" "+row);
                //System.out.println("*");
                //System.out.println(" "+col);
                //System.out.println(" "+col%2);
                //System.out.println(" "+row%2);
            }
            System.out.println();
        }
    }
}
