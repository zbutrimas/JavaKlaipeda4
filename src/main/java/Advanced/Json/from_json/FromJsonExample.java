package Advanced.Json.from_json;

import Advanced.Json.Empoyees;
import Advanced.Json.Staff;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FromJsonExample {

    private static final String FILE_LOCATION ="C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\Json\\Example.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(FILE_LOCATION)) {
            //Reading one object
//            Staff staff = gson.fromJson(reader, Staff.class);
//            System.out.println(staff);

            //Reading list of objects
            Empoyees empoyees = gson.fromJson(reader, Empoyees.class);
            System.out.println(empoyees);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
