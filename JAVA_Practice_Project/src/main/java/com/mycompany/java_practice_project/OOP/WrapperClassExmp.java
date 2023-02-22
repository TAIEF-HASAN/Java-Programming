package com.mycompany.java_practice_project.OOP;

public class WrapperClassExmp {
    public static void main(String[] args) {

        /*
         * Wrapper Class:
         * Auto boxing = Converting primitive to object
         * Unboxing = Converting object to primitive
         * String is not a Primitive data
         */
        
        //converting primitive to Object of wrapper class
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("Value of Wrapper class is "+y);

        //We can convert primitive to Object of like this
        int i = 40;
        Integer j = i; //here compiler automatically takeoff The wrapper class -->Integer.ValueOf(j)  
        System.out.println(j);

        //Converting Wrapper Class Object to primitive data type
        Double a = new Double (4.00);
        double b = a.doubleValue();
        System.out.println(b);

        
        Double k = 3.14;
        System.out.println(k);

        //we can code like this to convert wrapper class obj to primitive
        Boolean m = true;
        boolean n = m; //.booleanValue();
        System.out.println(n);


    }
}
