package com.mycompany.java_practice_project.ArrayJava;

import java.util.Scanner;

public class Array2DInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][4];
        int[][] B = new int[2][3];

        System.out.println("Enter the Value Of A:");
        for(int row=0; row<2; row++){
            for (int col = 0; col < 3; col++) {
                System.out.printf("Put the value of A[%d][%d]:", row,col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("Enter the Value Of B:");
        for(int row=0; row<2; row++){
            for (int col = 0; col < 3; col++) {
                System.out.printf("Put the value of B[%d][%d]:", row,col);
                B[row][col] = input.nextInt();
            }
        }



        System.out.print("A= ");
        for(int row=0; row<2; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("B = ");
        for(int row=0; row<2; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
        }
        //int sum=0;
        System.out.println("Sum of A and B");
        for(int row=0; row<2; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+(B[row][col]+A[row][col]));
            }
            System.out.println();
        }



        
    }
}
