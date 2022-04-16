package Lessons.lesson13.task06;

public class Searchering {
    public static int findSecondIndex(int[] array, int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
                if (counter == 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
