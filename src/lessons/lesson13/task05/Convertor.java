package lessons.lesson13.task05;

public class Convertor {
    public static StringBuilder ConvertFromArrayToString(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int element : array) {
            result.append(element).append(" ");
        }
        return result;
    }
}
