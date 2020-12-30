package Advanced.NamuDarbai.JavaDeveloper;

public class Person extends Developer{

    private String name;

    public Person(String name,int ageOfExperience) {
        super(ageOfExperience);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
