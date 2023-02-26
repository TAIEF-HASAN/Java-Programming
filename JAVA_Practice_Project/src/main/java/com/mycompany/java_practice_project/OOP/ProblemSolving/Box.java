package com.mycompany.java_practice_project.OOP.ProblemSolving;

public class Box {
    

    double height, width, depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void displayVol(){
        System.out.println("Height "+height);
        System.out.println("Width "+width);
        System.out.println("depth "+depth);
    }
}
