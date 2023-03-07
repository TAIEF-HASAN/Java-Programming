package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class PatternTringleAscAndDesc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter Pattern number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){

            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            for(int col=1; col<=(row*2)-1; col++){
                System.out.print(" "+col%2);
            }

            System.out.println();

        }

        for(int row=n-1; row>=1; row--){

            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            for(int col=1; col<=(row*2)-1; col++){
                System.out.print(" "+col%2);
            }

            System.out.println();

        }
    }
}
