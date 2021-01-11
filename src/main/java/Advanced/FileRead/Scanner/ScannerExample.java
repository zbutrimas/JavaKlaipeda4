package Advanced.FileRead.Scanner;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ScannerExample {

    public static void main(String[] args) {
        String location = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\FileRead\\Duomenys";

        try ( Scanner scanner = new Scanner(new File(location))){
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant duomenis is failo!");
        }
    }
}
