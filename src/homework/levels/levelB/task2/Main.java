package homework.levels.levelB.task2;

import homework.levels.levelB.MethodsForB;
import homework.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        MethodsForB.randomElementsForArray(array, size, -10, 10);
        Printer.print("Array: " + Arrays.toString(array));


        Printer.print("\nEnter the number: ");
        int number = scanner.nextInt();
        Printer.print("Quantity of elements, which are less: " + MethodsForB.findingLessElement(array, size, number));

    }
}

