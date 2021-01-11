package Advanced.NamuDarbai.Company;

public class Device{

    private String name;
    private double price;
    private double quantity;
    private String description;


    public Device(String name, double price, double quantity, String description) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Device() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return String.format("Most expensive device price %s \n",
                getPrice());
    }

    }

