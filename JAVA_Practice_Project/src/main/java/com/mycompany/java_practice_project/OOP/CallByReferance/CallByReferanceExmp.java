package com.mycompany.java_practice_project.OOP.CallByReferance;

public class CallByReferanceExmp {
    
    String name;

    void change(CallByReferanceExmp r2){
    //change to the formal parameter does affect the Actual parameter
       r2.name = "Habil";
    }
}
