package com.mycompany.java_practice_project.String.ToStringMethod;



public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Habil", 25);
        Person p2 = new Person("kabil", 25);

        System.out.println(p1);//here object by default calling toString()
        System.out.println(p2);//here object by default calling toString()
        
        //System.out.println(p1.toString()); 
        //System.out.println(p2.toString()); 
    }


    
    

    
}
