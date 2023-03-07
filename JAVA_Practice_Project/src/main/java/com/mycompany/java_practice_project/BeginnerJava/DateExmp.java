package com.mycompany.java_practice_project.BeginnerJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExmp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
        String newDateF = dateFormat.format(date);
        System.out.println(newDateF);
    }
}
