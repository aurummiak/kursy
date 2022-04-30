package Homework.LevelF;

import java.util.Random;

public class MethodsForF {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void numberSortDescending(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    if (array[i] == 0) {
                        break;
                    }
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    flag = false;

                }
                if (flag) {
                    break;
                }
            }
        }

    }
}