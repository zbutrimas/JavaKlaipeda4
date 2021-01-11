package Advanced.NamuDarbai.Generics.LastEntry;

import java.util.Arrays;
import java.util.List;

public class EntriesMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(28, 99, 122, -22);

        Entry<String> stringEntry = new Entry<>(strings);
        Entry<Integer> integerEntry = new Entry<>(integers);

        System.out.println(stringEntry.lastEntry());
        System.out.println(integerEntry.lastEntry());
    }
}