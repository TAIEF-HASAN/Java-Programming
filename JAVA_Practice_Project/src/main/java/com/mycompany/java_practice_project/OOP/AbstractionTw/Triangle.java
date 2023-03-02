package com.mycompany.java_practice_project.OOP.AbstractionTw;

public class Triangle extends Shape {

    Triangle(double height, double width){
        super(height, width);
    }
    
    @Override
    double area(){
        System.out.print("The area of Triangle :");
        return 0.5 *height * width;
    }
}
