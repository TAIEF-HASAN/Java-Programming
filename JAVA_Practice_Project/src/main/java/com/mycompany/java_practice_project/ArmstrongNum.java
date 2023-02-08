package com.mycompany.java_practice_project;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter the number to check weather the number is Armstrong Number or not!");
        n = input.nextInt();

        int temp = n;
        int r;
        double sum=0;

        while(temp!=0){
            r = temp % 10;
            sum = sum + Math.pow(r, 3);
            temp = temp / 10;
        }

        if(sum==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("not a Armstrong Number");
        }
    }
}
