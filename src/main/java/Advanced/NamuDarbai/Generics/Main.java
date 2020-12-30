package Advanced.NamuDarbai.Generics;

public class Main {
    public static void main(String[] args) {

        TwoItems twoItems = new TwoItems(5,"Fordas");
        System.out.println(twoItems.toString(twoItems.getEntry1()));
        System.out.println(twoItems.toString(twoItems.getEntry2()));
    }
}
