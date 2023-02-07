package com.mycompany.java_practice_project;

import java.util.Scanner;

public class Assignment12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m,n, sum = 0;

        System.out.print("Enter the number between m-n for result of odd number:");
        m = input.nextInt();
        n = input.nextInt();


        if(m>n){

            for(int i = m; i>=n; i--){

                if(i %2 !=0){
                    sum = sum + i;
                }
            } 
        }
        else{

            for(int i = m; i<=n; i++){

                if(i %2 !=0){
                    sum = sum + i;
                }
            }

        }
        System.out.println(sum);
    }
}
