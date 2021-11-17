package by.itacademy.task1.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();

        Scanner sc = new Scanner(System.in);

        int count = -2;

        System.out.println("Введите номер дня: , либо -1 для выхода");

        while (count != -1) {
            if (!sc.hasNextInt()) {
                System.out.println("Некорректное значение");
                System.out.println("Введите номер дня: , либо -1 для выхода");
                sc.next();
            }
            else {
                    System.out.println("Введите номер дня: , либо -1 для выхода");
                    int number = sc.nextInt();
                    daysOfTheWeek.setDaysOfTheWeek(number);
                    System.out.println("Введите номер дня: , либо -1 для выхода");
                    count = number;
            }
        }
    }
}

