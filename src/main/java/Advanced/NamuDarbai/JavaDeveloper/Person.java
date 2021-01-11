package Advanced.NamuDarbai.JavaDeveloper;

public abstract class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println(Person.class.getSimpleName() + " constructor is called");
    }

    protected String textInCapital(String text) {
        return text.toUpperCase();
    }
}
