package lt.sda.javafundamentals.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int num = num1 % 10;
        int num2 = (num1 / 10) % 10;
        int num3 = (num1 / 100) % 10;
        int num4 = (num1 / 1000) % 10;
        int num5 = (num1 / 10000) % 10;
        int num6 = (num1 / 100000) % 10;
        int num7 = (num1 / 1000000) % 10;
        int num8 = (num1 / 10000000) % 10;
        int num9 = (num1 / 100000000) % 10;
        int num10 = (num1 / 1000000000) % 10;


                System.out.println(num+num2+num3+num4+num5+num6+num7+num8+num9+num10);
        }
    }

