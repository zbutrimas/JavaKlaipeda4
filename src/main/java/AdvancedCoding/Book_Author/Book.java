package AdvancedCoding.Book_Author;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private double price;
    private Integer qnt;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", qnt=" + qnt +
                '}';
    }

    public Book(String title, List<Author> authors, double price, Integer qnt) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qnt = qnt;


    }
}

