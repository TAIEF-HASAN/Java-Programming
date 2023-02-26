package com.mycompany.java_practice_project.OOP.StaticBlock;

public class StaticBlockExmp {
    static String name;
    static int id;

    static{
        name = "Patel";
        id = 161;
    }

    static void display(){
        System.out.println("name "+name);
        System.out.println("ID "+id);
    }

    //main method called in same class without calling in another class 
    public static void main(String[] args) {
        
        StaticBlockExmp.display();
    }
    
}
