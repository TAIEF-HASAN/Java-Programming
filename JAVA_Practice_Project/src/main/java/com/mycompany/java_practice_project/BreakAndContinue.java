package com.mycompany.java_practice_project;

public class BreakAndContinue {
    
    public static void main(String[] args) {
        
        int i;
        /*//Example of Break
        for(i=1; i<=100; i++){

            if(i==10)
                break;
            System.out.print(i);
        }
        System.out.println();
        //Example of break
        for(i=1; i<=100; i=i+2){

            if(i==10)
                break;
            System.out.print(" "+i);
        }
        System.out.println();
        //Example of continue
        for(i=1; i<=12; i++){

            if(i==10)
                continue;
            System.out.print(" "+i);
        }
        System.out.println();
        //Example of continue
        for(i=1; i<=20; i=i+2){

            if(i==10)
                continue;
            System.out.print(" "+i);
        }

        System.out.println();*/
        //break and continue Example
        for(i = 1; i<=100; i=i+3){

            if(i==10)
                continue;
            System.out.println(i);
            
            if(i>13)
                break;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
