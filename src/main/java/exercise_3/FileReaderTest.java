package exercise_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("src/main/resources/words.txt")) {
            BufferedReader bf = new BufferedReader(file);
            String line = bf.readLine();
            String string = "";
            while (line != null) {
                string += line + " ";
                line = bf.readLine();
            }
            CalculateFrequency.calculateWord(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
