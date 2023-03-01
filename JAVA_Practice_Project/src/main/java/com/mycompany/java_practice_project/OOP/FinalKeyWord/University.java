package com.mycompany.java_practice_project.OOP.FinalKeyWord;

public class University {
    
    final String uName = "DIU"; //Final value always being constant
    final int fees; //blank final value
    static final int cls; //static blank final

    //for static blank final variable need to a static block for assign a value
    static{
        cls = 14;
    }

    //for blank final variable need to a constructor for assign a value
    University(){
        fees = 58745;
    }

    void display(){
       
        System.out.println("uName "+uName);
        System.out.println("LEdger "+fees);
        System.out.println("Class "+cls);
    }
}
