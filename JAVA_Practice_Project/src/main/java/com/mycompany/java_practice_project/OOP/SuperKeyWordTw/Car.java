package com.mycompany.java_practice_project.OOP.SuperKeyWordTw;

public class Car extends Vehicle {
    
    int gear;
    Car(String c, double w, int g){
        //here constructor calling of super class by superKeyword
        super(c, w);
        gear = g;
    }

    //here override the method of super class and its called by superKeyword
    void display(){
        super.display();
        System.out.println("Gear "+gear);
    }
}
