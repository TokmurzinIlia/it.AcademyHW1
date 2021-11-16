package by.itacademy.task3.formArray;

import java.util.Arrays;

import java.util.stream.Stream;

public class Book {

    int id;
    String title;
    String authors;
    int yearOfPublication;
    int numberOfPages;
    double price;
    String bindingType;

    public Book(int id, String title, String authors, int yearOfPublication, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Книга : " +
                "id='" + id + '\'' +
                ", title=" + title + '\'' +
                ", authors=" + authors + '\'' +
                ", yearOfPublication=" + yearOfPublication + '\'' +
                ", numberOfPages=" + numberOfPages + '\'' +
                ", price=" + price + '\'' +
                ", bindingType=" + bindingType +

                '}';
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void getBookAuthor(String author, Book[] arrayBooks) {
        System.out.println("Книги, автор - " + author + ":");
        Stream<Book> streamFromArrays = Arrays.stream(arrayBooks);
        streamFromArrays
                .filter(Book -> Book.getAuthors().equals(author))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void getContainWord(String word, Book[] arrayBooks) {
        System.out.println("Книги, содержащие слово " + "'" + word + "'" + ":");
        Stream<Book> streamFromArrays2 = Arrays.stream(arrayBooks);
        streamFromArrays2
                .filter(Book -> Book.getTitle().contains(word))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void getYearOfPublicationFromTo (int from, int to, Book[] arrayBooks) {
        System.out.println("Книги, выпущенные  с " + from + " по " +  to + " гг : ");
        Stream<Book> streamFromArrays3 = Arrays.stream(arrayBooks);
        streamFromArrays3
                .filter(Book -> Book.getYearOfPublication() >= from && Book.getYearOfPublication() <= to)
                .forEach(System.out::println);

        System.out.println();
    }
}
