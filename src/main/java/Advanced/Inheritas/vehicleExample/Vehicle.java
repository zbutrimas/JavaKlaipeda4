package Advanced.Inheritas.vehicleExample;

public abstract class Vehicle {

    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int vehicleMaxSpeed() ;

    }

