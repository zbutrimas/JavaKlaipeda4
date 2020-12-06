package lt.sda.javafundamentals.task2;

public class bmi {
    public static void main(String[] args) {

        int weight = 42;
        float height = 1.56f;
        float bmi = (weight / (height * height));

//        System.out.println("BMI = " + bmi);

        float i = bmi;
        if(i <= 18.5) {
            System.out.println("BMI too small " + bmi);
        } else if (i <= 24.9 ) {
            System.out.println("BMI optimal " + bmi);
        } else {
            System.out.println("BMI not Optimal " + bmi);


        }


    }
}
