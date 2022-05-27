package lessons.lesson14.task02;

import lessons.lesson14.ArraySorter;
import view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 6, 9, 5, 3, 10, 7};

        Printer.print("Before sorting: " + Arrays.toString(array));

        ArraySorter.insertedSort(array);
        Printer.print("\nAfter sorting:  " + Arrays.toString(array));
    }
}
