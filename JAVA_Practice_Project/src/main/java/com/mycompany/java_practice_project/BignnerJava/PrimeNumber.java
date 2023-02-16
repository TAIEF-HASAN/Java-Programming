package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n; //count = 0;
        boolean flag = false;

        System.out.println("Enter the number to check if the number is prime or not!");
        n = input.nextInt();

        if(n==0 || n==1){
            System.out.println("not a prime");
        }else{
            for(int i=2; i<n; i++){

                if(n%i==0){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                System.out.println("The Number is Prime");
            }
            else{
                System.out.println("The Number is not Prime");
            }
        }

    }
}
