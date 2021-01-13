package AdvancedCoding.NamuDarbai.FileReadAndWrite;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

    public static void main(String[] args) throws IOException {

        File input = new File("C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\AdvancedCoding\\NamuDarbai\\Vehicles\\Vehicles");
        File output = new File("C:\\Users\\Zydrunas\\IdeaProjects\\pirmas projektas SDA\\src\\main\\java\\AdvancedCoding\\NamuDarbai\\FileReadAndWrite\\fileOutput.txt");
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader(input);
            fw=new FileWriter(output);
            int ch;
            while ((ch=fr.read())!=-1){
                fw.write(ch);
            }
        }
        catch (Exception e){

        }
        finally {
            fr.close();
            fw.close();
        }
    }
}
