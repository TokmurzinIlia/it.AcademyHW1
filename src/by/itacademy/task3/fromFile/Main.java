package by.itacademy.task3.fromFile;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/by/itacademy/task3/fromFile/Books"));
        List<Books> books = new ArrayList<>();

        Map<String, Integer> bookValueMap = new HashMap<>();

        String[] bookValues = reader.readLine().split(";");
        int counter = 0;
        for (String value : bookValues) {
            bookValueMap.put(value, counter++);}


        while (reader.ready()) {
            bookValues = reader.readLine().split(";");

            int id = Integer.parseInt(bookValues[bookValueMap.get("id")]);
            String title = bookValues[bookValueMap.get("title")];
            String authors = bookValues[bookValueMap.get("authors")];
            int yearOfPublication = Integer.parseInt(bookValues[bookValueMap.get("yearOfPublication")]);
            int numberOfPages = Integer.parseInt(bookValues[bookValueMap.get("numberOfPages")]);
            double price = Double.parseDouble(bookValues[bookValueMap.get("price")]);
            String bindingType = bookValues[bookValueMap.get("bindingType")];
            Books book = new Books(id, title, authors, yearOfPublication, numberOfPages, price, bindingType);
            books.add(book);


        }

        String nameAutor = "Михаил Булгаков";
        String vord = "сердце";

        int from = 1980;
        int to = 2000;

        System.out.println("Книги, автор - " + nameAutor + ":");
        books.stream()
                .filter(Book -> Book.getAuthors().contains(nameAutor))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Книги, выпущенные  с " + from + " по " +  to + " гг : ");
        books.stream()
                .filter(Book -> Book.getYearOfPublication() >= from && Book.getYearOfPublication() <= to)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Книги, содержащие слово " + "'" + vord + "'" + ":");
        books.stream()
                .filter(Book -> Book.getTitle().contains(vord))
                .forEach(System.out::println);
        System.out.println();

    }

}
