package com.mycompany.java_practice_project.File;

import java.io.File;

public class CreateDirectoryExample {
    
    public static void main(String[] args) {
        
        File nDirectory = new File("Person");
        nDirectory.mkdir();

        String location =  nDirectory.getAbsolutePath();
        System.out.println(location);
        System.out.println(nDirectory.getName()); 

        /*
        if(nDirectory.delete()){
            System.out.println(nDirectory.getName()+" Folder has been delete");
        }
        nDirectory.mkdir();
        System.out.println("person folder has been created");
         */

        File nfile = new File(location+"/student.txt");
        try {
            nfile.createNewFile();
            System.out.println("file has been created");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception "+e);
        }
        
    }
}
