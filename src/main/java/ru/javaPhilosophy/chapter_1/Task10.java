package ru.javaPhilosophy.chapter_1;

/*
* Напишите программу, которая выводит три параметра командной строки. Для
* получения аргументов вам потребуется обращение к элементам массива строк
* (String).
*
* Для добавления аргументов - Run/Debug -> Edit Configuration
*/

public class Task10 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(args[i]);
        }
    }
}
