package com.mycompany.java_practice_project.File;

import java.io.File;

public class CreateDirectoryExample {
    
    public static void main(String[] args) {
        
        File nDirectory = new File("D:/Project/Java-Programming/JAVA_Practice_Project/src/main/java/com/mycompany/java_practice_project/Person");
        nDirectory.mkdir();

        String location =  nDirectory.getAbsolutePath();
        System.out.println(location);
        System.out.println(nDirectory.getName()); 

        if(nDirectory.delete()){
            System.out.println(nDirectory.getName()+" Folder has been delete");
        }
        
    }
}
