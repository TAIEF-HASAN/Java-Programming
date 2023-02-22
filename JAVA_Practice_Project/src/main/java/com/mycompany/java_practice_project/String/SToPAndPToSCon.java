package com.mycompany.java_practice_project.String;


public class SToPAndPToSCon {
    
    public static void main(String[] args) {
        
       /*
        * Conversion String to Primitive 
        * Primitive to String
        */

        //Primitive to String type Conversion
        int s = 7;
        String q = Integer.toString(s);
        System.out.println(q);

        //Primitive to String type Conversion
        double k = 4.30;
        String l = Double.toString(k);
        System.out.println(l);

        //Primitive to String type Conversion
        boolean b = true;
        String a = Boolean.toString(b);
        System.out.println(a);

        //String to Primitive type conversion
        String A = "7";
        int B = Integer.valueOf(A);
        System.out.println(B);

        //String to Primitive type conversion
        String c = "77";
        int d = Integer.parseInt(c);
        System.out.println(d);

        //String to Primitive type conversion
        String n = "true";
        boolean m = Boolean.parseBoolean(n);
        System.out.println(m);

    }
}
