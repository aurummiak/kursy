package Homework.Stage12.task4.model;

import java.util.Random;

public class ArrayElements {
    public static int getEvenNumbers(int[] number) {
        int even_number = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even_number++;
            }
        }
        return even_number;
    }

    public static void randomElements(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

}