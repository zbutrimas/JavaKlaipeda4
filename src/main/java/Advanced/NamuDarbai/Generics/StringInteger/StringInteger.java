package Advanced.NamuDarbai.Generics.StringInteger;

public class StringInteger {
    public static void main(String[] args) {

        Integer[] iaray = {5,8,9,7,11};
        String[] saray = {"one","two","three","four"};

        printMe(iaray);
        printMe(saray);
    }
    public static <T> void printMe(T[] x){
        for (T b : x)
            System.out.println("%s ");
        System.out.println();
    }
}
