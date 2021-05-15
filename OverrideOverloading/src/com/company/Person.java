package com.company;

public class Person {
    int id;
    String firstName;
    String lastName;



    public void sayHello(){
        System.out.println("Say hello JAVA");
    }
    public void sayHello(String str){
        System.out.printf("Welcome %s %s to JAVA World . ",firstName,lastName);
        System.out.println();
    }
}
