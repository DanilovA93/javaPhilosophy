package ru.javaPhilosophy.chapter_1;

/*
 * Сделайте то же для кода с использованием класса DataOnly.
 */

public class Task4 {
    public static void main(String[] args){
        FirstDataOnly data = new FirstDataOnly();

        data.print();
    }
}

class FirstDataOnly{
    int i;
    double d;
    boolean b;

    void print(){
        System.out.println("i - " + i);
        System.out.println("d - " + d);
        System.out.println("b - " + b);
    }
}
