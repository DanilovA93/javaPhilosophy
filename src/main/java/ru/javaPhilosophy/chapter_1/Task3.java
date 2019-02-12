package ru.javaPhilosophy.chapter_1;

/*
* Найдите фрагмент кода с классом ATypeName и сделайте из него программу, при-
* годную для компиляции и запуска.
*/

public class Task3 {
    public static void main(String[] args){
        ATypeName aTypeName = new ATypeName();

        aTypeName.print();
    }
}

class ATypeName{
    void print(){
        System.out.println("Привет, мир");
    }
}
