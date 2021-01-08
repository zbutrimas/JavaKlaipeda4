package Advanced.NamuDarbai.Company;

import lt.coding.namuDarbai.tractor.Tractor;

public class CompanyMain {

    public static Device getMostExpensiveDevice(Device[] Device) {
        Device mostExpensive = Device[0];

        for (Device t : Device) {
            mostExpensive = t;
            if (t.getPrice() > mostExpensive.getPrice()) {
            }
        }
        return mostExpensive;
    }
    public static void main(String[] args) {

        Company company1 = new Company("Dodge", "California", "AUTOMOBILES", "cars");
        Company company2 = new Company("Opel", "Berlin", "AUTOMOBILES", "cars");
        Company company3 = new Company("Lays", "Chicago", "FOOD", "chips");
        Company company4 = new Company("Fiskars", "Kaunas", "GARDEN_TOOLS", "Shovel");
        Company company5 = new Company("Samsung", "Seulas", "TECHNOLOGIES", "telephones");

        Device device11 = new Device("Grand Caravan", 25.000, 25, "Minivan");
        Device device12 = new Device("Durango", 31.000, 21, "Jeep");

        Device device21 = new Device("INSIGNIA", 23.000, 42, "family car");
        Device device22 = new Device("Corsa", 13.000, 59, "small car");

        Device device31 = new Device("with dill", 1.2, 1000, "potato chips with dill");
        Device device32 = new Device("with salt", 1.1, 2000, "potato chips with salt");
        Device device33 = new Device("with chilli", 1.15, 1200, "potato chips with chilli");

        Device device41 = new Device("Light", 52, 400, "garden shovel");
        Device device42 = new Device("Xact", 60, 300, "garden shovel");
        Device device43 = new Device("Solid", 68, 200, "garden shovel");

        Device device51 = new Device("Galaxy Note 8", 530, 100, "Smartphone");
        Device device52 = new Device("Galaxy A51", 284, 150, "Smartphone");
        Device device53 = new Device("Galaxy A41", 205, 200, "Smartphone");

        System.out.println();
    }
}
