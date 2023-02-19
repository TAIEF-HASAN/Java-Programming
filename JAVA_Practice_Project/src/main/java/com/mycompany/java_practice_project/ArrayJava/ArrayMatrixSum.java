package com.mycompany.java_practice_project.ArrayJava;

import java.util.Scanner;

public class ArrayMatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];

        System.out.println("Enter the Value Of A:");
        for(int row=0; row<3; row++){
            for (int col = 0; col<3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        int SumOfDiagonal = 0;
        int SumOfUpper = 0;
        int SumOfLower = 0;

        for(int row=0; row<3; row++){
            for (int col = 0; col < 3; col++) {
                
                if(row==col){
                    SumOfDiagonal+= A[row][col];
                }

                if(row<col){
                    SumOfUpper += A[row][col];
                }
                if(row>col){
                    SumOfLower += A[row][col];
                }
            }

        }
        System.out.println("The Sum Of Diagonal:"+SumOfDiagonal);
        System.out.println("The Sum Of Upper:"+SumOfUpper);
        System.out.println("The Sum Of Lower:"+SumOfLower);
    }


    
}
