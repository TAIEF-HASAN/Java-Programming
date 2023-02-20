package com.mycompany.java_practice_project.ArrayList;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        
       java.util.ArrayList<Integer> number = new java.util.ArrayList<>();
        System.out.println("Array size = "+number.size());


        //adding elements in arraylist
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(5, 60);

        
        //Three ways of printing arraylist

        System.out.println(number);

        /*
        for (int x : number) {
            System.out.print(x+" ");
        }
        */

        Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


        System.out.println();
        System.out.println("Array Size = "+number.size());

        //removing elements of array
        number.remove(0);
        System.out.print(" "+number);
        System.out.println();
        System.out.println("Array Size = "+number.size());

        number.removeAll(number);
        System.out.println(number);
        System.out.println("Array Size = "+number.size());

        
    }
}
