package lt.klaipeda.sda.ketvirtaklase.antraPamoka;

public class Main {
    public static void main(String[] args){
        for (int i = 0; i <= 1000; i=i+2) { //i++ spausdins visus skaicius.
            System.out.println(i);      //(int i=0;i++) begalinis ciklas
        }
        //i++ // i=i+1

        for(int i=1; i < 10;i++) {
            if (i % 3 == 0) {
                continue;
            }
            if(i % 5 ==0) {
                break;
            }
            System.out.println(i);

        }

        short age = 1;

        while (age < 18) {
            age++;
            System.out.println("You can not vote");
        }

        short newAge = 1;
        do {
            System.out.println("You can vote");
        } while (newAge >= 18);
    }
}
