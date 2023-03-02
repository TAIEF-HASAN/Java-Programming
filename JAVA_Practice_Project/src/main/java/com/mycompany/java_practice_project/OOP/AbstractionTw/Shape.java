package com.mycompany.java_practice_project.OOP.AbstractionTw;

public abstract class Shape {
    double height;
    double width;
    double radius;


    Shape(double height, double width){
        this.height = height;
        this.width = width;
    }

    Shape(double radius){
        this.radius = radius;
    }
    
    abstract double area();

    void sendMessage(){
        System.out.println("Hi I am Shape");
    }
}
