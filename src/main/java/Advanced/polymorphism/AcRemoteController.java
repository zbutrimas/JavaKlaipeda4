package Advanced.polymorphism;

public class AcRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air Conditioning on - " + action);
    }
}
