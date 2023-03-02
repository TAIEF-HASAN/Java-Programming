package com.mycompany.java_practice_project.OOP.PolymorphismTw;

public class Rectangle extends Shape {
    
    double height;
    double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    double area(){
        System.out.print("The area of Rectangle :");
        return height * width;
    }
}

