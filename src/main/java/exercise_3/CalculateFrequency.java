package exrcise_3;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry :
                sortedMap.entrySet()) {
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
        }
    }
}
