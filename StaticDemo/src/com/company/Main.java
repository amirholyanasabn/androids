package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.firstName = "Amirhossein"; //instance variable
        student.lastName = "Olyanasb"; //instance variable
        System.out.printf("Hi %s %s",student.firstName,student.lastName);
        System.out.println();
        System.out.println(Student.MANAGER_NAME); //Constant
        System.out.println(Student.schoolName); //Static Variable - class variable
        Student.sayAddress(); //Static Method
//
//        Student student = new Student();
//
//        System.out.println(student.schoolName);
    }
}
