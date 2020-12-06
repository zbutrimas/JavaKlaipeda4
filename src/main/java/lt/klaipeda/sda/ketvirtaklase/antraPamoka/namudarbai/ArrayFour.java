package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class ArrayFour {

        //    3. Susikurti dvimatį masyvą ir jam su reiksmėmis.
//    3a. susirasti visų elementų sumą
//    3b. Surasti kuris dvimačio indexas talpina didzžiausią vertę. Kuris mažiausią.
//        jei vertė kartojasi imti tą kurio indexas didesnis.
        public static void main(String[] args) {
            int[][] array = {
                    {5, 45, 99, -66, 61},
                    {5, 78, 46, 26, -1},
                    {86, 58, 26, 1, 0},
                    {44, 48, -66, 45, 2},
                    {2, 99, 45, 1, 6},
                    {69, -66, 88},
            };
//        3a. Pratimas
            System.out.println("3a.\n");
            int arraySum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    arraySum = arraySum + array[i][j];
                }
            }
            System.out.println("Visų elementų suma yra " + arraySum + "\n");
//        3b. Pratimas
            System.out.println("3b.\n");
            int maxValue = array[0][0];
            int minValue = array[0][0];
            int maxIndexI = 0;
            int maxIndexJ = 0;
            int minIndexI = 0;
            int minIndexJ = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > maxValue || array[i][j] == maxValue) {
                        maxValue = array[i][j];
                        maxIndexI = i;
                        maxIndexJ = j;
                    }
                    if (array[i][j] < minValue || array[i][j] == minValue) {
                        minValue = array[i][j];
                        minIndexI = i;
                        minIndexJ = j;
                    }
                }
            }
            System.out.println("Didžiausia vertė yra " + maxValue + " kurio indexas yra array[" + maxIndexI + "][" + maxIndexJ + "]");
            System.out.println("Mažiausia vertė yra " + minValue + " kurio indexas yra array[" + minIndexI + "][" + minIndexJ + "]");
        }
    }

