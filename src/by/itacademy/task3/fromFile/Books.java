package by.itacademy.task3.fromFile;


import java.util.Arrays;
import java.util.stream.Stream;

public class Books {

    int id;
    String title;
    String authors;
    int yearOfPublication;
    int numberOfPages;
    double price;
    String bindingType;

    public Books(int id, String title, String authors, int yearOfPublication, int numberOfPages, double price, String bindingType) {
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

    public Books() {

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
}
