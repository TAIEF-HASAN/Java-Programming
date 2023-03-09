package com.mycompany.java_practice_project.File;

import java.io.File;

public class CreateFileExample {
    
    public static void main(String[] args) {
        
        File nFile = new File("D:/Project/Java-Programming/JAVA_Practice_Project/src/main/java/com/mycompany/java_practice_project/Person/student.txt");
        File nFile2 = new File("D:/Project/Java-Programming/JAVA_Practice_Project/src/main/java/com/mycompany/java_practice_project/Person/teacher.txt");

        try {
            nFile.createNewFile();
            nFile2.createNewFile();
            System.out.println("Files are creating");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception: "+e);
        }

    
    }
}
