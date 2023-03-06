package com.mycompany.java_practice_project.TypeCasting;

public class Test {
    
    public static void main(String[] args) {
        
        int x = 10;
        //here the possible casting int to double 
        double y = x;
        //here not possible casting double to int conversion without type casting
        int z = (int)y;

        //here create an object subclass using superclass
        Person person = new Teacher();
        person.display();
        //here create an object super class using subclass. it may pass the compile time error but must caught the run time error.
        Teacher teacher = (Teacher)new Person();
        teacher.display();
    }
}
