package Advanced.FileRead.BufferredReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderExample {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\FileRead\\Duomenys");
            BufferedReader br = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String line = null;

//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();

            do{
                line = br.readLine();
                if(line != null) {
                    stringBuilder.append(line);
                }
            }while (line != null);
            System.out.println(stringBuilder.toString());  //antras pavizdys

            br.close(); // butina uzdaryti faila,kad kita pr galetu atidaryti
        } catch (FileNotFoundException e) {
            System.out.println("Failas nebuvo rastas!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
