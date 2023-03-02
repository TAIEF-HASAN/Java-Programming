package com.mycompany.java_practice_project.OOP.Abstraction;

public class Test {
    public static void main(String[] args) {

        /*
         * What is Abstraction?
         * Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
         * The two way of abstraction in java
         * 1.Abstract class (0 to 100%)
         * 2.Interface (Achieve 100% abstraction )
         */

        
        MobileUser mobileUser;
        mobileUser = new Rahim();
        mobileUser.sendMessage();
        mobileUser.hello();

        mobileUser = new Karim();
        mobileUser.sendMessage();
       
        
    }
}
