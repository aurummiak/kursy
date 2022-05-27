package lessons.lesson14.task03;

import homework.view.Printer;
import lessons.lesson14.ArraySorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 6, 9, 5, 3, 10, 7};

        Printer.print("Before sorting: " + Arrays.toString(array));

        ArraySorter.selectedSortAsc(array);
        Printer.print("\nAfter ascending sorting : " + Arrays.toString(array));
        ArraySorter.selectedSortDesc(array);
        Printer.print("\nAfter descending sorting: " + Arrays.toString(array));
    }
}