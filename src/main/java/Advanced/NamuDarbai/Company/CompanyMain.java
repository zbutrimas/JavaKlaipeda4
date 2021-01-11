package Advanced.NamuDarbai.Company;

import java.util.ArrayList;
import java.util.List;

import static Advanced.NamuDarbai.Company.ProductionType.*;

public class CompanyMain {

//    public static Company getMostExpensiveDevice(List<Company> companies){
//        Company mostExpensiveDevice = companies.get(0);
//        for (Company company : companies) {
//            if (company.getPrice() > mostExpensiveDevice.getPrice()) {
//                mostExpensiveDevice = company;
//            }
//        }
//        return mostExpensiveDevice;
//    }
public static Device getMostExpensiveDevice(List<Device> devices){
        Device mostExpensiveDevice = devices.get(0);
        for (Device device : devices) {
            if (device.getPrice() > mostExpensiveDevice.getPrice()) {
                mostExpensiveDevice = device;
            }
        }
        return mostExpensiveDevice;
    }

    public static void main(String[] args) {

        Company company1 = new Company("Dodge", "California", AUTOMOBILES, "cars");
        Company company2 = new Company("Opel", "Berlin", AUTOMOBILES, "cars");
        Company company3 = new Company("Lays", "Chicago", FOOD, "chips");
        Company company4 = new Company("Fiskars", "Kaunas", GARDEN_TOOLS, "Shovel");
        Company company5 = new Company("Samsung", "Seulas", TECHNOLOGIES, "telephones");

        Device device11 = new Device("Grand Caravan", 25000, 25, "Minivan");
        Device device12 = new Device("Durango", 31000, 21, "Jeep");

        Device device21 = new Device("INSIGNIA", 23000, 42, "family car");
        Device device22 = new Device("Corsa", 13000, 59, "small car");

        Device device31 = new Device("with dill", 1.2, 1000, "potato chips with dill");
        Device device32 = new Device("with salt", 1.1, 2000, "potato chips with salt");
        Device device33 = new Device("with chilli", 1.15, 1200, "potato chips with chilli");

        Device device41 = new Device("Light", 52, 400, "garden shovel");
        Device device42 = new Device("Xact", 60, 300, "garden shovel");
        Device device43 = new Device("Solid", 68, 200, "garden shovel");

        Device device51 = new Device("Galaxy Note 8", 530, 100, "Smartphone");
        Device device52 = new Device("Galaxy A51", 284, 150, "Smartphone");
        Device device53 = new Device("Galaxy A41", 205, 200, "Smartphone");

        List<Device> devices = new ArrayList<>();
        devices.add(device11);
        devices.add(device12);
        devices.add(device21);
        devices.add(device22);
        devices.add(device31);
        devices.add(device32);
        devices.add(device33);
        devices.add(device41);
        devices.add(device42);
        devices.add(device43);
        devices.add(device51);
        devices.add(device52);
        devices.add(device53);

        System.out.println(getMostExpensiveDevice(devices));

//        List<Company> companies = new ArrayList<>();
//        companies.add(company1);
//        companies.add(company2);
//        companies.add(company3);
//        companies.add(company4);
//        companies.add(company5);
//
//        System.out.println(getMostExpensiveDevice(companies));


    }
}
