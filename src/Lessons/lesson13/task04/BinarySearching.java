package Lessons.lesson13.task04;

public class BinarySearching {
    public static boolean findPositionMiddle(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle == value) {
                return true;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}