package com.company;

public class Student {

    private String name;
    private int age;
    private String address = "";
    public static int counter = 0;

    public static String UNIVERSITY = "MSTU";

    Student() {

    }

    public Student(String name) {
        this.name = name;
        counter++;
        System.out.println("Student(name): "+counter);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        System.out.println("Student(name,age): "+counter);
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void doMove() {
        System.out.println("doMove");
    }

    public void printCounter() {
        System.out.println(counter);
    }
}
