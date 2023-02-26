package com.mycompany.java_practice_project.OOP.StaticKeyword;

public class Student {
   //Which  variable declare in the Class is called instance
    String name;
    int id;
    // which data type before place static is called static variable
    static String UniName = "Diu";

    //which variable declare in the method is called local variable
    Student(String n, int i){
        name = n;
        id = i;
    }

    void display(){
        System.out.println("Name :"+name);
        System.out.println("ID: "+id);
        System.out.println("University name: "+UniName);
    }
}
