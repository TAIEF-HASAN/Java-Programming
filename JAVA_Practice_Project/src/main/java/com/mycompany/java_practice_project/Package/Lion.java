package com.mycompany.java_practice_project.Package;

import com.mycompany.java_practice_project.Package.SubPackage.Tiger;
//if we want need another class object from another package then we have to import the package first
import com.mycompany.java_practice_project.PackageTw.Hen;

public class Lion {

    public static void main(String[] args) {
        Hen hen = new Hen();
        hen.display();
        Tiger tiger = new Tiger();
    }
    
   
}
