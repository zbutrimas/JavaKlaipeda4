package lt.sda.javafundamentals.task11;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        Scanner scstr = new Scanner(str);
        String longestWord = scstr.next();
        int maxlen = longestWord.length();

        while (scstr.hasNext()) {
            String word = scstr.next();
            int len = word.length();

            if (len > maxlen) {
                longestWord = word;
                maxlen = len;
            }
        }
        System.out.println("Maximum words is: " + longestWord );
        System.out.println("Sentence length " + maxlen +" words.");
    }
}