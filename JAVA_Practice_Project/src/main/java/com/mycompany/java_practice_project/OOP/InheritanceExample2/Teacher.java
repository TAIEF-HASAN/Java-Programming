package com.mycompany.java_practice_project.OOP.InheritanceExample2;

public class Teacher extends Person {
    private String qualification = "BSc in CSE";

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

     
     void display2(){
        //System.out.println("Name :"+name);
        //System.out.println("Age :"+age);
        //display();
        System.out.println("Name : "+getName());
        System.out.println("Age :"+getAge());
        System.out.println("Qualification:"+getQualification());
    }
    
    
}
