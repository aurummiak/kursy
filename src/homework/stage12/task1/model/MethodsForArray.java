package homework.stage12.task1.model;

import java.util.Arrays;
import java.util.Random;

public class MethodsForArray {
    public static void randomElements(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }


    public static String sortArray(int[] array){
        String sortArray = "";
        Arrays.sort(array);
        sortArray = Arrays.toString(array);
        return sortArray;
    }

}
