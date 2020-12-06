package lt.klaipeda.sda.ketvirtaklase.treciaPamoka;

public class Book {
    private String author;
    private String title;
    private int pages;

    public Book() {
        System.out.println("New book was created");
    }

    public Book(int pages){
        System.out.println("Book with pages was created");
        this.pages=pages;
    }

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getPages() {
        return pages;
    }
    }
