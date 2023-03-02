package com.mycompany.java_practice_project.OOP.Interface;

public class Test {

    public static void main(String[] args) {

        /*
         * What is an Interface?
         * an interface is an collection of abstract methods.
         * 
         * Why Do we need Interface?
         * 1.For Fully Abstraction
         * 2.It supports multiple inheritance.
         */
        
        //Interface can not be declare as an object.
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
    }
    
   

}
