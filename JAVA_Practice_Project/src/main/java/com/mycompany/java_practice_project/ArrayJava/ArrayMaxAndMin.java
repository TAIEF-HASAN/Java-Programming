package com.mycompany.java_practice_project.ArrayJava;

import java.util.Scanner;

public class ArrayMaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];
        int sum = 0;
        System.out.print("Enter the Array number: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        int max = number[0];
        int min = number[0];

        for (int i = 1; i < 5; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        for (int i = 1; i < 5; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Max :" + max);
        System.out.println("Min :" + min);

    }

}
