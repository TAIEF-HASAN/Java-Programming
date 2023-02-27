package com.mycompany.java_practice_project.OOP.varargs;

public class VarargsExample {
    int count = 1;
    //here without declaration multiple formal parameter we can declare at a time like given method and we can give multiple parameter value in a method for not doing method over loading
    void add(int... num){

        int sum = 0;
        
        for (int i : num) {
            sum = sum + i;
        }

        System.out.println("Sum is "+(count++)+" "+sum);
    }
    
}
