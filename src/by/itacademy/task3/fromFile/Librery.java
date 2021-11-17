package by.itacademy.task3.fromFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Librery {
    List<Books> bookPool;

    String fileAddress;

    public Librery(String fileAddress) throws IOException
    {

        this.fileAddress = fileAddress;

        this.bookPool = new BuildBooks().createBook(fileAddress);
    }


    public List<Books> getBookPool() {
        return bookPool;
    }

    public Stream<Books> stream()
    {

        return bookPool.stream();
    }

    public static void getBookAuthor(String author, Librery librery)
    {

        System.out.println("Книги, автор - " + author + ":");

        Stream<Books> streamFromArrays2 = librery.stream();

        streamFromArrays2

                .filter(Books -> Books.getAuthors().contains(author))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void getContainWord(String word, Librery librery)
    {

        System.out.println("Книги, содержащие слово " + "'" + word + "'" + ":");

        Stream<Books> streamFromArrays2 = librery.stream();

        streamFromArrays2
                .filter(Book -> Book.getTitle().contains(word))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void getYearOfPublicationFromTo (int from, int to, Librery librery)
    {

        System.out.println("Книги, выпущенные  с " + from + " по " +  to + " гг : ");

        Stream<Books> streamFromArrays3 = librery.stream();

        streamFromArrays3
                .filter(Book -> Book.getYearOfPublication() >= from && Book.getYearOfPublication() <= to)
                .forEach(System.out::println);

        System.out.println();
    }
}
