package com.mycompany.java_practice_project.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingProblemSolving {
    
    public static void main(String[] args) {

        boolean b = false;
        while (b!=true) {
            try {
                Scanner n = new Scanner(System.in);
                int x,y;
                System.out.print("Please enter the num1: ");
                x = n.nextInt();
                System.out.print("Please enter the num2: ");
                y = n.nextInt();
    
                int result = x/y;
                System.out.println("Result: "+x+"/"+y+" = "+result);
                b = true;
                break;
    
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception: "+e);
                System.out.println("Please try again");
            }
        }

        /*or we can use do w */
        /*
         * int count=1;
            do {
            count++;
        }   while (count==1);
         */
        
        
        
    }
}
