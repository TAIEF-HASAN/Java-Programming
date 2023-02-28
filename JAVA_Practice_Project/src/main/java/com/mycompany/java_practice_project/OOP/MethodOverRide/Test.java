package com.mycompany.java_practice_project.OOP.MethodOverRide;

public class Test {
    
    public static void main(String[] args) {
        
        Teacher t = new Teacher();
        t.name = "Nabila";
        t.age = 27;
        t.qualification = "BSc in CSE";
        t.display();

        Person p = new Person();
        p.name = "Tania";
        p.age = 27;
        p.display();

    }
}
