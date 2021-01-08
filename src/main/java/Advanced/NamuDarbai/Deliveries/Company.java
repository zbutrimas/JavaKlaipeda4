package Advanced.NamuDarbai.Deliveries;

public class Company extends Deliveries {

    private String name;
    private String address;
    private Gadget gadget;

    @Override
    public String getName() {
        return name;
    }
    public Gadget getGadget(){
        return gadget;
    }
    public double getPrice() {
        return price;
    }

    public Company(String name, String address, Gadget gadget) {
        this.name = name;
        this.address = address;
        this.gadget = gadget;
    }

    public String toString() {
        return String.format( "Company with name: %s has most expensive gadget %s with price %s \n",
                name, gadget.gadgetType, gadget.getPrice());
    }
}