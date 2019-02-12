package ru.javaPhilosophy.chapter_1;

/*
* Измените упражнение 4 так, чтобы данным класса DataOnly присваивались
* значения, а затем распечатайте их в методе main().
*/

public class Task5 {
    public static void main(String[] args){
        SecondDataOnly data = new SecondDataOnly();

        data.i = 5;
        data.d = 5;
        data.b = true;

        System.out.println("i - " + data.i);
        System.out.println("d - " + data.d);
        System.out.println("b - " + data.b);
    }
}

class SecondDataOnly{
    int i;
    double d;
    boolean b;
}
