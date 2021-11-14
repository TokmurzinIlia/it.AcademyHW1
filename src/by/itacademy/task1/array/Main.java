package by.itacademy.task1.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        Scanner sc = new Scanner(System.in);
        int count = -2;
        System.out.println("Введите номер дня: , либо -1 для выхода");
        while (count != -1) {
            if (!sc.hasNextInt()){
                System.out.println("Некорректное значение");
                System.out.println("Введите номер дня: , либо -1 для выхода");
                sc.next();
            }
            else {
            int number = sc.nextInt();
                if (number > 0 && number < 8) {
                    daysOfTheWeek.setDaysOfTheWeek(number);
                    System.out.println("Введите номер дня: , либо -1 для выхода");
                }
                else if (number == -1) {
                    System.out.println("Выход");
                }
                else {
                    System.out.println("Такого дня не существует");
                    System.out.println("Введите номер дня: , либо -1 для выхода");
                }
                count = number;
            }
        }
    }
}


