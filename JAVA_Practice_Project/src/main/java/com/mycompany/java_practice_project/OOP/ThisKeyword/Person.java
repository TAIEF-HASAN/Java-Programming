package com.mycompany.java_practice_project.OOP.ThisKeyword;

public class Person {

    String name;
    int age;
    String hairColor;

    //This keyword is refer to current class object
    /*
     * uses of "this" keyword
     * 1.Refer Current Class Instance variable
     * 2.It can be use to call current class instructor
     * 3.It can be used to call current class method (but not necessary for method)
     * 4.It can be pass as an argument in the method.(event handling)
     */

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String  hairColor){
        this(name, age);
        this.hairColor = hairColor;
    }

    void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Hair Color "+hairColor);
    }
    
}
