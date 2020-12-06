package lt.klaipeda.sda.ketvirtaklase.pirmaPamoka.namudarbai;

public class NamuDarbai1 {
    public static void main(String[] args) {
        float pirmas = 25.5f;
        float antras = 3.5f;
        float trecias = pirmas * antras - antras * antras;
        float ketvirtas = 40.5f - 4.5f;
        System.out.println(trecias / ketvirtas);

        float radius = 7.5f;
        float area = 3.14f * radius * radius;
        float perimeter = 2 * 3.14f * radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("average = " + (x + y + z) / 3);


    }
}
