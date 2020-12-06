package lt.sda.javafundamentals.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int a,b,c,delta;
        double x1,x2;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = b * b - 4 * a * c;
        if (delta >= 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Delta negative");
        }
    }
}
