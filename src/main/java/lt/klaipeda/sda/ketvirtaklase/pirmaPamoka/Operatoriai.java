package lt.klaipeda.sda.ketvirtaklase.pirmaPamoka;

public class Operatoriai {
    public static void main(String[] args) {

        int x = 1;
        x += 2; // x = x + 2;
        System.out.println(x); //result 5.
        x -= 5;
        System.out.println(x); // result 8.
        x *= 4; // tas pats kas x=x*4;
        x /= 2; // x=x/2 retai naudojami;
        System.out.println(x); // result 2.

        x = 15;
        x = x % 7; // apskaiciuoja liekana
        System.out.println("liekana:" + x); // result 1.

        x++; // taip pat kaip x=x+1    bus naudojama realiuose projektuose
        ++x; // taip pat kaip x=x+1
        x--; // bus naudojama realiuose projektuose
        --x;

        x = 5;
        System.out.println();
        System.out.println("x++ lygu" + x++);
        System.out.println ("po atspausdinimo x lygu " + x);

        x = 5;
        System.out.println();
        System.out.println("x++ lygu" + ++x);
        System.out.println ("po atspausdinimo x lygu " + x);

        int y;
        y = 10;
        x = 9;
        System.out.println("ar y lygu x: " + (y == x));
        System.out.println("ar y nelygu x: " + (y != x));  // javoj ! reiskia ne
        System.out.println("ar y daugiau x: " + (y > x));  // > daugiau, >= daugiau arba lygu
        System.out.println("ar y maziau x: " + (y < x));  //  < maziau, <= maziau arba lygu

        boolean value1 = true;
        boolean value2 = false;

        System.out.println(value1 && value2);  // && - IR (angl. and). folse
        System.out.println(value1 || value2);  // || - ARBA (angl. ar). true
        System.out.println(!value1);   //  ! - NE (angl. not).  folse

    }
}