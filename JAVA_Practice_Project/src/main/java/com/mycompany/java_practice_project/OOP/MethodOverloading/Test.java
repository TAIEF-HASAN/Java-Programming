package com.mycompany.java_practice_project.OOP.MethodOverloading;

public class Test {
    public static void main(String[] args) {
        
        AddNumber num = new AddNumber();
        num.add();
        num.add(4.5, 6.5);
        num.add(5, 5);
        num.add(10, 20, 50);
    }
}
