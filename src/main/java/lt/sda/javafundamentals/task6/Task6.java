package lt.sda.javafundamentals.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value <= 0) return;

        System.out.println(harmonicSum(value));
//        System.out.println(harmonicSumRecursion(value));
    }

        private static double harmonicSum(int n) {
            double s = 0;
            for(double i = 1; i <= n; i++) {
                s = s + 1 / i;
            }
            return s;
        }
//        private static double harmonicSumRecursion(int n) {
//
//            return 0;
//        }
}

