package AdvancedCoding.NamuDarbai.Vehicles;

import java.util.List;

public class Motorcycles<Shape> {

    private String brand;
    private String model;
    private int price;
    private int topSpeed;
    private List<Shape> shapes;

    @Override
    public String toString() {
        return "Motorcycles{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", topSpeed=" + topSpeed +
                ", shapes=" + shapes +
                '}';
    }

    public Motorcycles(String brand, String model, int price, int topSpeed, List<Shape> shapes) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
        this.shapes = shapes;
    }
}
