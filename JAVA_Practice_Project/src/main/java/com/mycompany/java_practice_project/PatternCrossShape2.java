package com.mycompany.java_practice_project;

import java.util.Scanner;

public class PatternCrossShape2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter Pattern number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row==col||row+col==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
