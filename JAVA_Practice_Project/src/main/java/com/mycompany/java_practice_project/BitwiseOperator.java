package com.mycompany.java_practice_project;

public class BitwiseOperator {
    public static void main(String[] args) {
        
        int a = 32;
        int b = 12;

        int c;

        c = a & b;
        System.out.println(c);

        c = a | b;
        System.out.println(c);

        c = a ^ b;
        System.out.println(c);

        c = a << 3;
        System.out.println(c);

        c = a >> 3;
        System.out.println(c);
    }
}