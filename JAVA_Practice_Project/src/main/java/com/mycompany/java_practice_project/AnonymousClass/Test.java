package com.mycompany.java_practice_project.AnonymousClass;

public class Test {
    public static void main(String[] args) {
        

        Person person = new Person(){

            //anonymous class
            @Override
            void display(){
                System.out.println("Hi I am Test class");
            }

        };
        person.display();
    }
}
