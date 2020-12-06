package lt.sda.javafundamentals.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pirmasNum = sc.nextFloat();
        sc.nextLine();
        String symbol = sc.nextLine();
        float kitasNum = sc.nextFloat();

        switch (symbol) {
            case "+":
                System.out.println(pirmasNum + kitasNum);
                break;
            case "-":
                System.out.println(pirmasNum - kitasNum);
                break;
            case "/":
            case "\\":
                System.out.println(pirmasNum / kitasNum);
                break;
            case "*":
                System.out.println(pirmasNum * kitasNum);
                break;
            default:
                System.out.println("Invalid symbol");
                break;
        }
        }
}
