package com.mycompany.java_practice_project.OOP.SuperKeyWordTw;

public class Vehicle {
    
    String color;
    double weight;

    Vehicle(String c, double w){
        color = c;
        weight = w;
    }

    void display(){
        System.out.println("Color "+color);
        System.out.println("Weight "+weight);
    }
}
