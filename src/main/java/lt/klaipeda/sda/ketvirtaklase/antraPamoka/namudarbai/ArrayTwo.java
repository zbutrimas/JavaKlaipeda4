package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class ArrayTwo {

//     1.b: Išvesti didžiausią verte
//     1.c išvesti maziausia verte

    public static void main(String[] args) {

        int arr[] = {5, 5, 8, 14, 3, 3, 14};
        int smallest = arr[0];
        int largest = arr[0];
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest || arr[i] == smallest) {
                smallest = arr[i];
                min = i;
            }
            if (arr[i] > largest || arr[i] == largest) {
                largest = arr[i];
                max = i;
            }
        }
        System.out.println("Largest number is: " + largest + " index: " + max);
        System.out.println("Smallest number is: " + smallest + " index: " + min);
    }
}
//        int[] arr = new int[6];
//        int number[] = {5, 5, 8, 14, 3, 3, 14};
//        int min;
//        int i;
//        min = number[0];
//        for(i=0;i<=6;i++) {
//            if (number[i] < min) min = number[i];
//        }
//            System.out.println(min);
//        }








//        int max = getMax(array);
//        System.out.println("Maximum Value is: " + max );
//
//        int min = getMin(array);
//        System.out.println("Minimum Value is: " + min);
//
//    }
//
//    public static int getMax(int[] inputArray) {
//        int maxValue = inputArray[0];
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] > maxValue) {
//                maxValue = inputArray[i];
//            }
//        }
//        return maxValue;
//    }
//
//    public static int getMin(int[] inputArray) {
//        int minValue = inputArray[0];
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] < minValue) {
//                minValue = inputArray[i];
//            }
//        }
//        return minValue;
//    }
//}





