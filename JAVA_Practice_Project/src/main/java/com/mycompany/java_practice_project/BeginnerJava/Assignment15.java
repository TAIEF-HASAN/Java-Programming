package com.mycompany.java_practice_project.BeginnerJava;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int totalArmstrongNumber=0;
        System.out.print("start number: ");
        int m = input.nextInt();

        System.out.print("end number: ");
        int n = input.nextInt();


        for(int i=m; i<=n; i++){

            int temp = i;
            int r;
            double sum = 0;
            

            while(temp != 0){
                r = temp % 10;
                sum = sum + Math.pow(r, 3);
                temp = temp/10;
            }

            if(i==sum){
                totalArmstrongNumber++;
                System.out.println(i+" Armstrong Number");
            }
            else{
                System.out.println("not a Armstrong Number");
            }

        }
        System.out.println("Total PalindromeNumber is:"+totalArmstrongNumber);
    }
}
