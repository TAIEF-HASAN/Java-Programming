package com.mycompany.java_practice_project.OOP.PolymorphismTw;

public class Triangle extends Shape {
    
    double height;
    double width;

    Triangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    double area(){
        System.out.print("The area of Triangle :");
        return 0.5 *height * width;
    }
}
