package Advanced.NamuDarbai.Deliveries;

public abstract class Deliveries {

    public String name;
    public String address;
    public Enum type;
    public double price;
    private Gadget gadget;
    private GadgetType gadgetType;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String display(){
        return  name;
    }
    public String displayAddress(){
        return address;
    }
    public Enum getType(){
        return type;
    }
    public double getPrice() {
        return price;
    }
}
