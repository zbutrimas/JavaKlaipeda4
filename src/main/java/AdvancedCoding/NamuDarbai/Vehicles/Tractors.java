package AdvancedCoding.NamuDarbai.Vehicles;

public class Tractors {

    private String brand;
    private String model;
    private int price;
    private int maxPulledWeight;

    @Override
    public String toString() {
        return "Tractors{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", maxPulledWeight=" + maxPulledWeight +
                '}';
    }

    public Tractors(String brand, String model, int price, int maxPulledWeight) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxPulledWeight = maxPulledWeight;
    }
}