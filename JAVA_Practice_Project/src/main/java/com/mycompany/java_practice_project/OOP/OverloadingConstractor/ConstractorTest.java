package com.mycompany.java_practice_project.OOP.OverloadingConstractor;

public class ConstractorTest {
    
    public static void main(String[] args) {
        
        TeacherInfo2 teacher = new TeacherInfo2();
        TeacherInfo2 teacher2 = new TeacherInfo2("Rahim","male");
        teacher2.displayInfo();

        TeacherInfo2 teacher3 = new TeacherInfo2("Lilly", "female", 01700000);
        teacher3.displayInfo();
        
    }
}
