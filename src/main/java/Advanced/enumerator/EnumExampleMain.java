package Advanced.enumerator;

import java.util.Locale;

public class EnumExampleMain {
    public static void main(String[] args) {
        String coffee = "latte";
        Coffee coffeeEnum = Coffee.valueOf(coffee.toUpperCase());

        System.out.println(Coffee.AMERICANO);
        System.out.println(coffeeEnum);

        System.out.println(AutoMakers.VOLVO.getEngineSize());
    }
}
