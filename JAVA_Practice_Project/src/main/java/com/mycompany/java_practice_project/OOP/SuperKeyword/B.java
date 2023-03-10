package com.mycompany.java_practice_project.OOP.SuperKeyword;

public class B extends A {
    int x = 20;

    B(){
        super(); //for calling a constructor of other class's
        System.out.println("B's constructor");
    }

    //In Class B Always Priority for own class, For super class need to access with super dot method or variable name.
    void display(){
        super.display(); //for calling the display method of superClass need to add super keyworf dot display 
        System.out.println(super.x);
    }
}
