package lt.klaipeda.sda.ketvirtaklase.ketvirtaPamoka.NamuDarbai;

import java.util.Arrays;
import java.util.List;

public class ArraysTaskExsekutor {
    private int[] arrValues;

    public ArraysTaskExsekutor() {
        arrValues = new int[]{1, 7, 3, 10, 9};
    }

    public void execute31Task() {

        int arrValuesSum = 0;
        for (int i = 0; i < arrValues.length; i++) {
            arrValuesSum += arrValues[i];
        }
        System.out.println(arrValuesSum);
    }

    public void execute32Task() {
        System.out.println(arrValues[1] - arrValues[0]);
    }

    public void execute33Task() {
        System.out.print(arrValues[0] + ",");
        System.out.print(arrValues[1] + ",");
        System.out.print(arrValues[2] + ",");
        System.out.println(arrValues[4] + ",");
    }

    public void execute34Task() {

        int min = Arrays.stream(arrValues).min().getAsInt();

//        int min = arrValues[0];
//        for (int i = 0; i < arrValues.length; i++ );{
//            int i = 0;
//            if (arrValues[i] < min) ;
//            min = arrValues[i];
//        }
        System.out.println("Min = " + min);

        int max = Arrays.stream(arrValues).max().getAsInt();
        System.out.println("Max = " + max);
    }

    public void execute35Task() {

        System.out.print("Output = ");
        for (int i = arrValues.length - 1; i >= 0; i--) {
            System.out.print(arrValues[i] + ",");
        }
    }

    public void execute36Task() {

        System.out.println(arrValues);
    }
}
