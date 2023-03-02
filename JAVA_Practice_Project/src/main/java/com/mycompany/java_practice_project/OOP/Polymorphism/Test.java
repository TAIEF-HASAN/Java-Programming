package com.mycompany.java_practice_project.OOP.Polymorphism;

public class Test {
    
    public static void main(String[] args) {

        /*
         * Polymorphism
         */
        
        Teacher t = new Teacher();
        t.display();

        Student s = new Student();
        s.display();

        Person p = new Person();
        p.display();

        //Student st = new Person();
        p = new Student();
        p.display();
    }
}
