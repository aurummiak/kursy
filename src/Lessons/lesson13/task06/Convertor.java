package Lessons.lesson13.task06;

public class Convertor {
    public static String ConvertFromArrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";

        }
        return result;
    }
}
