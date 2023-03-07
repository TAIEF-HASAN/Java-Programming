package com.mycompany.java_practice_project.BeginnerJava;

import java.text.DecimalFormat;

public class DecimalFormatting {
    
    public static void main(String[] args) {

        //Format decimal number by DecimalFormat class
        
        DecimalFormat ob = new DecimalFormat("0.00");
        double x = 2.25455485;

        System.out.println(" "+ob.format(x));

    }
}
