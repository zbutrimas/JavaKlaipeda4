package Advanced.classes.NonStaticKlases;

public class NestedNonStaticExmple {
    public static void main(String[] args) {
        Bicykle bicykle = new Bicykle(20);
        System.out.println(bicykle.getMaxSpeed());

        Bicykle.Wheel wheel = bicykle.new Wheel();
        wheel.damage();

        System.out.println(bicykle.getMaxSpeed());
    }
}
