package exercise_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    static void printUsers(String string) {
        List<User> list = new ArrayList<>();
        String[] array = string.split("\n");
        for (int i = 0; i < array.length; i += 1) {
            String[] newArray = array[i].split(" ");
            list.add(new User((newArray[0]), newArray[newArray.length - 1]));
        }

        try (FileWriter fw = new FileWriter("src/main/resources/users.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(list);
            fw.flush();
            fw.write(json);
            System.out.println(json);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("src/main/resources/file.txt")) {
            BufferedReader bf = new BufferedReader(fr);
            String string = "";
            String line = bf.readLine();
            while (line != null) {
                string += line + "\n";
                line = bf.readLine();
            }
            printUsers(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
