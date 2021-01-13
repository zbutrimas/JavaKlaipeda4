package AdvancedCoding.NamuDarbai.Vehicles;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCar {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\AdvancedCoding\\NamuDarbai\\Vehicles\\Vehicles";
        String searchTerm = "Car";

        String[] data = (readRecord(searchTerm, filePath));

        System.out.println(searchTerm);
//        System.out.println(data[1]);
//        System.out.println(data[2]);
//        System.out.println(data[3]);
//        System.out.println(data[4]);

    }
    public static String[] readRecord(String searchTerm, String filePath) {

        ArrayList<String> records = new ArrayList<String>();

        boolean found = false;
        String type = "";
        String brand = "";
        String model = "";
        String price = "";
        String topSpeed = "";
        String transmition = "";
        String shape = "";
        String record = "";

        try {
            Scanner x;
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()); {
                type = x.next();
                if (type.equals(searchTerm))
                {
                    brand = x.next();
                    model = x.next();
                    price = x.next();
                    topSpeed = x.next();
                    transmition = x.next();
                    shape = x.next();
                    record = type + "," + brand + "," + model + "," + price + "," + topSpeed + "," + transmition + "," + shape;
                    records.add(record);
                    found = true;
                }
                else
                {
                    x.next();
                    x.next();
                }
            }
            if (! found) {
                System.out.println("No records found");
            }
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        String[] recordsArray = new String[records.size()];
        records.toArray(recordsArray);
        return recordsArray;

    }

}
