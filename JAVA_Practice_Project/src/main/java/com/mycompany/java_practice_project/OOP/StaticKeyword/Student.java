package com.mycompany.java_practice_project.OOP.StaticKeyword;

public class Student {
   //Which  variable declare in the Class is called instance
    String name;
    int id;
    // which data type before place static is called static variable
    //Mostly static variables are used to grab the common properties that are shared by the class objects such as the name of the department for a college class, etc. These variables are allocated memory only once when the class is loaded.
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
