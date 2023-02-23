package com.mycompany.java_practice_project.OOP;

public class TeacherInfo {
    
    String name, gender;
    int phone;


    void setDisplay(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    /*
     * methods have many more advantage
     * we can declare method instead of big line of code to short
     */
    void displayInfo(){
        
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
    }


}
