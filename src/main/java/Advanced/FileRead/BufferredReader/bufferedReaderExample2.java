package Advanced.FileRead.BufferredReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderExample2 {

        public static void main(String[] args) {
            String fileLocation = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\FileRead\\Duomenys";

            try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))){
                String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            } catch (FileNotFoundException e) {
                System.out.println("Failas nebuvo rastas!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }

}
