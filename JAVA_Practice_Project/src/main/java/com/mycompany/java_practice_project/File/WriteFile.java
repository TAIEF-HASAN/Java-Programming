package com.mycompany.java_practice_project.File;

import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number");
        num = input.nextInt();

        try {
            Formatter formatter = new Formatter("D:/Project/Java-Programming/JAVA_Practice_Project/Person/student.txt");

            for (int i = 1; i <=num; i++) {
                System.out.println("Enter the Roll and name");
                int roll = input.nextInt();
                String name = input.nextLine();
                formatter.format("%s %s \r \n", roll,name);
                
            }

            formatter.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
     }
}
