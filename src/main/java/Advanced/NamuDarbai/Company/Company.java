package Advanced.NamuDarbai.Company;

public class Company extends Device{

    private String name;
    private String address;
    private String productionType;
    private String devices;

    public Company(String name, String address, String productionType, String devices) {
        super();
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProductionType() {
        return productionType;
    }

    public String getDevices() {
        return devices;
    }
}
