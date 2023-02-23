package com.mycompany.java_practice_project.BignnerJava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String tFormat = time.format(formatter);
        System.out.println(tFormat);

    }
}
