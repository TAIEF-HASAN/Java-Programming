package com.mycompany.java_practice_project.OOP.StaticKeyword;

public class Student {
   
    String name;
    int id;
    static String UniName = "Diu";

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
