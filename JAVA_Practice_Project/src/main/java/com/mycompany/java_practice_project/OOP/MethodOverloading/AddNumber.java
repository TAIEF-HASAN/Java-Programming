package com.mycompany.java_practice_project.OOP.MethodOverloading;

public class AddNumber {

    //Method overloading is called same method call multiple time with different parameter 
    void add(int a, int b){
        System.out.println("Total is "+(a+b));
    }
    void add(double a, double b){
        System.out.println("Total is "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Total is "+(a+b+c));
    }

    void add(){
        System.out.println("No Name");
    }
}
