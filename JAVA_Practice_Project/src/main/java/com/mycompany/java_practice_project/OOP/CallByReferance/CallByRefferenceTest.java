package com.mycompany.java_practice_project.OOP.CallByReferance;

public class CallByRefferenceTest {
    public static void main(String[] args) {
        
        CallByReferanceExmp r1 = new CallByReferanceExmp();
        r1.name = "Kabil"; 
        System.out.println("Before calling: "+r1.name);


       /*
        *if we call a method by passing a reference type of data (object, String) then it is known as call by reference.
        */
        r1.change(r1); //In call by reference original value get change.
        System.out.println("After Calling: "+r1.name);
    }
}
