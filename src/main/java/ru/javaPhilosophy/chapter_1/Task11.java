package ru.javaPhilosophy.chapter_1;

/*
* Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу.
*/

public class Task11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();

        for (;rainbow.anIntegerRepresentingColors < rainbow.colors.length; rainbow.anIntegerRepresentingColors++) {

            rainbow.changeTheHueOfTheColor(rainbow.anIntegerRepresentingColors);
        }
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

    void changeTheHueOfTheColor(int newHue) {
        System.out.println(colors[newHue]);
    }
}
