package homework.levels.levelF.task1;

import homework.levels.levelF.MethodsForF;
import view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        MethodsForF.randomElementsForArray(array, size, -10, 10);
        Printer.print("\nArray: " + Arrays.toString(array));

        MethodsForF.numberSortDescending(array);
        Printer.print("\nArray: " + Arrays.toString(array));
    }
}
