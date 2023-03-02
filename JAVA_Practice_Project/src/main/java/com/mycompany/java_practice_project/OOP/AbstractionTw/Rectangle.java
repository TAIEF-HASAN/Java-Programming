package com.mycompany.java_practice_project.OOP.AbstractionTw;

public class Rectangle extends Shape {

    Rectangle(double height, double width){
        super(height, width);
    }
    @Override
    double area(){
        System.out.print("The area of Rectangle :");
        return height * width;
    }
}
