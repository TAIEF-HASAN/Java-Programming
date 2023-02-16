package com.mycompany.java_practice_project.BignnerJava;

public class IncrementAndDecrement {
    
    public static void main(String[] args) {
        
        int x = 25, result;

        result = --x; //pre increment x=24;
        System.out.println("result: "+result);

        result = x++; //post increment x = 24;
        System.out.println("result: "+result);

        result = --x; //pre decrement x = 24;
        System.out.println("result: "+result);

        result = x++; //post decrement x = 24;
        System.out.println("Result: "+result);
    }
}
