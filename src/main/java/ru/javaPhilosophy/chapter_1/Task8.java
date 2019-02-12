package ru.javaPhilosophy.chapter_1;

/*
* Напишите программу, которая демонстрирует, что независимо от количества
* созданных объектов класс содержит только один экземпляр поля static.
*/

public class Task8 {
    public static void main(String[] args) {
        StaticChecker si1 = new StaticChecker();
        StaticChecker si2 = new StaticChecker();
        StaticChecker si3 = new StaticChecker();

        System.out.println("si1 - " + si1.i++ +
                "; si2 - " + si2.i++ +
                "; si3 - " + si3.i++);

        System.out.println("i - " + StaticChecker.si++ +
                "; i - " + StaticChecker.si++ +
                "; i - " + StaticChecker.si++);
    }
}

class StaticChecker {
    static int si = 0;
    int i = 0;
}
