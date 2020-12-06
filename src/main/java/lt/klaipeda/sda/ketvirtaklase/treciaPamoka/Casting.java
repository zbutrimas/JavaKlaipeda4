package lt.klaipeda.sda.ketvirtaklase.treciaPamoka;

public class Casting {
    public static void main(String[] args){
        byte b = 127;
        short s = 10;
        int i = 129;
        float f = 3549f;
        long l = 1852;
        double d = 85.2;
        i = (int) d;
        f = (float) d;

        System.out.println(i);

        boolean bool = false;
        char c = 8;

        short byteToShort = b;
        byte shortToByte = (byte) s;
        byte intToByte = (byte) i;

        int sum = b+b;
        double newSum = sum +f;
        c = (char) newSum;

        int transformedChar = c;
        c = (char) newSum;


        System.out.println(c);
        System.out.println(intToByte);
    }
}
