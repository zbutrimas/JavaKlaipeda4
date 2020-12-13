package Advanced.polymorphism;

public interface RemoteController {

    void enable(boolean action);

    default  void print() {
        System.out.println("Printing statement!");
    }
}
