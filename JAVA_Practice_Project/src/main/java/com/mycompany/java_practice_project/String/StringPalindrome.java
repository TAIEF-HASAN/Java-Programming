package com.mycompany.java_practice_project.String;

public class StringPalindrome {
    public static void main(String[] args) {
        
        String s = "madam";
        StringBuffer s2 = new StringBuffer(s);
        String s3 = s2.reverse().toString();

        if(s.equals(s3)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
