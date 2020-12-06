package lt.klaipeda.sda.ketvirtaklase.antraPamoka;

public class Arrays {
    public static void main(String[] args){

        int[] arr = new int[5];
        int[] arrayWithValues = new int[]{5,8,7,9};
        int[] arrNew = {5,8,7,9};

        for(int value : arrayWithValues) {
            System.out.println(value);
        }
        System.out.println("______");
        for (int i = 0; i < arrayWithValues.length; i++) {
            System.out.println("Index: " + i+ " Value: " + arrayWithValues[i] );
        }

        int firstElement = arr[0];
        int lastElementOfArrayWithValue = arrayWithValues[arrayWithValues.length - 1];
        System.out.println(lastElementOfArrayWithValue);


        int[][]multiDimentionalArray = new int [3][];
        multiDimentionalArray[0] = arrayWithValues;
        multiDimentionalArray[1] = arrNew;

        int[]smallerArray = {2};
        multiDimentionalArray[2] = smallerArray;

        int[]lastMultiDimentionalArray = multiDimentionalArray[multiDimentionalArray.length-1];




        System.out.println("___multidimentional array iterate thought all numbers_____");
        //multiDimentionalArray
        for (int i = 0; i < multiDimentionalArray.length; i++) {
            System.out.println();
            for (int k = 0; k < multiDimentionalArray[i].length; k++) {
                System.out.print(multiDimentionalArray[i][k]);

            }
        }
    }
}
