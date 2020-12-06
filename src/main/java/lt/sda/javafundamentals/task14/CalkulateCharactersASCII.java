package lt.sda.javafundamentals.task14;

public class CalkulateCharactersASCII {

        public static void main(String[] args) {

            char CapitalChar = 'a';
            char LastChar = 'z';

            char SmallChar = 'a';

            char x = CapitalChar;
            char y = LastChar;

            System.out.println("ASCII Value from "+ x + " to "+y);

            for(int i = x ; i<= y ; i++) {

                System.out.println(CapitalChar +" : "+i);

                CapitalChar++;
            }
        }
    }

