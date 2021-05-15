package com.company.person;

public class Person {
    int id;
    public String name;
    public String family;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

//    public Person() {
//    }

    /**
     * Say Welcome to User
     */
    public void sayWelcome(){
        System.out.printf("Welcome %s %s to Java World",name,family);
    }
}
