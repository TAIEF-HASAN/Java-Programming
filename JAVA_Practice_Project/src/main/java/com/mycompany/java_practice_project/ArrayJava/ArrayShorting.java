package com.mycompany.java_practice_project.ArrayJava;

import java.util.Arrays;

public class ArrayShorting {
    public static void main(String[] args) {
        
        //Sorting for integer number
        int[] number = {4, 6,-1,-4, 8,1,5};
        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        for (int i = number.length-1; i >=0 ; i--) {
            System.out.print(" "+number[i]);
        }

        System.out.println();

        String[] letter = {"A", "C", "B", "E", "D", "G", "F"};
        Arrays.sort(letter);

        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+letter[i]);
        }
        System.out.println();
        for (int i = number.length-1; i >=0 ; i--) {
            System.out.print(" "+letter[i]); 
        }


    }   

}
