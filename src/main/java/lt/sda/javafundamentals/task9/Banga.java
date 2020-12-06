package lt.sda.javafundamentals.task9;

public class Banga {

    public static void main(String[] args) {

        int bangAuk = 2;
        int bi = bangAuk;
        int ba = bangAuk - 1;
        int x = ba;

        for (int i = 0; i <= ba; i++) {
            for (int j = 0; j <= ba * bi * 2; j++) {
                if ( j % (ba * 2) == i||j % (ba * 2) == ba *2-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println();
        }
    }
}

//        int n = 6;
//
//        for (int eilut = 1; eilut <= n; eilut++) {
//                for (int stulp = 1; stulp <= n * 2; stulp++) {
//                    if (eilut == stulp || stulp == n * 2 - eilut) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }








