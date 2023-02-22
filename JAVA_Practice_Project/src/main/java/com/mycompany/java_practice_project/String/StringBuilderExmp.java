package com.mycompany.java_practice_project.String;

public class StringBuilderExmp {
    public static void main(String[] args) {
        
        //declaration of String Builder
        StringBuilder s = new StringBuilder("My country");
        System.out.println(s);

        //append method do add a String with a Sting Builder
        s.append(" is Bangladesh ");
        System.out.println(s);
        s.append(570);
        System.out.println(s+" km");

        /*
        #set length method set length of a string
        s.setLength(10);
        System.out.println(s);

        #reverse method do reverse the string
        s.reverse();
        System.out.println(s);*/

        /*s.delete(0, 5);
        System.out.println(s);*/

        //delete method do delete first index to last index which is given in bracket
        s.delete(0, 5);
        System.out.println(s);
    }

   
}
