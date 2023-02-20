package com.mycompany.java_practice_project.String;

public class StringExmp2 {
    public static void main(String[] args) {
        
        String m = " Bangladesh";
        String n = "My";

        //here concat with + Sign
        String fullPhrase = n + m;
        System.out.println("The Full Phrase is "+fullPhrase);

        //here the string concat with the concat methods
        String fullPhrase1 = n.concat(m);
        System.out.println(fullPhrase1);

        //using toUpperCase method for a String uppercase 
        String UpperCase = fullPhrase.toUpperCase();
        System.out.println(UpperCase);

        //using toLowerCase method for a String lowercase
        String LowerCase = fullPhrase1.toLowerCase();
        System.out.println(LowerCase);

        //find a string start With the same letter or not, based on return true or false
        Boolean sW = m.startsWith(" B");
        System.out.println(sW);

        //find a string ends with the same letter or not, based on return true or false
        Boolean eW = m.endsWith("h");
        System.out.println(eW);


    }
}
