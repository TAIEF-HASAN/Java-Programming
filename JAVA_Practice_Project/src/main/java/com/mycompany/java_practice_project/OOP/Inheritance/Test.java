package com.mycompany.java_practice_project.OOP.Inheritance;

public class Test {
    public static void main(String[] args) {

        /*
         * 1. What is Inheritance?
         * Inheritance can be defined as the process where one class get the properties(methods and fields) fo another.
         * Why do we need Inheritance?
         * 1.For code reusability
         * 2.For method overriding
         * 3.To implement parent-child relationship. 
         */
        Teacher t = new Teacher();
        t.name = "hamid";
        t.age = 25;
        t.qualification = "BSc in CSE";
        t.display2();
    }
}
