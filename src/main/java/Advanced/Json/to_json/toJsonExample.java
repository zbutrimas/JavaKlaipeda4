package Advanced.Json.to_json;

import Advanced.Json.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class toJsonExample {

    private static final String FILE_LOCATION = "C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\Advanced\\Json\\Example.json";

    public static void main(String[] args) {
        Staff staff = new Staff();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter(FILE_LOCATION)) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
