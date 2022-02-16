package exercise_1;

public class ValidNumbers {
    static void validator(String string) {
        String[] array = string.split("\n");
        for (int i = 0; i < array.length; i += 1) {
            if (array[i].contains("-")) System.out.println(array[i]);
        }
    }
}




















































