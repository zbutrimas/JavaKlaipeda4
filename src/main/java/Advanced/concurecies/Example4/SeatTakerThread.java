package Advanced.concurecies.Example4;

public class SeatTakerThread extends Thread {

    private Bench bench;

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }

    @Override
    public  void run() {
//        bench.takeASeat();
//        bench.takeASeatSynced();
        bench.takeASeatSynced1();


    }
}
