package lt.sda.javafundamentals.task4;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNumber = sc.nextInt();

         while (randomNumber <= 0){
             System.out.println("Wrong number");
             randomNumber = sc.nextInt();
         }

            for (int i = 1; i <= randomNumber; i++) {
                if (i % 21 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i % 7 == 0) {
                    System.out.println("buzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
