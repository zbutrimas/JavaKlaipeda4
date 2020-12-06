package lt.sda.javafundamentals.task12;

import java.util.Scanner;

public class CountNumbersSpacesCharacters {

    public static void main(String[] args) {
        char[] ch;
        String str;
        int letter = 0, spaces = 0, number = 0, other = 0, length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        str = sc.nextLine();
        ch = str.toCharArray();
        length = str.length();

        for (int i = 0; i < length; i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                other++;
            }
        }
        System.out.println("Letters: " + letter);
        System.out.println("Numbers: " + number);
        System.out.println("Spaces: " + spaces);
        System.out.println("Others: " + other);
        System.out.println("Length: " + length);
        System.out.println("Spaces percentage is: "+(spaces*100)/length+"%");
    }
}
