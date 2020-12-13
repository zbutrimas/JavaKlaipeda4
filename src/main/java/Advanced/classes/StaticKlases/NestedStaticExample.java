package Advanced.classes.StaticKlases;

public class NestedStaticExample {
    public static void main(String[] args) {
        Bicykle bicykle = new Bicykle(5);
        System.out.println(bicykle.getMaxSpeed());

        Bicykle.Mechnic mechnic = new Bicykle.Mechnic();
        mechnic.upgrade(bicykle);
        System.out.println(bicykle.getMaxSpeed());
    }
}
