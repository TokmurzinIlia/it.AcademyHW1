package by.itacademy.task3.fromFile;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Librery librery = new Librery("src/by/itacademy/task3/fromFile/Books");

        String nameAutor = "Михаил Булгаков";

        String word = "сердце";

        int from = 1980;
        int to = 2000;

        librery.getBookAuthor(nameAutor,librery);

        librery.getContainWord(word,librery);

        librery.getYearOfPublicationFromTo(from, to, librery);


    }

}
