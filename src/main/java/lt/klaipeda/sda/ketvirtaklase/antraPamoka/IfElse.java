package lt.klaipeda.sda.ketvirtaklase.antraPamoka;
public class IfElse {
    public static void main(String[] args) {
        // checkAge();

        int randomNumber = 5;
        boolean isEvenNumber = randomNumber % 2 == 0;
        boolean isRandomNumberZero = randomNumber == 0;

        if(isEvenNumber && !isRandomNumberZero) {
            System.out.println("Number is even");
        } else if (isRandomNumberZero) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is odd");
         }
    }

    private static void checkAge() {
        byte jonasAge = 20;
        byte petrasAge = 30;

        boolean isJonasOlderThanJonas = jonasAge > petrasAge;
        boolean isJonasSameAgeAsPetras = jonasAge == petrasAge;

        if(isJonasOlderThanJonas) {
            System.out.println("Jonas is older than Petras");
        } else if (isJonasSameAgeAsPetras) {
            System.out.println("Jonas and Petras are same age");
        } else {
            System.out.println("Petras is older than Jonas");
        }
  }
}
