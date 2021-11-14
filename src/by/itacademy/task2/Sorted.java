package by.itacademy.task2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {
    protected static void getMaxMinNumber(TreeSet<Double> setNumbers){

        System.out.println("Минимальное число: " + setNumbers.first() + "." + "Максимальное число: "
                + setNumbers.last() + ".");
    }
    protected static void getShortLong(TreeSet<Double> setNumbers) {

        SortedSet<String> stringNumbers = new TreeSet<>(Comparator.comparing(String::length));
        for (Double numbers : setNumbers) {
            stringNumbers.add(numbers.toString());
        }
        System.out.println("Самое короткое число: " + stringNumbers.first() + "." + "Самое длинное число: "
                + stringNumbers.last()  + ".");
        System.out.println("Длина самого короткого числа: " + stringNumbers.first().length() + "."
                + "Длина самого длинного числа: " + stringNumbers.last().length()  + ".");

    }
}
