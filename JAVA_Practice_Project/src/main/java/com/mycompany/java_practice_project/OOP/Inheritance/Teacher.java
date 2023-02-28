package com.mycompany.java_practice_project.OOP.Inheritance;

public class Teacher extends Person {
    
    String qualification;

    void display2(){
        //System.out.println("Name :"+name);
        //System.out.println("Age :"+age);
        display();
        System.out.println("Qualification :"+qualification);
    }
}
