package com.mycompany.java_practice_project.List;

import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        
        LinkedList<String> name = new LinkedList<>();

        name.add("Afghanistan");
        name.add("Bangladesh");
        name.add("India");
        name.add("Nepal");
        name.add("Vutan");
        name.add(5, "Hawaii");
        name.addFirst("Australia");
        name.addLast("Japan");
        //name.remove("India");
        //name.remove(0);
        //name.removeFirst();
        //name.removeLast();
        //name.removeAll(name);

        for (String namString : name) {
            System.out.println(namString);
        }

        //System.out.println(name);
        name.clear();
        System.out.println(name);
    }
}
