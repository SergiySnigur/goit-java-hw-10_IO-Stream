package exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/resources/fileOne.txt")) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String string = "";
            while (line != null) {
                string += line + "\n";
                line = reader.readLine();
            }
            ValidNumbers.validator(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
