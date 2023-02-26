package com.mycompany.java_practice_project.OOP.StaticMethod;

public class Student {
    
    void display(){
        System.out.println("I am a not static method");
    }

    //non static property or method can not use static method 
    static void display2(){
        //display();
        System.out.println("I am a static method");
    }
}
