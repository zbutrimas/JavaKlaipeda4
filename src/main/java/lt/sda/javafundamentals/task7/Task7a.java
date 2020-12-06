package lt.sda.javafundamentals.task7;

import java.util.Scanner;

public class Task7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeris = sc.nextInt();

        if (numeris <= 0) return;

        int n1 = 0, n2 = 1, n3;

        switch (numeris) {
            case 1:
                System.out.println(n1);
                break;
            case 2:
                System.out.println(n2);
                break;
            default:
                n3 = 0;
                for (int i = 2; i < numeris; ++i) {
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }
                System.out.println(n3);
                break;
        }


    }
}
