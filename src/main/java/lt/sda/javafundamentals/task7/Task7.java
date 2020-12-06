package lt.sda.javafundamentals.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int number1 = sc.nextInt();

        if (number1 <= 0) return;

        int a = 1;
        int b = 1;
        int c = 2;
        for (int i = 1; i < number1; i++) {
            c = b + a;
            a = b;
            b = c;

            System.out.println(a);
        }

    }
}
