package lt.coding.namuDarbai.houseProject;

public class HouseMain {

    public static void main(String[] args) {

        House house1 = new House(150, "Vilnius", 2010, "fitted");
        House house2 = new House(178, "Kretinga", 2019, "partiallyFinished");
        House house3 = new House(205, "Dauparai", 2004, "not finished");

        if (2010 > 2019 && 2010 > 2004) {
            System.out.println("house1 newest house");
        } else if (2019 > 2010 && 2019 > 2004) {
            System.out.println("house2 newest house");
        } else {
            System.out.println("house3 newest house");
        }


        String condition = new String();
        if (condition != "fitted") {
            System.out.println("house1");
        } else {
            System.out.println("house2 or house3");
        }


        if (150 < 178 && 150 < 205) {
            System.out.println("house1 smallest area");
        } else if (178 < 150 && 178 < 205) {
            System.out.println("house2 smallest area");
        } else {
            System.out.println("house3 smallest area");


        }
    }


    public int builtYear() {
        return 0;
    }

    public int area() {
        return 0;
    }

    public int condition() {
        return 0;
    }
}
