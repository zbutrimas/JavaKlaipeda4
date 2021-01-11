package Advanced.FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        String location = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\FileWriter\\Rezultatai.txt";
        String text = "Laba diena";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(location))) {
            bw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
