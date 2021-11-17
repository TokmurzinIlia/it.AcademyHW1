package by.itacademy.task2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Double> setNumbers = new TreeSet<>();

        double number;

        System.out.println("Введите число, либо 'стоп' для получения результата");

        while (true)
        {
            if (sc.hasNext("стоп"))
            {
                break;
            }
            if (!sc.hasNextInt())
            {
                System.out.println("Некорректное значение");
                System.out.println("Введите число, либо 'стоп' для получения результата");
                sc.next();
            }

            else
                {
                number = sc.nextInt();
                setNumbers.add(number);
                System.out.println("Введите число, либо 'стоп' для получения результата");
                }
        }

        Sorted.getMaxMinNumber(setNumbers);

        Sorted.getShortLong(setNumbers);
    }
}
