package com.mycompany.java_practice_project.OOP.StaticMethod;

public class Test {
    public static void main(String[] args) {
        
        //non static method need an object for calling
        Student s = new Student();
        s.display();

        //static method do direct call with class name
        Student.display2();
    }
}
