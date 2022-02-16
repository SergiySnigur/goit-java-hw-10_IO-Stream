package exercise_3;

import java.util.HashMap;
import java.util.Map;

public class CalculateFrequency {
    static void calculateWord(String line) {
        String[] array = line.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i += 1) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
        }
    }
}
