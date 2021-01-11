package Advanced.NamuDarbai.JavaDeveloper;

public class JavaDevelMain {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Deimantas", 4);

        System.out.println(javaDeveloper.getDeveloper());
        System.out.println(javaDeveloper.textInCapital("Saltis"));
    }
}
