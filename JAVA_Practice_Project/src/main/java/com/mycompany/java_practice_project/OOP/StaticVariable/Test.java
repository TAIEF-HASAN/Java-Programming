package com.mycompany.java_practice_project.OOP.StaticVariable;

public class Test {
    public static void main(String[] args) {
        
        /*
        Student s = new Student();
        System.out.println("Name: "+s.UniName);
        */

        //static variable directly connect with class, not with object
        System.out.println("name"+Student.UniName);
    }
}
