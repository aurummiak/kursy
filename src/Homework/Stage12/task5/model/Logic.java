package Homework.Stage12.task5.model;

import java.util.Random;

public class Logic {
    public static void randomElements(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int enter;
            enter = random.nextInt(max - min + 1) + min;
            array[i] = enter;
            if (enter == 5) {
                countingFive(array, size);
            }
        }
    }

    public static String convertFromArrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";

        }
        return result;
    }

    public static String countingFive(int[] array, int size) {
        String quantityFive = "";
        int countFive = 0;

        for (int i = 0; i < array.length; i++) {
                countFive++;
        }

        quantityFive = String.valueOf(countFive);
        return quantityFive;
    }
}
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] == 5) {
//        countFive++;
//        } else {
//        countFive = 0;
//        }
//        }
