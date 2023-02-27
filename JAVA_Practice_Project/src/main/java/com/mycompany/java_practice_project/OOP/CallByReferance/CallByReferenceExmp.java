package com.mycompany.java_practice_project.OOP.CallByReferance;

public class CallByReferenceExmp {
    
    String name;

    void change(CallByReferenceExmp r2){
    //change to the formal parameter does affect the Actual parameter
       r2.name = "Habil";
    }
}
