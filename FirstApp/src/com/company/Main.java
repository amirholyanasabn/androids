package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String message = "Hello Java";
//        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Please enter your first name :");
        person.firstName = scanner.next();
        System.out.println("Please enter your last name : ");
        person.lastName = scanner.next();

        person.sayHello();
    }
}
