package com.mycompany.java_practice_project.String;

public class StringExmp3 {
    public static void main(String[] args) {
        
        String Phrase = "My Country is   Bangladesh ";
        System.out.println(Phrase);

        //trim method do remove only First Space and last space of a Phrase.
        String k = Phrase.trim();
        System.out.println(k);

        //CharAt method shows the First char of the Phrase
        char n = Phrase.charAt(0);
        System.out.println(n);

        //codePointAt methods shows the ascii value of the Index of character
        int m = Phrase.codePointAt(0);
        System.out.println("Ascii value is "+m);

        //IndexOf Method shows the First letter of index number.
        int i = Phrase.indexOf("n");
        System.out.println(i);

        //lastIndexOf Method shows the last letter of index number.
        int j = Phrase.lastIndexOf("n");
        System.out.println(j);
    }
}
