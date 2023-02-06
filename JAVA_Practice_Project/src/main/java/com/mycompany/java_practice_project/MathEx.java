package com.mycompany.java_practice_project;

public class MathEx {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 2;


        int max = Math.max(x, y);
        System.out.println(max);

        int min = Math.min(x, y);
        System.out.println(min);

        int abs = Math.abs(y);
        System.out.println(abs);

        double power = Math.pow(x, y);
        System.out.println(power);

        int round = Math.round(8.8f);
        System.out.println(round);

        double floor = Math.floor(8.9f);
        System.out.println(floor);

        double ceil = Math.ceil(8.7f);
        System.out.println(ceil);

    }
}
