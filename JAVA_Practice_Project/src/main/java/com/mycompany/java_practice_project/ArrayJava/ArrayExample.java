package com.mycompany.java_practice_project.ArrayJava;

public class ArrayExample {
    public static void main(String[] args) {

        //Declaration of array 
        int[] number = new int[5];

        //assigning value in array index
        number[0] = 5;
        number[1] = 6;
        number[2] = 7;
        number[3] = 8;
        number[4] = 9;

        int sum = number[1]+number[2]+ number[3]+ number[4]+number[0];

        System.out.println("Sum :"+sum);

        int len =  number.length;
        System.out.println("Number of length is "+len);
    }

    
}
