package com.mycompany.java_practice_project.String;

public class StringExmp4 {
    public static void main(String[] args) {
        
        String s = "My country is Bangladesh";
        //replace method do replace any Integer or String one to another
        String s2 = s.replace("y", "i");
        System.out.println(s2);

        //Split method do a String or number separate base on instruction of double quotation
        String[] s3 = s.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }
    }
}
