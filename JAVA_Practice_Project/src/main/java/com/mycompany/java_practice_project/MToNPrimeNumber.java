package com.mycompany.java_practice_project;

import java.util.Scanner;

public class MToNPrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        int m,n;
        boolean flag = false;

        System.out.println("Enter two number what you want to in between weather the prime number have or not:");
        m = input.nextInt();
        n = input.nextInt();

        for(int i=m; i<=n; i++){

            for(int j=2; j<i; j++){
                
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if (flag==true){
                System.out.println(i+ " is not a prime number");
            flag=false;
            }
            else{
                System.out.println(i+ " is a prime number");
            }
        }


    }
}
