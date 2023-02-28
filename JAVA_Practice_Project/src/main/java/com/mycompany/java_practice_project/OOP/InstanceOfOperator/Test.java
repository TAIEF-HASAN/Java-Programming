package com.mycompany.java_practice_project.OOP.InstanceOfOperator;

public class Test {
    public static void main(String[] args) {
        
        Head h = new Head();
        Teacher t = new Teacher();
        Student s = new Student();

        System.out.println(h instanceof Teacher);
        System.out.println(t instanceof Student);
        System.out.println(h instanceof Student);
        System.out.println(s instanceof Teacher);
        System.out.println(s instanceof Head);
    }
}
