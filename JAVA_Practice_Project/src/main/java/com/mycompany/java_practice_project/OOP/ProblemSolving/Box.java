package com.mycompany.java_practice_project.OOP.ProblemSolving;


/*
 * To solved the problem knowledge required about class, object, variable, data type, methods, constructor
 * Create a class called Box that include three pieces of information as instance variable- height, width and 
 * depth(type double) of to box. your class should have constructor and initialize three instance variables. Provide
 * a method displayVol that display the volume of two boxes suppose, the value of instance variables for the first
 * boxes are (10, 10, 10) and second boxes are (20, 30, 10). write a test application named BoxVolume the demonstrate
 * class box's capabilities. 
 */
public class Box {
    

    double height, width, depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Height "+vol);
    }
}
