package com.mycompany.java_practice_project.OOP.SuperKeyword;

public class B extends A {
    int x = 20;

    //In Class B Always Priority for own class, For super class need to access with super dot method or variable name.
    void display(){
        System.out.println(super.x);
    }
}
