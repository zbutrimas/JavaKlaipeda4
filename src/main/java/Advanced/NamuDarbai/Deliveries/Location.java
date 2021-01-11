package Advanced.NamuDarbai.Deliveries;

public abstract class Location {

    protected String name;
    protected String address;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }
}