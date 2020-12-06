package lt.sda.javafundamentals.task19;

public class Main {

    public static void main(String[] args) {

        Author author = new Author();
        author.setSurname("Grigaitis");
        author.setNationality ("Latvis");

        Author author2 = new Author("Jonaitis", "Lietuvis");
        Author author3 = new Author("Guette", "Vokietis");

        Poem poem = new Poem();
        poem.setAuthor ("Grigaitis");
        poem.setStropheNumbers (100);

        Poem poem2 = new Poem("Jonaitis",200);
        Poem poem3 = new Poem("Guette",300);

        Poem[] allPoems = new Poem[3];
        allPoems[0] = poem;
        allPoems[1] = poem2;
        allPoems[2] = poem3;


    }
}
