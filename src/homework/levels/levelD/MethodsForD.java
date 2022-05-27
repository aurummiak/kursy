package homework.levels.levelD;

import java.util.Random;

public class MethodsForD {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static String isAllNumbersOdd(int[] array, int size) {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                res = "All is odd.";
            } else {
                res = "All is even.";
            }

        }
        return res;
    }

    public static String differentCoupleValues(int[] array, int size) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        result = "Find a couple of numbers.";
                        break;
                    } else {
                        result = "All numbers are different.";
                    }
                }

            }

        }
        return result;
    }

    public static String differentValues(int[] array, int size) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        result = "All numbers are not different.";
                        break;
                    } else {
                        result = "All numbers are different.";
                    }
                }

            }

        }
        return result;
    }

    public static String sameValues(int[] array, int size) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] != array[j]) {
                        result = "All numbers are not the same.";
                        break;
                    } else {
                        result = "All numbers are the same.";
                    }
                }

            }

        }
        return result;
    }

    public static String oppositeCoupleValues(int[] array, int size) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int a = - array[j];
                if (i != j) {
                    if (array[i] == a) {
                        result = "Find a couple of opposite numbers.";
                        break;
                    } else {
                        result = "Search is empty.";
                    }
                }

            }

        }
        return result;
    }


}
