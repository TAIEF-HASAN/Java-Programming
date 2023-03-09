package com.mycompany.java_practice_project.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap <Integer, String> sName = new HashMap<>();

        sName.put(101, "Ridy");
        sName.put(102, "Raj");
        sName.put(103, "Habil");
        sName.put(104, "Kabil");
        
        System.out.println(sName.get(101));
        System.out.println(sName.get(102));
        System.out.println(sName.get(103));
        System.out.println(sName.get(104));
    }
}
