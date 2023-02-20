package com.mycompany.java_practice_project.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AscAndDesc {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(5);
        number.add(-11);
        number.add(-3);
        number.add(4);
        number.add(1);
        number.add(9);
        number.add(7);

        System.out.println(number);

        //sorted arraylist in ascending order
        Collections.sort(number);
        System.out.println(number);

        //sorted arraylist in descending order
        Collections.sort(number, Collections.reverseOrder());
        System.out.println(number);
    }
}
