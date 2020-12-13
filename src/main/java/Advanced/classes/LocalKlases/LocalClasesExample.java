package Advanced.classes.LocalKlases;

public class LocalClasesExample {
    public static void main(String[] args) {
        System.out.println("Local class example!");

        for (int i = 0; i < 10; i++) {
            class Pair {
                String key;
                int value;

                public Pair(String key, int value) {
                    this.key = key;
                    this.value = value;
                }
            }
        }
        //lokali klase uz for(if salyga) ciklo nebematoma
//        Pair pair = new Pair("k1", 1);
    }
}
