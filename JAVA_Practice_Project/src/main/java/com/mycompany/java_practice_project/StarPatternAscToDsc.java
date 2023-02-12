package com.mycompany.java_practice_project;

import java.util.Scanner;

public class StarPatternAscToDsc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter the Pattern Number:");
        n = input.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int row=n-1; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
