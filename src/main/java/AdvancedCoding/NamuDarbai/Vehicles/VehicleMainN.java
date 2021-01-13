package AdvancedCoding.NamuDarbai.Vehicles;

import lt.coding.namuDarbai.houseProject.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VehicleMainN {

    private static final String FILE_LOCATION = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\AdvancedCoding\\NamuDarbai\\Vehicles\\Vehicles";

    public static  void main(String[] args){
        List<Vehicle> vehicles = readingDataFile();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    private static List<Vehicle> readingDataFile(){
        List<Vehicle> vehicles = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line!= null) {
                vehicles.add(mapVehicleData(line));
                line = br.readLine();
            }
        }catch (IOException e) {
            System.out.println("Ivyko klaida randant faila arba skaitant duomenis");
            System.out.println(e.getMessage());
        }
        return vehicles;
    }
    private static Vehicle mapVehicleData(String line) {
        String[] splittedLine = line.split("Vehicle");
        return new Vehicle(
                splittedLine[0]
//                splittedLine[1],
//                splittedLine[2],
//                Integer.parseInt(splittedLine[3])
        );
    }

//    private static List<Car> mapCarData(String carsData) {
//        List<Car> cars = new ArrayList<>();
//        String[] splittedCarsData = carsData.split(" ");
//
//        for (String car: splittedCarsData) {
//            String[] carData = car.split("Car");
//            cars.add(new Car(
//                    splittedCarsData[1],
//                    splittedCarsData[2],
//                    splittedCarsData[3],
//                    splittedCarsData[4],
//                    splittedCarsData[5],
//                    splittedCarsData[6]
//            ));
//        }
//        return cars;
//    }
}
