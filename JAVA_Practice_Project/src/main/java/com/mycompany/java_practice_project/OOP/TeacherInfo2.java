package com.mycompany.java_practice_project.OOP;

public class TeacherInfo2 {
    
    String name, gender;
    int phone;

    //overloading Constructor
    TeacherInfo2(){
        System.out.println("No Value");
    }

    TeacherInfo2(String n, String g){
        name = n;
        gender = g;
    }

    TeacherInfo2(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo(){
        
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
    }




}
