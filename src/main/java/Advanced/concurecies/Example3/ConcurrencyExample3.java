package Advanced.concurecies.Example3;

public class ConcurrencyExample3 {
    public static void main(String[] args) {
        StopWach stopWach1 = new StopWach("SW1");
        stopWach1.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(1000);

            StopWach stopWach2 = new StopWach("SW2");
            stopWach2.start();

            Thread.sleep(2000);
            System.out.println("Main thread is running");
            Thread.sleep(3000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
