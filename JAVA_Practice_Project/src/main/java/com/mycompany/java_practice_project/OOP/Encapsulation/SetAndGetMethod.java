package com.mycompany.java_practice_project.OOP.Encapsulation;

public class SetAndGetMethod {
    
    /*
     * Encapsulation is a process of
     * 1. Packaging Variable and Methods into single unit.
     * 2. Protecting data by declaring them as private.
     * 
     * How to do Encapsulation ?
     * 1. Declare the variable as private.
     * 2.Provide public set and get method to modify and get the variable value.
     * 
     * Benefit:
     * 1.Provided data hiding 
     * 2.Reusability
     * 3.code can be modify without breaking the code
     * 4.Maintainability: Hiding implementation details reduces complexity.
     */
    private String name; //Private data will be hidden from other classes and they can only be accessed through the methods of their current class. this is known as data hiding.
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
