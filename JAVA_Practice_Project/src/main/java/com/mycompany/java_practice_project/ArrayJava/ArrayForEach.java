package com.mycompany.java_practice_project.ArrayJava;

public class ArrayForEach {
    public static void main(String[] args) {
        
            int[] number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            int sum = 0;

            for(int x: number){
                sum += x;
                
            }

            System.out.println("The Sum of number is "+sum);

        
    }
}
