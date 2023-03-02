package com.mycompany.java_practice_project.OOP.AbstractionTw;

public class Circle extends Shape {
    


    Circle(double radius){
        super(radius);
    }

    @Override
    double area(){
        System.out.print("Area of Circle :");
        return 3.1416 * radius * radius;
    }
}
