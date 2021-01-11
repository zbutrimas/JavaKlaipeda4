package Advanced.NamuDarbai.Company;

public class Company extends Device {

    private String name;
    private String address;
    private ProductionType productionType;
    private String devices;

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public Company(String name, String address, ProductionType productionType, String devices) {
        super();
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

}