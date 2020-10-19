package com.company;

public class Main {

    public static void main(String[] args) {

        Student ivan = new Student("Ivan");
        Student petr = new Student("Petr",16);

        Student olga = new Student();
        olga.printCounter();

        Aspirant oleg = new Aspirant("Oleg");
        oleg.doMove();
       // oleg.UNIVERSITY
        String univ = Student.UNIVERSITY;
       // Student.doMove();
        //Math.PI;
        //Math.abs();
        Student.UNIVERSITY = "BMSTU";

        System.out.println("--------------------------------------");

        // Строки в Java неизменяемые - immutable
        String a1 = "Hello!";
        a1 = "Hello2";
        String a2 = "Hello!";
        System.out.println(a1==a2); // true
        System.out.println(a1.equals(a2)); // true

        String b1 = new String("School!");
        String b2 = new String("School!");
        System.out.println(b1==b2); // false
        System.out.println(b1.equals(b2)); // true

        // StringBuilder или StringBuffer - mutable
        StringBuilder stringBuilder = new StringBuilder("123123");
        stringBuilder.append("dfgadgdfg");
        String str = stringBuilder.toString();

        String str2 = "Hello";
        char ch = str.charAt(0); // 'H'
    }
}
