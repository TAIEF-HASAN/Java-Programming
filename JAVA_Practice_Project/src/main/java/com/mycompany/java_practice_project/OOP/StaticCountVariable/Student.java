package com.mycompany.java_practice_project.OOP.StaticCountVariable;

public class Student {
    //when the count variable is not static then count variable will take individual memory for individual obj
    // when count variable is static it will take memory only for class 
    static int count = 0;

    Student(){
        count++;
    }

    void display(){
        System.out.println("Total Student "+count);
    }
}
