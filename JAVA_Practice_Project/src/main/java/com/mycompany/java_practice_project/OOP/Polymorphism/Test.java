package com.mycompany.java_practice_project.OOP.Polymorphism;

public class Test {
    
    public static void main(String[] args) {

        /*
         * There are two types of Polymorphism
         * 1. Compile time/static polymorphism --> Method/constructor overload
         * 2. Runtime/dynamic Polymorphism --> Method override
         */
        
        Teacher t = new Teacher();
        t.display();

        Student s = new Student();
        s.display();

        Person p = new Person();
        p.display();

        //Student st = new Person(); --> sub class cannot create object of super class
        //This is called Runtime polymorphism
        p = new Student(); // super class can create a object of subclass
        p.display();
    }
}
