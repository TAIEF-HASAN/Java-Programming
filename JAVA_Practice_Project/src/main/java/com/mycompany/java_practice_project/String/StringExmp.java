package com.mycompany.java_practice_project.String;

public class StringExmp {
    public static void main(String[] args) {
        
        String n = "My Country Bangladesh";
        String m = new String("My Country Bangladesh");

        int x = n.length();
        System.out.println("The length of String is "+x);

        if(n==m){
            System.out.println("Equal");

        }
        else{
            System.out.println("not equal");
        }

        //if the condition is true/False equal method returns boolean value
        if(n.equals(m)){
            System.out.println("Equal");

        }
        else{
            System.out.println("not equal");
        }

        //if the condition is true/False contains method returns boolean value
        if(n.contains(m)){
            System.out.println("Equal");

        }
        else{
            System.out.println("not equal");
        }

        //if the condition is true/False isEmpty method returns boolean value
        if(n.isEmpty()){
            System.out.println("Empty");

        }
        else{
            System.out.println("not EMPTY");
        }


    }
}
