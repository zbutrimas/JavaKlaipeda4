package Advanced.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {

        RemoteController remote = new TvRemoteController();
        remote.enable(true);

        remote = new AcRemoteController();
        remote.enable(false);

        test(new TvRemoteController());
        test(new AcRemoteController());
    }
    public static void test (RemoteController remote){

    }
}
