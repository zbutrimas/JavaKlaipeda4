package Advanced.concurecies.Example2;

public class StopWach extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Stop watch: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
