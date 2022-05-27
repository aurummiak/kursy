package homework.levels.levelE.task1;

import homework.levels.levelE.MethodsForE;
import view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        MethodsForE.randomElementsForArray(array, size, -10, 10);
        Printer.print("\nArray: " + Arrays.toString(array));

        Printer.print(MethodsForE.findMaxAndMinIndexElements(array,size));

    }
}
