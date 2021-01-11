package Advanced.concurecies.Example3;

public class StopWach extends Thread {

    private String prefix;

    public StopWach(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(prefix + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
