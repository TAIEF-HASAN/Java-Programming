package com.mycompany.java_practice_project.ArrayList;

import java.util.ArrayList;

public class ArrayListExmp2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number  = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);

        number3.addAll(number);

        System.out.println("The element of number: "+number);
        System.out.println("The element of number2: "+number2);
        System.out.println("The element of number3: "+number3);

        boolean equal = number.equals(number2);
        System.out.println("number == number2:"+equal); 

        equal = number.equals(number3);
        System.out.println("number == number3:"+equal); 

    }
}
