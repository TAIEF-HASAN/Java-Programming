package com.mycompany.java_practice_project;

import java.util.Scanner;

public class TimeTable {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, m,result;

        System.out.println("Which number of time table you want to see? please enter the number");
        n = input.nextInt();
        m = input.nextInt();

        for(int i = n; i<=m; i++){

            for(int j = 1; j<=10; j++){

                result = j * n;
                System.out.println(j+" Time "+i+" = "+ result );
            }
            System.out.println();
        }
    }
}
