package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class ArrayThree {
    public static void main(String[] args) {

        int arr[][] = new int[][]{
                {13, 20, 20},
                {15, 37, 21, 10},
                {50, 31, 24, 14}
        };
        int sumLine = 0;
        int index = 0;
        int highValue = Integer.MIN_VALUE; // Integer.MIN_VALUE priskiria mažiausią įmanoma int reikšmę
        int highIndex = Integer.MIN_VALUE;
        int lowValue = Integer.MAX_VALUE; // Integer.MAX_VALUE priskiria didžiausią įmanoma int reikšmę
        int lowIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumLine += arr[i][j];           //Prie sumLine pridedama eilutės suma
                index = i;                      // nurodomas eilutės indeksas

            }
            if (sumLine >= highValue) {
                highValue = sumLine;            // į highValue perkeliama aukščiausia suma
                highIndex = index;              // newIndex pakeičiamas if salygą atitinkančiu indexu
            }
            if (sumLine <= lowValue) {
                lowValue = sumLine;
                lowIndex = index;
            }
            sumLine = 0;                        // sumLine reikšmė pakeičiama į 0 kad apskaičiuoti sekančios eilutės sumą
        }
        System.out.println("Highest: " + highValue + ", index: " + highIndex);
        System.out.println("Lowest: " + lowValue + ", index: " + lowIndex);
        System.out.println("__________");

    }
}