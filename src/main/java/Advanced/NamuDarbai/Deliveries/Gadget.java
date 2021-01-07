package Advanced.NamuDarbai.Deliveries;

public class Gadget extends Deliveries {
    public GadgetType gadgetType;
    double price;
    public Courier courier;
    public String mostExpensiveGadget;
    public Gadget(GadgetType gadgetType, double price, Courier courier){
        this.gadgetType = gadgetType;
        this.price = price;
        this.courier = courier;
    }
    public GadgetType getGadgetType() {
        return gadgetType;
    }
    @Override
    public double getPrice() {
        return price;
    }
    public Courier getCourier() {
        return courier;
    }
}
