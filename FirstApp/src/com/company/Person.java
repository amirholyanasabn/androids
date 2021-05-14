package com.company;

public class Person {
    int id;
    String firstName;
    String lastName;

    public void sayHello(){
        System.out.printf("Welcome %s %s to Java world",this.firstName,this.lastName);
    }
}
