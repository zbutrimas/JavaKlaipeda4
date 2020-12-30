package Advanced.NamuDarbai.Company;

public class CompanyDevice extends CompanyMain {

    Company company1 = new Company("Dodge", "California", "AUTOMOBILES", "cars");
    Company company2 = new Company("Opel", "Berlin", "AUTOMOBILES", "cars");
    Company company3 = new Company("Lays", "Chicago", "FOOD", "chips");
    Company company4 = new Company("Fiskars", "Kaunas", "GARDEN_TOOLS", "Shovel");
    Company company5 = new Company("Samsung", "Seulas", "TECHNOLOGIES", "telephones");

    public Company getCompany1() {
        return company1;
    }

    public Company getCompany2() {
        return company2;
    }

    public Company getCompany3() {
        return company3;
    }

    public Company getCompany4() {
        return company4;
    }

    public Company getCompany5() {
        return company5;
    }

    class company1 {
        Device device11 = new Device("Dodge Grand Caravan", 25.000, 25, "Minivan");
        Device device12 = new Device("Dodge Durango", 31.000, 21, "Jeep");

        public Device getDevice11() {
            return device11;
        }

        public Device getDevice12() {
            return device12;
        }


    }

    class company2 {
        Device device21 = new Device("INSIGNIA", 23.000, 42, "family car");
        Device device22 = new Device("Corsa", 13.000, 59, "small car");

        public Device getDevice21() {
            return device21;
        }

        public Device getDevice22() {
            return device22;
        }
    }

    class company3 {
        Device device31 = new Device("Lays with dill", 1.2, 1000, "potato chips with dill");
        Device device32 = new Device("Lays with salt", 1.1, 2000, "potato chips with salt");
        Device device33 = new Device("Lays with chilli", 1.15, 1200, "potato chips with chilli");

        public Device getDevice31() {
            return device31;
        }

        public Device getDevice32() {
            return device32;
        }

        public Device getDevice33() {
            return device33;
        }
    }

    class company4 {
        Device device41 = new Device("Fiskars Light", 52, 400, "garden shovel");
        Device device42 = new Device("Fiskars Xact", 60, 300, "garden shovel");
        Device device43 = new Device("Fiskars Solid", 68, 200, "garden shovel");

        public Device getDevice41() {
            return device41;
        }

        public Device getDevice42() {
            return device42;
        }

        public Device getDevice43() {
            return device43;
        }
    }

    class company5 {
        Device device51 = new Device("Galaxy Note 8", 530, 100, "Smartphone");
        Device device52 = new Device("Galaxy A51", 284, 150, "Smartphone");
        Device device53 = new Device("Galaxy A41", 205, 200, "Smartphone");

        public Device getDevice51() {
            return device51;
        }

        public Device getDevice52() {
            return device52;
        }

        public Device getDevice53() {
            return device53;
        }
    }
}


