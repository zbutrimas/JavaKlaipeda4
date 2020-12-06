package lt.sda.javafundamentals.task5;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value <= 0) return;

        for (int i = 2; i <= value; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}

