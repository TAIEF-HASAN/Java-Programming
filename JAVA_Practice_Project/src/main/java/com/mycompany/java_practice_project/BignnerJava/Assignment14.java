package com.mycompany.java_practice_project.BignnerJava;

import java.util.Scanner;

public class Assignment14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int totalPalindromeNumber=0;
        System.out.print("start number: ");
        int m = input.nextInt();

        System.out.print("end number: ");
        int n = input.nextInt();


        for(int i=m; i<=n; i++){

            int temp = i;
            int r;
            int sum = 0;
            

            while(temp != 0){
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp/10;
            }

            if(i==sum){
                totalPalindromeNumber++;
                System.out.println(i+" is a Palindrome Number");
            }
            else{
                System.out.println("Not a Palindrome Number");
            }

        }
        System.out.println("Total PalindromeNumber is:"+totalPalindromeNumber);

        /*Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number and it will get you reverse:");
        n = input.nextInt();*/

        
    }
}
