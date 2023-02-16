package com.mycompany.java_practice_project.ArrayJava;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[5];
        int sum = 0;
        System.out.print("Enter the Array number: ");
        /*number[0]= input.nextInt();
        number[1]= input.nextInt();
        number[2]= input.nextInt();
        number[3]= input.nextInt();
        number[4]= input.nextInt();*/

        for(int i=0; i<number.length; i++){
            number[i]=input.nextInt();
        }

        //int sum =number[0]+number[1]+number[2]+ number[3]+ number[4];
        for(int i=0; i<number.length; i++){
            sum += number[i];
        }

        System.out.println("Sum :"+sum);

        double avg = sum/number.length;
        System.out.println("number of avg "+avg);

        int len =  number.length;
        System.out.println("Number of length is "+len);
    }
}
