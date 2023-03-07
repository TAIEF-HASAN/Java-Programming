package com.mycompany.java_practice_project.BeginnerJava;

public class EqualOperatorVsEqualMethod {
    
    //For object comparison equals() is better
    //For primitive data type comparison == operator is better
    public static void main(String[] args) {
        String p1 = "Jamil123";
        String p2 = "Jamil123";
        String p3 = new String("Jamil123");
        String p4 = new String("Jamil123");

        //the comparison of == operator
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p3==p4);
        System.out.println();

        //the comparison of equals()
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p4));
    }

}
