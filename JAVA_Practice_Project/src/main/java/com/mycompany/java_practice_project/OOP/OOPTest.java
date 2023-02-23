package com.mycompany.java_practice_project.OOP;

public class OOPTest {
    public static void main(String[] args) {
        
        TeacherInfo teacher; //object declare
        teacher = new TeacherInfo("Rahim", "Male", 18000000); //create object

        //we can create and declare together like this
        TeacherInfo teacher1 = new TeacherInfo("Lilly", "Female", 17000000);

        TeacherInfo teacher3 = new TeacherInfo();
        teacher3.displayInfo();

        //we can setValue of class by creating a method
        //teacher.setDisplay("Rahim", "Male", 18000000);
        //teacher1.setDisplay("Lilly", "Female", 17000000);
        
        /*
         * teacher.name = "Rahim";
         * teacher.gender = "male";
         * teacher.phone = 18000000;
         
        
        teacher1.name = "Sely";
        teacher1.gender = "Female";
        teacher1.phone = 17000000;*/

        
        teacher.displayInfo();
        teacher1.displayInfo();

        /*
         *  System.out.println("Name :"+teacher.name);
            System.out.println("Gender :"+teacher.gender);
            System.out.println("Phone :"+teacher.phone);
            
            System.out.println("Name :"+teacher1.name);
            System.out.println("Gender :"+teacher1.gender);
            System.out.println("Phone :"+teacher1.phone);
         */
      
    }
}
