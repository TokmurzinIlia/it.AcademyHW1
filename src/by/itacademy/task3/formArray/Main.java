package by.itacademy.task3.formArray;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Южный почтовый", "Сент-Экзюпери А.Д.",
                1960, 146, 14.99, "Мягкий");

        Book book2 = new Book(2, "Планета людей", "Сент-Экзюпери А.Д.",
                1963, 224, 12.65, "Твердый");

        Book book3 = new Book(3, "Коллекционер", "Джон Фаулз",
                1993, 100, 4.78, "Мягкий");

        Book book4 = new Book(4, "Мантисса", "Джон Фаулз",
                200, 78, 2.99, "Мягкий");

        Book book5 = new Book(5, "Собачье сердце", "Михаил Булгаков",
                1987, 320, 5.55, "Мягкий");

        Book book6 = new Book(6, "Мастер и Маргарита", "Михаил Булгаков",
                1966, 504, 14.00, "Твердый");

        Book[] arrayBooks = new Book[]{book1, book2, book3, book4, book5, book6};

        Book.getBookAuthor("Михаил Булгаков", arrayBooks);

        Book.getContainWord("сердце", arrayBooks);

        Book.getYearOfPublicationFromTo(1980, 2000, arrayBooks);

    }
}
