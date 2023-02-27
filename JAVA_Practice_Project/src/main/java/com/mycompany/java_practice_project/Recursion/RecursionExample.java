package com.mycompany.java_practice_project.Recursion;

public class RecursionExample {
    

    int fact(int n){

        if(n==1){
            return 1;
        }else{
           return n * fact(n-1);
        }
    }
}
