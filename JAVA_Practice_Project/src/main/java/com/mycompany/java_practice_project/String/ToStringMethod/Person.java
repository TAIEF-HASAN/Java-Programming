package com.mycompany.java_practice_project.String.ToStringMethod;

public class Person {
    
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+name+"\n"+"Age: "+age+"\n";
    }
}
