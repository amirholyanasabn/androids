package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Horse();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Horse);
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Vegeterian);
        System.out.println(animal instanceof Lion);
    }
}
