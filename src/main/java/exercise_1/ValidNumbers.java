package exercise_1;

public class ValidNumbers {
    static void validator(String string) {
        String[] array = string.split("\n");
        String validNumber1 = "^([0-9]{3})\\-[0-9]{3}\\-[0-9]{4}$";
        String validNumber2 = "^(\\([0-9]{3}\\))\\s[0-9]{3}\\-[0-9]{4}$";

        for (int i = 0; i < array.length; i += 1) {
            if (array[i].matches(validNumber1) | array[i].matches(validNumber2)) System.out.println(array[i]);
        }
    }
}




















































