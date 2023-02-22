package com.mycompany.java_practice_project.String;

public class StringBufferExmp {
    public static void main(String[] args) {
        
        //declaration of String Buffer
        StringBuffer s = new StringBuffer("My Country");

        System.out.println(s);

        //StringBuffer can add  with a String without declaring any object Like String s1 = s.append();
        s.append(" is Bangladesh");
        System.out.println(s);
        s.append(25);

        /*// Delete method delete character form start to end of Index
         * s.delete(0, 7);
        System.out.println(s);
         */

        //setLength Method set the Index of a String 
        s.setLength(5);
        System.out.println(s);
        
    }
}
