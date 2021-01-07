package Advanced.NamuDarbai.Deliveries;
public class Company extends Deliveries {

    String name;
    String address;
    private Gadget gadget;

    @Override
    public String getName() {
        return name;
    }
    public Gadget getGadget(){
        return gadget;
    }
    @Override
    public String displayAddress() {
        return address;
    }
    public Company(String name, String address, Gadget gadget){      //konstruktorius
        super.name = name;
        super.address = address;
        this.gadget = gadget;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format( "Company with name: %s has most expensive gadget with price %f \n", name, gadget.getPrice());
    }
}