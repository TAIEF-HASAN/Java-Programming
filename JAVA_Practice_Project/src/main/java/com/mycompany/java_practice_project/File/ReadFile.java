package com.mycompany.java_practice_project.File;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        
        try {
            File readFile = new File("D:/Project/Java-Programming/JAVA_Practice_Project/Person/student.txt");
            Scanner scanner = new Scanner(readFile);

            while(scanner.hasNext()){
                String roll = scanner.next();
                String name = scanner.next();
                System.out.println("ID: "+roll+" Name: "+name);

            }

            scanner.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
