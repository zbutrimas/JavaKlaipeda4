package Advanced.composition;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(
                new Bed(2.5,4),
                new TV ("4k")
        );

        Bed bed = new Bed(5.5,8.8);
        TV tv = new TV("2k");
        Room anotherRoom = new Room(bed, tv);
    }
}
