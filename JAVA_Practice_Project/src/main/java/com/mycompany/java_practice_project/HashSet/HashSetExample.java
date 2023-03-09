package com.mycompany.java_practice_project.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        //set can not take duplicate value
        HashSet<String> fruitsName = new HashSet<>();

        fruitsName.add("apple");
        fruitsName.add("banana");
        fruitsName.add("bit");
        fruitsName.add("jackfruit");
        fruitsName.add("pineapple");
        fruitsName.add("bit");

        System.out.println(fruitsName);

        fruitsName.remove("apple");
        System.out.println(fruitsName);

        fruitsName.clear();
        System.out.println(fruitsName);

        System.out.println(fruitsName.isEmpty());
    }
}
