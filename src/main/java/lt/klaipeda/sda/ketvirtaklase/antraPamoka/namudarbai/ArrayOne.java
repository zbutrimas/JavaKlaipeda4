package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class ArrayOne {

//    Susikurti vienmatį masyvą ir su 5 elementais.:
//            1.a: Apskaičuoti ir išvesti elementų sumą.

    public static void main(String[] args) {

        int[] arrayWithValues = {2,4,6,8,10};
        int sum = 0;

        for (int i : arrayWithValues)
            sum += i;
        System.out.println(sum);

        }
    }

