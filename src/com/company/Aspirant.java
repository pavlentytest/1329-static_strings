package com.company;

public class Aspirant extends Student {

    public Aspirant(String name) {
        super(name); // Student(name)
    }

    @Override // <!- аннотация
    public void doMove() {
        System.out.println("Aspirant move!");
    }
}
