package com.mycompany.java_practice_project.OOP.MethodOverRide;

public class Teacher extends Person {
    
    String qualification;
    //Here method override the another class of method
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }
}
