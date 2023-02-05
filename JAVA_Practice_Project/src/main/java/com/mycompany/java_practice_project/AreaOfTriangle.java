package com.mycompany.java_practice_project;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, height, area;

        System.out.println("Enter Area of base: ");
        base = input.nextDouble();
        System.out.println("Enter Height: ");
        height = input.nextDouble();

        area = .5 * base * height;

        System.out.println("Area of Tringle: "+area);

    }
}
