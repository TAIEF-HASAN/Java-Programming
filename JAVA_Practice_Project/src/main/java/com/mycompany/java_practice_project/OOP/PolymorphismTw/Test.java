package com.mycompany.java_practice_project.OOP.PolymorphismTw;

public class Test {
    
    public static void main(String[] args) {
        
        Shape[] s = new Shape[3];

        s[0] = new Shape();
        
        s[1] = new Rectangle(10, 30);
        
        s[2] = new Triangle(10, 30);
        System.out.println(s[0].area()); 
        System.out.println(s[1].area());
        System.out.println(s[2].area());
        
    }
}
