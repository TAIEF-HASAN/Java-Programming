package com.mycompany.java_practice_project.OOP.CallByValue;

public class CallByValueTest {
    public static void main(String[] args) {
        
        CallByValueExmp ob = new CallByValueExmp();
        int x = 10; //primitive value --> primitive value store in stack memory
        System.out.println("x before call: "+x);

        ob.change(x);
        System.out.println("x after call: "+x);
    }
}
