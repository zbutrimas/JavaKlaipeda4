package lt.sda.javafundamentals.task15;

import java.util.*;


public class TwiseNumbers {
    public static void main(String[] args) {
        String x = "5588223377";
        char y[] = x.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldval = map.get(y[i]);
                int newval = oldval + 1;
                map.put(y[i], newval);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> lhamp = map.entrySet();
        for(Map.Entry<Character, Integer> data : lhamp) {
            if (data.getValue() > 1)
            {
                System.out.print(data.getKey());
                System.out.print("-");
                System.out.println(data.getValue());
            }
        }
    }
}
