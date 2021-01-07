package Advanced.NamuDarbai.Deliveries;

public class Courier extends Deliveries {
    public String name;
    public String deliveredFrom;
    public int date; // lygint su person obj datos lauku;

    public Courier(String name, String deliveredFrom, int date) {   //konstruktorius
        super.name = name;
        this.deliveredFrom = deliveredFrom;
        this.date = date;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDeliveredFrom() {
        return deliveredFrom;
    }

    public int getDate() {
        return date;
    }
}