package ru.javaPhilosophy.chapter_1;

/*
* Превратите фрагменты кода с классом Incrementable в работающую программу.
*/

public class Task7 {
    public static void main(String[] args) {
        Incrementable.increment();
    }
}

class Incrementable {
    static void increment(){
        System.out.println(StaticTest.i++);
    }
}

class StaticTest {
    static int i = 47;
}
