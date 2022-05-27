package homework.levels.levelC.task5;

import homework.levels.levelC.MethodsForC;
import view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        MethodsForC.randomElementsForArray(array, size, -10, 10);
        Printer.print("Array: " + Arrays.toString(array));

        Printer.print("\nResult: " + MethodsForC.findingGeomApproximateNumber(array, size));

    }
}
