package ru.javaPhilosophy.chapter_1;

//: object/Task12.java

import java.util.Date;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
*/

public class Task12 {
    /** Точка входа в класс и приложение.
     * @param args Массив строковых аргументов
     * @throws exception Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
}
