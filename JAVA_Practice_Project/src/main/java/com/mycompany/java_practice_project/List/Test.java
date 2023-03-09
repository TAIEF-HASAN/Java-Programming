package com.mycompany.java_practice_project.List;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        
        LinkedList<Student> list = new LinkedList<Student>();

        Student n1 = new Student("Tamim", 101);
        Student n2 = new Student("saleh", 102);
        Student n3 = new Student("Rahim", 103);
        Student n4 = new Student("Karim", 104);
        Student n5 = new Student("Harun", 105);

        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

        for (Student student : list) {
            //we can see value by printing object using toString
            //System.out.println(student);
            //Or we can call object value for printing
            System.out.println(student.id+" "+student.name+" "+Student.className);
        }
    }
}
