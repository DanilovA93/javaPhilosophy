package ru.javaPhilosophy.chapter_1;

/*
* Напишите программу, включающую метод storage(), приведённый ранее в этой
* главе.
*/

public class Task6 {
    public static void main(String[] args){
        String s = "Привет, мир";

        System.out.println(storage(s));
    }

    static int storage(String s) {
        return s.length() * 2;
    }
}
