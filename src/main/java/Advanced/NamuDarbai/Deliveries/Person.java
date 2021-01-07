package Advanced.NamuDarbai.Deliveries;

public class Person extends Deliveries {
    String name;
    String deliveryAddress;
    GadgetType gadgetType;
    int deliverUntil;
    int LocalDate;
    public Person(String name, String deliveryAddress, GadgetType gadgetType, int LocalDate){  // konstruktorius
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.gadgetType = gadgetType;
        this.LocalDate = LocalDate;
    }
    public int setDeliverUntil(java.time.LocalDate date){
        return LocalDate;
    }
}
