package AdvancedCoding.Book_Author;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("1","a","labas","8166");
        List<Integer> ints = Arrays.asList(4, 654, 888, 7715568);

        for (String text : string) {
            System.out.println(text);
        }
        for(Integer number : ints) {
            System.out.println(number);
        }
    }
}
