package homework.levels.levelE;

import java.util.Random;

public class MethodsForE {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static String findMaxAndMinIndexElements(int[] array, int size) {
        String res = "";
        int multi = 1;
        int indexMax = 0, indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        if (indexMax < indexMin) {
            int a = indexMax;
            indexMax = indexMin;
            indexMin = a;
        }

        for (int i = indexMin + 1; i < indexMax; i++) {
            multi *= array[i];
        }

        res = "\nMax: " + indexMax + "\nMin: " + indexMin + "\nMulti: " + multi;
        return res;
    }

    public static int findFirstAndSecondZero(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] > 0) {
                        sum += array[i];
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return sum;

    }

    public static String getMulti (int[] array, int size){
        String res = String.valueOf(findFirstAndSecondZero(array, size));
        return res;
    }





}
