package AdvancedCoding.NamuDarbai.Vehicles;

public class Car {

    private String brand;
    private String model;
    private String price;
    private String topSpeed;
    private String transmitions; //Manual/Automatic
    private String shapes; //Coupe/Sedan/Wagon

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                ", transmitions='" + transmitions + '\'' +
                ", shapes='" + shapes + '\'' +
                '}';
    }

    public Car(String brand, String model, String price, String topSpeed, String transmitions, String shapes) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
        this.transmitions = transmitions;
        this.shapes = shapes;
    }
}
