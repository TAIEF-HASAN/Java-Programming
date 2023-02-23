package com.mycompany.java_practice_project.BignnerJava;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        
        Random rand  = new Random();
        //int n = rand.nextInt(91)+10;
        int n = (int)(Math.random()*10)+1;
        System.out.println("Number is "+n);


    }
}
