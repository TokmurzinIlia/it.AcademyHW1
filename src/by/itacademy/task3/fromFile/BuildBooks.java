package by.itacademy.task3.fromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildBooks {

    public List<Books> createBook (String fileAddress) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileAddress));

        List<Books> book = new ArrayList<>();

        Map<String, Integer> bookValueMap = new HashMap<>();

        if (reader.ready())
        {
            String bookValues[] = reader.readLine().split(";");
            int counter = 0;
            for (String value : bookValues)
            {
                bookValueMap.put(value, counter++);
            }
        } else
        {
            return book;
        }

        while (reader.ready())
        {
            String bookValues[] = reader.readLine().split(";");

            int id = Integer.parseInt(bookValues[bookValueMap.get("id")]);
            int yearOfPublication = Integer.parseInt(bookValues[bookValueMap.get("yearOfPublication")]);
            int numberOfPages = Integer.parseInt(bookValues[bookValueMap.get("numberOfPages")]);

            double price = Double.parseDouble(bookValues[bookValueMap.get("price")]);

            String title = bookValues[bookValueMap.get("title")];
            String authors = bookValues[bookValueMap.get("authors")];
            String bindingType = bookValues[bookValueMap.get("bindingType")];

            Books books = new Books( id,  title,  authors,  yearOfPublication, numberOfPages, price, bindingType);

            book.add(books);


        }

        return book;}
}

