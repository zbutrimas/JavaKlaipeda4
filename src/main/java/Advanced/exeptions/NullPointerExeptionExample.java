package Advanced.exeptions;

public class NullPointerExeptionExample {
    public  static void main (String[] args) {

        try {
            String text = null;
            System.out.println(text.charAt(5));
        } catch (NullPointerException e) {
            System.out.println("Buvo gautas null-pointeris");
        }
    }
}
