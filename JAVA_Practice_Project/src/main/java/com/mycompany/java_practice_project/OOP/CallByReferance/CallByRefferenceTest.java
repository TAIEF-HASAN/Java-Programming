package com.mycompany.java_practice_project.OOP.CallByReferance;

public class CallByRefferenceTest {
    public static void main(String[] args) {
        
        CallByReferanceExmp r1 = new CallByReferanceExmp();
        r1.name = "Kabil";
        System.out.println("Before calling: "+r1.name);

        r1.change(r1);
        System.out.println("After Calling: "+r1.name);
    }
}
