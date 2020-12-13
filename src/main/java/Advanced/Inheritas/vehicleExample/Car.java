package Advanced.Inheritas.vehicleExample;

public class Car extends Vehicle {

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                "maxSpeed='" + maxSpeed +
                '}';
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed * 15;
    }
}
