package com.mycompany.java_practice_project.List;

public class Student {
    
    String name, className;
    int id;

    Student(String name, String className, int id){
        this.name = name;
        this.className = className;
        this.id = id;
    }

    //we can override the toString for showing object value
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+name+" Class name: "+className+" ID: "+id;
    }
}
