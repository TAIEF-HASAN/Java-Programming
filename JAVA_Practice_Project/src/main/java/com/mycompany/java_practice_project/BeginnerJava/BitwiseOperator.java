package com.mycompany.java_practice_project.BeginnerJava;

public class BitwiseOperator {
    public static void main(String[] args) {
        
        int a = 32;
        int b = 12;
        int c;
        
        //Bitwise operator do binary Summation between two number and give a result in integer number 
        c = a & b; 
        System.out.println(c);

        c = a | b;
        System.out.println(c);

        c = a ^ b;
        System.out.println(c);

        //left shift do multiply 1 shift left 
        c = a << 3;
        System.out.println(c);

        //right shift do division on shift right
        c = a >> 3;
        System.out.println(c);
    }
}
