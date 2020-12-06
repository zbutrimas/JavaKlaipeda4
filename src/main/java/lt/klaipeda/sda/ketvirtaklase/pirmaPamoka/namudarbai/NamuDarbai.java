package lt.klaipeda.sda.ketvirtaklase.pirmaPamoka.namudarbai;

public class NamuDarbai {
    public static void main(String[] args) {
        int x = 74;
        int y = 36;
        int sumaLygi = x + y;
        System.out.print( "x = " + x);
        System.out.print( " y = " + y);
        System.out.print( " suma lygi = " + sumaLygi + '\n');

         x = 50;
         x = x % 16;
        System.out.println( x );

        x = 8 * 6;
        y = x - 5;
        System.out.println(y);

        x = 55 + 9;
        x = x % 9;
        System.out.println(x);

        x = -3 * 5;
        x = x / 8;
        x = 20 + x;
        System.out.println(x);

        x = 15 / 3;
        x = x * 2;
        x = 5 + x;
        y = 8 % 3;
        System.out.println(x - y);

    }
}
