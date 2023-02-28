package com.mycompany.java_practice_project.OOP.Encapsulation;

public class Test {
    public static void main(String[] args) {
        
        SetAndGetMethod ob = new SetAndGetMethod();
        ob.setAge(17);
        ob.setName("Harun");
        System.out.println(" "+ob.getName());
        System.out.println(" "+ob.getAge());
    }
}
