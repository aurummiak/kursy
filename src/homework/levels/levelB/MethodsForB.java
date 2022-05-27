package homework.levels.levelB;

import java.util.Random;

public class MethodsForB {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static String findingLargerElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i > number) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String findingLessElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i < number) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String findingEqualElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i == number) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String findingNotEqualElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i != number) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String findingMultipleElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i % number == 0 && i != 0) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String findingNotMultipleElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i % number != 0 && i != 0) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String equalModuleElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i == Math.abs(number)) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String largerModuleElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i > Math.abs(number)) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

    public static String lessModuleElement(int[] array, int size, int number) {
        String res = "";
        int count = 0;
        for (int i : array) {
            if (i < Math.abs(number)) {
                count++;
            }
        }
        res = String.valueOf(count);
        return res;
    }

}
