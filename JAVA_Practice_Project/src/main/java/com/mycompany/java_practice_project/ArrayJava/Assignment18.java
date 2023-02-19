package com.mycompany.java_practice_project.ArrayJava;

import java.util.Scanner;


public class Assignment18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the day number 1-7:");
        n = input.nextInt();
        
        String[] weekdays = {"Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //System.out.println(weekdays.length);


        for(int i=0; i<weekdays.length; i++){
            if(weekdays[i]==weekdays[n-1]){
                System.out.println(weekdays[i]);
            }
        }

        
    }
}
