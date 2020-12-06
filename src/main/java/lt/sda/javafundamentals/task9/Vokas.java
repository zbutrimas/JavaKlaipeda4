package lt.sda.javafundamentals.task9;

public class Vokas {

    public static void main(String[] args) {

        int n = 8;

        for (int eilut = 1; eilut <= n; eilut++) {
            for (int stulp = 1; stulp <= n; stulp++) {
                if (eilut == 1 || eilut == n || stulp == 1 || stulp == n
                || eilut == stulp || stulp == n - eilut + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
