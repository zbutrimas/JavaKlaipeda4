package Advanced.concurecies.Example2;

public class CocurrencyExample2 {
    public static void main(String[] args) {
        StopWach stopWach = new StopWach();
        stopWach.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
            System.out.println("Main thread is running");
            Thread.sleep(3000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
