package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class FizzBuzz {
    public static void main(String[] args) {

        int randomNumber = 9;
        boolean isEvenNumber = randomNumber % 3 == 0;
        boolean isRandomNumberZero = randomNumber % 15 == 0;
        boolean isRandomNumberFirst = randomNumber % 5 == 0;

        if (isEvenNumber && !isRandomNumberZero) {
            System.out.println("fizz");
        } else if (isRandomNumberZero) {
            System.out.println("fizzbuzz");
        } else if (isRandomNumberFirst) {
            System.out.println("buzz");
        } else {
            System.out.println("Nieko");
        }
//        Write a program which prints "fizz" if the number is a multiplier of 3, prints "buzz" if
//        its multiplier of 5 and prints "fizzbuzz" if the number is divisible by both 3 and 5.
//        testuoti su:
//        0 - nieko
//        1 - nieko
//        3 - fizz
//        5 buzz
//        8 nieko
//        9 fizz
//        10 buzz
//        15 fizzbuzz
//        30 fizzbuzz
//        28 nieko

    }
}


