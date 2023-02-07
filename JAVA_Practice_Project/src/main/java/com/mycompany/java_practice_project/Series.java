package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Series {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n ;
        int sum = 0, sum2 = 0, sum3 = 0;
        
        System.out.print("Enter the number:");
        n = input.nextInt();

        //1 + 2 + 3 + 4 + ........ + n distance 1
        for(int i=1; i<=n; i=i+1){
            sum = sum + i;
        }
        System.out.println(sum);

        //1 + 3 + 5 + 7 + ........ + n distance 2    
        for(int i=1; i<=n; i=i+2){
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

         //1^2 + 2^2 + 3^2 + 4^2 + ........ + n number of square distance 1
         for(int i=1; i<=n; i=i+1){
             sum3 = sum3 + i*i;
         }
         System.out.println(sum3);
    }

    
}
