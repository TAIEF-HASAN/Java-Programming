package com.mycompany.java_practice_project.OOP.Abstraction;

public class Test {
    public static void main(String[] args) {

        /*
         * What is Abstraction?
         * Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
         */

        
        MobileUser mobileUser;
        mobileUser = new Rahim();
        mobileUser.sendMessage();
        mobileUser.hello();

        mobileUser = new Karim();
        mobileUser.sendMessage();
       
        
    }
}
