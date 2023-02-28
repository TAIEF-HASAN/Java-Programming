package com.mycompany.java_practice_project.OOP.MethodOverRide;

public class Teacher extends Person {
    
    String qualification;
    //Here method override the another class of method
    /*
     * The rules of method overriding
     * 1.Method name, signature, parameter must be same
     * 2.if a method can not be inherited, then it can not be overridden.
     * 3.Static method can not be over ride. Because static method is bound to class, on the other hand method method is bound to object.
     * 4. A method declare with final cannot be override.
     * 5.Constructor cannot be override.
     */

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }
}
