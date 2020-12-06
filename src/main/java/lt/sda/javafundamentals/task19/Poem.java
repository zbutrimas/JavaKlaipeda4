package lt.sda.javafundamentals.task19;

public class Poem {

    public Poem() {

    }


    private String author;
    private int stropheNumbers;

    public Poem(String surname, int pages) {
        this.author = surname;
        this.stropheNumbers = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int pages) {
        this.stropheNumbers = pages;
    }
}
