package com.company;

public class Student {

    static {
        //static block
    }
    String firstName;
    String lastName;
    static String schoolName = "My School";
    static final String MANAGER_NAME = "Mr Doe"; //Constant

    public static void sayAddress(){
        System.out.println("Tehran-Iran");
    }
}
