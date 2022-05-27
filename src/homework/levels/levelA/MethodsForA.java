package homework.levels.levelA;

import java.util.Random;

public class MethodsForA {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static String countingForNonZero(int[] array, int size) {
        String count = "";
        int countNonZero = 0;
        for (int i : array) {
            if (i != 0) {
                countNonZero++;
            }
        }
        count = String.valueOf(countNonZero);
        return count;
    }

    public static String countingEvenNumbers(int[] array, int size) {
        String evenNum = "";
        int countEven = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        evenNum = String.valueOf(countEven);
        return evenNum;
    }

    public static String countingPositiveElements(int[] array, int size) {
        String pos = "";
        int countPos = 0;
        for (int i : array) {
            if (i > 0) {
                countPos++;
            }
        }
        pos = String.valueOf(countPos);
        return pos;
    }

    public static String countingForZero(int[] array, int size) {
        String count = "";
        int countZero = 0;
        for (int i : array) {
            if (i == 0) {
                countZero++;
            }
        }
        count = String.valueOf(countZero);
        return count;
    }

    public static String countingOddNumbers(int[] array, int size) {
        String num = "";
        int countOdd = 0;
        for (int i : array) {
            if (i % 2 == 1) {
                countOdd++;
            }
        }
        num = String.valueOf(countOdd);
        return num;
    }

    public static String countingNegativeElements(int[] array, int size) {
        String neg = "";
        int countNeg = 0;
        for (int i : array) {
            if (i > 0) {
                countNeg++;
            }
        }
        neg = String.valueOf(countNeg);
        return neg;
    }

}
