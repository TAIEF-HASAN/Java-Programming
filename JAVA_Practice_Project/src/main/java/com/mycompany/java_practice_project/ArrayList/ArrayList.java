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

        //System.out.println(number);

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

        //removing elements from array in many way
        /*
         * number.remove(0);
        System.out.print(number+" ");
        System.out.println();
        System.out.println("Array Size = "+number.size());

        number.removeAll(number);
        System.out.println(number);
        System.out.println("Array Size = "+number.size());
         */

        /*
         * number.clear();
         System.out.println(number);
         */

        //return true or false base on value of arraylist
        boolean c =  number.contains(30);
        System.out.println(c);

        //check if the arraylist is empty or not
        boolean empty =  number.isEmpty();
        System.out.println("Is empty: "+empty);

        //return  a Index of value 
        System.out.println("the Index of value is: "+number.get(4));
        
        //set method do replace the existence index of value
        System.out.println("The new  value is:"+number.set(1, 70));    

        //print the indexOf value
        System.out.println("The value of index is: "+number.indexOf(50));    

         
         
        

        
    }
}
