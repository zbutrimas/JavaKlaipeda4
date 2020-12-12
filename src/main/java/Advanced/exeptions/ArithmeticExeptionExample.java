package Advanced.exeptions;

public class ArithmeticExeptionExample {
    public  static void main (String[] args) {
        int firstNum = 10;
        int secondNum = 0;

        try {
            System.out.println(firstNum / secondNum);
        } catch (ArithmeticException exemption) {
            System.out.println("Can't divide "+ firstNum+ " by " + secondNum);
        }finally {
            System.out.println("Executing finally block");
        }
    }
}
