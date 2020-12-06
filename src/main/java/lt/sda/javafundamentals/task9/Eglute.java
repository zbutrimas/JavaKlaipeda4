package lt.sda.javafundamentals.task9;

public class Eglute {
    public static void main(String[] args) {

        int n = 1;

        for (int eilut = 1; eilut <= n; eilut++) {
            if (eilut == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int eilut = 1; eilut <= n; eilut++) {
            for (int stulp = 1; stulp <= n * 2; stulp++) {
                if (eilut == n - stulp || stulp == n + eilut || eilut == n * 2 - eilut || stulp == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int eilut = 1; eilut <= n; eilut++) {
            if(eilut == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

