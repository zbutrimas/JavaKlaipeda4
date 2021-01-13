package AdvancedCoding.NamuDarbai.Vehicles;

import java.util.List;

public class Vehicle {

    private String vehiclesType;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehiclesType='" + vehiclesType + '\'' +
                '}';
    }

    public Vehicle(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }
}



