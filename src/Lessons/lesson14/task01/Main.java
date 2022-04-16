package Lessons.lesson14.task01;

import Lessons.lesson14.ArraySorter;
import view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 6, 9, 5, 4, 10, 7};

        Printer.print("Before sorting: " + Arrays.toString(array));

        ArraySorter.bubbleSortAscending(array);
        Printer.print("\nAfter sorting - ascending: " + Arrays.toString(array));

        ArraySorter.bubbleSortDescending(array);
        Printer.print("\nAfter sorting - descending: " + Arrays.toString(array));

    }
}
