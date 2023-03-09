package com.mycompany.java_practice_project.List;

public class Student {
    
    String name;
    //here we can use static keyword for constant value
    static String className = "Twelve";
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    //we can override the toString for showing object value
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+name+" className: "+className+" ID: "+id;
    }
}
