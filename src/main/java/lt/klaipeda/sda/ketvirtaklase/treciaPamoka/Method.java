package lt.klaipeda.sda.ketvirtaklase.treciaPamoka;

public class Method {
    public static void main(String[] args){
        int changeNumber = changeNumber(101, 5);
        System.out.println(changeNumber);
        greetings( "Petras");
        int numberOfStudents = getStudentCount();
        System.out.println(numberOfStudents);
    }

    public static int changeNumber(int numberToChange, int valueToChange){
        if (numberToChange > 100) {
            return numberToChange + 1;
        } else if (numberToChange < 100) {
            return numberToChange - 1;
        }
        return numberToChange;
    }

    public static void greetings(String name) {
        System.out.println("Greetings: " + name);
    }

    public static int getStudentCount() {
        return 12;
    }
}
